package Gamepieces;

import java.util.*;

public class Agent extends Gamepiece {
    // The likelihood of the agent picking each of the four directions
    //      Left, right, up, down
    double [] strategy;
    // When a random number is generated, if it is between the bounds assigned to an action, agent does that action
    // Based on the agent's strategy
    // Ex. if 12 is picked, and that's between the lower and upper bounds for left, agent goes left
    //      Left lower, left upper, right lower, right upper, up lower, up upper, down lower, down upper
    // Between 0 and 99, so it's an easy thing to calculate & use
    int [] bounds;
    // A random number generator for the agent to use to make decisions
    Random rand = new Random();

    private void setBounds() {
        bounds = new int[4];
        // Setting the left bounds
        int current = 0;
        current += (strategy[0] * 100);
        bounds[0] = current;

        // Setting the right bounds
        current += (strategy[1] * 100) + 1;
        bounds[1] = current;

        // Setting the up bounds
        current += (strategy[2] * 100) + 1;
        bounds[2] = current;

        // Setting the down bounds
        current += (strategy[3] * 100) + 1;
        bounds[3] = current;

    }

    //Create a new agent, with a strategy
    public Agent(double[] strategy) {
        super();
        this.strategy = strategy;
        setBounds();
    }

    // Create a new agent, with its position and a strategy
    public Agent(int row, int col, double[] strategy) {
        super(row, col);
        this.strategy = strategy;
        setBounds();
    }

    // Allows the agent to make a decision about what direction to move in
    // Outputs an int representing the direction
    //      0 = left; 1 = right; 2 = up; 3 = down
    public int makeDecision () {
        int choice = rand.nextInt(100);
        for (int i = 0; i < 4; i++) {
            if (choice < bounds[i]) {
                return i;
            }
        }
        return 0;
    }

}
