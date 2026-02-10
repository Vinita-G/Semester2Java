package Unit4B.Notes;

import java.util.Scanner;

public class TryCatchExamples {
    public static void main(String[] args){
        // goal it to get an int from 1-4 from user
        // if they dont enter an int we will go to the catch block
        // if they dont enter an int from 1-4 we will ask them to do it again
        // keep asking till we get what we want

        Scanner kb = new Scanner(System.in);
        System.out.println("please enter an int from 1-4");
        int choice = -1;
        boolean keepGoing = true;
        while (keepGoing == true){
            try{
                choice = kb.nextInt();
                if(choice >= 0 && choice <= 4){
                    keepGoing = false;
                }
                else{
                    System.out.println("please enter an interger from 1 to 4");
                }
                System.out.println("you entered " + choice);
            }
            // exeption e is what would have happend like an input mismatch
            catch(Exception e){
                System.out.println("invalid entry, need int from 1-4");
                System.out.println("please try again");
                kb.nextLine();
            }
        }
    }
}
