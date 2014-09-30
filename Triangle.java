package application;



import java.awt.Color;

import java.awt.Graphics;

import java.awt.Polygon;



/**

 * Classe Triangle permet de créer un triangle à partir d'une figure

 */

public class Triangle extends Figure{

	Polygon _p;



	/**

	 * Création du triangle et remplissage

	 * @param base base du triangle

	 * @param c caractère de remplissage

	 */

	public Triangle(int x, int y, int base, char c) {

		super(x, y, 0, 0);

		fill(c);

	}

	

	public Triangle(int x, int y, int tX, int tY, Color cl) {

		super(x, y, tX, tY, cl);

	}



	/**

	 * Remplit le dessin du triangle avec le caractère donné

	 * @param c caractère de remplissage du dessin

	 */

	public void fill(char c){

		

	}

	

	/**

	 * Dessine le dessin du triangle

	 * @param g contexte graphique

	 */

	public void paint(Graphics g){

		

	}

}
