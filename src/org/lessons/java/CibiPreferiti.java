package org.lessons.java;

public class CibiPreferiti {

	public static void main(String[] args) {
		String[] cibi = new String[5];
		cibi[0]="Pizza";
		cibi[1]="Lasagna";
		cibi[2]="Riso al curry";
		cibi[3]="Cotoletta";
		cibi[4]="Arancini";
		
		int mezzo = Math.round (cibi.length / 2);
		
		System.out.println("preferito:  " + cibi[0]);
		System.out.println("meno apprezzato:  " + cibi[cibi.length - 1]);
		System.out.println("quello in mezzo:  " + cibi[mezzo]);
	}

}
