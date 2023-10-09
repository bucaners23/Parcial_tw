package pizzas2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class pizzastwo {

	private JFrame frmThePatriotsPizzery;
	private JSlider sldCan;
	private JComboBox cmbEsp;
	private JRadioButton radInd;
	private JRadioButton radGra;
	private JRadioButton radFam;
	private JRadioButton radRec;
	String especialidad = "MEXICANA";
	int cantidad = 1;
	int total = 0;
	String telefono, nombre, direccion;
	String tamano = "JUMBO";
	int totalCom = 0;
	int precioPiz = 0;
	String c1 = " ", c2 = " ", c3 = " ", c4 = " ";
	private JLabel lblCan;
	private JCheckBox chkRes;
	private JCheckBox chkAli;
	private JCheckBox chkPap;
	private JCheckBox chkMis;
	private JTextArea txtResumen;
	private JLabel lblMxn;
	private JButton btnBor;
	private JButton btnPago;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pizzastwo window = new pizzastwo();
					window.frmThePatriotsPizzery.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public pizzastwo() {
		initialize();
	}

	public void ordenPizza() {
		lblCan.setText(" " + cantidad);
		switch (tamano) {
		case "Individual":
			precioPiz = 50;
			break;
		case "Grande":
			precioPiz = 100;
			break;
		case "Familiar":
			precioPiz = 200;
			break;
		case "Rectangular":
			precioPiz = 250;
			break;
		}
		total = (cantidad * precioPiz) + totalCom;
		txtResumen.setText("   Nombre :  " + nombre + "\n   Direccion :  "+direccion + "\n   Telefono :  " + telefono + "   \n   Cantidad : "
				+ sldCan.getValue() + "\n   Tamaño : " + tamano + "\n   Especialidad : " + especialidad
				+ "\n   ******************************************\n   Complementos :\n" + c1 + "\n" + c2 + "\n" + c3
				+ "\n" + c4);
		DecimalFormat f = new DecimalFormat("#.00");
		lblMxn.setText("  $  " + f.format(total) + " MXN");
	}

	private void initialize() {
		frmThePatriotsPizzery = new JFrame();
		frmThePatriotsPizzery.setIconImage(Toolkit.getDefaultToolkit().getImage(pizzastwo.class.getResource("/pizzas2/pzatatum.png")));
		frmThePatriotsPizzery.setBackground(Color.BLUE);
		frmThePatriotsPizzery.getContentPane().setBackground(new Color(192, 192, 192));
		frmThePatriotsPizzery.setTitle("The Patriots Pizzery");
		frmThePatriotsPizzery.setBounds(100, 100, 708, 536);
		frmThePatriotsPizzery.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmThePatriotsPizzery.setLocationRelativeTo(null);
		frmThePatriotsPizzery.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("CANTIDAD :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 29, 84, 14);
		frmThePatriotsPizzery.getContentPane().add(lblNewLabel);

		sldCan = new JSlider();
		sldCan.setValue(1);
		sldCan.setMinimum(1);
		sldCan.setMaximum(10);
		sldCan.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				cantidad = sldCan.getValue();
				ordenPizza();
			}
		});

		sldCan.setBackground(new Color(192, 192, 192));
		sldCan.setBounds(10, 54, 200, 26);
		frmThePatriotsPizzery.getContentPane().add(sldCan);

		JLabel lblEspecialidad = new JLabel("ESPECIALIDAD :");
		lblEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEspecialidad.setBounds(10, 109, 107, 14);
		frmThePatriotsPizzery.getContentPane().add(lblEspecialidad);

		cmbEsp = new JComboBox();
		cmbEsp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				especialidad = String.valueOf(cmbEsp.getSelectedItem());
				ordenPizza();
			}
		});
		cmbEsp.setModel(new DefaultComboBoxModel(new String[] { "MEXICANA", "ITALINA", "QUESOS", "PICANTE" }));
		cmbEsp.setBounds(10, 134, 200, 22);
		frmThePatriotsPizzery.getContentPane().add(cmbEsp);

		JLabel lblTamao = new JLabel("TAMAÑO  :");
		lblTamao.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTamao.setBounds(10, 190, 107, 14);
		frmThePatriotsPizzery.getContentPane().add(lblTamao);

		radInd = new JRadioButton("Individual");
		radInd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (radInd.isSelected()) {
					tamano = "Individual";
				}
				ordenPizza();
			}
		});
		radInd.setBackground(new Color(192, 192, 192));
		radInd.setBounds(8, 210, 109, 23);
		frmThePatriotsPizzery.getContentPane().add(radInd);

		radGra = new JRadioButton("Grande");
		radGra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (radGra.isSelected()) {
					tamano = "Grande";
				}
				ordenPizza();

			}
		});
		radGra.setBackground(new Color(192, 192, 192));
		radGra.setBounds(8, 236, 109, 23);
		frmThePatriotsPizzery.getContentPane().add(radGra);

		radFam = new JRadioButton("Familiar");
		radFam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (radFam.isSelected()) {
					tamano = "Familiar";
				}
				ordenPizza();

			}
		});
		radFam.setBackground(new Color(192, 192, 192));
		radFam.setBounds(8, 262, 109, 23);
		frmThePatriotsPizzery.getContentPane().add(radFam);

		radRec = new JRadioButton("Rectangular");
		radRec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (radRec.isSelected()) {
					tamano = "Rectangular";
				}
				ordenPizza();

			}
		});
		radRec.setBackground(new Color(192, 192, 192));
		radRec.setBounds(10, 288, 109, 23);
		frmThePatriotsPizzery.getContentPane().add(radRec);
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(radFam);
		grupo.add(radGra);
		grupo.add(radInd);
		grupo.add(radRec);

		JLabel lblComplementos = new JLabel("COMPLEMENTOS :");
		lblComplementos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblComplementos.setBounds(10, 336, 109, 14);
		frmThePatriotsPizzery.getContentPane().add(lblComplementos);

		chkRes = new JCheckBox("Refresco");
		chkRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chkRes.isSelected()) {
					totalCom += 35;
					c1 = "REFRESCO";
				} else {
					totalCom -= 35;
					c1 = "";
				}
				ordenPizza();
			}
		});
		chkRes.setBackground(new Color(192, 192, 192));
		chkRes.setBounds(10, 357, 97, 23);
		frmThePatriotsPizzery.getContentPane().add(chkRes);

		chkPap = new JCheckBox("Pap´s");
		chkPap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chkPap.isSelected()) {
					totalCom += 50;
					c2 = "PAP´S";
				} else {
					totalCom -= 50;
					c2 = "";
				}
				ordenPizza();
			}
		});
		chkPap.setBackground(new Color(192, 192, 192));
		chkPap.setBounds(10, 382, 97, 23);
		frmThePatriotsPizzery.getContentPane().add(chkPap);

		chkAli = new JCheckBox("Alitas");
		chkAli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chkAli.isSelected()) {
					totalCom += 60;
					c3 = "ALITAS";
				} else {
					totalCom -= 60;
					c3 = "";
				}
				ordenPizza();
			}
		});
		chkAli.setBackground(new Color(192, 192, 192));
		chkAli.setBounds(10, 408, 97, 23);
		frmThePatriotsPizzery.getContentPane().add(chkAli);

		chkMis = new JCheckBox("Helado");
		chkMis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chkMis.isSelected()) {
					totalCom += 20;
					c4 = "HELADO";
				} else {
					totalCom -= 20;
					c4 = "";
				}
				ordenPizza();
			}
		});
		chkMis.setBackground(new Color(192, 192, 192));
		chkMis.setBounds(10, 434, 97, 23);
		frmThePatriotsPizzery.getContentPane().add(chkMis);

		lblCan = new JLabel("1");
		lblCan.setHorizontalAlignment(SwingConstants.CENTER);
		lblCan.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblCan.setBounds(211, 54, 39, 26);
		frmThePatriotsPizzery.getContentPane().add(lblCan);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(pizzastwo.class.getResource("/pizzas2/Pizza.jpg")));
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_2.setBounds(288, 11, 394, 269);
		frmThePatriotsPizzery.getContentPane().add(lblNewLabel_2);

		JLabel lblTotal = new JLabel("TOTAL :");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotal.setBounds(370, 296, 107, 14);
		frmThePatriotsPizzery.getContentPane().add(lblTotal);

		lblMxn = new JLabel("  $    0.00    MXN");
		lblMxn.setForeground(new Color(0, 0, 0));
		lblMxn.setBackground(Color.WHITE);
		lblMxn.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblMxn.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMxn.setBounds(370, 325, 120, 37);
		frmThePatriotsPizzery.getContentPane().add(lblMxn);

		JLabel lblResumen = new JLabel("RESUMEN :");
		lblResumen.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblResumen.setBounds(123, 266, 109, 14);
		frmThePatriotsPizzery.getContentPane().add(lblResumen);

		txtResumen = new JTextArea();
		txtResumen.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		txtResumen.setBounds(125, 291, 235, 184);
		frmThePatriotsPizzery.getContentPane().add(txtResumen);

		btnBor = new JButton("BORRAR !");
		btnBor.setBackground(new Color(255, 51, 51));
		btnBor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sldCan.setValue(1);
				cmbEsp.setSelectedIndex(0);
				radInd.setSelected(true);
				radGra.setSelected(true);
				radFam.setSelected(true);
				radRec.setSelected(true);
				chkRes.setSelected(false);
				chkPap.setSelected(false);
				chkAli.setSelected(false);
				chkMis.setSelected(false);
				txtResumen.setText("");
				lblCan.setText("1");
				nombre = "";
				direccion = "";
				telefono = "";

				lblMxn.setText(" $    0.00  MXN");

			}
		});
		btnBor.setBounds(551, 357, 89, 23);
		frmThePatriotsPizzery.getContentPane().add(btnBor);

		btnPago = new JButton("PAGAR");
		btnPago.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombre = JOptionPane.showInputDialog(null, "¿Cual es tu nombre?", "Datos",
						JOptionPane.QUESTION_MESSAGE);
				direccion = JOptionPane.showInputDialog(null, "¿Cual es tu direccion?", "Datos",
						JOptionPane.QUESTION_MESSAGE);
				telefono = JOptionPane.showInputDialog(null, "¿Cual es tu telefono", "Datos",
						JOptionPane.QUESTION_MESSAGE);
				ordenPizza();
			}
		});
		btnPago.setBounds(380, 382, 89, 23);
		frmThePatriotsPizzery.getContentPane().add(btnPago);
	}

}
