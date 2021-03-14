import processing.core.PApplet;

public class Pacman extends PApplet {
	// déclaration du damier pour faire le plateau du jeu
	static Damier damier = new Damier(); 
	
	public static void main(String[] args) {
		PApplet.main(Pacman.class.getName());
                System.out.println(Pacman.class.getName());
	}
	
	@Override
	public void settings () {
		size(damier.getSize(), damier.getSize());
	}
	
	@Override
	public void setup () {
		damier.draw(this);
	}
	
	@Override
	public void draw () {
	}
	
        //fonction qui permet d'update la position de pacman
	@Override
	public void keyPressed () {
		damier.keyPresset(this);
		damier.draw(this);
	}	
}
