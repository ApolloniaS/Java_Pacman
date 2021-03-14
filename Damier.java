
import processing.core.PApplet;

public class Damier {

    public int marge = 25;
    public int nbCell = 29;
    public int tailleCell = 21;
    public Personnage personnage = new Personnage();

    //dessin du main
    public void draw(PApplet pApplet) {
        //fond noir et trait mauve
        //définir : int diameter = (int) (tailleCell * 1.1); pour taille du pacman 110%
        //ellipse de couleur jaune
        pApplet.background(0);
        pApplet.stroke(128, 0, 255);

        // dessine le damier
        for (int i = 0; i <= nbCell; ++i) {
            //longueur commence à marge, + taille de la cellule
            pApplet.line(marge, marge + (tailleCell * i), marge + tailleCell * nbCell, marge + (tailleCell * i));
        }
        for (int i = 0; i <= nbCell; ++i) {
            pApplet.line(marge + (tailleCell * i), marge, marge + (tailleCell * i), marge + tailleCell * nbCell);
        }

        // dessine packman
        personnage.draw(pApplet, trouverAbisseCell(personnage.x), trouverOrdonneeCell(personnage.y));
    }

    public void keyPresset(PApplet pApplet) {
        //pacman se déplace en fct de la touche de clavier
        switch (pApplet.keyCode) {
            case PApplet.UP:
                personnage.moveUp();
                break;
            case PApplet.RIGHT:
                personnage.moveRight();
                break;
            case PApplet.DOWN:
                personnage.moveDown();
                break;
            case PApplet.LEFT:
                personnage.moveLeft();
                break;
        }
    }

    //pour centrer en X
    public int trouverAbisseCell(int x) {
        x %= nbCell;
        if (x < 0) {
            x += nbCell;
        }
        // pour que le x trouvé soit repassé en pixel dans le damier
        return (int) (marge + (x + 0.5F) * tailleCell);
    }

    //idem pour Y
    public int trouverOrdonneeCell(int y) {
        return trouverAbisseCell(y);
    }

    public int getSize() {
        return nbCell * tailleCell + 2 * marge;
    }
}
