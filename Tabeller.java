package no.hvl.dat100.lab5.tabeller;

public class Tabeller {


	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i<tabell.length; i++) {
			System.out.println(tabell[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String s = ("[");
		for (int i = 0; i<tabell.length; i++) {
			if(i == 0) {
				s += Integer.toString(tabell[i]);
			} else {
				s = s + (",") + Integer.toString(tabell[i]);
			}
		}
		s += ("]");
		return s;
		
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		for(int i = 0; i<tabell.length; i++) {
			sum += tabell[i];
		}
		System.out.println(sum);
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		int i = 0;
		boolean finnestall = false;
		while (i < tabell.length && !finnestall) {
			if(tabell[i] == tall) {
				finnestall = true;
			
			}
			i++;
		}
		System.out.println(finnestall);
		return finnestall;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int pos=-1;
		for(int i = 0; i<tabell.length; i++) {
			if (tabell[i] == tall){
			pos = i;
			}
		}
		System.out.println(pos);
		return pos;

	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] revers = new int[tabell.length];
		int j = tabell.length - 1;
		for(int i = 0; i<tabell.length; i++) {
			revers[j]= tabell[i];
			j--;
		}
		return revers;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean ersortert = true;
		for(int i = 1; i < tabell.length-1; i++) {
			if (!(tabell[i] < tabell[i+1] && tabell[i] > tabell[i-1])) {
			ersortert = false;
		}
		}
		return ersortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] sattSammen = new int[tabell1.length + tabell2.length];
		int i = 0;
		for(int k: tabell1) {
			sattSammen[i] = k;
			i++;
		}
		for(int k: tabell2) {
			sattSammen[i] = k;
			i++;
		}
		return sattSammen;
	}
}
