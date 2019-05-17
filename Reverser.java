// program to reverse a string
// author: gbemisola

import java.util.Scanner;
public class Reverser{

    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
        System.out.println ("enter a word");
        String word = input.nextLine();

        String rev = "";
        for(int i=word.length()-1; i>=0; i--){
            rev = rev + word.charAt(i);

        }
        System.out.println("Reverse word =" + rev);

        
    }
}