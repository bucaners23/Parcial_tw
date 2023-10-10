package xd;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class f {

	private JFrame frmIdiomaF;
	private JTextArea txtArea;
	private JTextArea txtTra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					f window = new f();
					window.frmIdiomaF.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public f() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIdiomaF = new JFrame();
		frmIdiomaF.getContentPane().setBackground(new Color(192, 192, 192));
		frmIdiomaF.setIconImage(Toolkit.getDefaultToolkit().getImage(f.class.getResource("/Tbal/oky2.jpg")));
		frmIdiomaF.setTitle("Idioma f");
		frmIdiomaF.setBounds(100, 100, 670, 495);
		frmIdiomaF.setLocationRelativeTo(null);
		frmIdiomaF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIdiomaF.getContentPane().setLayout(null);
		
		txtArea = new JTextArea();
		txtArea.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				txtTra.setText(txtArea.getText());
				String t=txtArea.getText();
				t=t.replace("a","afa");
				t=t.replace("e","efe");
				t=t.replace("i","ifi");
				t=t.replace("o","ofo");
				t=t.replace("u","ufu");
				t=t.replace("A","AFA");
				t=t.replace("E","EFE");
				t=t.replace("I","IFI");
				t=t.replace("O","OFO");
				t=t.replace("U","UfU");
				txtTra.setText(t);
			}
		});
		txtArea.setBounds(98, 45, 420, 151);
		frmIdiomaF.getContentPane().add(txtArea);
		
		txtTra = new JTextArea();
		txtTra.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
							}
			@Override
			public void keyReleased(KeyEvent e) {
			}
		});
		txtTra.setBounds(98, 226, 420, 151);
		frmIdiomaF.getContentPane().add(txtTra);
	}
}
