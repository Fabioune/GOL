class Board {

    /**
     * Size X
     */
    private int gridX;
    /**
     * Size Y
     */
    private int gridY;

    /**
     * current Grid to draw
     */
    private Cell[][] grid;

    /**
     * Current turn of game
     */
    private int currentTurn;

    Board(int gridX, int gridY) {
        this.gridX = gridX;
        this.gridY = gridY;

        this.populate();
    }

    private void populate()
    {
        grid = new Cell[this.getGridX()][this.getGridY()];

        for (int i = 0; i < this.getGridX(); i++) {
            for (int j = 0; j < this.getGridY(); j++) {
                grid[i][j] = new Cell(Math.random() > 0.9, i, j);
            }
        }
    }

    void newTurn()
    {
        Cell currentCell;
        int myNeighbors;

        for (int i = 0; i < this.getGridX(); i++) {
            for (int j = 0; j < this.getGridY(); j++) {
                currentCell = getCellByPosition(i, j);

                myNeighbors = this.countNeighborsOfCell(currentCell);

                if (! currentCell.getState() && myNeighbors == 3) {
                    currentCell.setState(true);
                } else if (currentCell.getState() && (myNeighbors < 2 || myNeighbors > 3)) {
                    currentCell.setState(false);
                }
            }
        }

        currentTurn++;
    }

    private int countNeighborsOfCell(Cell cell)
    {
        int counter = 0;

        for (int x = -1; x <= 1; x++) {
            for (int y = -1; y <= 1; y++) {
                if (this.hasCell(cell.getPositionX() + x, cell.getPositionY() + y)) {
                    if (x == 0 && y == 0) {

                    } else {
                        if (this.getCellByPosition(cell.getPositionX() + x, cell.getPositionY() + y).getState()) {
                            counter++;
                        }
                    }
                }
            }
        }
        return counter;
    }

    Cell getCellByPosition(int x, int y)
    {
        return this.grid[x][y];
    }

    private boolean hasCell(int x, int y)
    {
        return x < this.gridX && x >= 0 && y < this.gridY && y >= 0;
    }

    int getGridX() {
        return gridX;
    }

    int getGridY() {
        return gridY;
    }

//    public int getCurrentTurn() {
//        return currentTurn;
//    }
}
