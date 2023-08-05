import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
class solution{
    static boolean checkPalindrome(String str,int L,int R) {
        if (L >= R) return true;
        if((str.charAt(L) != str.charAt(R)))return false;
            return checkPalindrome(str, L + 1, R - 1);
    }
    static boolean isPalindrome(String str){
        return checkPalindrome(str,0,str.length()-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A STRING TO CHECK IT IS PALINDROME OR NOT!!");
        String str = sc.nextLine();
        if(isPalindrome(str)){
            System.out.println("YES IT IS A PALINDROME");
        }
        else{
            System.out.println("NO IT IS NOT A PALINDROME");
        }
    }
}






/**class PalindromeChecker{
    // RECURSIVE FUNCTION TO CHECK WHETHER THE STRING IS PALINDROME IR NOT
    static boolean checkPalindrome(String str,int l,int r){
        //  ALL CONDITIONS WILL CHECK
        if (l >= r) return true;// PRINT PAL

        if((str.charAt(l))!=(str.charAt(r))) return false;// FIRST AND LAST NOT MATCH NOT PALINDROME

        //RECURSION CALL
        return checkPalindrome(str,l+1,r-1);// MULTIPLE CHARACTERS AND FIRST TWO MATCH THEN MATCH MIDDLE ONE
    }
     static boolean isPalindrome(String str){
       return checkPalindrome(str,0,str.length()-1);// STRING IS NOT 0 THEN CALL FUNCTION
    }
    public static void main(String[] args){
        System.out.println("TO CHECK WHETHER THE GUVEN STRING IS PALINDROME OR NOT\nENTER A STRING :-");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(isPalindrome(str)){
            System.out.println("STRING "+str+" is PALINDROME");
        }
        else{
            System.out.println("STRING "+str+" is not PALINDROME");
        }
    }
}*/