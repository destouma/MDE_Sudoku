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
		grille.Init();
		grille.AddCell(0 , 0 , 9 , true);
		grille.AddCell(0 , 3 , 1 , true);
		grille.AddCell(0 , 8 , 5 , true);
		grille.AddCell(1 , 2 , 5 , true);
		grille.AddCell(1 , 4 , 9 , true);
		grille.AddCell(1 , 6 , 2 , true);
		grille.AddCell(1 , 8 , 1 , true);
		grille.AddCell(2 , 0 , 8 , true);
		grille.AddCell(2 , 4 , 4 , true);
		grille.AddCell(3 , 4 , 8 , true);
		grille.AddCell(4 , 3 , 7 , true);
		grille.AddCell(5 , 4 , 2 , true);
		grille.AddCell(5 , 5 , 6 , true);
		grille.AddCell(5 , 8 , 9 , true);
		grille.AddCell(6 , 0 , 2 , true);
		grille.AddCell(6 , 3 , 3 , true);
		grille.AddCell(6 , 8 , 6 , true);
		grille.AddCell(7 , 3 , 2 , true);
		grille.AddCell(7 , 6 , 9 , true);
		grille.AddCell(8 , 2 , 1 , true);
		grille.AddCell(8 , 3 , 9 , true);
		grille.AddCell(8 , 5 , 4 , true);
		grille.AddCell(8 , 6 , 5 , true);
		grille.AddCell(8 , 7 , 7 , true);
		grille.Display();
		deb=System.currentTimeMillis();
		grille.Solve(0);
		fin=System.currentTimeMillis();
		System.out.println(fin-deb);
		grille.Display();
				
		// grille de test 2
		grille.Init();
		grille.AddCell(1 , 5 , 3 , true);
		grille.AddCell(1 , 7 , 8 , true);
		grille.AddCell(1 , 8 , 5 , true);
		grille.AddCell(2 , 2 , 1 , true);
		grille.AddCell(2 , 4 , 2 , true);
		grille.AddCell(3 , 3 , 5 , true);
		grille.AddCell(3 , 5 , 7 , true);
		grille.AddCell(4 , 2 , 4 , true);
		grille.AddCell(4 , 6 , 1 , true);
		grille.AddCell(5 , 1 , 9 , true);
		grille.AddCell(6 , 0 , 5 , true);
		grille.AddCell(6 , 7 , 7 , true);
		grille.AddCell(6 , 8 , 3 , true);
		grille.AddCell(7 , 2 , 2 , true);
		grille.AddCell(7 , 4 , 1 , true);
		grille.AddCell(8 , 4 , 4 , true);
		grille.AddCell(8 , 8 , 9 , true);
        grille.Display();
		deb=System.currentTimeMillis();
		grille.Solve(0);
		fin=System.currentTimeMillis();
		System.out.println(fin-deb);
		grille.Display();
	}

}
