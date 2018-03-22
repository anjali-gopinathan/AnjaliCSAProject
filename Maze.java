//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;
   private boolean exitFound;
  // private boolean[][] isOne;
	public Maze()
	{
		exitFound = false;
		maze = new int[0][0];

	}

	public Maze(int size, String line)
	{
		Scanner read = new Scanner(line);
		for(int r=0; r<maze.length; r++){
			for(int c=0; c<maze[0].length; c++){
				maze[r][c] = read.nextInt();
			}
		}

	}

	public void hasExitPath(int r, int c)
	{
		if(r>=0 && c>=0 && r< maze.length && c<maze[0].length
				&& maze[r][c]==1){
				//&& !isOne[r][c]){
			//isOne[r][c] = true;
			if(c == maze[0].length-1){
				exitFound = true;
			}
			else{
				int save = maze[r][c];
				maze[r][c] = 0;
				hasExitPath(r-1,c);
				hasExitPath(r+1,c);
				hasExitPath(r,c-1);
				hasExitPath(r,c+1);
				maze[r][c]=save;
			}	
		}
	}

	public String toString()
	{
		String output="";
		for(int r=0; r<maze.length; r++){
			for(int c=0; c<maze[0].length; c++){
				output+= maze[r][c];
			}
			output+="\n";
		}
		if(exitFound)
			output+="exit found";
		else
			output+="exit not found";
		return output;
	}
}