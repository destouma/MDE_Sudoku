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

public class Cell {
	int Value;
	boolean Fixed;
	
	public Cell(int v, boolean f){
		this.Value = v;
		this.Fixed =f;
	}
	
	public void SetValue(int v){
		this.Value = v;
	}
	
	public int GetValue(){
		return this.Value;
	}
	
	public void SetFixed(boolean f){
		this.Fixed = f;
	}
	
	public boolean GetFixed(){
		return this.Fixed;
	}
}
