import java.util.Scanner;

public  class string_04 {
    public static void main(String[] args) {
        System.out.print("enter the string which you want : ");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int vowel=0;
        int consonant=0;
        int special_char=0;
        boolean palindrome=false;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                vowel++;
            }
            else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                consonant++;
            }
            else if(ch=='$' || ch=='%' || ch=='&' || ch=='@' || ch=='#' || ch=='!' || ch=='*' || ch=='(' || ch==')' || ch=='-' || ch=='+'){
                special_char++;
            }
        }       
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            palindrome=true;
        }
        System.out.println("vowel="+vowel);
        System.out.println("consonant="+consonant);
        System.out.println("special_char="+special_char);
        if(palindrome){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }

}