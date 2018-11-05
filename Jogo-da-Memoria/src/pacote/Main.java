package pacote;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
            JogoFacil frameJogo= new JogoFacil();
            frameJogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frameJogo.setSize(800, 500);
            frameJogo.setVisible(true);
            frameJogo.setResizable(true);
            }
}

