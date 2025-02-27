import java.util.*;

public class AreaOfACircle{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius :");
		double radius=sc.nextDouble();
		double area =Math.PI * radius*radius;
		System.out.print("The Area is :"+area);
	}
}
