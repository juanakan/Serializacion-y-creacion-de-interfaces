import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class dialogo extends JDialog {
	
	public dialogo () {
		getContentPane().setLayout(null);
		JLabel lbcorrecto = new JLabel("Gracias por usar la aplicacion");
		lbcorrecto.setBounds(106,40,203,75);
		getContentPane().add(lbcorrecto);
		
		
		JButton btok = new JButton ("ok");
		btok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);


			}
		});
		btok.setBounds(290,190,65,25);
		getContentPane().add(btok);
		
		setVisible(true);
		setSize(450,300);
		setLocation(600,300);

		
		

		
	}
	

}
