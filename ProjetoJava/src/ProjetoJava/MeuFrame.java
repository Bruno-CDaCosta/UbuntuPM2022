package ProjetoJava;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MeuFrame extends JFrame{
	
	public MeuFrame() {
		
		super("Meu Frame");
		
		//JFrame frame = new JFrame();
		JButton botao = new JButton("Clique");
	/*	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);*/
		getContentPane().add(botao);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
	}
		public static void main(String[] args) {
			new MeuFrame();
		
	}
}
