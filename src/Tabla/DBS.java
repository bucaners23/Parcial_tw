package Tabla;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class DBS {

	private JFrame frmDragonBallSuper;
	private JTextField txtPer;
	private JTextField txtRaz;
	private JLabel lblRaza;
	private JButton btnAgr;
	private JButton btnBor;
	private JButton btnBorTab;
	private JScrollPane scrollPane;
	private DefaultTableModel modelo = new DefaultTableModel();
	private JTable tblD;
	public ArrayList<dragon> lista = new ArrayList<dragon>();
	private JLabel lblNewLabel_1;

	public static void main(String[] args) {
		DBS x = new DBS();
		x.frmDragonBallSuper.setVisible(true);
	}

	public DBS() {
		initialize();
	}

	public void borrarTabla() {
		lista.clear();
		actualizarTabla();

	}

	public void actualizarTabla() {
		while (modelo.getRowCount() > 0) {
			modelo.removeRow(0);
		}
		for (dragon dragon : lista) {
			Object o[] = new Object[2];
			o[0]=dragon.getPer();
			o[1]=dragon.getPod();
			modelo.addRow(o);
		}
		tblD.setModel(modelo);
		

	}

	private void initialize() {
		frmDragonBallSuper = new JFrame();
		frmDragonBallSuper.setIconImage(Toolkit.getDefaultToolkit().getImage(DBS.class.getResource("/Tbal/oky2.jpg")));
		frmDragonBallSuper.setTitle("Dragon Ball Super");
		frmDragonBallSuper.setLocationRelativeTo(null);
		frmDragonBallSuper.setBounds(100, 100, 641, 455);
		frmDragonBallSuper.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDragonBallSuper.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Personaje : ");
		lblNewLabel.setBounds(10, 11, 69, 14);
		frmDragonBallSuper.getContentPane().add(lblNewLabel);

		txtPer = new JTextField();
		txtPer.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtPer.getText().length()>=10) {
					e.consume();
				}

			}
		});
		txtPer.setBounds(89, 8, 125, 20);
		frmDragonBallSuper.getContentPane().add(txtPer);
		txtPer.setColumns(10);

		txtRaz = new JTextField();
		txtRaz.setColumns(10);
		txtRaz.setBounds(89, 36, 125, 20);
		frmDragonBallSuper.getContentPane().add(txtRaz);

		lblRaza = new JLabel("Poder  :");
		lblRaza.setBounds(10, 39, 69, 14);
		frmDragonBallSuper.getContentPane().add(lblRaza);

		btnAgr = new JButton("Agregar");
		btnAgr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dragon dbz = new dragon();
				dbz.setPer(txtPer.getText());
				dbz.setPod(txtRaz.getText());
				lista.add(dbz);
				actualizarTabla();
			}
		});
		btnAgr.setBounds(20, 80, 89, 23);
		frmDragonBallSuper.getContentPane().add(btnAgr);

		btnBor = new JButton("Borrar");
		btnBor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPer.setText("");
				txtRaz.setText("");
			}
		});
		btnBor.setBounds(136, 80, 89, 23);
		frmDragonBallSuper.getContentPane().add(btnBor);

		btnBorTab = new JButton("Borrar Tabla");
		btnBorTab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarTabla();
			}
		});
		btnBorTab.setBounds(64, 127, 142, 23);
		frmDragonBallSuper.getContentPane().add(btnBorTab);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 178, 578, 227);
		frmDragonBallSuper.getContentPane().add(scrollPane);

		tblD = new JTable();
		
		scrollPane.setViewportView(tblD);
		modelo.addColumn("Nombre del personaje");
		modelo.addColumn("Poder del personaje");
		tblD.setModel(modelo);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(DBS.class.getResource("/Tabla/db.png")));
		lblNewLabel_1.setBounds(247, 14, 330, 136);
		frmDragonBallSuper.getContentPane().add(lblNewLabel_1);
		
	}
}
