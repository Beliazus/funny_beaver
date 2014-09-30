package application;



import java.awt.Point;

import java.awt.Color;



/**

 * Classe abstraite Figure

 */

public abstract class Figure {

	

	/**

	 * Couleur de la figure

	 */

	protected Color _c;

	

	/**

	 * Dessin associé à une figure

	 */

	protected Dessin _dessin;

	

	/**

	 * Position de la figure dans le dessin

	 */

	protected Point _position;

	

	/**

	 * Taille de la figure en x

	 */

	protected int _tailleX;

	

	/**

	 * Taille de la figure en y

	 */

	protected int _tailleY;



	/**

	 * Création de la figure et initialisation du dessin

	 * @param posX position de la figure en x dans le dessin

	 * @param posY position de la figure en y dans le dessin

	 * @param tx nombre de caractères en x

	 * @param ty nombre de caractères en y

	 */

	public Figure(int posX, int posY, int tx, int ty)  {

		_position = new Point (posX, posY);

		_tailleX = tx;

		_tailleY = ty;

		_dessin = new Dessin(_tailleX, _tailleY);

		_c = null;

	}

	

	/**

	 * Pour paint

	 * @param posX position de la figure en x dans le dessin

	 * @param posY position de la figure en y dans le dessin

	 * @param tx nombre de caractères en x

	 * @param ty nombre de caractères en y

	 * @param c couleur

	 */

	public Figure(int posX, int posY, int tx, int ty, Color c)  {

		_position = new Point (posX, posY);

		_tailleX = tx;

		_tailleY = ty;

		_dessin = new Dessin(_tailleX, _tailleY);

		_c = c;

	}



	/**

	 * Teste l'égalité de deux figures

	 * @param f figure à comparer

	 * @return true si même taille et position

	 */

	public boolean equals (Figure f){

		return (this._position.equals(f._position) 

				&& this._tailleX == f._tailleX 

				&& this._tailleY == f._tailleY);

	}

	

	/**

	 * Fonction abstraite pour remplir la figure

	 * @param c caractère de remplissage

	 */

	public abstract void fill (char c);

	

	/**

	 * Retourne le dessin de la figure

	 * @return dessin de la figure

	 */

	public Dessin getDessin(){

		return _dessin;

	}

	

	/**

	 * Renvoie la position de la figure

	 * @return position de la figure

	 */

	public Point getPosition(){

		return _position;

	}

	

	/**

	 * Renvoie la taille de la figure en x

	 * @return taille en x de la figure

	 */

	public int getTailleX(){

		return _tailleX;

	}

	

	/**

	 * Renvoie la taille de la figure en y

	 * @return taille en y de la figure

	 */

	public int getTailleY(){

		return _tailleY;

	}

	/**

	 * Affiche la figure

	 */

	public String toString(){

		String s = "Figure:\nTaille en X:"+getTailleX()+"\nTaille en Y:"+getTailleY()+"\n";

		

		for (int i = 0; i < getTailleX(); i++){

			for (int j = 0; j < getTailleY(); j++){

				s += _dessin.getPoint(new Point(i, j)) + " ";

			}

			s += "\n";

		}

		

		return s;

	}
}
