import processing.core.PApplet;

public class Personnage {
	//21 = taille de la cellule
	int diameter = (int) (21 * 1.1);
	public int x = 0;
	public int y = 0;
	
	public void draw (PApplet pApplet, int x, int y) {
                //pacman = ellipse jaune sans bordure
		pApplet.noStroke();
		pApplet.fill(255, 255, 0);
		pApplet.ellipse(x, y, diameter, diameter);
	}
	
	public void moveUp () {
		--y;
	}
	
	public void moveRight () {
		++x;
	}

	public void moveDown () {
		++y;
	}

	public void moveLeft () {
		--x;
	}
}
