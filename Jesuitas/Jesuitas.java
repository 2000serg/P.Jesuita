package Jesuitas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import bb.dd.SqlJesuitas;
import bb.dd.basededatos;

public class Jesuitas {
	
	JFrame Frame=null;
	JPanel Panel=null;
	JPanel Panel2=null;
	JLabel NJesuita=null;
	JLabel NAlumno=null;
	JLabel Alumno=null;
	JLabel Firma=null;
	JLabel Firmaingles=null;
	JLabel jlbImagen1=null;
	JLabel Codigo=null;
	JTextField Texto5=null;
	JTextField Texto1=null;
	JTextField Texto2=null;
	JTextField Texto3=null;
	JTextField Texto4=null;
	JButton Enviar=null;
	JTabbedPane TPane;
	
	
	public Jesuitas() {
		
		disenio();
		Frame.setVisible(true);
	}
	
	public void disenio() {
		
		Frame = new JFrame();
		Frame.setSize(500, 700);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

		
		NJesuita = new JLabel("Nombre Jesuita:");
		NJesuita.setBounds(50, 100, 100, 50);
		NJesuita.setForeground(Color.white);
		Panel2.add(NJesuita);
		
		Texto1 = new JTextField();
		Texto1.setBounds(150, 110, 130, 30);
		Panel2.add(Texto1);
		
		NAlumno = new JLabel("Nombre Alumno:");
		NAlumno.setBounds(50, 50, 100, 50);
		NAlumno.setForeground(Color.white);
		Panel2.add(NAlumno);
		
		Texto2 = new JTextField();
		Texto2.setBounds(150, 60, 130, 30);
		Panel2.add(Texto2);

		Firma = new JLabel("Firma:");
		Firma.setBounds(50, 200, 100, 40);
		Firma.setForeground(Color.white);
		Panel2.add(Firma);
		
		Texto3 = new JTextField();
		Texto3.setBounds(150, 190, 130, 70);
		Panel2.add(Texto3);
		
		Firmaingles = new JLabel("Firma Ingles:");
		Firmaingles.setBounds(50, 320, 100, 40);
		Firmaingles.setForeground(Color.white);
		Panel2.add(Firmaingles);
		
		Texto4 = new JTextField();
		Texto4.setBounds(150, 300, 130, 70);
		Panel2.add(Texto4);
		
		Enviar = new JButton("ENVIAR");
		Enviar.setBounds(190, 610, 100, 40);
		Enviar.setForeground(Color.white);
		Enviar.setBackground(new Color(23,81,126));
		Panel.add(Enviar);
		Enviar.addActionListener( e -> {
			
			/*JTextField Texto5;
			JTextField Texto1;
			JTextField Texto2;
			JTextField Texto3;
			JTextField Texto4;*/
			basededatos bd = new basededatos();
			SqlJesuitas jesuitas = new SqlJesuitas(bd);
			jesuitas.insertarFila(Texto1.getText(), Texto2.getText(), Texto3.getText(), Texto4.getText(), Texto5.getText());
			
		});	
		Codigo = new JLabel("Codigo:");
		Codigo.setBounds(50, 400, 100, 40);
		Codigo.setForeground(Color.white);
		Panel2.add(Codigo);
		
		Texto5 = new JTextField();
		Texto5.setBounds(150, 400, 130, 40);
		Panel2.add(Texto5);
		

		
		
	}

	public static void main(String[] args) {
		new Jesuitas();

	}

}
