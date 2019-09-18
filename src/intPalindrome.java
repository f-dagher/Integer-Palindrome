import java.util.*;

public class intPalindrome {

	public static void main(String[] args) {
		
		System.out.println("Enter an integer to see if it is a palindrome: ");
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		
		System.out.println(isPalin(in));
		
	}
	
	public static boolean isPalin(int num) {
		int palin = num;
		int reverse = 0;
		
		while(palin !=0)
		{
			int remainder = palin % 10;
			reverse = reverse * 10 + remainder;
			palin = palin/10;
		}
		
		if(reverse == num)
			return true;
		else
			return false;
	}

}
