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

public class Update extends JFrame {

	private JPanel contentPane;
	private JTextField textID;
	private JTextField textNome;
	private JTextField textMarca;
	private JTextField textQuant;
	private JTextField textValor;
	private JTextField textCod;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update frame = new Update();
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
	public Update() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID: ");
		lblNewLabel.setBounds(20, 27, 46, 14);
		contentPane.add(lblNewLabel);
		
		textID = new JTextField();
		textID.setBounds(65, 24, 86, 20);
		contentPane.add(textID);
		textID.setColumns(10);
		
		JLabel txttextNome = new JLabel("NOME: ");
		txttextNome.setBounds(180, 27, 46, 14);
		contentPane.add(txttextNome);
		
		JLabel txttextMarca = new JLabel("MARCA: ");
		txttextMarca.setBounds(20, 63, 46, 14);
		contentPane.add(txttextMarca);
		
		JLabel txttextQuant = new JLabel("QUANTIDADE: ");
		txttextQuant.setBounds(20, 99, 46, 14);
		contentPane.add(txttextQuant);
		
		JLabel txttextValor = new JLabel("VALOR:");
		txttextValor.setBounds(180, 99, 46, 14);
		contentPane.add(txttextValor);
		
		JLabel txttextCod = new JLabel("COD: ");
		txttextCod.setBounds(20, 140, 46, 14);
		contentPane.add(txttextCod);
		
		JButton btnNewButton = new JButton("Atualizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BancoDeDados conectar = new BancoDeDados();
				conectar.executaconexao();

				
				if (conectar.estaConectado()) {
					
					conectar.editarProduto(textID.getText(), textNome.getText(), textMarca.getText(), textQuant.getText(), textValor.getText(), textCod.getText());

					System.out.println("Conexão com o banco executada com exito");
					
				}else {
					System.out.println("Não foi possivel conectar");
				}
				
			}
		});
		btnNewButton.setBounds(335, 211, 89, 23);
		contentPane.add(btnNewButton);
		
		textNome = new JTextField();
		textNome.setBounds(224, 24, 161, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textMarca = new JTextField();
		textMarca.setBounds(65, 60, 161, 20);
		contentPane.add(textMarca);
		textMarca.setColumns(10);
		
		textQuant = new JTextField();
		textQuant.setBounds(65, 95, 86, 23);
		contentPane.add(textQuant);
		textQuant.setColumns(10);
		
		textValor = new JTextField();
		textValor.setBounds(236, 96, 86, 20);
		contentPane.add(textValor);
		textValor.setColumns(10);
		
		textCod = new JTextField();
		textCod.setBounds(65, 137, 86, 20);
		contentPane.add(textCod);
		textCod.setColumns(10);
		

		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textID.setText("");
				txttextNome.setText("");
				txttextMarca.setText("");
				txttextQuant.setText("");
				txttextValor.setText("");
				txttextCod.setText("");
			}
		});
		btnNewButton_1.setBounds(20, 211, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Pesquisar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_2.setBounds(224, 211, 89, 23);
		contentPane.add(btnNewButton_2);
	}

}
