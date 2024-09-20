import java.util.Scanner;

public class aiRiddleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Define an array of riddles and their array of answers.

        String[] riddles = {
                "What has a neck but no head?",
                "What is full of holes but still holds water?",
                "What has many rings but no fingers?",
                "What comes down but never goes up?",
                "I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?",
                "The more you take, the more you leave behind. What am I?",
                "What is more useful when it is broken?",
                "I'm not alive, but I can grow; I don't have lungs, but I need air; I don't have a mouth, but water kills me. What am I?"
                
        };

        String[] answers = {
                "A bottle",
                "A sponge",
                "A phone",
                "Rain",
                "An echo",
                "Footsteps",
                "An egg",
                "A fire"
                
        };

        // Define hints for each riddle

        String[] hints = {
                "Hint: It is used to fill water",
                "Hint: It is very soft",
                "Hint: We use it daily",
                "Hint: A natural source of water",
                "Hint: This thing is known for its ability to reflect sound.",
                "Hint: Think about what you leave behind when you walk.",
                "Hint: We can eat it",
                "Hint: It produces heat and light."
        };

        int numRiddles = riddles.length;

        while (true) {
            int randomIndex = (int) (Math.random() * numRiddles);
            String selectedRiddles = riddles[randomIndex];
            String correctAnswer = answers[randomIndex];
            String hint = hints[randomIndex];

            // Display the riddle to the user
            System.out.println("Riddle : " + selectedRiddles);

            // Get user's answer
            guess : ;
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!!!");
                score++;
            } else {
                // If the answer is incorrect offer a hint
                System.out.println("Wrong!, Would you like to take a hint? (yes/no)");
                String giveHint = scanner.nextLine().toLowerCase();
                if (giveHint.equals("yes")) {
                    System.out.println(hint);
            }

            // Allow the user to continue or exit.
            System.out.println("Continue playing? (yes/no)");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }

        // Display final score.
        System.out.println("Your final Score is :" + score);
        System.out.println("Thanks for playing");
    }
    }
}
