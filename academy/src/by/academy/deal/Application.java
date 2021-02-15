package by.academy.deal;

import java.util.Scanner;

public class Application {
	static final String MENU_OUTPUT = "1: New deal \n2: Finish deal \n3: Deal menu \n4: Archive \n0: Exit";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean menu = true;
		int menuChoose;
		Deal[] archive = new Deal[128];
		int dealCount = 0;
		Deal deal = new Deal();

		while (menu) {
			System.out.println(MENU_OUTPUT);
			menuChoose = sc.nextInt();
			switch (menuChoose) {
			case 1:
				deal.createDeal(sc);
				deal.deal();
				break;
			case 2:
				if (archive[dealCount] == null) {
					archive[dealCount] = deal; // Add deal to archive
					dealCount++;
				} else {
					System.out.println("Archive problem!\n");
				}
				break;
			case 3:
				if (archive[dealCount] == null) {
					deal.dealMenu(sc);
				} else {
					System.out.println("No active deals! \n");
				}
				break;
			case 4:
				printArchive(archive, dealCount);
				break;
			case 0:
				menu = false;
				sc.close();
				break;
			default:
				break;
			}
		}
	}

	static void printArchive(Deal[] archive, int dealCount) {
		if (archive[0] == null) {
			System.out.println("Empty history\n");
		} else {
			for (int i = 0; i < dealCount; i++) {
				Deal d = archive[i];
				DealDate.printDealDate(d.getDate());
				System.out.println("Buyer: " + d.getBuyer().toString());
				System.out.println("Seller: " + d.getSeller().toString());
				d.printProducts();
			}
		}
	}
}
