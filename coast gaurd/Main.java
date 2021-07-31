import java.util.*;
public class Main {
	int rows;
	int columns;
	int noOfBoats;
	int[][] boats;		
	int grids;
	public void calUncontSq() {
		int uncontSq = 0;
		for(int a = 0; a < columns; a++) 
		{	
			for(int b = 0; b < rows; b++) 
			{
				HashSet<Integer> stepsSet = new HashSet<Integer>();
				for(int i = 0; i < noOfBoats; i++){
					if(!(stepsSet.add(Math.abs(boats[i][0] - a) + Math.abs(boats[i][1] - b))))
					{	
						uncontSq++;
						break;
					}
				}
			}
		}
		System.out.println(uncontSq);
	}
	
	public void getInput() {
		String[] lineVector = null;
		Scanner in = new Scanner(System.in);
		lineVector = in.nextLine().split(",");
		try {
			rows = Integer.parseInt(lineVector[0]);
			columns = Integer.parseInt(lineVector[1]);
			noOfBoats = Integer.parseInt(lineVector[2]);
			grids = rows*columns;
			checkInput();
			boats = new int[noOfBoats][2];
			for(int i = 0; i < noOfBoats; i++) {
				lineVector = in.nextLine().split(",");
				int left = Integer.parseInt(lineVector[0]);
				int right = Integer.parseInt(lineVector[1]);
				int[] num = {left, right};
				checkInput(num, i);
				boats[i] = num;
			}
		} catch(Exception e) {
			exitProgram();
		}
		in.close();
	}
	
	public void checkInput() {
		if (rows >=50 || rows <=0 || columns >=50 || columns <=0 || noOfBoats >= 10 || noOfBoats <=1 || noOfBoats > grids) 
		{	
			exitProgram();
		}
	}
	
	public void checkInput(int[] num, int count) {
		if (num[0] < 0 || num[0] > columns-1 || num[1] < 0 || num[1] > rows-1) {
			exitProgram();
		}
		for (int i = 0; i < count; i++) {
			if(Arrays.equals(num, boats[i])) 
			{	
				exitProgram();
			}
		}
	}
	
	public void exitProgram() {
		System.out.println("Invalid input");
		System.exit(1);
	}
	
	public static void main(String[] args) {
		CoastGuard c = new CoastGuard();
		c.getInput();
		c.calUncontSq();
	}
}