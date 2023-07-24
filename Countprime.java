package countprime;

import java.util.Scanner;

public class Countprime {
      public static int Prime(int n) {
    	  int count=0;
    	  for (int i = 1; i <= n ; i++) {
		      if (n % i == 0) {
		        count++;
		      }
		    }
		return count;
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		

		   System.out.println(Prime(n));
		}
}

