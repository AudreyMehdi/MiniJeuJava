package openclassroom;

public class PositionJoueur {
     
	private int x =0;
	private int y =0;
	 
	public PositionJoueur(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int toto) {
		this.x = toto;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	public int depasser(){

		if (y > 5) {
			System.out.println("déplacement haut impossible");
			this.y = 5;
			return -1;
		}
		if (y < 0) {
			System.out.println("déplacement bas impossible");
			this.y = 0;
			return +1;
		}
		if (x > 5) {
			System.out.println("déplacement droite impossible");
			this.x = 5;
			return -1;
		}
		if (x < 0) {
			System.out.println("déplacement gauche impossible");
			this.x = 0;
			return +1;
		}

		return 0;
		
	}
	
	private void deplasser (int deplacementX, int deplacementY) {
		x += deplacementX;
		y += deplacementY;
		this.depasser();
	}
	
	public void haut() {
		this.deplasser(0, 1);
	}
	
	public void bas() {
		this.deplasser(0, -1);
	}
	
	public void gauche() {
		this.deplasser(-1, 0);
	}
	public void droite() {
		this.deplasser(1, 0);
	}
}
