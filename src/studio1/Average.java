package studio1;

import support.cse131.ArgsProcessor;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int n1 = ap.nextInt("The first two integers to be averaged?");
		int n2 = ap.nextInt("The second two intergers to be averaged?");
		double n3 = n1 + n2;
		System.out.println(n3/2);

	}

}
