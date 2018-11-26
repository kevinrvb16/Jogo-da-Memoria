package pacote;

import javax.swing.*;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class JogoFacil extends JogosMae{
	protected Carta[] cartas;
	private JPanel painelA;
	boolean comecou = false;
	int contaClique = 0;
	MouseEvent clique;
	private ImageIcon[] cartaComPar = new ImageIcon[8];
	public final ImageIcon imagemFundo = new ImageIcon(getClass().getResource("FUNDO.jpg"));
	public final ImageIcon[] arrayFundos = {
			new ImageIcon(getClass().getResource("1.jpg")),
			new ImageIcon(getClass().getResource("2.jpg")),
			new ImageIcon(getClass().getResource("3.jpg")),
			new ImageIcon(getClass().getResource("4.jpg")),   
			new ImageIcon(getClass().getResource("5.jpg")),
			new ImageIcon(getClass().getResource("6.jpg")),
			new ImageIcon(getClass().getResource("7.jpg")),
			new ImageIcon(getClass().getResource("8.jpg")),
			new ImageIcon(getClass().getResource("9.jpg")),
			new ImageIcon(getClass().getResource("10.jpg")),
			new ImageIcon(getClass().getResource("11.jpg")),
			new ImageIcon(getClass().getResource("12.jpg")),
			new ImageIcon(getClass().getResource("13.jpg")),
			new ImageIcon(getClass().getResource("14.jpg")),
			new ImageIcon(getClass().getResource("15.jpg")),
			new ImageIcon(getClass().getResource("16.jpg")),
			new ImageIcon(getClass().getResource("17.jpg")),
			new ImageIcon(getClass().getResource("18.jpg")),
			new ImageIcon(getClass().getResource("19.jpg")),
			new ImageIcon(getClass().getResource("20.jpg")),
			new ImageIcon(getClass().getResource("21.jpg")),
			new ImageIcon(getClass().getResource("22.jpg")),
			new ImageIcon(getClass().getResource("23.jpg")),
			new ImageIcon(getClass().getResource("24.jpg")),
			new ImageIcon(getClass().getResource("25.jpg")),
			new ImageIcon(getClass().getResource("26.jpg")),
			new ImageIcon(getClass().getResource("27.jpg")),
			new ImageIcon(getClass().getResource("28.jpg")),
			new ImageIcon(getClass().getResource("29.jpg")),
			new ImageIcon(getClass().getResource("30.jpg")),
	};
      
		public JogoFacil() {
			
			super();
						
            int qtdCartas = 8;
            int qtdImagens = 4;
			painelA = new JPanel();
			add(painelA);
			painelA.setLayout(new GridLayout(2, 4));
			cartas = new Carta[qtdCartas];
            
			//??????????????????????????????????????????????????????????????????????????????????????
            int numeroCarta = 1;
			for(int i = 0; i < qtdCartas; i++) {
				cartas[i] = new Carta(numeroCarta);
                numeroCarta++;
                if(numeroCarta > qtdImagens){
                numeroCarta = 1;
                }
			}
			
			//adicionando imagem de fundo para todas as cartas
			for(int i = 0; i < qtdCartas; i++) {
				cartas[i].setIcon(imagemFundo);
			}
								
			//adicionando todas as cartas ao frame
			for(int i = 0; i < qtdCartas; i++) {
				painelA.add(cartas[i]);
			}
			
			//adicionando handlers a todas as cartas
			ButtonHandler handler = new ButtonHandler();
			for(int i = 0; i < qtdCartas; i++) {
				cartas[i].addActionListener(handler);
			}                       
		}
		
		public void sortear() {
			ImageIcon aux;
			Random random = new Random();
			for (int i = 0; i < 29; i++) {
				aux = arrayFundos[i];
				int rng = random.nextInt(30);//rng = Random Number Generators
				arrayFundos[i] = arrayFundos[rng];
				arrayFundos[rng] = aux;
			}

			cartaComPar[0] = arrayFundos[0];
			cartaComPar[1] = arrayFundos[1];
			cartaComPar[2] = arrayFundos[2];
			cartaComPar[3] = arrayFundos[3];
			cartaComPar[4] = arrayFundos[0];
			cartaComPar[5] = arrayFundos[1];
			cartaComPar[6] = arrayFundos[2];
			cartaComPar[7] = arrayFundos[3];
			
		}
                  
	//classe listener com erro
	class ButtonHandler implements ActionListener {
            Carta botao1 = null;
			Carta botao2 = null;
            boolean botao2Clicado = false;
            
		@Override
		public void actionPerformed(ActionEvent event) {
			if (contaClique == 2) {
            	for(int i = 0; i < 8; i++) {
    				cartas[i].setIcon(imagemFundo);
    			}
            	contaClique = 0;
            }
            contaClique++;
			Random num = new Random();
			Carta botao = (Carta) event.getSource();
			if (!comecou) { 
				sortear(); 
			}
			comecou = true;
            botao.setIcon(cartaComPar[num.nextInt(4)]);
            
            
				/*//System.out.println("botao1= "+botao1);
				//System.out.println("botao2= "+botao2);
				while((botao1 == null || botao2 == null) && botao2Clicado == false) {
					source = (JButton) event.getSource();
					if(botao1 == null){
						botao1 = source;
                                                System.out.println(botao1);}
					else
						if(source == botao1)
							return;
                                                else{
                                                        botao2Clicado = true;
							botao2 = source;}
				}
				System.out.println(botao1);
				System.out.println(botao2);*/
			
                
              
                //int random = (int) (Math.random() * 6) + 1;
                //botao1.setIcon(arrayFundos[random]);		
                
                //metodo compara cartas
                //if(botao1.getImagemFundo() == botao2.getImagemFundo()) {}
			//}	
			
			//public void comparaCartas() 
		}   
	}
}