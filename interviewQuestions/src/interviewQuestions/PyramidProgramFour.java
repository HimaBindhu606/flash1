package interviewQuestions;

import java.util.Scanner;

public class PyramidProgramFour {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
            
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter how many rows you want in pyramid");
		
		int noOfRows=input.nextInt();
		
		int rowCount=1;
		
		for(int i=noOfRows;i>0;i--)
		{
			for(int j=1;j<=i*2;j++)
			{
				System.out.print(" ");
				
			}
			for(int j=1;j<=rowCount;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=rowCount-1;j>=1;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			rowCount++;
		}
	}

}
