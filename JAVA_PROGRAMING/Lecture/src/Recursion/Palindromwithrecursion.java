package Recursion;

public class Palindromwithrecursion {
	// Recursive function to check if `str[low…high]` is a palindrome or not
		public static boolean isPalindrome(String str, int i, int j)
		    {
		         	 
		   if (i >= j) {      return true;        }
		   
		   if(str.charAt(i) != str.charAt(j)) { return false;  }
		   
		   return isPalindrome(str, i + 1, j - 1);
		    }
		    public static void main(String[] args)
		    {
		        String str = "MADAM";
		
		        if (isPalindrome(str, 0, str.length() - 1)) {
		            System.out.print("Palindrome");
		        }
		        else {
		            System.out.print("Not Palindrome");
		        }
		    }

}
