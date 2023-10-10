package coloresrgb;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Toolkit;

public class name {

	private JFrame frmColresCombinados;
	private JLabel lblColor;
	private JSlider sldRoj;
	private JSlider sldVer;
	private JSlider sldAzu;
	private JLabel lblN1;
	private JLabel lblN2;
	private JLabel lblN3;
	private JLabel lblRojo;
	private JLabel lblVerde;
	private JLabel lblAzul;
	private JLabel lblCudro;
	int ro = 0, ve = 0, az = 0;
	private JSlider sldVerd;
	int cantidad, cantidad1, cantidad2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					name window = new name();
					window.frmColresCombinados.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public name() {
		initialize();
		CambiarColor();
	}

	public void CambiarColor() {
		lblRojo.setText("" + ro);
		lblVerde.setText("" + ve);
		lblAzul.setText("" + az);
		lblCudro.setText("RGB(" + ro + "," + az + "," + ve + ")");
		lblColor.setBackground(new Color(ro, ve, az));
		lblN1.setText(" " + cantidad);
		lblN2.setText(" " + cantidad1);
		lblN3.setText(" " + cantidad2);
	}
	private void initialize() {
		frmColresCombinados = new JFrame();
		frmColresCombinados.setIconImage(Toolkit.getDefaultToolkit().getImage(name.class.getResource("/P2/oky.jpg")));
		frmColresCombinados.setTitle("COLRES COMBINADOS");
		frmColresCombinados.setBounds(100, 100, 724, 526);
		frmColresCombinados.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmColresCombinados.setLocationRelativeTo(null);
		frmColresCombinados.getContentPane().setLayout(null);

		lblRojo = new JLabel("ROJO");
		lblRojo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRojo.setBounds(31, 35, 127, 14);
		frmColresCombinados.getContentPane().add(lblRojo);

		lblVerde = new JLabel("VERDE");
		lblVerde.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblVerde.setBounds(31, 150, 127, 14);
		frmColresCombinados.getContentPane().add(lblVerde);

		lblAzul = new JLabel("AZUL");
		lblAzul.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAzul.setBounds(31, 88, 127, 14);
		frmColresCombinados.getContentPane().add(lblAzul);

		lblCudro = new JLabel("");
		lblCudro.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblCudro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCudro.setBounds(145, 359, 386, 90);
		frmColresCombinados.getContentPane().add(lblCudro);

		lblColor = new JLabel("");
		lblColor.setOpaque(true);
		lblColor.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblColor.setBounds(342, 88, 330, 184);
		frmColresCombinados.getContentPane().add(lblColor);

		lblN2 = new JLabel("    0");
		lblN2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblN2.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblN2.setBounds(240, 117, 33, 26);
		frmColresCombinados.getContentPane().add(lblN2);

		lblN3 = new JLabel("    0");
		lblN3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblN3.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblN3.setBounds(240, 175, 33, 26);
		frmColresCombinados.getContentPane().add(lblN3);

		lblN1 = new JLabel("    0");
		lblN1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblN1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblN1.setBounds(240, 60, 33, 26);
		frmColresCombinados.getContentPane().add(lblN1);

		sldRoj = new JSlider();
		sldRoj.setValue(0);
		sldRoj.setMaximum(255);
		sldRoj.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				ro = sldRoj.getValue();
				cantidad = sldRoj.getValue();
				CambiarColor();

			}
		});
		sldRoj.setBounds(31, 60, 200, 26);
		frmColresCombinados.getContentPane().add(sldRoj);

		sldAzu = new JSlider();
		sldAzu.setValue(0);
		sldAzu.setMaximum(255);
		sldAzu.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				az = sldAzu.getValue();
				cantidad1 = sldAzu.getValue();
				CambiarColor();
			}
		});
		sldAzu.setBounds(31, 113, 200, 26);
		frmColresCombinados.getContentPane().add(sldAzu);

		sldVerd = new JSlider();
		sldVerd.setValue(0);
		sldVerd.setMaximum(255);
		sldVerd.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				ve = sldVerd.getValue();
				cantidad2 = sldVerd.getValue();
				CambiarColor();
			}
		});
		sldVerd.setBounds(30, 175, 200, 26);
		frmColresCombinados.getContentPane().add(sldVerd);

	}
}
