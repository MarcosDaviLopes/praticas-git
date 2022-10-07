package ifsc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField Nota2;
	private JTextField Nota1;
	private JTextField txtNome;
	private JTextField Nota3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 233, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Nota2 = new JTextField();
		Nota2.setBounds(82, 129, 86, 20);
		contentPane.add(Nota2);
		Nota2.setColumns(10);
		
		Nota1 = new JTextField();
		Nota1.setBounds(82, 79, 86, 20);
		contentPane.add(Nota1);
		Nota1.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(82, 27, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		Nota3 = new JTextField();
		Nota3.setBounds(82, 181, 86, 20);
		contentPane.add(Nota3);
		Nota3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(26, 30, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nota 1:");
		lblNewLabel_1.setBounds(26, 82, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nota 2");
		lblNewLabel_2.setBounds(26, 132, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nota 3:");
		lblNewLabel_3.setBounds(26, 184, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtNome.getText();
				String nota1 = Nota1.getText();
				String nota2 = Nota1.getText();
				String nota3 = Nota1.getText();
				
				if (!nome.isEmpty() && !nota1.isEmpty() && !nota2.isEmpty() && !nota3.isEmpty()) {
					double N1 = Double.valueOf(nota1);
					double N2 = Double.valueOf(nota2);
					double N3 = Double.valueOf(nota3);
					
					Double Media = (N1+N2+N3)/3;
					JOptionPane.showMessageDialog(null, "Nome: "+ nome +" \nCom a nota: "+ Math.round(Media));
					
				}
				
				
			}
		});
		btnCalc.setBounds(79, 215, 89, 23);
		contentPane.add(btnCalc);
	}
}
