package holi;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import java.awt.Toolkit;

public class xd {
	private JFrame frame;

	private JButton btnNom;

	String nom = "";

	private JProgressBar BarraPro;



	/**

	 * Launch the application.

	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					xd window = new xd();

					window.frame.setVisible(true);

				} catch (Exception e) {

					e.printStackTrace();

				}

			}

		});

	}



	/**

	 * Create the application.

	 */

	public xd() {

		initialize();

	}



	public void start() {

		nom = JOptionPane.showInputDialog("Ingresa nombre");

		Thread hilo=new Thread(new Runnable() {



			@Override

			public void run() {

				for (int i = 0; i <=100; i++) {

					BarraPro.setValue(i);

					try {

						Thread.sleep(50);

					} catch (InterruptedException e) {

						e.printStackTrace();

					}

					if (i==100) {

						Nuevo hola=new Nuevo(nom);

						hola.frmHola.show(true);

						frame.show(false);

					}

				}

				

				

			}

			

		});

        hilo.start();

	}



	/**

	 * Initialize the contents of the frame.xxxx

	 */

	private void initialize() {

		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(xd.class.getResource("/holi/oky.jpg")));

		frame.setTitle("Barra de progreso");

		frame.setBounds(100, 100, 541, 353);

		frame.setLocationRelativeTo(null);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().setLayout(null);



		BarraPro = new JProgressBar();

		BarraPro.setFont(new Font("Tahoma", Font.BOLD, 19));

		BarraPro.setBackground(new Color(240, 240, 240));

		BarraPro.setForeground(new Color(51, 153, 255));

		BarraPro.setStringPainted(true);

		BarraPro.setBounds(85, 56, 347, 62);

		frame.getContentPane().add(BarraPro);



		btnNom = new JButton("New button");

		btnNom.addActionListener((ActionListener) new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				start();

			}

		});

		btnNom.setText("Start");

		btnNom.setBounds(190, 154, 125, 34);

		frame.getContentPane().add(btnNom);

	}


}
