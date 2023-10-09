package holi;
import java.awt.Color;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Font;
public class Nuevo {
	
	
	JFrame frmHola;

	String Nom;

	 JLabel lblHola;



	/**

	 * Launch the application.

	 */



	/**

	 * Create the application.

	 */

	public Nuevo(String Nom) {

		this.Nom=Nom;

		initialize();

		lblHola.setText("Hola "+Nom);

	}



	public String getNom() {

		return Nom;

	}



	public void setNom(String nom) {

		Nom = nom;

	}



	/**

	 * Initialize the contents of the frame.

	 */

	private void initialize() {

		frmHola = new JFrame();

		frmHola.setTitle("Hola");

		frmHola.setBounds(100, 100, 450, 300);

		frmHola.setLocationRelativeTo(null);

		frmHola.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frmHola.getContentPane().setLayout(null);



		lblHola = new JLabel("Hola");

		lblHola.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));

		lblHola.setHorizontalAlignment(SwingConstants.CENTER);

		lblHola.setBorder(new LineBorder(new Color(0, 0, 0)));

		lblHola.setBounds(69, 24, 292, 143);

		frmHola.getContentPane().add(lblHola);

	}

}
