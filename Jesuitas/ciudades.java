package Jesuitas;

import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ciudades {
	
	JFrame Frame=null;
	JPanel Panel=null;
	JPanel Panel2=null;
	JLabel Label=null;
	JTextField Texto=null;
	JLabel Ip=null;
	JTextField IpTexto=null;
	JButton Boton=null;
	JLabel jlbImagen1=null;

	public ciudades() {
		disenio();
		Frame.setVisible(true);
	}

	public void disenio() {
		
		Frame = new JFrame();
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setSize(500,700);
		Frame.setLocationRelativeTo(null);
		
		Panel = new JPanel();
		Panel.setSize(500, 700);
		Panel.setLayout(null);
		Panel.setBackground(Color.WHITE);
		Frame.add(Panel);
		
		Panel2 = new JPanel();
		Panel2.setLayout(null);
		Panel2.setBounds(45, 100, 400,500);
		Panel2.setBackground(new Color(23,81,126));
		Panel.add(Panel2);
		
		jlbImagen1 = new JLabel();
		jlbImagen1.setBounds(new Rectangle(0, 0, 500, 100));
		jlbImagen1.setIcon(new ImageIcon(getClass().getResource("/Jesuita.png")));
		Panel.add(jlbImagen1);
		
		Texto = new JTextField();
		Texto.setBounds(170, 110, 180, 30);
		Panel2.add(Texto);
		
		Label = new JLabel("CIUDADES VISITADAS: ");
		Label.setBounds(40, 100, 140, 50);
		Label.setForeground(Color.white);
		Panel2.add(Label);
		
		Boton = new JButton("ENVIAR");
		Boton.setBounds(190, 610, 100, 40);
		Boton.setForeground(Color.white);
		Boton.setBackground(new Color(23,81,126));
		Panel.add(Boton);
		
		Ip = new JLabel("IP: ");
		Ip.setBounds(40, 150, 140, 50);
		Ip.setForeground(Color.white);
		Panel2.add(Ip);
		
		Texto = new JTextField();
		Texto.setBounds(170, 160, 180, 30);
		Panel2.add(Texto);
		
		
		
	}
	public static void main(String[] args) {
		new ciudades();

	}

}
