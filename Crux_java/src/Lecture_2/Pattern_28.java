/*
 
5
				1	
			2	3	2	
		3	4	5	4	3	
	4	5	6	7	6	5	4	
5	6	7	8	9	8	7	6	5	


 
 */

package Lecture_2;

import java.util.Scanner;

public class Pattern_28 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nsp = n - 1;
		int nst = 1;
		int row = 1;
		int val;
		while (row <= n) {

			val = row;

			// Spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("\t");
				csp++;
			}

			// Work
			int cst = 1;
			while (cst <= nst) {
				System.out.print(val + "\t");
				if (cst <= nst / 2) {
					val++;
				} else {
					val--;
				}

				cst++;
			}

			// Preparartion
			System.out.println();
			nsp--;
			nst += 2;
			row++;
		}

	}

}