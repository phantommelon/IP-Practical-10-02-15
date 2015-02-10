/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Write a description of class Palindrome here.
 * 
 * @author Alistair Madden <phantommelon@gmail.com> 
 * @version (a version number or a date)
 */

public class Palindrome {

    private String inputPhrase;
    
    //Remove spaces.
    public Palindrome(String inputPhrase) {
        this.inputPhrase = inputPhrase;
        inputPhrase.replaceAll(" ", "");
    }
    
    public boolean isPalindrome() {

        for(int i = 0; i <= inputPhrase.length() / 2; i++) {
            if(!(inputPhrase.charAt(i) == inputPhrase.charAt(inputPhrase.length() -
                    i - 1))) {

                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String arg = new String();
        String argSpace = new String();
        
        for(int i = 0; i < args.length; i++) {
            arg += args[i];
            
            if(!(i == args.length - 1)) {
                argSpace += args[i] + " ";
            }
            
            else {
                argSpace += args[i];
            }
        }
        
        Palindrome palindrome = new Palindrome(arg);
        
        if(palindrome.isPalindrome()) {
            System.out.println("\"" + argSpace + "\"" +" is a palindrome");
        }
        else {
            System.out.println("\"" + argSpace + "\"" +" is not a palindrome");
        }
    }
}