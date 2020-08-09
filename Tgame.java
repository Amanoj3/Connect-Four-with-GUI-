import javax.swing.*;
import java.awt.*;

public class Tgame {

    public static void setUp() {

        JFrame intro = new JFrame(); // the "frame" or the stage in the app window
        Slots gameBoard = new Slots();
        JButton resetButton = new JButton("Reset");

        JLabel redWin = new JLabel("Red Won!");
        JLabel blueWin = new JLabel("Blue Won!");
        JLabel drawn = new JLabel("Game Drawn!");

        redWin.setBounds(200,20,150,30);
        blueWin.setBounds(200,20,150,30);
        drawn.setBounds(200,20,150,30);

        redWin.setFont(new Font("Verdana", Font.BOLD,18));
        blueWin.setFont(new Font("Verdana", Font.BOLD,18));
        drawn.setFont(new Font("Verdana", Font.BOLD,18));

        redWin.setVisible(false);
        blueWin.setVisible(false);
        drawn.setVisible(false);

        intro.add(redWin);
        intro.add(blueWin);
        intro.add(drawn);

        // initialize and allocate memory for Jbuttons
        // you push the button to insert a coin into the column of your choice

        JButton a = new JButton("A");
        JButton b = new JButton("B");
        JButton c = new JButton("C");
        JButton d = new JButton("D");
        JButton e = new JButton("E");
        JButton f = new JButton("F");
        JButton g = new JButton("G");


        a.setBounds(115,600,45,20);
        b.setBounds(175,600,45,20);
        c.setBounds(235,600,45,20);
        d.setBounds(295,600,45,20);
        e.setBounds(355,600,45,20);
        f.setBounds(415,600,45,20);
        g.setBounds(475,600,45,20);

        resetButton.setBounds(100,50,90,30);

        //images for the connect four slots (to do)

        //adding buttons and their respective actionListeners

        a.addActionListener(e1 -> {
            //System.out.println("YeEeEeE\n");
            gameBoard.receiveMoveSignal('A');
            if (gameBoard.getWhoWon() == "Blue" || gameBoard.getWhoWon() == "Red"
                    || gameBoard.getWhoWon() == "It's a draw!") {

                if (gameBoard.getWhoWon() == "Blue") {
                    blueWin.setVisible(true);
                }

                if (gameBoard.getWhoWon() == "Red") {
                    redWin.setVisible(true);
                }

                if (gameBoard.getWhoWon() == "It's a draw!") {
                    drawn.setVisible(true);
                }

                a.setEnabled(false);
                b.setEnabled(false);
                c.setEnabled(false);
                d.setEnabled(false);
                e.setEnabled(false);
                f.setEnabled(false);
                g.setEnabled(false);
            }
        });

        b.addActionListener(e12 -> {
            //System.out.println("YeEeEeE\n");
            gameBoard.receiveMoveSignal('B');
            if (gameBoard.getWhoWon() == "Blue" || gameBoard.getWhoWon() == "Red"
                    || gameBoard.getWhoWon() == "It's a draw!") {

                if (gameBoard.getWhoWon() == "Blue") {
                    blueWin.setVisible(true);
                }

                if (gameBoard.getWhoWon() == "Red") {
                    redWin.setVisible(true);
                }

                if (gameBoard.getWhoWon() == "It's a draw!") {
                    drawn.setVisible(true);
                }

                a.setEnabled(false);
                b.setEnabled(false);
                c.setEnabled(false);
                d.setEnabled(false);
                e.setEnabled(false);
                f.setEnabled(false);
                g.setEnabled(false);
            }
        });

        c.addActionListener(e13 -> {
            //System.out.println("YeEeEeE\n");
            gameBoard.receiveMoveSignal('C');
            if (gameBoard.getWhoWon() == "Blue" || gameBoard.getWhoWon() == "Red"
                    || gameBoard.getWhoWon() == "It's a draw!") {

                if (gameBoard.getWhoWon() == "Blue") {
                    blueWin.setVisible(true);
                }

                if (gameBoard.getWhoWon() == "Red") {
                    redWin.setVisible(true);
                }

                if (gameBoard.getWhoWon() == "It's a draw!") {
                    drawn.setVisible(true);
                }

                a.setEnabled(false);
                b.setEnabled(false);
                c.setEnabled(false);
                d.setEnabled(false);
                e.setEnabled(false);
                f.setEnabled(false);
                g.setEnabled(false);
            }
        });

        d.addActionListener(e14 -> {
            //System.out.println("YeEeEeE\n");
            gameBoard.receiveMoveSignal('D');
            if (gameBoard.getWhoWon() == "Blue" || gameBoard.getWhoWon() == "Red"
                    || gameBoard.getWhoWon() == "It's a draw!") {

                if (gameBoard.getWhoWon() == "Blue") {
                    blueWin.setVisible(true);
                }

                if (gameBoard.getWhoWon() == "Red") {
                    redWin.setVisible(true);
                }

                if (gameBoard.getWhoWon() == "It's a draw!") {
                    drawn.setVisible(true);
                }

                a.setEnabled(false);
                b.setEnabled(false);
                c.setEnabled(false);
                d.setEnabled(false);
                e.setEnabled(false);
                f.setEnabled(false);
                g.setEnabled(false);
            }
        });

        e.addActionListener(e15 -> {
            //System.out.println("YeEeEeE\n");
            gameBoard.receiveMoveSignal('E');
            if (gameBoard.getWhoWon() == "Blue" || gameBoard.getWhoWon() == "Red"
                    || gameBoard.getWhoWon() == "It's a draw!") {

                if (gameBoard.getWhoWon() == "Blue") {
                    blueWin.setVisible(true);
                }

                if (gameBoard.getWhoWon() == "Red") {
                    redWin.setVisible(true);
                }

                if (gameBoard.getWhoWon() == "It's a draw!") {
                    drawn.setVisible(true);
                }

                a.setEnabled(false);
                b.setEnabled(false);
                c.setEnabled(false);
                d.setEnabled(false);
                e.setEnabled(false);
                f.setEnabled(false);
                g.setEnabled(false);
            }
        });

        f.addActionListener(e16 -> {
            //System.out.println("YeEeEeE\n");
            gameBoard.receiveMoveSignal('F');
            if (gameBoard.getWhoWon() == "Blue" || gameBoard.getWhoWon() == "Red"
                    || gameBoard.getWhoWon() == "It's a draw!") {

                if (gameBoard.getWhoWon() == "Blue") {
                    blueWin.setVisible(true);
                }

                if (gameBoard.getWhoWon() == "Red") {
                    redWin.setVisible(true);
                }

                if (gameBoard.getWhoWon() == "It's a draw!") {
                    drawn.setVisible(true);
                }

                a.setEnabled(false);
                b.setEnabled(false);
                c.setEnabled(false);
                d.setEnabled(false);
                e.setEnabled(false);
                f.setEnabled(false);
                g.setEnabled(false);
            }
        });

        g.addActionListener(e17 -> {
            //System.out.println("YeEeEeE\n");
            gameBoard.receiveMoveSignal('G');
            if (gameBoard.getWhoWon() == "Blue" || gameBoard.getWhoWon() == "Red"
                    || gameBoard.getWhoWon() == "It's a draw!") {

                if (gameBoard.getWhoWon() == "Blue") {
                    blueWin.setVisible(true);
                }

                if (gameBoard.getWhoWon() == "Red") {
                    redWin.setVisible(true);
                }

                if (gameBoard.getWhoWon() == "It's a draw!") {
                    drawn.setVisible(true);
                }

                a.setEnabled(false);
                b.setEnabled(false);
                c.setEnabled(false);
                d.setEnabled(false);
                e.setEnabled(false);
                f.setEnabled(false);
                g.setEnabled(false);
            }
        });

        resetButton.addActionListener(e18 -> {
            intro.setVisible(false);
            System.out.println("Resetting..");
            main(null);
        });

        intro.add(a);
        intro.add(b);
        intro.add(c);
        intro.add(d);
        intro.add(e);
        intro.add(f);
        intro.add(g);
        intro.add(resetButton);
        intro.setTitle("Connect Four");

        for (int i = 0; i < gameBoard.getBoardWidth(); i++) {
            for (int k = 0; k < gameBoard.getBoardHeight(); k++) {
                intro.add(gameBoard.getBoardArray()[i][k]);
            }
        }

        intro.setSize(700,900);
        intro.setLayout(null);
        intro.setVisible(true);
        intro.setResizable(false);
    }

    public static void main(String[] args) {
        Tgame game = new Tgame();
        setUp();
    }
}