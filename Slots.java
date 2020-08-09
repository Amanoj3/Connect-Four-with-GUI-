import javax.swing.*;

public class Slots {
    private int numSlots;
    private final int boardHeight;
    private final int boardWidth;
    private int moveCounter;
    private final int[] inUse;

    private final JLabel[][] boardArray; // empty slots at the beginning
    private final ImageIcon blueIcon;
    private final ImageIcon redIcon;
    private String whoWon;

    JLabel[][] getBoardArray() {
        return this.boardArray;
    }

    int getNumSlots() {
        return this.numSlots;
    }

    int getBoardHeight() {
        return this.boardHeight;
    }

    int getBoardWidth() {
        return this.boardWidth;
    }

    int getMoveCounter() {
        return this.moveCounter;
    }

    String getWhoWon() {
        return whoWon;
    }

    Slots() {
        whoWon = "Nobody";
        boardHeight = 6;
        boardWidth = 7;
        numSlots = boardHeight * boardWidth;
        // to determine coordinates of slots
        int startingX = 100;
        int startingY;
        int incrementFactorX = 60;
        int incrementFactorY = 80;
        moveCounter = 0;
        inUse = new int[boardWidth]; // inUse[0..6] correspond to columns A-G, respectively

        for (int x = 0; x < boardWidth; x++) {
            inUse[x] = -1;
        }

        boardArray = new JLabel[boardWidth][boardHeight];

        ImageIcon emptyIcon = new ImageIcon("src/Icon.png");
        blueIcon = new ImageIcon("src/Icon_Blue.png");
        redIcon = new ImageIcon("src/Icon_Red.png");

        for (int i = 0; i < boardWidth; i++) { // format: [WIDTH][HEIGHT]
            startingY = 400;
            for (int j = 0; j < boardHeight; j++) {
                boardArray[i][j] = new JLabel();
                boardArray[i][j].setIcon(emptyIcon);
                boardArray[i][j].setBounds(startingX, startingY,200,300);
                startingY = startingY - incrementFactorY;
            }
            startingX = startingX + incrementFactorX;
        }

    }

    boolean winningSequence() {
        /*ImageIcon x = (ImageIcon) boardArray[0][0].getIcon();
        if (x == blueIcon) {
            System.out.println("Works!");
        }*/

        //horizontal checks
        for (int y = 0; y < boardHeight; y++) {

            for (int x = 0; x < boardWidth; x++) {

                if (x < 4) { // to prevent accessing what's out of bounds

                    if (((ImageIcon) boardArray[x][y].getIcon() == blueIcon && (ImageIcon) boardArray[x+1][y].getIcon() == blueIcon
                            && (ImageIcon) boardArray[x+2][y].getIcon() == blueIcon && (ImageIcon) boardArray[x+3][y].getIcon() == blueIcon))
                    {
                        System.out.println("Blue wins horizontally L-R");
                        whoWon = "Blue";
                        return true;
                    }

                    else if (((ImageIcon) boardArray[x][y].getIcon() == redIcon && (ImageIcon) boardArray[x+1][y].getIcon() == redIcon
                            && (ImageIcon) boardArray[x+2][y].getIcon() == redIcon && (ImageIcon) boardArray[x+3][y].getIcon() == redIcon))
                    {
                        System.out.println("Red wins horizontally L-R");
                        whoWon = "Red";
                        return true;
                    }

                }

                else {

                    if ((ImageIcon) boardArray[x][y].getIcon() == blueIcon && (ImageIcon) boardArray[x-1][y].getIcon() == blueIcon &&
                            boardArray[x-2][y].getIcon() == blueIcon && boardArray[x-3][y].getIcon() == blueIcon) {
                        System.out.println("Blue wins horizontally R-L");
                        whoWon = "Blue";
                        return true;
                    }

                    else if ((ImageIcon) boardArray[x][y].getIcon() == redIcon && (ImageIcon) boardArray[x-1][y].getIcon() == redIcon &&
                            boardArray[x-2][y].getIcon() == redIcon && boardArray[x-3][y].getIcon() == redIcon) {
                        System.out.println("Red wins horizontally R-L");
                        whoWon = "Red";
                        return true;
                    }

                }

            }
        } // end of horizontal checks
        //begin vertical checks

        for (int x = 0; x < boardWidth; x++) {

            for (int y = 0; y < boardHeight; y++) {

                if (y <= 2) {

                    if (((ImageIcon) boardArray[x][y].getIcon() == blueIcon && (ImageIcon) boardArray[x][y+1].getIcon() == blueIcon &&
                            (ImageIcon) boardArray[x][y+2].getIcon() == blueIcon && boardArray[x][y+3].getIcon() == blueIcon)) {
                        System.out.println("Blue wins vertically");
                        whoWon = "Blue";
                        return true;
                    }

                    else if (((ImageIcon) boardArray[x][y].getIcon() == redIcon && (ImageIcon) boardArray[x][y+1].getIcon() == redIcon &&
                            (ImageIcon) boardArray[x][y+2].getIcon() == redIcon && boardArray[x][y+3].getIcon() == redIcon)) {
                        System.out.println("Red wins vertically");
                        whoWon = "Red";
                        return true;
                    }
                }

                else {

                    if (((ImageIcon) boardArray[x][y].getIcon() == blueIcon && (ImageIcon) boardArray[x][y-1].getIcon() == blueIcon &&
                            (ImageIcon) boardArray[x][y-2].getIcon() == blueIcon && boardArray[x][y-3].getIcon() == blueIcon)) {
                        System.out.println("Blue wins vertically");
                        whoWon = "Blue";
                        return true;
                    }

                    else if (((ImageIcon) boardArray[x][y].getIcon() == redIcon && (ImageIcon) boardArray[x][y-1].getIcon() == redIcon &&
                            (ImageIcon) boardArray[x][y-2].getIcon() == redIcon && boardArray[x][y-3].getIcon() == redIcon)) {
                        System.out.println("Red wins vertically");
                        whoWon = "Red";
                        return true;
                    }
                }
            }
        }//end of vertical checks
        //begin ascending diagonal checks

        for (int x = 0; x < 4; x++) { // to avoid going out of bounds

            for (int y = 0; y < 3; y++) {

                if ((ImageIcon) boardArray[x][y].getIcon() == blueIcon && (ImageIcon) boardArray[x+1][y+1].getIcon() == blueIcon &&
                        (ImageIcon) boardArray[x+2][y+2].getIcon() == blueIcon && (ImageIcon) boardArray[x+3][y+3].getIcon() == blueIcon) {
                    System.out.println("Blue wins (ascending diagonal)");
                    whoWon = "Blue";
                    return true;
                }

                else if ((ImageIcon) boardArray[x][y].getIcon() == redIcon && (ImageIcon) boardArray[x+1][y+1].getIcon() == redIcon &&
                        (ImageIcon) boardArray[x+2][y+2].getIcon() == redIcon && (ImageIcon) boardArray[x+3][y+3].getIcon() == redIcon) {
                    System.out.println("Red wins (ascending diagonal)");
                    whoWon = "Red";
                    return true;
                }

            }
        }//end ascending diagonal checks
        //begin descending diagonal checks

        for (int x = 0; x < 4; x++) {

            for (int y = 5; y > 2; y--) {

                if ((ImageIcon) boardArray[x][y].getIcon() == blueIcon && (ImageIcon) boardArray[x+1][y-1].getIcon() == blueIcon
                    && (ImageIcon) boardArray[x+2][y-2].getIcon() == blueIcon && boardArray[x+3][y-3].getIcon() == blueIcon) {
                    System.out.println("Blue wins (Descending Diagonal)");
                    whoWon = "Blue";
                    return true;
                }

                else if ((ImageIcon) boardArray[x][y].getIcon() == redIcon && (ImageIcon) boardArray[x+1][y-1].getIcon() == redIcon
                        && (ImageIcon) boardArray[x+2][y-2].getIcon() == redIcon && boardArray[x+3][y-3].getIcon() == redIcon) {
                    System.out.println("Red wins (Descending Diagonal)");
                    whoWon = "Red";
                    return true;
                }

            }

        }


        return false;

    }

    void receiveMoveSignal(char move) {
       //a
        if (move == 'A') {
            inUse[0] = inUse[0] + 1;
            //System.out.println("Stack height as of now is:" + inUse[0] + "\n");
            if (inUse[0] >= boardHeight) {
                System.out.println("Error. Stack is full!");
                return;
            }
            else {
                if (moveCounter % 2 == 0) {
                    boardArray[0][inUse[0]].setIcon(blueIcon);
                }

                if (moveCounter % 2 != 0) {
                    boardArray[0][inUse[0]].setIcon(redIcon);
                }

                moveCounter = moveCounter + 1;
                numSlots = numSlots - 1;
            }
        }

        //b
        else if (move == 'B') {
            inUse[1] = inUse[1] + 1;
            //System.out.println("Stack height as of now is:" + inUse[0] + "\n");
            if (inUse[1] >= boardHeight) {
                System.out.println("Error. Stack is full!");
                return;
            }
            else {
                if (moveCounter % 2 == 0) {
                    boardArray[1][inUse[1]].setIcon(blueIcon);
                }

                if (moveCounter % 2 != 0) {
                    boardArray[1][inUse[1]].setIcon(redIcon);
                }

                moveCounter = moveCounter + 1;
                numSlots = numSlots - 1;
            }
        }
        //c
        else if (move == 'C') {
            inUse[2] = inUse[2] + 1;
            //System.out.println("Stack height as of now is:" + inUse[0] + "\n");
            if (inUse[2] >= boardHeight) {
                System.out.println("Error. Stack is full!");
                return;
            }
            else {
                if (moveCounter % 2 == 0) {
                    boardArray[2][inUse[2]].setIcon(blueIcon);
                }

                if (moveCounter % 2 != 0) {
                    boardArray[2][inUse[2]].setIcon(redIcon);
                }

                moveCounter = moveCounter + 1;
                numSlots = numSlots - 1;
            }
        }
        //d
        else if (move == 'D') {
            inUse[3] = inUse[3] + 1;
            //System.out.println("Stack height as of now is:" + inUse[0] + "\n");
            if (inUse[3] >= boardHeight) {
                System.out.println("Error. Stack is full!");
                return;
            }
            else {
                if (moveCounter % 2 == 0) {
                    boardArray[3][inUse[3]].setIcon(blueIcon);
                }

                if (moveCounter % 2 != 0) {
                    boardArray[3][inUse[3]].setIcon(redIcon);
                }

                moveCounter = moveCounter + 1;
                numSlots = numSlots - 1;
            }
        }

        //e
        else if (move == 'E') {
            inUse[4] = inUse[4] + 1;
            //System.out.println("Stack height as of now is:" + inUse[0] + "\n");
            if (inUse[4] >= boardHeight) {
                System.out.println("Error. Stack is full!");
                return;
            }
            else {
                if (moveCounter % 2 == 0) {
                    boardArray[4][inUse[4]].setIcon(blueIcon);
                }

                if (moveCounter % 2 != 0) {
                    boardArray[4][inUse[4]].setIcon(redIcon);
                }

                moveCounter = moveCounter + 1;
                numSlots = numSlots - 1;
            }
        }
        //f
        else if (move == 'F') {
            inUse[5] = inUse[5] + 1;
            //System.out.println("Stack height as of now is:" + inUse[0] + "\n");
            if (inUse[5] >= boardHeight) {
                System.out.println("Error. Stack is full!");
                return;
            }
            else {
                if (moveCounter % 2 == 0) {
                    boardArray[5][inUse[5]].setIcon(blueIcon);
                }

                if (moveCounter % 2 != 0) {
                    boardArray[5][inUse[5]].setIcon(redIcon);
                }

                moveCounter = moveCounter + 1;
                numSlots = numSlots - 1;
            }
        }
        else if (move == 'G') {
            inUse[6] = inUse[6] + 1;
            //System.out.println("Stack height as of now is:" + inUse[0] + "\n");
            if (inUse[6] >= boardHeight) {
                System.out.println("Error. Stack is full!");
                return;
            }
            else {
                if (moveCounter % 2 == 0) {
                    boardArray[6][inUse[6]].setIcon(blueIcon);
                }

                if (moveCounter % 2 != 0) {
                    boardArray[6][inUse[6]].setIcon(redIcon);
                }

                moveCounter = moveCounter + 1;
                numSlots = numSlots - 1;
            }
        }

        if (winningSequence()) {
            System.out.println("Win detected.\n");
        }

        else if (!winningSequence() && numSlots == 0) {
            whoWon = "It's a draw!";
            System.out.println("Game drawn.\n");
        }


    }
}
