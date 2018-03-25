//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = new char[3][3];
	}

	public TicTacToe(String game)
	{
//		Scanner read = new Scanner(game);
		int i=0;
		for(int r=0; r<3; r++) {
			for(int c=0; c<3; c++) {
				mat[r][c] = game.charAt(i);
				i++;
			}
		}



	}

	public String getWinner()
	{
		boolean xWins=false, oWins=false;
		String direction="";
		//checks for horizontal winner
		for(int r=0; r<3; r++) {
			if(mat[r][0] == mat[r][1] && mat[r][1]==mat[r][2]) {
				direction = "horizontally";
				if(mat[r][0]=='X') {
					xWins = true;
					return "X wins "+direction;
				}
				if(mat[r][0]=='O') {
					oWins = true;
					return "O wins "+direction;
				}
			}
		}
		//checks for vertical winner
		for(int c=0; c<3; c++) {
			if(mat[0][c] == mat[1][c] && mat[1][c] == mat[2][c]) {
				direction = "vertically";
				if(mat[0][c]=='X') xWins = true;
				if(mat[0][c]=='O') oWins = true;
			}
		}
		//checks for diagonal winner (aahhh hard coding is bad)
		if(  (mat[0][0]==mat[1][1] && mat[1][1]==mat[2][2])
		   ||(mat[0][2]==mat[1][1] && mat[1][1]==mat[2][0]) ){
			if(mat[0][0]=='X') xWins = true;
			if(mat[0][0]=='O') oWins = true;
			direction = "diagonally";
		}

//		for(int r=0; r<3; r++) {
//			for(int c=0; c<3; c++) {
//				if(mat[r][c] == mat)
//			}
//		}

		if(xWins) return "X wins" + direction + "!";
		if(oWins) return "O wins" + direction + "!";
		if(!xWins && !oWins)  return "cat's game - no winner!";
		return "";
	}

	public String toString()
	{
		String output="";
		for(int r=0; r<3; r++) {
			for(int c=0; c<3; c++) {
				output+= mat[r][c]+" ";
			}
			output+="\n";
		}
		output+=getWinner();
		return output+"\n\n";
	}
}