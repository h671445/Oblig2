package no.hvl.dat100.lab6.matriser;

import java.util.Iterator;

public class Matriser {
	public static void main(String[] args) {
		
	}

	

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int [] rad: matrise) {
			System.out.println();
			for (int verdi: rad) {
				System.out.print(" "+ verdi);
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		var matriseTekst = ""; 

		for (int [] rad: matrise) {
			for (int verdi: rad) {
				matriseTekst= matriseTekst + verdi + " ";
			}
			matriseTekst= matriseTekst + "\n";
		}
		return matriseTekst;
		
	}

		


	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int nyMatrise[][] = new int[matrise.length][];
		
	    for (int i = 0; i < matrise.length; i++) {
	        nyMatrise[i] = new int[matrise[i].length];
	        
	        for (int j = 0; j < matrise[i].length; j++) {	
	            nyMatrise[i][j] = matrise[i][j] * tall;
	        }
	    }
	    tilStreng(nyMatrise);
	    return nyMatrise;
	    
	}
	

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean erLik = true;
		for (int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				if (a[i][j] != b[i][j]) {
					erLik = false;
				}
			}
		}
		System.out.println(erLik);
		return erLik;
	}
}
	
