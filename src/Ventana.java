
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.management.OperatingSystemMXBean;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @author Sain Pedraza Guerrero
 *
 */
public class Ventana extends JFrame implements ActionListener{
	/**
	 * Class Ventana botones, labels y cajas de texto
	 */
	
	private JTextField txtN1 = new JTextField();
	private JTextField txtN2 = new JTextField();
	
	private JLabel lbN1 = new JLabel("Numero 1");
	private JLabel lbN2= new JLabel("Numero 2");
	private JLabel lbResultado= new JLabel("Resultado");
	
	private JButton btnSumar = new JButton("+");
	private JButton btnRestar = new JButton("-");
	private JButton btnMultiplicar = new JButton("*");
	private JButton btnDividir = new JButton("/");
	
	private Container c = getContentPane();
	
	private Operaciones Op = new Operaciones();
	/**
	 * Elementos de la ventana
	 */
	
public Ventana(){
	/**
	 * Metodo ventana para las dimenciones de la interfas
	 */
	super.setTitle("Operaciones");
	super.setSize(320, 480);
	super.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	cargarContoles();
	
}

/**
 * Metodo cargarControles dimenciones de cada elemnto de la interfas
 */
private void cargarContoles() {
	c.setLayout(null);
	lbN1.setBounds(10, 10, 300, 30);
	txtN1.setBounds(10, 40, 250, 30);
	lbN2.setBounds(10, 80, 300, 30);
	txtN2.setBounds(10, 110, 250, 30);
	
	btnSumar.setBounds(10, 150, 50, 30);
	btnRestar.setBounds(70, 150, 50, 30);
	btnMultiplicar.setBounds(130, 150, 50, 30);
	btnDividir.setBounds(190, 150, 50, 30);
	
	
	lbResultado.setBounds(10, 190, 300, 30);
	
	c.add(lbN1);
	c.add(txtN1);
	c.add(lbN2);
	c.add(txtN2);
	c.add(btnSumar);
	c.add(btnRestar);
	c.add(btnMultiplicar);
	c.add(btnDividir);
	c.add(lbResultado);
	/**
	 * ActionListener poner en puesta lod botones que se ejecutan
	 */
	btnSumar.addActionListener(this);
	btnRestar.addActionListener(this);
	btnMultiplicar.addActionListener(this);
	btnDividir.addActionListener(this);
		
}
	/**
	 * metodo para agregar las sentencias de cada operacion
	 */
public void actionPerformed(ActionEvent arg0){
	Object boton = arg0.getSource();
	if(boton==btnSumar){
		int s = Op.sumar(Integer.parseInt(txtN1.getText()), Integer.parseInt(txtN2.getText()));
		lbResultado.setText(String.format("%s + %s = %d", txtN1.getText(), txtN2.getText(), s));
	}
	if(boton==btnRestar){
		int r = Op.restar(Integer.parseInt(txtN1.getText()), Integer.parseInt(txtN2.getText()));
		lbResultado.setText(String.format("%s - %s = %d", txtN1.getText(), txtN2.getText(), r));
	}
	if(boton==btnMultiplicar){
		int m = Op.multiplicar(Integer.parseInt(txtN1.getText()), Integer.parseInt(txtN2.getText()));
		lbResultado.setText(String.format("%s * %s = %d", txtN1.getText(), txtN2.getText(), m));
	}
	if(boton==btnDividir){
		int d = Op.dividir(Integer.parseInt(txtN1.getText()), Integer.parseInt(txtN2.getText()));
		lbResultado.setText(String.format("%s / %s = %d", txtN1.getText(), txtN2.getText(), d));
	}

}

}
