import java.util.*;

public class CalculateAverageOfThreeNumbers{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1=sc.nextInt();
		System.out.println("Enter the second number:");
		int num2=sc.nextInt();
		System.out.println("Enter the third number:");
		int num3=sc.nextInt();
		int ans=(num1+num2+num3)/3;
		System.out.print("The answer id :"+ans);
	}
}
		
		