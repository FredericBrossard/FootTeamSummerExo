package co.simplon.footteam;

import co.simplon.footteam.model.Player;
import co.simplon.footteam.model.Team;

public class FootTeamManagement {

	public static void main(String[] args) {

		// Foot team management
		System.out.println("Foot Team Management");

		/*
		 * Players creation Create here as many players as you want
		 */
		Player fredGoal = new Player("Fred", "Brossard", 1, 8);

		Player cindyMeneuse = new Player("Cindy", "Crawford", 10, 9);

		Player totoAttaquant = new Player();
		totoAttaquant.firstName = "Toto";
		totoAttaquant.name = "Schillatci";
		totoAttaquant.positionField = 9;
		totoAttaquant.noteAverage = 5;

		System.out.println("Les joueurs sont  : " + fredGoal.toString() + " et " + totoAttaquant.toString() + " et "
				+ cindyMeneuse.toString());

		/*
		 * Teams creation Create here as many teams as you want
		 */

		Team marseille = new Team();
		
		
		
		Team arsenal = new Team();
	
		
		
		/*
		 * Team completion Add created players to one of the teams you created
		 */
		
		marseille.name="Olympique de Marseille";
		marseille.playersList.add(fredGoal);
		marseille.playersList.add(totoAttaquant);
		
		for(int i = 0; i < marseille.playersList.size(); i++)
	
	    {
	   
	    	System.out.println(marseille);
	    }     
		
		arsenal.name="Arsenal";
		arsenal.playersList.add(cindyMeneuse);
		
		/**
		 * Print the best team => the best team is the team with the highest mean player
		 * score
		 */

		/**
		 * Print all best team players ordered by name
		 */

		/**
		 * Print all best team players ordered by position on the field
		 */

		/**
		 * Print all best team players ordered by note
		 */
	}

}
