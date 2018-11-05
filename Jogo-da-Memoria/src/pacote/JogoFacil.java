package pacote;

import javax.swing.*;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.*;
import java.math.*;

public class JogoFacil extends JFrame { //implements Jogo
	private JButton carta;
	MouseEvent clique;
	private final ImageIcon[] arrayFundos = {
			new ImageIcon("01.jpg"),
			new ImageIcon("02.jpg")
	};
	
		public JogoFacil() {
			super("Jogo da Memoria");
			setLayout(new GridBagLayout());
			arrayFundos[0] = new ImageIcon(getClass().getResource("FUNDO.jpg"));
			carta = new JButton(arrayFundos[0]);
			add(carta);
			carta.addMouseListener(
					new MouseListener() {

						@Override
						public void mouseClicked(MouseEvent arg0) {
							arrayFundos[0] = new ImageIcon(getClass().getResource("01.jpg"));
							carta.setIcon(arrayFundos[0]);
						}

						@Override
						public void mouseEntered(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void mouseExited(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void mousePressed(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void mouseReleased(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
					}
					);
		}
		
		
		
}


