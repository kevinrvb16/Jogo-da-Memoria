package pacote;

import javax.swing.*;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.*;

public class JogoFacil extends JFrame {
	private JButton carta;
	Icon fundo1;
	MouseEvent clique;
	
		public JogoFacil() {
			super("Jogo da Memoria");
			
			setLayout(new GridBagLayout());
			fundo1 = new ImageIcon(getClass().getResource("FUNDO.jpg"));
			carta = new JButton(fundo1);
			add(carta);
			carta.addMouseListener(
					new MouseListener() {

						@Override
						public void mouseClicked(MouseEvent arg0) {
							fundo1 = new ImageIcon(getClass().getResource("01.jpg"));
							carta.setIcon(fundo1);
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
