/*
   This file is part of MDE_Sudoku.

    MDE_Sudoku is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    MDE_Sudoku is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with MDE_Sudoku.  If not, see <http://www.gnu.org/licenses/>.
  
 */
package MdeSudoku;

public class Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Grid grille = new Grid(9);
		long deb,fin;
		
		
		// grille de test 1
		grille.initGrid();
		grille.setCell(0 , 0 , 9 , true);
		grille.setCell(0 , 3 , 1 , true);
		grille.setCell(0 , 8 , 5 , true);
		grille.setCell(1 , 2 , 5 , true);
		grille.setCell(1 , 4 , 9 , true);
		grille.setCell(1 , 6 , 2 , true);
		grille.setCell(1 , 8 , 1 , true);
		grille.setCell(2 , 0 , 8 , true);
		grille.setCell(2 , 4 , 4 , true);
		grille.setCell(3 , 4 , 8 , true);
		grille.setCell(4 , 3 , 7 , true);
		grille.setCell(5 , 4 , 2 , true);
		grille.setCell(5 , 5 , 6 , true);
		grille.setCell(5 , 8 , 9 , true);
		grille.setCell(6 , 0 , 2 , true);
		grille.setCell(6 , 3 , 3 , true);
		grille.setCell(6 , 8 , 6 , true);
		grille.setCell(7 , 3 , 2 , true);
		grille.setCell(7 , 6 , 9 , true);
		grille.setCell(8 , 2 , 1 , true);
		grille.setCell(8 , 3 , 9 , true);
		grille.setCell(8 , 5 , 4 , true);
		grille.setCell(8 , 6 , 5 , true);
		grille.setCell(8 , 7 , 7 , true);
		grille.displayGrid();
		deb=System.currentTimeMillis();
		grille.solveGrid(0);
		fin=System.currentTimeMillis();
		System.out.println(fin-deb);
		grille.displayGrid();
				
		// grille de test 2
		grille.initGrid();
		grille.setCell(1 , 5 , 3 , true);
		grille.setCell(1 , 7 , 8 , true);
		grille.setCell(1 , 8 , 5 , true);
		grille.setCell(2 , 2 , 1 , true);
		grille.setCell(2 , 4 , 2 , true);
		grille.setCell(3 , 3 , 5 , true);
		grille.setCell(3 , 5 , 7 , true);
		grille.setCell(4 , 2 , 4 , true);
		grille.setCell(4 , 6 , 1 , true);
		grille.setCell(5 , 1 , 9 , true);
		grille.setCell(6 , 0 , 5 , true);
		grille.setCell(6 , 7 , 7 , true);
		grille.setCell(6 , 8 , 3 , true);
		grille.setCell(7 , 2 , 2 , true);
		grille.setCell(7 , 4 , 1 , true);
		grille.setCell(8 , 4 , 4 , true);
		grille.setCell(8 , 8 , 9 , true);
        grille.displayGrid();
		deb=System.currentTimeMillis();
		grille.solveGrid(0);
		fin=System.currentTimeMillis();
		System.out.println(fin-deb);
		grille.displayGrid();
	}

}
