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
	private JButton[] cartas;
	MouseEvent clique;
	private final ImageIcon[] arrayFundos = {
			new ImageIcon(getClass().getResource("FUNDO.jpg")),
			new ImageIcon(getClass().getResource("1.jpg")),
			new ImageIcon(getClass().getResource("2.jpg"))
	};
	
		public JogoFacil() {
			super("Jogo da Memoria");
			setLayout(new GridBagLayout());
			cartas = new JButton[2];
			
			//colocando fundo
			for(int i = 0; i < 2; i++) {
			cartas[i] = new JButton(arrayFundos[0]);}
			
			//adicionando cartas ao frame?
			for(int i = 0; i < 2; i++) {
			add(cartas[i]);}
			
			
			//adicionando handlers
			ButtonHandler handler = new ButtonHandler();
			for(int i = 0; i < 2; i++) {
			cartas[i].addActionListener(handler);
			}
			
		}
			
		
		
		
		//clase listener com erro
	class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			JButton botao1 = (JButton) event.getSource();
			int random = (int) (Math.random() * 2);
			arrayFundos[0] = new ImageIcon(getClass().getResource("1.jpg"));
			arrayFundos[1] = new ImageIcon(getClass().getResource("2.jpg"));
			botao1.setIcon(arrayFundos[random]);
			System.out.println(botao1);
			
		}
		
	}
	}




