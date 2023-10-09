package Bin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JToggleButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class binarioa {

	private JFrame frmBinario;
	private JLabel lblDec;
	private JToggleButton tglbtnNewToggleButton_11;
	private JToggleButton tglbtnNewToggleButton_10;
	private JToggleButton tglbtnNewToggleButton_9;
	private JToggleButton tglbtnNewToggleButton_8;
	private JToggleButton tglbtnNewToggleButton_7;
	private JToggleButton tglbtnNewToggleButton;
	private JToggleButton tglbtnNewToggleButton_1;
	private JToggleButton tglbtnNewToggleButton_2;
	private JToggleButton tglbtnNewToggleButton_3;
	private JToggleButton tglbtnNewToggleButton_4;
	private JToggleButton tglbtnNewToggleButton_5;
	private JToggleButton tglbtnNewToggleButton_6;
	int d = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					binarioa window = new binarioa();
					window.frmBinario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public binarioa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBinario = new JFrame();
		frmBinario.setTitle("Binario");
		frmBinario.setIconImage(Toolkit.getDefaultToolkit().getImage(binarioa.class.getResource("/Tbal/oky2.jpg")));
		frmBinario.setBounds(100, 100, 828, 501);
		frmBinario.setLocationRelativeTo(null);
		frmBinario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBinario.getContentPane().setLayout(null);

		tglbtnNewToggleButton = new JToggleButton("0");
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnNewToggleButton.isSelected()) {
					tglbtnNewToggleButton.setText("1");
					d += 2048;
					lblDec.setText("" + d);

				} else {

					tglbtnNewToggleButton.setText("0");
					d -= 2048;
					lblDec.setText("" + d);
				}
			}
		});
		tglbtnNewToggleButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		tglbtnNewToggleButton.setBounds(10, 40, 54, 38);
		frmBinario.getContentPane().add(tglbtnNewToggleButton);

		tglbtnNewToggleButton_1 = new JToggleButton("0");
		tglbtnNewToggleButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnNewToggleButton_1.isSelected()) {
					tglbtnNewToggleButton_1.setText("1");
					d += 1024;
					lblDec.setText("" + d);

				} else {

					tglbtnNewToggleButton_1.setText("0");
					d -= 1024;
					lblDec.setText("" + d);
				}
			}
		});
		tglbtnNewToggleButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		tglbtnNewToggleButton_1.setBounds(74, 40, 54, 38);
		frmBinario.getContentPane().add(tglbtnNewToggleButton_1);

		tglbtnNewToggleButton_2 = new JToggleButton("0");
		tglbtnNewToggleButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnNewToggleButton_2.isSelected()) {
					tglbtnNewToggleButton_2.setText("1");
					d += 512;
					lblDec.setText("" + d);

				} else {

					tglbtnNewToggleButton_2.setText("0");
					d -= 512;
					lblDec.setText("" + d);
				}
			}
		});
		tglbtnNewToggleButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		tglbtnNewToggleButton_2.setBounds(144, 40, 54, 38);
		frmBinario.getContentPane().add(tglbtnNewToggleButton_2);

		tglbtnNewToggleButton_3 = new JToggleButton("0");
		tglbtnNewToggleButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnNewToggleButton_3.isSelected()) {
					tglbtnNewToggleButton_3.setText("1");
					d += 256;
					lblDec.setText("" + d);

				} else {

					tglbtnNewToggleButton_3.setText("0");
					d -= 256;
					lblDec.setText("" + d);
				}
			}
		});
		tglbtnNewToggleButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		tglbtnNewToggleButton_3.setBounds(208, 40, 54, 38);
		frmBinario.getContentPane().add(tglbtnNewToggleButton_3);

		tglbtnNewToggleButton_4 = new JToggleButton("0");
		tglbtnNewToggleButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnNewToggleButton_4.isSelected()) {
					tglbtnNewToggleButton_4.setText("1");
					d += 128;
					lblDec.setText("" + d);

				} else {

					tglbtnNewToggleButton_4.setText("0");
					d -= 128;
					lblDec.setText("" + d);
				}
			}
		});
		tglbtnNewToggleButton_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		tglbtnNewToggleButton_4.setBounds(273, 40, 54, 38);
		frmBinario.getContentPane().add(tglbtnNewToggleButton_4);

		tglbtnNewToggleButton_5 = new JToggleButton("0");
		tglbtnNewToggleButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnNewToggleButton_5.isSelected()) {
					tglbtnNewToggleButton_5.setText("1");
					d += 64;
					lblDec.setText("" + d);

				} else {

					tglbtnNewToggleButton_5.setText("0");
					d -= 64;
					lblDec.setText("" + d);
				}
			}
		});
		tglbtnNewToggleButton_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		tglbtnNewToggleButton_5.setBounds(337, 40, 54, 38);
		frmBinario.getContentPane().add(tglbtnNewToggleButton_5);

		tglbtnNewToggleButton_6 = new JToggleButton("0");
		tglbtnNewToggleButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnNewToggleButton_6.isSelected()) {
					tglbtnNewToggleButton_6.setText("1");
					d += 32;
					lblDec.setText("" + d);

				} else {

					tglbtnNewToggleButton_6.setText("0");
					d -= 32;
					lblDec.setText("" + d);
				}
			}
		});
		tglbtnNewToggleButton_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		tglbtnNewToggleButton_6.setBounds(402, 40, 54, 38);
		frmBinario.getContentPane().add(tglbtnNewToggleButton_6);

		tglbtnNewToggleButton_7 = new JToggleButton("0");
		tglbtnNewToggleButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnNewToggleButton_7.isSelected()) {
					tglbtnNewToggleButton_7.setText("1");
					d += 16;
					lblDec.setText("" + d);

				} else {

					tglbtnNewToggleButton_7.setText("0");
					d -= 16;
					lblDec.setText("" + d);
				}
			}
		});
		tglbtnNewToggleButton_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		tglbtnNewToggleButton_7.setBounds(470, 40, 54, 38);
		frmBinario.getContentPane().add(tglbtnNewToggleButton_7);

		tglbtnNewToggleButton_8 = new JToggleButton("0");
		tglbtnNewToggleButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnNewToggleButton_8.isSelected()) {
					tglbtnNewToggleButton_8.setText("1");
					d += 8;
					lblDec.setText("" + d);

				} else {

					tglbtnNewToggleButton_8.setText("0");
					d -= 8;
					lblDec.setText("" + d);
				}
			}
		});
		tglbtnNewToggleButton_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		tglbtnNewToggleButton_8.setBounds(534, 40, 54, 38);
		frmBinario.getContentPane().add(tglbtnNewToggleButton_8);

		tglbtnNewToggleButton_9 = new JToggleButton("0");
		tglbtnNewToggleButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnNewToggleButton_9.isSelected()) {
					tglbtnNewToggleButton_9.setText("1");
					d += 4;
					lblDec.setText("" + d);

				} else {

					tglbtnNewToggleButton_9.setText("0");
					d -= 4;
					lblDec.setText("" + d);
				}
			}
		});
		tglbtnNewToggleButton_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		tglbtnNewToggleButton_9.setBounds(603, 40, 54, 38);
		frmBinario.getContentPane().add(tglbtnNewToggleButton_9);

		tglbtnNewToggleButton_10 = new JToggleButton("0");
		tglbtnNewToggleButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnNewToggleButton_10.isSelected()) {
					tglbtnNewToggleButton_10.setText("1");
					d += 2;
					lblDec.setText("" + d);

				} else {

					tglbtnNewToggleButton_10.setText("0");
					d -= 2;
					lblDec.setText("" + d);
				}
			}
		});
		tglbtnNewToggleButton_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		tglbtnNewToggleButton_10.setBounds(667, 40, 54, 38);
		frmBinario.getContentPane().add(tglbtnNewToggleButton_10);

		tglbtnNewToggleButton_11 = new JToggleButton("0");
		tglbtnNewToggleButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnNewToggleButton_11.isSelected()) {
					tglbtnNewToggleButton_11.setText("1");
					d += 1;
					lblDec.setText("" + d);

				} else {

					tglbtnNewToggleButton_11.setText("0");
					d -= 1;
					lblDec.setText("" + d);
				}
			}

		});
		tglbtnNewToggleButton_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		tglbtnNewToggleButton_11.setBounds(731, 40, 54, 38);
		frmBinario.getContentPane().add(tglbtnNewToggleButton_11);

		JLabel lblNewLabel = new JLabel("Decimal");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 68));
		lblNewLabel.setBounds(257, 107, 450, 122);
		frmBinario.getContentPane().add(lblNewLabel);

		lblDec = new JLabel("0");
		lblDec.setHorizontalAlignment(SwingConstants.CENTER);
		lblDec.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblDec.setBounds(118, 221, 568, 193);
		frmBinario.getContentPane().add(lblDec);
	}
}
