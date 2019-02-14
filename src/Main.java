
public class Main {
    public static void main(String[] args) {
        Board board = new Board(30, 250);
        Drawer.draw(board);

        int i = 0;

        while(true) {
            board.newTurn();
            Drawer.draw(board);
            i++;
        }
    }
}
