import java.util.*;
public class numbergame {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=100;i++){
            System.out.print("  " + i);
        }
     System.out.println("\nGuess the number between 1 and 100. You have 3 attempts.");

            int n=75;
             System.out.print("Enter your guess: ");
             int guess=sc.nextInt();




             if(guess>n)
             System.out.println("Try a smaller number.");
             else if(guess<n)
             System.out.println("Try a larger number.");


            if(n==guess){
               System.out.println("Congratulations! You guessed the correct number.");

        }

        else{
                System.out.println("Incorrect guess left with 2 attempts");
}

        int guess1=sc.nextInt();
        if(guess1>n)
             System.out.println("Try a smaller number.");
             else if(guess1<n)
             System.out.println("Try a larger number.");

        if(n==guess1){
            System.out.println("Congratulations! You guessed the correct number.");
        }
        else{
            System.out.println("Incorrect guess left with 1 attempts");
        }

        int guess2=sc.nextInt();
        // if(guess2>n)
        //      System.out.println("Try a smaller number.");
        //      else if(guess2<n)
        //      System.out.println("Try a larger number.");
        if(n==guess2){
            System.out.println("Congratulations! You guessed the correct number.");
        }
        else{
    System.out.println("Sorry, you've run out of attempts. The correct number was " + n + ".");
            }
    }

}





// import java.util.*;

// public class numbergame {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Random random = new Random();
//         int targetNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
//         int attempts = 3;

//         System.out.println("Guess the number between 1 and 100. You have 3 attempts.");

//         while (attempts > 0) {
//             System.out.print("Enter your guess: ");
//             int guess = sc.nextInt();

//             if (guess == targetNumber) {
//                 System.out.println("Congratulations! You guessed the correct number.");
//                 break; // Exit the loop if the guess is correct
//             } else {
//                 System.out.println("Incorrect guess.");
//                 attempts--;

//                 if (attempts > 0) {
//                     System.out.println("You have " + attempts + " attempts left.");
//                     if (guess > targetNumber) {
//                         System.out.println("Try a smaller number.");
//                     } else {
//                         System.out.println("Try a larger number.");
//                     }
//                 }
//             }
//         }

//         if (attempts == 0) {
//             System.out.println("Sorry, you've run out of attempts. The correct number was " + targetNumber + ".");
//         }

//         sc.close();
//     }
// }