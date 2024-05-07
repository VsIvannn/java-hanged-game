import java.util.Scanner;

public class hanged {
    public static void main(String[] args) {
        // For the user to write
        Scanner sc = new Scanner(System.in);

        // Declarations and assignments
        String guessWord = "yourword";
        int maxAttempts = 3;
        int attempts = 0;
        boolean guessedWord = false;

        // Arrangements
        char[] guessedLetters = new char[guessWord.length()];

        for (int i = 0; i < guessedLetters.length; i++) {
            guessedLetters[i] = '_';

        }

        while (!guessedWord && attempts < maxAttempts) {

            System.out.println(
                    "Word to guess: " + String.valueOf(guessedLetters) + " (" + guessWord.length() + " letras)");

            System.out.println("Enter a letter, please");

            char letter = Character.toLowerCase(sc.next().charAt(0));

            boolean correctLetter = false;

            for (int i = 0; i < guessWord.length(); i++) {
                if (guessWord.charAt(i) == letter) {
                    guessedLetters[i] = letter;
                    correctLetter = true;
                }

            }
            if (!correctLetter) {
                attempts++;
                System.out.println("Wrong letter, you have left " + (maxAttempts - attempts) + " attempts");
            }
            if (String.valueOf(guessedLetters).equals(guessWord)) {
                guessedWord = true;
                System.out.println("¡Congratulations!, you guessed it the secret word " + guessWord);
            }

        }

        if (!guessedWord) {
            System.out.println("You ran out of attempts, GAME OVER");

        }
        sc.close();

    }

}