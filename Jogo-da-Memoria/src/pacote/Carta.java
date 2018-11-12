package pacote;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Carta extends JButton {
		ImageIcon imageIcon;
		int numeroImagem;
		int x;
		int y;
		public final ImageIcon[] arrayFundos = {
				new ImageIcon(getClass().getResource("FUNDO.jpg")),
				new ImageIcon(getClass().getResource("1.jpg")),
				new ImageIcon(getClass().getResource("2.jpg")),
				new ImageIcon(getClass().getResource("3.jpg")),
				new ImageIcon(getClass().getResource("4.jpg")),
				new ImageIcon(getClass().getResource("5.jpg")),
				new ImageIcon(getClass().getResource("6.jpg")),
		};
		
		public Carta(int numeroImagem) {
			this.imageIcon = arrayFundos[0];
			this.numeroImagem = numeroImagem;
			this.x = 0;
			this.y = 0;
			
		}
		
		public Carta() {

		}

		public int getNumeroImagem() {
			return numeroImagem;
		}
		
		public void setNumeroImagem(int numeroImagem) {
			this.numeroImagem = numeroImagem;
		}
		
		public void setImageIcon(ImageIcon imageIcon) {
			this.imageIcon = imageIcon;
		}
		
		
}
