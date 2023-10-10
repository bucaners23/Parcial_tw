package scollpane;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import javax.swing.ImageIcon;

public class ok {

	private JFrame frame;
	private JLabel lblImaw;
	private JScrollBar scbAlt;
	private JLabel lblNewLabel;
	private JLabel lblAlto;
	private JLabel lblIma;
	int h = 0, w = 0;
	private JScrollBar scbAnc;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ok window = new ok();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void xd() {
		w = scbAnc.getValue();
		h = scbAlt.getValue();
		lblImaw.setBounds(10, 151, w, h);
		ImageIcon iman = new ImageIcon(getClass().getResource("/scollpane/cecy.png"));
		Image imanu = iman.getImage().getScaledInstance(lblImaw.getWidth(), lblImaw.getHeight(),
				Image.SCALE_SMOOTH);
		lblImaw.setIcon(new ImageIcon(imanu));
		frame.getContentPane().add(lblImaw);
	}

	public ok() {
		initialize();
	}
	

	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(ok.class.getResource("/Tbal/oky2.jpg")));
		frame.setBounds(100, 100, 727, 521);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblImaw = new JLabel("");
		lblImaw.setIcon(new ImageIcon(ok.class.getResource("/scollpane/cecy.png")));
		lblImaw.setFont(new Font("Tahoma", Font.BOLD, 56));
		lblImaw.setBounds(339, 151, 362, 287);
		frame.getContentPane().add(lblImaw);

		scbAnc = new JScrollBar();
		scbAnc.setMinimum(10);
		scbAnc.setMaximum(1000);
		
		scbAnc.setOrientation(JScrollBar.HORIZONTAL);
		scbAnc.setBounds(88, 43, 519, 33);
		frame.getContentPane().add(scbAnc);

		scbAlt = new JScrollBar();
		scbAlt.setMinimum(10);
		
		scbAlt.setOrientation(JScrollBar.HORIZONTAL);
		scbAlt.setMaximum(1000);
		scbAlt.setBounds(88, 107, 519, 33);
		frame.getContentPane().add(scbAlt);

		lblNewLabel = new JLabel("ancho");
		lblNewLabel.setBounds(98, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);

		lblAlto = new JLabel("alto");
		lblAlto.setBounds(98, 87, 46, 14);
		frame.getContentPane().add(lblAlto);

		lblIma = new JLabel("");
		scbAnc.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
				xd();
				// lblA.setText("Valor : "+scbAnc.getValue());

			}
		});
		scbAlt.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
				xd();

			}
		});

	}
}
