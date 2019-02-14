public class Cell {

    /**
     * Alive (true) or dead (false)
     */
    private boolean state;

    private int positionX;
    private int positionY;

    public String toString()
    {
        return this.state ? "*" : "-";
    }

    Cell(boolean state, int positionX, int positionY) {
        this.state = state;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    void setState(boolean state) {
        this.state = state;
    }

    boolean getState() {
        return state;
    }

    int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
}
