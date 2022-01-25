import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textIdade;
	private JTextField textEmail;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Idade");
		lblNewLabel_1.setBounds(10, 49, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setBounds(10, 95, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textName = new JTextField();
		textName.setBounds(47, 8, 248, 20);
		contentPane.add(textName);
		textName.setColumns(10);
		
		textIdade = new JTextField();
		textIdade.setBounds(47, 46, 46, 20);
		contentPane.add(textIdade);
		textIdade.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setBounds(47, 92, 248, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		JButton ButtonLimpar = new JButton("Limpar");
		ButtonLimpar.setBounds(146, 173, 89, 23);
		ButtonLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textName.setText("");
				textIdade.setText("");
				textEmail.setText("");
			}
		});
		contentPane.add(ButtonLimpar);
		
		btnNewButton = new JButton("Gravar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BancoDeDados conectar = new BancoDeDados();
				conectar.executaconexao();

				
				if (conectar.estaConectado()) {
					
					conectar.inserirContato(textName.getText(), textIdade.getText(), textEmail.getText());

					System.out.println("Conexão com o banco executada com exito");
					
				}else {
					System.out.println("Não foi possivel conectar");
				}
			}
		});
		btnNewButton.setBounds(245, 173, 89, 23);
		contentPane.add(btnNewButton);
	}
}
