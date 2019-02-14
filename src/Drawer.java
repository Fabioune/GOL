class Drawer {

    static void draw(Board board)
    {
        System.out.println("X".repeat(board.getGridY() + 2));

        for (int i = 0; i < board.getGridX(); i++) {
            System.out.print("X");
            for (int j = 0; j < board.getGridY(); j++) {
                System.out.print(board.getCellByPosition(i, j));
            }
            System.out.println("X");
        }

        System.out.print("X".repeat(board.getGridY() + 2));

        try {

            Thread.sleep(300);
        } catch (InterruptedException e) {

        }
    }
}
