package Day1Task;

import java.util.Scanner;

//Binary to decimal Conversion 
public class Task2_Binary_To_Decimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary number :");
		int bNo = sc.nextInt();
		int rem=0,temp, cal = 0, count = 0;
		
		while(bNo > 0)
		{
			temp = bNo % 10;
			rem=rem*10+temp;
			bNo = bNo / 10;
		}
		
		while (rem > 0) {
		    temp = rem % 10;
		    cal = cal + (int)(Math.pow(2, count) * temp);
		    rem = rem / 10;
		    count++;
		}
		
		System.out.println(cal);

	}

}
