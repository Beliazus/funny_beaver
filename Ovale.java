package application;



import java.awt.Color;

import java.awt.Graphics;



/**

 * Classe Ovale

 */

public class Ovale extends Figure {

	char _s;

	

	/**

	 * Création de l'ovale

	 * @param taille taille de l'ovale

	 * @param c caractère de remplissage

	 */

	public Ovale(int x, int y, int tailleX, int tailleY, char c) {

		super(x, y, tailleX, tailleY);

		fill(c);

	}



	public Ovale(int x, int y, int tailleX, int tailleY, Color c){

		super(x, y, tailleX, tailleY, c);

	}

	

	/**

	 * Remplit le dessin de l'Ovale avec le caractère c

	 * (attention à utiliser un calcul flottant !!)

	 * @param c caratère de remplissage du dessin

	 */

	public void fill(char c){

		

	}

	

	/**

	 * Dessine le dessin de l'Ovale

	 * @param g contexte graphique

	 */

	public void paint(Graphics g){

		

	}

}
