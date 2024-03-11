import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ElevensBoardTester {
    public static void main(String[] args) {
        ElevensBoard board = new ElevensBoard();
        System.out.println(board);

        System.out.println("----- Testing newGame() -----");
        board.newGame();
        System.out.println(board);

        System.out.println("----- Testing size() -----");
        System.out.println("The size of the board: " + board.size());

        System.out.println("----- Testing isEmpty() -----");
        System.out.println("Is the board empty? " + board.isEmpty());

        System.out.println("----- Testing deal() -----");
        board.deal(0);
        System.out.println(board);

        System.out.println("----- deckSize() -----");
        System.out.println(board.deckSize());
        board.deal(6);
        System.out.println(board.deckSize());

        System.out.println("----- cardAt() -----");
        System.out.println(board.cardAt(0));

        System.out.println("----- replaceSelectedCards() -----");
        System.out.println("Before: ");
        System.out.println(board);
        System.out.println("After: ");
        Integer[] arr = {2, 4, 6};
        ArrayList<Integer> x = new ArrayList<Integer>(Arrays.asList(arr));
        board.replaceSelectedCards(x);
        System.out.println(board);

        System.out.println("----- cardIndexes() of non-null -----");
        System.out.println(board.cardIndexes());

        System.out.println("----- gameIsWon() -----");
        System.out.println(board.gameIsWon());

        System.out.println("----- isLegal() -----");
        Integer[] arr2 = {6, 8};
        ArrayList<Integer> selectedCard = new ArrayList<Integer>(Arrays.asList(arr2));
        System.out.println(board.isLegal(selectedCard));

        Integer[] arr3 = {5, 7};
        ArrayList<Integer> selectedCard2 = new ArrayList<Integer>(Arrays.asList(arr3));
        System.out.println(board.isLegal(selectedCard2));

        Scanner scan = new Scanner(System.in);
        System.out.println("Pick 3 cards by index");
        int element1 = scan.nextInt();
        scan.nextLine();
        int element2 = scan.nextInt();
        scan.nextLine();
        int element3 = scan.nextInt();
        Integer[] checkJQK = {element1, element2, element3};
        ArrayList<Integer> selectedCard3 = new ArrayList<Integer>(Arrays.asList(checkJQK));
        System.out.println(board.isLegal(selectedCard3));
        Integer[] arr4 = {1, 4};
        ArrayList<Integer> selectedCard4 = new ArrayList<Integer>(Arrays.asList(arr4));
        System.out.println(board.isLegal(selectedCard4));

        System.out.println("----- anotherPlayIsPossible() -----");
        System.out.println(board.anotherPlayIsPossible());

        System.out.println("----- cardIndexes() of non-null -----");
        System.out.println(board.cardIndexes());
        for (int i = 0; i < 39; i++) {
            board.deal(0);
        }
        System.out.println(board.deckSize());
        System.out.println(board);
        System.out.println(board.cardIndexes());
    }
}