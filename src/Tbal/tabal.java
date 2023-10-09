package Tbal;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tabal {

	private JFrame frmPokemon;
	private JTextField txtNom;
	private JLabel lblTipoDePokemon;
	private JTextField txtTip;
	private JButton btnAgr;
	private JButton btnBor;
	private JButton btnBorrarT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tabal window = new tabal();
					window.frmPokemon.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tabal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPokemon = new JFrame();
		frmPokemon.setIconImage(Toolkit.getDefaultToolkit().getImage(tabal.class.getResource("/Tbal/oky.jpg")));
		frmPokemon.setTitle("Pokemon");
		frmPokemon.setBounds(100, 100, 506, 436);
		frmPokemon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPokemon.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre de pokemon");
		lblNewLabel.setBounds(10, 27, 155, 14);
		frmPokemon.getContentPane().add(lblNewLabel);
		
		txtNom = new JTextField();
		txtNom.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtNom.getText().length()>10) {
					e.consume();
				}
			}
		});
		txtNom.setBounds(169, 24, 179, 20);
		frmPokemon.getContentPane().add(txtNom);
		txtNom.setColumns(10);
		
		lblTipoDePokemon = new JLabel("Tipo de pokemon");
		lblTipoDePokemon.setBounds(10, 68, 155, 14);
		frmPokemon.getContentPane().add(lblTipoDePokemon);
		
		txtTip = new JTextField();
		txtTip.setColumns(10);
		txtTip.setBounds(169, 65, 179, 20);
		frmPokemon.getContentPane().add(txtTip);
		
		btnAgr = new JButton("Agregar");
		btnAgr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAgr.setBounds(10, 93, 89, 23);
		frmPokemon.getContentPane().add(btnAgr);
		
		btnBor = new JButton("Borrar");
		btnBor.setBounds(128, 93, 89, 23);
		frmPokemon.getContentPane().add(btnBor);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(47, 368, 301, -215);
		frmPokemon.getContentPane().add(scrollPane);
		
		btnBorrarT = new JButton("Borrar tabla");
		btnBorrarT.setBounds(231, 96, 131, 23);
		frmPokemon.getContentPane().add(btnBorrarT);
	}
}
