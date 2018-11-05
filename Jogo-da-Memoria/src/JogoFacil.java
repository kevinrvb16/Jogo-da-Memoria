import javax.swing.*;
import java.awt.GridBagLayout;
import java.lang.*;

public class JogoFacil extends JFrame {
	private JButton carta1;
	
		public JogoFacil() {
			super("Jogo da Memoria");
			
			setLayout(new GridBagLayout());
			Icon icone1 = new Icon("01.jpg");
			carta1 = new JButton(icone1);
			add(carta1);
		}
}
