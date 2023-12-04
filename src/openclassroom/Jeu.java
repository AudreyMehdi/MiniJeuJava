package openclassroom;

import java.util.Scanner;

public class Jeu {
	public static void main(String[] args) {
		PositionJoueur position = new PositionJoueur(0, 0);
		for (int i = 1; i <= 25; i++) {
			String sens = saisieUtilisateur();
			switch (sens) {
			case "haut":
				position.haut();
				System.out.println(position.getY());
				break;
			case "bas":
				position.bas();
				System.out.println(position.getY());
				break;
			case "droite":
				position.droite();
				System.out.println(position.getX());
				break;
			case "gauche":
				position.gauche();
				System.out.println(position.getX());
				break;
			default:
				System.out.println("Erreur de saisie");
			}
			System.out.println("vous en êtes au tour " + i);
			System.out.println("---------------------------");
			if (position.getX() == 5 && position.getY() == 5) {
				System.out.println("vous êtes arrivé");
			}
			
		}
		System.out.println("la position : x = " + position.getX() + ", y = " + position.getY());
	}

	private static String saisieUtilisateur() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Entrez un sens : haut, bas, gauche, droite");
		return myObj.nextLine();
	}
}
