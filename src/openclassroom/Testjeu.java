package openclassroom;

import java.util.Scanner;

public class Testjeu {

	
	public static void main(String[] args) {
System.out.println("toto");
		int deplacement_x = 0;
		int deplacement_y = 0;
		for (int i = 1; i <= 25; i++) {
			Scanner myObj = new Scanner(System.in);
			System.out.println("Entrez un sens : haut, bas, gauche, droite");
			String sens = myObj.nextLine();

			if (sens.equals("haut") || sens.equals("bas") || sens.equals("droite") || sens.equals("gauche")) {
				if (sens.equals("haut")) {
					deplacement_y++; 
					deplacement_y += Testjeu2.depasser(deplacement_x, deplacement_y);
				}
				
				if (sens.equals("bas")) {
					deplacement_y--;
					deplacement_y += Testjeu2.depasser(deplacement_x, deplacement_y);
				}
				

				if (sens.equals("droite")) {
					deplacement_x++;
					deplacement_x += Testjeu2.depasser(deplacement_x, deplacement_y);
				}
				
				if (sens.equals("gauche")) {
					deplacement_x--;
					deplacement_x += Testjeu2.depasser(deplacement_x, deplacement_y);
				}
				
				System.out.println("x = " + deplacement_x + " y = " + deplacement_y);
			} else {
				System.out.println("l'entrée n'est pas correcte");
				i--;
			}

			System.out.println("vous en êtes au tour " + i);
			System.out.println("---------------------------");
			if (deplacement_x == 5 && deplacement_y == 5) {
				System.out.println("vous êtes arrivé");
			}

		}

	}
	

}
