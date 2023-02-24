package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Collectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // System.in is a standard input stream
		System.out.print("Start from");
		int a = sc.nextInt();
		System.out.print("End from");
		int b = sc.nextInt();

		ArrayList<Integer> aaa = new ArrayList<Integer>();
		for (int i = a; i <= b; i++) {
			aaa.add(i);
		}
		System.out.println("Main list: " + aaa);

		for (int i = a; i <= b; i++) {
			System.out.println(i);
		}

		ArrayList<Integer> bbb = new ArrayList<Integer>();
		for (int aa = a; aa <= b; aa++) {
			if (aa % 2 == 0) {
				bbb.add(aa);
			}
		}

		System.out.println("Even number:" + bbb);

		ArrayList<Integer> ccc = new ArrayList<Integer>();
		for (int bb = a; bb <= b; bb++) {
			if (bb % 2 != 0) {
				ccc.add(bb);
			}
		}
		System.out.println("Odd number:" + ccc);

		HashSet<Integer> ddd = new HashSet<Integer>();
		for (int cc = a; cc <= b; cc++) {
			ddd.add(cc);

		}

		System.out.println("main set:" + ddd);

		HashSet<Integer> eee = new HashSet<Integer>();
		for (int dd = a; dd <= b; dd++) {
			if (dd % 2 == 0) {
				eee.add(dd);
			}
		}
		System.out.println("Even number:" + eee);

		HashSet<Integer> fff = new HashSet<Integer>();
		for (int ee = a; ee <= b; ee++) {
			if (ee % 2 != 0) {
				fff.add(ee);
			}
		}
		System.out.println("Odd number:" + fff);

		HashMap<Integer, Integer> ggg = new HashMap<Integer, Integer>();
		for (int ff = a; ff <= b; ff++) {
			ggg.put(a, b);
		}
		System.out.println("main map:" + ggg);
	}
}
