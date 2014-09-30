package application;



import java.awt.Color;

import java.awt.Graphics;

import java.awt.Point;



/**

 * Classe Rectangle permet de créer un rectangle à partir d'une figure

 */

public class Rectangle extends Figure{



	/**

	 * Création du rectangle et remplissage

	 * @param tailleX longueur du rectangle

	 * @param tailleY largeur du rectangle

	 * @param c caractère de remplissage

	 */

	public Rectangle(int x, int y, int tailleX, int tailleY, char c) {

		super(x, y, tailleX, tailleY);

		fill(c);

	}

	

	public Rectangle(int x, int y, int tailleX, int tailleY, Color cl){

		super(x, y, tailleX, tailleY, cl);

	}

	

	/**

	 * Remplit le dessin du rectangle avec le caractère donné

	 * @param c caractère de remplissage du dessin

	 */

	public void fill(char c){

		for (int i = 0; i < getTailleX(); i++){

			for (int j = 0; j < getTailleY(); j++){

				_dessin.setPoint(new Point(i, j), c);

			}

		}

	}

	


	public static void main (String args[]){

		Rectangle r1 = new Rectangle(0, 0, 10, 15, '+');

		

		System.out.println(r1.toString());

	}
}
