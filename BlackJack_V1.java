import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BlackJack_V1 {

//Creation des cartes et du deck
	
	public static void partie() {
		ArrayList<String> deck = new ArrayList<String>();
		ArrayList<String> bank = new ArrayList<String>();
		ArrayList<String> joueur = new ArrayList<String>();
		String[] colors= {"Carreau", "Coeur", "Trèfle", "Pique"};
		String[] ranks= {"As", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Reine", "Roi"};	
		int x=0;
		int y=0;
		//String card=ranks[y] + " de " + colors[x];
		for(x=0; x<=3; x++) {
			for(y=0; y<=13; y++) {
				deck.add(ranks[y] + " de " + colors[x]);
			}
		}
//Donner des valeurs aux cartes
		
//Shuffle du deck
		
		Collections.shuffle(deck);
		
//Distribution des cartes
		
		for(int z=0; z<2; z++) {
		joueur.add(deck.get(0));
		deck.remove(0);
		bank.add(deck.get(0));
		deck.remove(0);
		}
		System.out.println("Main du Joueur: " + joueur.get(0) + " et " + joueur.get(1) + ".\n" + " Valeur des cartes: ");
		System.out.println("Main de la Banque: " + bank.get(0) + " et " + bank.get(1) + ".\n" + " Valeur des cartes: ");
		
//Redistribuer des cartes
		
		System.out.println("\nNouvelle carte?\nPress 'Y' for yes or 'N' for no.");
		Scanner scJoueur = new Scanner(System.in);
		String carteSup = scJoueur.next();
		if(carteSup.equals("y")) {
			joueur.add(deck.get(0));
			deck.remove(0);
			System.out.println("Le joueur tire une carte.");
			System.out.println("Main du Joueur: " + joueur.get(0) + ", " + joueur.get(1) + " et " + joueur.get(2) + ".\n" + " Valeur des cartes: ");
			System.out.println("Main de la Banque: " + bank.get(0) + " et " + bank.get(1) + ".\n" + " Valeur des cartes: ");
		}
		else {
			System.out.println("Partie terminée! 'Untel' gagne avec 'x' points contre 'y' points!");
		}
		
	}

	
	public static void main(String[] args) {
		partie();
	}

}
