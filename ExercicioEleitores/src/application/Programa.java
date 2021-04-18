package application;

import entities.Voters;

public class Programa {

	public static void main(String[] args) {
		
		Voters eleitores = new Voters();
		
		System.out.println(eleitores.percentagelValidVotes());
		System.out.println(eleitores.percentagelWhiteVotes());
		System.out.println(eleitores.percentagelNullVotes());
	}

}
