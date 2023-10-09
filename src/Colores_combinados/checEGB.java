package Colores_combinados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class checEGB {

	private JFrame frmColores;
	private JCheckBox chkRed;
	private JCheckBox chkBlu;
	private JCheckBox chkGreen;
	private JLabel lblColor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					checEGB window = new checEGB();
					window.frmColores.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public checEGB() {
		initialize();
	}
	public void asignarColor() {
		
	    int r=(chkRed.isSelected()?225:0);
	    int g=(chkGreen.isSelected()?225:0);
	    int b=(chkBlu.isSelected()?225:0);
	    lblColor.setBackground(new Color(r,g,b));
	}

	private void initialize() {
		frmColores = new JFrame();
		frmColores.setTitle("Colors");
		frmColores.setBounds(100, 100, 580, 393);
		frmColores.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmColores.getContentPane().setLayout(null);
		
		chkRed = new JCheckBox("Red");
		chkRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor();
			}
		});
		chkRed.setBounds(59, 113, 97, 23);
		frmColores.getContentPane().add(chkRed);
		
		chkGreen = new JCheckBox("Green");
		chkGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor();
			}
		});
		chkGreen.setBounds(59, 153, 97, 23);
		frmColores.getContentPane().add(chkGreen);
		
		chkBlu = new JCheckBox("blue");
		chkBlu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor();
			}
		});
		chkBlu.setBounds(59, 197, 97, 23);
		frmColores.getContentPane().add(chkBlu);
		
		lblColor = new JLabel("");
		lblColor.setOpaque(true);
		lblColor.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblColor.setBounds(208, 32, 321, 299);
		frmColores.getContentPane().add(lblColor);
	}
}
