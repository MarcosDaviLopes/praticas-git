package Jframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Pratica extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pratica frame = new Pratica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */private String Textall;
	public Pratica() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setBounds(102, 23, 126, 23);
		
		String [] VetPaises = { "Brasil", "França", "Bolívia", "México" };
		for (int i = 0; i < VetPaises.length; i++) {
			comboBox.addItem(VetPaises[i]);
		}
		contentPane.add(comboBox);
		
		
		
		
		JLabel lblNewLabel = new JLabel("Opções:");
		lblNewLabel.setBounds(46, 27, 46, 14);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(46, 67, 340, 184);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sav =  (String) comboBox.getSelectedItem();
				if (Textall == null) {
					Textall = sav;
				} else {
					Textall = Textall + "\n" + sav;
				}
				textArea.setText(Textall);
			}
		});
		btnNewButton.setBounds(286, 23, 100, 23);
		contentPane.add(btnNewButton);
	}
}
