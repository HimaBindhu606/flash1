package interviewQuestions;

import java.util.Scanner;

public class PyramidPatternThree {

	public static void main(String[] args) {


		Scanner input=new Scanner(System.in);
		
		System.out.println("how many rows you want in pyramid");
		
		int noOfRows=input.nextInt();
		
		int rowCount=1;
		
		for(int i=noOfRows;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=rowCount;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			rowCount++;
		}
	}

}
