package tri;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Area {

	private JFrame frame;
	public JLabel lblAlt;
	public JLabel lblRes;
	public JLabel lblBas;
	public JTextField txtBas;
	public JTextField txtAlt;
	public JButton btnCal;
	public JButton btnBor;

	public static void main(String[] args) {
		Area x = new Area();
		x.frame.show(true);
	}

	public Area() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Area de Triangulo");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Area.class.getResource("/tri/oky.jpg")));
		frame.setBounds(600, 750, 500, 350);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblAlt = new JLabel("ALTURA");
		lblAlt.setBounds(30, 20, 60, 30);
		frame.getContentPane().add(lblAlt);

		lblBas = new JLabel("BASE");
		lblBas.setBounds(30, 60, 60, 80);
		frame.getContentPane().add(lblBas);
		
		txtAlt=new JTextField("");
		txtAlt.setBounds(100,20,60,30);
		frame.getContentPane().add(txtAlt);
		
		txtBas=new JTextField("");
		txtBas.setBounds(100,90,60,30);
		frame.getContentPane().add(txtBas);

		lblRes = new JLabel("Resultado");
		lblRes.setBounds(300, 90, 320, 80);
		frame.getContentPane().add(lblRes);
		

		btnCal=new JButton("Calcular");
		btnCal.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			double a=Double.parseDouble(txtAlt.getText());
			double b=Double.parseDouble(txtBas.getText());
			DecimalFormat f=new DecimalFormat("#.00");
			lblRes.setText("Resultado   :  \" "+f.format((a*b)/2)+" \"");

		}
		});
		btnCal.setBounds(100, 200, 120, 30);
		frame.getContentPane().add(btnCal);
		
		btnBor=new JButton("Borrar");
		btnBor.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			txtAlt.setText("");
			txtBas.setText("");
			lblRes.setText("Reultado    :");

		}
		});
		btnBor.setBounds(290,200, 120, 30);
		frame.getContentPane().add(btnBor);
	}

}
