import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class Interfaz extends JFrame {

	private JTextField tfnombre;
	private JTextField tfapellido;
	private ButtonGroup gruporadio;
	private boolean verdaderoapellido= true;
	private boolean verdaderonombre= true;
	private boolean verdaderosexo= true;
	private boolean verdaderoaficion= true;
	static String incompletonombre="";
	static String incompletoapellido="";
	static String incompletoaficion="";
	static String incompletosexo="";
	public Interfaz() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		tfnombre = new JTextField();
		tfnombre.setBounds(128, 16, 119, 20);
		getContentPane().add(tfnombre);
		tfnombre.setColumns(10);


		
		JLabel lbapellido = new JLabel("Apellido:");
		lbapellido.setBounds(55, 47, 63, 14);
		getContentPane().add(lbapellido);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(55, 19, 63, 14);
		getContentPane().add(lblNombre);
		
		tfapellido = new JTextField();
		tfapellido.setBounds(128, 44, 119, 20);
		getContentPane().add(tfapellido);
		tfapellido.setColumns(10);

		
		JComboBox<String> cbedad = new JComboBox<String>();
		cbedad.setToolTipText("10-15");
		cbedad.setBounds(336, 33, 63, 20);
		getContentPane().add(cbedad);
		
		cbedad.addItem("10 - 15");
		cbedad.addItem("15 - 20");
		cbedad.addItem("20 - 25");
		
		JLabel lbedad = new JLabel("Edad:");
		lbedad.setBounds(280, 36, 46, 14);
		getContentPane().add(lbedad);
		
		JLabel lbsexo = new JLabel("Sexo:");
		lbsexo.setBounds(55, 103, 46, 14);
		getContentPane().add(lbsexo);
		
		JRadioButton rbhombre = new JRadioButton("Hombre");
		rbhombre.setBounds(111, 99, 86, 23);
		getContentPane().add(rbhombre);
		
		JRadioButton rbmujer = new JRadioButton("Mujer");
		rbmujer.setBounds(220, 99, 79, 23);
		getContentPane().add(rbmujer);
		
		gruporadio = new ButtonGroup();
		gruporadio.add(rbhombre);
		gruporadio.add(rbmujer);
		
		JLabel lbaficiones = new JLabel("Aficiones:");
		lbaficiones.setBounds(55, 132, 63, 14);
		getContentPane().add(lbaficiones);
		
		JCheckBox cbcine = new JCheckBox("Cine");
		cbcine.setBounds(138, 128, 63, 23);
		getContentPane().add(cbcine);
		
		JCheckBox cbviajar = new JCheckBox("Viajar");
		cbviajar.setBounds(210, 128, 65, 23);
		getContentPane().add(cbviajar);
		
		JCheckBox cbfutbol = new JCheckBox("Futbol");
		cbfutbol.setBounds(277, 128, 70, 23);
		getContentPane().add(cbfutbol);
		
		JCheckBox cbmusica = new JCheckBox("Musica");
		cbmusica.setBounds(349, 128, 79, 23);
		getContentPane().add(cbmusica);
		
	
		
		JButton btaceptar = new JButton("Aceptar");
		btaceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tfapellido.getText().length()==0){
					verdaderoapellido=false;
					incompletoapellido="El campo apellido esta vacio";
				}else {
					verdaderoapellido=true;
					incompletoapellido="";
				}
				if(tfnombre.getText().length()==0){
					verdaderonombre=false;
					incompletonombre="El campo nombre esta vacio";
				}else {
					verdaderonombre=true;
					incompletonombre="";
				}
				
				
				if(rbmujer.isSelected()){
					verdaderosexo=true;
					incompletosexo="";
					
				}else if(rbhombre.isSelected()){
					verdaderosexo=true;
					incompletosexo="";
				}else{
					 verdaderosexo=false;
					 incompletosexo="Tienes que indicar el sexo";
				}
				if(cbcine.isSelected()) {
					verdaderoaficion=true;
					incompletoaficion="";
					
				}else if(cbviajar.isSelected()){
					verdaderoaficion=true;
					incompletoaficion="";
				}else if(cbfutbol.isSelected()) {
					verdaderoaficion=true;
					incompletoaficion="";
				}else if(cbmusica.isSelected()) {
					verdaderoaficion=true;
					incompletoaficion="";
					
				}else {
					verdaderoaficion=false;
					incompletoaficion="Tienes que marcar una aficcion como minimo";
				}
				
				if(verdaderoapellido && verdaderonombre && verdaderosexo && verdaderoaficion) {
					dialogo d = new dialogo();
					
				}else {
					dialogo2 d2 = new dialogo2();
				}

			}
		});
		btaceptar.setBounds(171, 200, 89, 23);
		getContentPane().add(btaceptar);
		
		setVisible(true);
		setSize(450,300);
		setLocation(600,300);
	}
}
