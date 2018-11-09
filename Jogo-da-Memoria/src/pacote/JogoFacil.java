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
			new ImageIcon(getClass().getResource("2.jpg")),
			new ImageIcon(getClass().getResource("3.jpg")),
			new ImageIcon(getClass().getResource("4.jpg")),
			new ImageIcon(getClass().getResource("5.jpg")),
			new ImageIcon(getClass().getResource("6.jpg")),
			//new ImageIcon(getClass().getResource("7.jpg"))
	};
	
		public JogoFacil() {
			super("Jogo da Memoria");
			setLayout(new GridBagLayout());
			cartas = new JButton[6];
			
			//colocando fundo
			for(int i = 0; i < 6; i++) {
			cartas[i] = new JButton(arrayFundos[0]);}
			
			//adicionando cartas ao frame?
			for(int i = 0; i < 6; i++) {
			add(cartas[i]);}
			
			
			//adicionando handlers
			ButtonHandler handler = new ButtonHandler();
			for(int i = 0; i < 6; i++) {
			cartas[i].addActionListener(handler);
			}
			
		}
		
		//clase listener com erro
	class ButtonHandler implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent event) {
			JButton source = null;
			JButton botao1 = null;
			JButton botao2 = null;
				
				while(botao1 == null && botao2 == null) {
					source = (JButton) event.getSource();
					if(botao1 == null)
						botao1 = source;
					//erro, volta botao2 nulo?
					else
						if(source == botao1)
							return;
						else
							botao2 = source;
				}
				System.out.println(botao1);
				System.out.println(botao2);
			
			}
			
			//int random = (int) (Math.random() * 6) + 1;
			//arrayFundos[0] = new ImageIcon(getClass().getResource("1.jpg"));
			//arrayFundos[1] = new ImageIcon(getClass().getResource("2.jpg"));
			//botao1.setIcon(arrayFundos[random]);			
			
			
			
		}
		
	
	}





