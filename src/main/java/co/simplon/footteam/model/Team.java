package co.simplon.footteam.model;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Team {

	/*
	 * Code attributes here - Name - Team type (see TeamType enum) - Players list
	 */

	public String name;
	TeamType teamType;
	public List<Player> playersList = new ArrayList<Player>();

	
	/*
	 * Code constructors here - One empty constructor - One constructor with all
	 * attributes
	 */
	public Team() {
	}

	

	public Team(String name, TeamType teamType, List<Player> playersList) {
		this.name = name;
		this.teamType = teamType;
		this.playersList = playersList;
	}



	/*
	 * Code here a function that sort players by their notes
	 */

	public static void sortPlayerNote() {
		// creation de l'objet Player et affectation de cet objet à la variable playerP
		Player playerP = new Player();
		// creation d'une liste de player qui permet un tri sur la note.
		TreeSet<Integer> listPlayerTrieNote = new TreeSet<Integer>();
		listPlayerTrieNote.add(playerP.noteAverage);
		System.out.println(
				"Joueur de note la plus élevée à la moins élevée : " + playerP.name + " / " + playerP.firstName);
	}

	/*
	 * Code here a function that sort players by their position
	 */

	public static void sortPlayerPosition() {
		// creation de l'objet Player et affectation de cet objet à la variable playerP
		Player playerP = new Player();
		// creation d'une liste de player qui permet un tri sur la note.
		TreeSet<Integer> listPlayerTriePosition = new TreeSet<Integer>();
		listPlayerTriePosition.add(playerP.positionField);
		System.out.println("Joueur de position sur le terrain la plus élevée à la moins élevée : " + playerP.name
				+ " / " + playerP.firstName);
	}

	/*
	 * Code here a function that sort players by their name
	 */

	public static void sortPlayerName() {
		// creation de l'objet Player et affectation de cet objet à la variable playerP
		Player playerP = new Player();
		// creation d'une liste de player qui permet un tri sur la note.
		TreeSet<String> listPlayerTrieName = new TreeSet<String>();
		listPlayerTrieName.add(playerP.name);
		System.out.println("Joueur de position sur le terrain la plus élevée à la moins élevée : " + playerP.name
				+ " / " + playerP.firstName);
	}
	
}
