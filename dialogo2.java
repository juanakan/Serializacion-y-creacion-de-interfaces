import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class dialogo2 extends JDialog {
	
	public dialogo2 () {
		getContentPane().setLayout(null);
		JLabel lbincorrecto = new JLabel("El formulario esta incompleto");
		lbincorrecto.setForeground(Color.red);
		lbincorrecto.setBounds(106,10,203,40);
		getContentPane().add(lbincorrecto);
		
		JLabel lbfaltanombre = new JLabel(Interfaz.incompletonombre);
		lbfaltanombre.setBounds(106,60,203,40);
		getContentPane().add(lbfaltanombre);
		
		JLabel lbfaltaapellido = new JLabel(Interfaz.incompletoapellido);
		lbfaltaapellido.setBounds(106,80,203,40);
		getContentPane().add(lbfaltaapellido);
		
		JLabel lbfaltasexo = new JLabel(Interfaz.incompletosexo);
		lbfaltasexo.setBounds(106,100,203,40);
		getContentPane().add(lbfaltasexo);
		
		JLabel lbfaltaaficion = new JLabel(Interfaz.incompletoaficion);
		lbfaltaaficion.setBounds(106,120,300,40);
		getContentPane().add(lbfaltaaficion);
		
		
		JButton btok = new JButton ("ok");
		btok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {



			}
		});
		
		setVisible(true);
		setSize(450,300);
		setLocation(600,300);

		
		

		
	}
	

}