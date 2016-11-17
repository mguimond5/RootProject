import java.util.Scanner;

/**
*
* Name: Marsha Guimond
* Teacher: Mr.Hardman
* Assignment 4, Program 2
* Date Last Modified: November 16, 2016
*
*/



/**
 * @author m.guimond3
 *
 */
public class Roots {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		double squareRoot;
		double userNum;
		
		do{
			
			System.out.println("Print enter a postive number that you want the square root of: "); 
			userNum = userInput.nextDouble();
			
			if(userNum<0){
				System.out.println("Not available!" + " Enter a number that is postive only!");
				
			}
		
		} while(userNum<0);
		
		squareRoot = Math.sqrt(userNum);
		
		System.out.println("The square root of " + userNum + " is equal to " + squareRoot + ".");
				
			
		
		
		
	

	}
	
}
