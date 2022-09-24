package ProjetoJava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Eventos extends JFrame implements ActionListener{
	
	public Eventos() {
		super("Meus Eventos");
		JButton botao = new JButton("Clique aqui");
		botao.addActionListener(this);
		
		getContentPane().add(botao);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new Eventos();
	}
	public void actionPerformed(ActionEvent e) {
		System.err.println("Você clicou!!!");
	}

}
