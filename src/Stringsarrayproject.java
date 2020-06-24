/*
Joohan Kim
Import java.util.* which imports the Scanner and the Array
Create scanner object
In the public static void main, make the integer variable that is the number of words the user types in
Create a do while loop for the user so that they can type the number of words
    using the while, set the wordAmount from 1 to 10
Then create the array for the words that the user will type
    make it possible to initalize more variables
Then after creating the array, create a for while loop
    this loop puts the users words into the array string
    this loop makes sure that the user types are between 2 ans 10000 characters
create the last for loop to create the print statement
Then create a method called output
Intitalize a variable for the even and off words
create for loop even Index
create for loop odd Index
Create a for loop for the even index
Create a for loop for the odd index
create return method that will be the output statement
 */
import java.util.Scanner;

public class Stringsarrayproject {
    // this sets up the scanner
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int  wordAmount;
        do { // this loop makes sure that the number of words is between 1 and 10
            System.out.print("How many words will you type? ");// this is the part where the loop asks for the number of words
            wordAmount = input.nextInt();
        }
        while ( wordAmount < 1 ||  wordAmount> 10);
        // this creates the array to hold the words the user types
        String[] inputWords = new String[ wordAmount];// this is my array named inputWords
        System.out.println("Type your word: ");//this is the println statement for the user
        for (int wordCount = 0; wordCount <  wordAmount; wordCount++) {
            //this for loop puts the words into a string
            do {
                inputWords[wordCount] = input.next();
            }
            //this do while loop makes sure the words that the user types are between 2 and 10000 characters
            while (inputWords[wordCount].length() < 2 || inputWords[wordCount].length() >10000);
            inputWords[wordCount]=(output(inputWords[wordCount]));
        }
        for (int wordCount = 0; wordCount <  wordAmount; wordCount++){ // second for loop for the print statememnt
            System.out.println(inputWords[wordCount]);
        }
    }


    public static String output (String wordinput){
        //intializes the variable
        String evenword = "";
        String oddword= "";
        int wordlength=  wordinput.length();// number of indexes in word
        //for loop for even index and skips every two indexes starting at 0
        for (int evenIndex=0; evenIndex<=wordlength-1;evenIndex=evenIndex+2){
            char evenoutput = wordinput.charAt(evenIndex);
            //this sets the variable for even word
            evenword=evenword+evenoutput;
        }
        //for loop for odd index and skips every two indexes starting at 1
        for (int oddIndex=1; oddIndex<=wordlength-1; oddIndex=oddIndex+2){
            char oddoutput= wordinput.charAt(oddIndex);
            //this sets the variable for odd word
            oddword=oddword+oddoutput;
        }
        //return statement that will be the output statement
        return evenword + " " + oddword;
    }
}

