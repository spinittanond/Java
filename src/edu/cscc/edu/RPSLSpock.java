package edu.cscc.edu;

import java.util.Random;

/**
 * @author Suvichada Pinittanond
 */


public class RPSLSpock {
    public static String banana;
    static Random rand = new Random(System.currentTimeMillis());
    public static final String ROCK = "rock";
    public static final String PAPER = "paper";
    public static final String SCISSORS = "scissors";
    public static final String LIZARD = "lizard";
    public static final String SPOCK = "spock";

    public RPSLSpock() {
    }

    /**
     *
     * @param pick Pulling users pick from Main
     * @return Checks if users pick is valid
     */
    public static boolean isValidPick(String pick) {
        if (pick == null) {
            return false;
        } else {
            pick = pick.trim();
            return "rock".equalsIgnoreCase(pick) || "paper".equalsIgnoreCase(pick) || "scissors".equalsIgnoreCase(pick) || "lizard".equalsIgnoreCase(pick) || "spock".equalsIgnoreCase(pick);
        }
    }

    /**
     * @return computer generates opposing pick
     */
    public static String generatePick() {
        String pick = null;
        switch(rand.nextInt(5)) {
            case 0:
                pick = "rock";
                break;
            case 1:
                pick = "paper";
                break;
            case 2:
                pick = "scissors";
                break;
            case 3:
                pick = "lizard";
                break;
            case 4:
                pick = "spock";
        }

        return pick;
    }

    /**
     * @param c_pick computers pick
     * @param h_pick users pick
     * @return Checks if computer or user won
     */
    public static boolean isComputerWin(String c_pick, String h_pick) {
        h_pick = h_pick.toLowerCase();
        return "rock".equals(c_pick) && ("scissors".equals(h_pick) || "lizard".equals(h_pick)) || "paper".equals(c_pick) && ("rock".equals(h_pick) || "spock".equals(h_pick)) || "scissors".equals(c_pick) && ("paper".equals(h_pick) || "lizard".equals(h_pick)) || "lizard".equals(c_pick) && ("paper".equals(h_pick) || "spock".equals(h_pick)) || "spock".equals(c_pick) && ("rock".equals(h_pick) || "scissors".equals(h_pick));
    }
}
