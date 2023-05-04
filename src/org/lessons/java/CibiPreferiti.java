package org.lessons.java;

public class CibiPreferiti {

	public static void main(String[] args) {
		String[] cibi = new String[6];
		cibi[0]="Pizza";
		cibi[1]="Lasagna";
		cibi[2]="Riso al curry";
		cibi[3]="Cotoletta";
		cibi[4]="Arancini";
		cibi[5]="Arancini1";
		
		int mezzo = Math.round (cibi.length / 2);
		int cibiL = cibi.length;
		
		System.out.println("preferito:  " + cibi[0]);
		System.out.println("meno apprezzato:  " + cibi[cibiL - 1]);
		System.out.println("quello in mezzo:  " + cibi[mezzo]);
		System.out.println(cibiL);
	}

}
