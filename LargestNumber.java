package Day5;

import java.util.Scanner;

public class LargestNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("First number : ");
        int num1 = sc.nextInt();
        System.out.println("First number : ");
        int num2 = sc.nextInt();
        System.out.println("First number : ");
        int num3 = sc.nextInt();

        if(num1 >= num2 && num1 >=num3){
            System.out.println(num1+" is the greatest Number");
        }
        else if(num2 >= num1 && num2 >=num3){
            System.out.println(num2+" is the greatest Number");
        }
        else {
            System.out.println(num3+" is the greatest Number");
        }

	}

}
