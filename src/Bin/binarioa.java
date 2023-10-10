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
	private JToggleButton btnA;
	private JToggleButton btnB;
	private JToggleButton btnC;
	private JToggleButton btnD;
	private JToggleButton btnE;
	private JToggleButton btnL;
	private JToggleButton btnK;
	private JToggleButton btnJ;
	private JToggleButton btnI;
	private JToggleButton btnH;
	private JToggleButton btnG;
	private JToggleButton btnF;
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

		btnL = new JToggleButton("0");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnL.isSelected()) {
					btnL.setText("1");
					d += 2048;
					lblDec.setText("" + d);

				} else {

					btnL.setText("0");
					d -= 2048;
					lblDec.setText("" + d);
				}
			}
		});
		btnL.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnL.setBounds(10, 40, 54, 38);
		frmBinario.getContentPane().add(btnL);

		btnK = new JToggleButton("0");
		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnK.isSelected()) {
					btnK.setText("1");
					d += 1024;
					lblDec.setText("" + d);

				} else {

					btnK.setText("0");
					d -= 1024;
					lblDec.setText("" + d);
				}
			}
		});
		btnK.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnK.setBounds(74, 40, 54, 38);
		frmBinario.getContentPane().add(btnK);

		btnJ = new JToggleButton("0");
		btnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnJ.isSelected()) {
					btnJ.setText("1");
					d += 512;
					lblDec.setText("" + d);

				} else {

					btnJ.setText("0");
					d -= 512;
					lblDec.setText("" + d);
				}
			}
		});
		btnJ.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnJ.setBounds(144, 40, 54, 38);
		frmBinario.getContentPane().add(btnJ);

		btnI = new JToggleButton("0");
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnI.isSelected()) {
					btnI.setText("1");
					d += 256;
					lblDec.setText("" + d);

				} else {

					btnI.setText("0");
					d -= 256;
					lblDec.setText("" + d);
				}
			}
		});
		btnI.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnI.setBounds(208, 40, 54, 38);
		frmBinario.getContentPane().add(btnI);

		btnH = new JToggleButton("0");
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnH.isSelected()) {
					btnH.setText("1");
					d += 128;
					lblDec.setText("" + d);

				} else {

					btnH.setText("0");
					d -= 128;
					lblDec.setText("" + d);
				}
			}
		});
		btnH.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnH.setBounds(273, 40, 54, 38);
		frmBinario.getContentPane().add(btnH);

		btnG = new JToggleButton("0");
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnG.isSelected()) {
					btnG.setText("1");
					d += 64;
					lblDec.setText("" + d);

				} else {

					btnG.setText("0");
					d -= 64;
					lblDec.setText("" + d);
				}
			}
		});
		btnG.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnG.setBounds(337, 40, 54, 38);
		frmBinario.getContentPane().add(btnG);

		btnF = new JToggleButton("0");
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnF.isSelected()) {
					btnF.setText("1");
					d += 32;
					lblDec.setText("" + d);

				} else {

					btnF.setText("0");
					d -= 32;
					lblDec.setText("" + d);
				}
			}
		});
		btnF.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnF.setBounds(402, 40, 54, 38);
		frmBinario.getContentPane().add(btnF);

		btnE = new JToggleButton("0");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnE.isSelected()) {
					btnE.setText("1");
					d += 16;
					lblDec.setText("" + d);

				} else {

					btnE.setText("0");
					d -= 16;
					lblDec.setText("" + d);
				}
			}
		});
		btnE.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnE.setBounds(470, 40, 54, 38);
		frmBinario.getContentPane().add(btnE);

		btnD = new JToggleButton("0");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnD.isSelected()) {
					btnD.setText("1");
					d += 8;
					lblDec.setText("" + d);

				} else {

					btnD.setText("0");
					d -= 8;
					lblDec.setText("" + d);
				}
			}
		});
		btnD.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnD.setBounds(534, 40, 54, 38);
		frmBinario.getContentPane().add(btnD);

		btnC = new JToggleButton("0");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnC.isSelected()) {
					btnC.setText("1");
					d += 4;
					lblDec.setText("" + d);

				} else {

					btnC.setText("0");
					d -= 4;
					lblDec.setText("" + d);
				}
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnC.setBounds(603, 40, 54, 38);
		frmBinario.getContentPane().add(btnC);

		btnB = new JToggleButton("0");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnB.isSelected()) {
					btnB.setText("1");
					d += 2;
					lblDec.setText("" + d);

				} else {

					btnB.setText("0");
					d -= 2;
					lblDec.setText("" + d);
				}
			}
		});
		btnB.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnB.setBounds(667, 40, 54, 38);
		frmBinario.getContentPane().add(btnB);

		btnA = new JToggleButton("0");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnA.isSelected()) {
					btnA.setText("1");
					d += 1;
					lblDec.setText("" + d);

				} else {

					btnA.setText("0");
					d -= 1;
					lblDec.setText("" + d);
				}
			}

		});
		btnA.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnA.setBounds(731, 40, 54, 38);
		frmBinario.getContentPane().add(btnA);

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
