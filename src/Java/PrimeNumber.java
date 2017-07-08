package Java;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, count=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		num = scan.nextInt();
		
		
		for(int i=2;i<num;i++)
		{
			if(num%i == 0)
			{
				count++;
				break;
			} 
		}
			if(count==0){
				System.out.println("Number is Prime");
			} else {
				System.out.print("This is not a Prime Number");
			}
			
	

	}

}
