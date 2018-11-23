package pacote;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
public class ControladorJogo extends JFrame {

    protected JPanel painel;
	protected JButton iniciar;
    protected JButton ranking;
    protected JButton opcaoNivel;
    //protected JButton pausar;
    protected JButton sair;
    protected String nivelSelecionado = "facil";
    protected JButton facil;
    protected JButton medio;
    protected JButton dificil;
    protected JDesktopPane desktop;
    protected ImageIcon icon;
    protected Image image;
	 
    public ControladorJogo(){
        
        super("Jogo da Memória");
        JMenuBar bar = new JMenuBar();
        JMenu menu= new JMenu("Opcões");
        JMenuItem frameInterno = new JMenuItem("Selecionar Nível");
        
        setJMenuBar(bar);
        bar.add(menu);
        menu.add(frameInterno);
        
        desktop = new JDesktopPane() {
        	public void paintComponent(Graphics g) {
            	g.drawImage(image, 0, 0, desktop.getWidth(), desktop.getHeight(), desktop);
            }
        };
        
        add(desktop);
        painel = new JPanel();
        
        frameInterno.addActionListener( 
        		new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						JInternalFrame frame = new JInternalFrame("Selecione", true, true, true, true);
						JPanel painelB = new JPanel();
						frame.add(painelB, BorderLayout.CENTER);
						frame.setSize(160, 170);
						frame.setVisible(true);
						desktop.add(frame);
						facil = new JButton(" Nível Fácil ");
						medio = new JButton(" Nível Médio ");
						dificil = new JButton(" Nível Difícil ");
						
						painelB.add(facil);
						painelB.add(medio);
						painelB.add(dificil);
						
						facil.addActionListener( new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent arg0) {
								nivelSelecionado ="facil";
								frame.setVisible(false);
							}
						});
						medio.addActionListener( new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent arg0) {
								nivelSelecionado ="médio";
								frame.setVisible(false);
							}
						});
						dificil.addActionListener( new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent arg0) {
								nivelSelecionado ="difícil";
								frame.setVisible(false);
							}	
						});
					}
        		}	
        );
        ImageIcon icon = new ImageIcon(getClass().getResource("dog.jpg"));
        image = icon.getImage();
        GridLayout grid = new GridLayout();
        
        iniciar = new JButton("START");
        iniciar.addActionListener(
        		new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						System.out.println(nivelSelecionado);
						if(nivelSelecionado.equalsIgnoreCase("facil")){
							JogoFacil jogoFacil = new JogoFacil();
							jogoFacil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							jogoFacil.setSize(800, 500);
							jogoFacil.setVisible(true);
							jogoFacil.setResizable(true);
						}
						if(nivelSelecionado.equalsIgnoreCase("médio")){
							JogoFacil jogoNormal = new JogoFacil();
							jogoNormal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							jogoNormal.setSize(800, 500);
							jogoNormal.setVisible(true);
							jogoNormal.setResizable(true);
						}
						if(nivelSelecionado.equalsIgnoreCase("difícil")){
							JogoFacil jogoDificil = new JogoFacil();
							jogoDificil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							jogoDificil.setSize(800, 500);
							jogoDificil.setVisible(true);
							jogoDificil.setResizable(true);
						}
					}
        }
        );
        ranking = new JButton("RANKING");
        ranking.addActionListener( 
        		new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						
					}
        			
        		}
        );
        
        sair = new JButton("SAIR DO JOGO");
        sair.addActionListener( 
        		new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						System.exit(EXIT_ON_CLOSE);
						
					}
        			
        		}
        );
        
        desktop.add(painel, BorderLayout.CENTER);
        desktop.add(iniciar);
        iniciar.setSize(230, 70);
        
        ranking.setLocation(310, 60);
        
        
        desktop.add(ranking);
        ranking.setSize(230,40);
        iniciar.setLocation(310, 236);
      
        desktop.add(sair);
        sair.setSize(230,40);
        sair.setLocation(310, 420); 
    }
}