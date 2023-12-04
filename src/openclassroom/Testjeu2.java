package openclassroom;



public class Testjeu2 {

	public static int depasser(int x, int y){

		if (y > 5) {
			System.out.println("déplacement haut impossible");
			return -1;
		}
		if (y < 0) {
			System.out.println("déplacement bas impossible");
			return +1;
		}
		if (x > 5) {
			System.out.println("déplacement droite impossible");
			return -1;
		}
		if (x < 0) {
			System.out.println("déplacement gauche impossible");
			return +1;
		}
		
		
		
		return 0;
	}

	}
	

