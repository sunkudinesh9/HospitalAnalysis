package com.priyankascompany.hospitalanalysis;

import java.util.Scanner;

public class HospitalAnalysis {

	public static int[] customerApplication() {
		int[] opinions = new int[2];
		int outsiders = 0;
		int insiders = 0;
		String opinion = null;
		String yes = null;

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Priyank's Hospital...! \n \n");
		while (true) {
			System.out.println("You are from ?");
			System.out.println("Select one option from below \n outsider \n insider \n");
			opinion = scan.nextLine();

			if (opinion.equalsIgnoreCase("outsider")) {
				outsiders++;
			} else if (opinion.equalsIgnoreCase("insider")) {
				insiders++;
			} else {
				System.out.println("Wrong input....!");
				continue;
			}
			System.out.println("Do u need to add one more persion ? \n yes (or) no");
			yes = scan.nextLine();
			if (yes.equalsIgnoreCase("yes")) {
				continue;
			} else {
				break;
			}

		}
		opinions[0] = outsiders;
		opinions[1] = insiders;
		scan.close();
		return opinions;
	}

	public static void percentage() {
		int[] opinions = customerApplication();
		if (opinions[0] > opinions[1]) {
			System.out.println("Buildings are constructed out side the Bangalore...");
		} else if (opinions[0] == opinions[1]) {
			System.out.println("insiders and outsiders are equal \n so priyanka will deside where to construct the buildings...!");
		} else {
			System.out.println("Buildings are constructed inside side the Bangalore...");
		}
	}

	public static void main(String[] args) {
		percentage();
	}

}
