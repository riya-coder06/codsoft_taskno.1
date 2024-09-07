// Task 1
// Number Game
import java.util.Scanner;
public class Numbergame {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int chances = 6;
        int finals = 0;
        boolean playAgain=true;
        System.out.println("Welcome to the NumberGame!");

        
        while(playAgain){
            
            int numberToGuess = (int)(Math.random() * 100);

            boolean guessCorrect = false;

            System.out.println("Hello user you have about" +chances+ " to win the game");
            System.out.println("You will play a number between 1 and 100");

            System.out.println("Let's start the game");

             System.out.println("Best of luck");


            for(int i=0;i<chances;i++){
                System.out.println("Chance" +(i+1)+ ":Enter your guess:");
                int userGuess = sc.nextInt();

                if(userGuess == numberToGuess){
                    guessCorrect=true;
                    finals+=1;
                    System.out.println("Hurray you won it.");
                    break;
                } 

                else if(userGuess > numberToGuess){
                    System.out.println("Too High");
                }

                else{
                    System.out.println("Too Low");
                }
            }
            if(!guessCorrect){
                System.out.println("Sorry User . You lost it. Try again by clicking yes");
            }
            System.out.println("Do you want to play again(yes/no)");
            String pA=sc.next();

            playAgain=pA.equalsIgnoreCase("yes");
        }
        System.out.println("That's it User,Hope you liked it");
        System.out.println("Your final score:" +finals);
        sc.close(); 
         
        


    }
}
