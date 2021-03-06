package by.academy.homework.hw5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Task2 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ArrayList<Integer> choosing = new ArrayList<Integer>();
		long m = System.currentTimeMillis();
		al = (ArrayList<Integer>) addElements(al);
		
		m -= System.currentTimeMillis();
		System.out.println("al is filling in " + Math.abs(m));
		m = System.currentTimeMillis();
		ll = (LinkedList<Integer>) addElements(ll);
		m -= System.currentTimeMillis();
		System.out.println("ll is filling in " + Math.abs(m));
		
		m = System.currentTimeMillis();
		choosing.addAll(chooseElements(al));
		m -= System.currentTimeMillis();
		System.out.println("al is choose in " + Math.abs(m));
		choosing.clear();
		m = System.currentTimeMillis();
		choosing.addAll(chooseElements(ll));
		m -= System.currentTimeMillis();
		System.out.println("ll is choose in " + Math.abs(m));
	}

	static Collection<Integer> addElements(List<Integer> c) {
		Double d;
		for (int i = 0; i < 1_000_000; i++) {
			d = (Math.random() * 100);
			c.add(d.intValue());
		}
		return c;
	}

	static ArrayList<Integer> chooseElements(List<Integer> c) {
		int k;
		ArrayList<Integer> r = new ArrayList<Integer>();
		for (int i = 0; i < 100_000; i++) {
			k = (int) (Math.random() * 1_000_000);
			r.add(c.get(k));
		}
		return r;
	}
}
