import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ElevensBoardRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ElevensBoard board = new ElevensBoard();
        System.out.println(board);

        while (board.anotherPlayIsPossible()) {
            List<Integer> selectedCard = new ArrayList<Integer>();
            System.out.print("Enter two or three cards to remove: ");
            String cards = scan.nextLine();

            for (int i = 0; i < cards.length(); i++) {
                if (!cards.substring(i, i + 1).equals(" ")) {
                    Integer cardsToInt = Integer.parseInt(cards.substring(i, i + 1));
                    selectedCard.add(cardsToInt);
                }
            }

            if (board.isLegal(selectedCard)) {
                board.replaceSelectedCards(selectedCard);
            } else {
                System.out.println("The selected cards do not equal to 11, or they are not Jack, Queen, and King.");
            }

            System.out.println(board);
        }

        if (board.gameIsWon()) {
            System.out.println("Congrats! You win the game!");
        } else {
            System.out.println("You lose the game :(");
        }
        

    }
}
