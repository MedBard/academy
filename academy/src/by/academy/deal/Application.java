package by.academy.deal;

import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {
	static Pattern p1 = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[012])-((18|19|20|21)\\d\\d)");
	static Pattern p2 = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((18|19|20|21)\\d\\d)");

	public static void main(String[] args) {
		Person seller = new Person();
		Person buyer = new Person();
		Scanner sc = new Scanner(System.in);
		boolean menu = true;
		int menuChoose;
		Deal[] archive = new Deal[128];
		int dealCount = 0;
		Deal deal = new Deal(new Date(), seller, buyer);

		while (menu) {
			System.out.println("1: New deal");
			System.out.println("2: Archive");
			System.out.println("3: Deal menu");
			System.out.println("0: Exit");
			menuChoose = sc.nextInt();
			switch (menuChoose) {
			case 1:
				System.out.println("Enter date of deal:");
				String gDate = sc.next();
				deal.setDate(checkDate(gDate, sc));
				System.out.println("Info about buyer");
				buyer = personInput(sc);
				deal.setBuyer(buyer);
				System.out.println("Info about seller");
				seller = personInput(sc);
				deal.setSeller(seller);
				deal.setDeadLine();
				archive[dealCount] = deal;
				deal.deal();
				dealCount++;
				break;
			case 2:
				for (int i = 0; i < dealCount; i++) {
					Deal d = archive[i];
					printDealDate(d.getDate());
					System.out.println("Buyer: " + d.getBuyer().toString());
					System.out.println("Seller: " + d.getSeller().toString());
					d.printProducts();
				}
				break;
			case 3:
				deal.dealMenu(sc);
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

	private static void printDealDate(Date date) {
		// TODO Auto-generated method stub

	}

	static Person personInput(Scanner sc) {
		Person p = new Person();
		String gDate;
		AmericanPhoneValidator apv = new AmericanPhoneValidator();
		BelarusPhoneValidator bpv = new BelarusPhoneValidator();
		EmailValidator ev = new EmailValidator();
		Pattern p1 = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[012])-((18|19|20|21)\\d\\d)");
		Pattern p2 = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((18|19|20|21)\\d\\d)");

		System.out.print("Enter name :");
		p.setName(sc.next());
		System.out.print("Enter money:");
		p.setMoney(sc.nextDouble());
		System.out.print("Enter birthday:");
		gDate = sc.next().trim();
		while (true) {
			Matcher m = p1.matcher(gDate);
			if (m.matches()) {
				p.setDateOfBirth(gDate);
				break;
			}
			m = p2.matcher(gDate);
			if (m.matches()) {
				p.setDateOfBirth(gDate);
				break;
			}
			System.out.print("Incorrect date! ");
			System.out.print("Enter date(dd/MM/yyyy or dd-MM-yyyy ):");
			gDate = sc.next();
		}
		System.out.print("Enter phone number:");
		String tmp = sc.next().trim();
		boolean check = apv.validate(tmp) | bpv.validate(tmp);
		do {
			if (check) {
				p.setPhone(tmp);
				break;
			} else {
				System.out.print("Enter correct phone number:");
				tmp = sc.next().trim();
			}
		} while (!check);
		System.out.print("Enter email:");
		tmp = sc.next().trim();
		do {
			if (ev.validate(tmp)) {
				p.setEmail(tmp);
				break;
			} else {
				System.out.print("Enter correct email:");
				tmp = sc.next().trim();
			}
		} while (!ev.validate(tmp));
		return p;
	}

	static Date checkDate(String gDate, Scanner sc) {
		DealDate date = new DealDate();
		String pattern1 = "dd-MM-yyyy";
		String pattern2 = "dd/MM/yyyy";
		while (true) {
			Matcher m = p1.matcher(gDate);
			if (m.matches()) {
				return date.parceDate(gDate, pattern1);
			}
			m = p2.matcher(gDate);
			if (m.matches()) {
				return date.parceDate(gDate, pattern2);
			}
			System.out.print("Incorrect date! ");
			System.out.print("Enter date(dd/MM/yyyy or dd-MM-yyyy ):");
			gDate = sc.next();
		}
	}
}
