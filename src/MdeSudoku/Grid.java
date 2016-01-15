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

public class Grid {
	Cell[][] Case;
	int Size;

	public Grid(int n){
		this.Case = new Cell[n][n];
		this.Size = n;
	}
	
	public void Init(){
    	int x,y;
    
        for(x=0;x<this.Size;x++)
        {
           for(y=0;y<this.Size;y++){
        	   this.Case[x][y]= new Cell(0 , false);
           }   
        }
    }
	
	public void AddCell(int x, int y, int v, boolean f){
        this.Case[x][y].SetValue(v);
		this.Case[x][y].SetFixed(f);
	}
	
    public boolean Solve(int p){
    	int x,y,z;
    	
    	if (p== this.Size*this.Size){
    		return true;
    	}
    	
    	x = p/this.Size;
    	y = p%this.Size;
    	
    	if(this.Case[x][y].GetFixed()){	
    	  return Solve(p+1);
    	}
    	
    	for(z=1;z<=this.Size;z++){
    		if( OffLine(z,x) && OffColumn(z,y) && OffBloc(z,x,y) ){
    			this.Case[x][y].SetValue(z);
    			if(Solve(p+1)){
    			  return true;
    		    }
    		}	
    	}
    	this.Case[x][y].SetValue(0);
    	return false;
    }
    
    public void Display(){
    	int x,y;
    
        for(x=0;x<this.Size;x++)
        {
        	System.out.print("!");          
         	for(y=0;y<this.Size;y++){
        	   System.out.print(this.Case[x][y].GetValue());
        	   System.out.print("!");   
           }   
           System.out.println();
        }
    }
    
    private boolean OffLine(int v, int x){
    	int y;
    	for(y=0;y<this.Size;y++){
    		if (this.Case[x][y].GetValue()==v){
    			return false;
    		}
    	}
    	return true;
    }
    
    private boolean OffColumn(int v, int y){
    	int x;
    	for(x=0;x<this.Size;x++){
    		if (this.Case[x][y].GetValue()==v){
    			return false;
    		}
    	}
    	return true;
    }
    
    private boolean OffBloc(int v, int x , int y){
    	int _x = x - (x % 3);
    	int _y = y - (y % 3);
    	for (x=_x; x <_x+3; x++){
    		for(y=_y; y< _y+3; y++){
    			if (this.Case[x][y].GetValue()==v)
    				return false;
    		}
    	}
    	return true;
    }
}
