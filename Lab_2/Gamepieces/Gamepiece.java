package Gamepieces;

public class Gamepiece {
    // The row and column the piece is in (it's location)
    int row;
    int col;

    public Gamepiece() {
        this.row = 0;
        this.col = 0;
    }

    public Gamepiece(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void setLocation(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return this.row;
    }

    public int getCol () {
        return this.col;
    }
}
