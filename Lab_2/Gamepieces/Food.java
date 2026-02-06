package Gamepieces;

public class Food extends Gamepiece{
    boolean eaten = false;

    public Food() {
        super();
    }

    public Food(int row, int col) {
        super(row, col);
    }

    public void getEaten() {
        eaten = true;
        row = -1;
        col = -1;
    }
}
