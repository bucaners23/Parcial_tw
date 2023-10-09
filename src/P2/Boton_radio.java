package P2;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JRadioButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Boton_radio {

	private JFrame frmBotonRadio;
	private JLabel lblCol;
	private JRadioButton radRoj;
	private JRadioButton radAzu;
	private JRadioButton radVer;
	private JRadioButton radNeg;
	private JRadioButton radNar;
	private JRadioButton radAma;
	private JRadioButton radGri;
	private JRadioButton radRos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Boton_radio window = new Boton_radio();
					window.frmBotonRadio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Boton_radio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBotonRadio = new JFrame();
		frmBotonRadio.setIconImage(Toolkit.getDefaultToolkit().getImage(Boton_radio.class.getResource("/P2/oky.jpg")));
		frmBotonRadio.setTitle("Boton radio");
		frmBotonRadio.setBounds(100, 100, 510, 421);
		frmBotonRadio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBotonRadio.setLocationRelativeTo(null);
		frmBotonRadio.getContentPane().setLayout(null);
		
		lblCol = new JLabel("");
		lblCol.setOpaque(true);
		lblCol.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblCol.setBounds(171, 38, 280, 321);
		frmBotonRadio.getContentPane().add(lblCol);
		
		radRoj = new JRadioButton("Rojo");
		radRoj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCol.setBackground(Color.RED);
			}
		});
		radRoj.setBounds(26, 83, 109, 23);
		frmBotonRadio.getContentPane().add(radRoj);
		
		radAzu = new JRadioButton("Azul");
		radAzu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCol.setBackground(Color.BLUE);
			}
		});
		radAzu.setBounds(26, 109, 109, 23);
		frmBotonRadio.getContentPane().add(radAzu);
		
		radVer = new JRadioButton("Verde");
		radVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCol.setBackground(Color.GREEN);
			}
		});
		radVer.setBounds(26, 135, 109, 23);
		frmBotonRadio.getContentPane().add(radVer);
		
		
		radNeg = new JRadioButton("Negro");
		radNeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCol.setBackground(Color.BLACK);
			}
		});
		radNeg.setBounds(26, 161, 109, 23);
		frmBotonRadio.getContentPane().add(radNeg);
		
		radNar = new JRadioButton("Naranja");
		radNar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCol.setBackground(Color.ORANGE);
			}
		});
		radNar.setBounds(26, 187, 109, 23);
		frmBotonRadio.getContentPane().add(radNar);
		
		radAma = new JRadioButton("Amarillo");
		radAma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCol.setBackground(Color.yellow);
			}
		});
		radAma.setBounds(26, 213, 109, 23);
		frmBotonRadio.getContentPane().add(radAma);
		ButtonGroup grupo=new ButtonGroup();
		
		
		radGri= new JRadioButton("Gris");
		radGri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCol.setBackground(Color.darkGray);
			}
			
		});
		radGri.setBounds(26, 239, 109, 23);
		frmBotonRadio.getContentPane().add(radGri);
		
		radRos = new JRadioButton("Rosa");
		radRos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCol.setBackground(Color.pink);
			}
		});
		radRos.setBounds(26, 265, 109, 23);
		frmBotonRadio.getContentPane().add(radRos);
		grupo.add(radRoj);
		grupo.add(radVer);
		grupo.add(radAzu);
		grupo.add(radNeg);
		grupo.add(radNar);
		grupo.add(radAma);
		grupo.add(radGri);
		grupo.add(radRos);
	}
}
