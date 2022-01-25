import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class inclusaoProdutos extends JFrame {

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
					inclusaoProdutos frame = new inclusaoProdutos();
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
	public inclusaoProdutos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID: ");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NOME: ");
		lblNewLabel_1.setBounds(165, 11, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MARCA: ");
		lblNewLabel_2.setBounds(10, 51, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("QNTIDADE: ");
		lblNewLabel_3.setBounds(10, 90, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("VALOR: ");
		lblNewLabel_4.setBounds(179, 90, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("C\u00D3DIGO: ");
		lblNewLabel_5.setBounds(10, 135, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		textID = new JTextField();
		textID.setBounds(66, 8, 86, 20);
		contentPane.add(textID);
		textID.setColumns(10);
		
		textNome = new JTextField();
		textNome.setBounds(216, 8, 208, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textMarca = new JTextField();
		textMarca.setBounds(66, 48, 208, 20);
		contentPane.add(textMarca);
		textMarca.setColumns(10);
		
		textQuant = new JTextField();
		textQuant.setBounds(66, 87, 86, 20);
		contentPane.add(textQuant);
		textQuant.setColumns(10);
		
		textValor = new JTextField();
		textValor.setBounds(224, 87, 86, 20);
		contentPane.add(textValor);
		textValor.setColumns(10);
		
		textCod = new JTextField();
		textCod.setBounds(66, 132, 86, 20);
		contentPane.add(textCod);
		textCod.setColumns(10);
		
		JButton btnNewButton = new JButton("Limpar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textID.setText("");
				textNome.setText("");
				textMarca.setText("");
				textQuant.setText("");
				textValor.setText("");
				textCod.setText("");
				
			}
		});
		btnNewButton.setBounds(145, 211, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cadastrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BancoDeDados conectar = new BancoDeDados();
				conectar.executaconexao();
				
				if (conectar.estaConectado()) {
					
					conectar.insertProduto(textID.getText(), textNome.getText(), textMarca.getText(), textQuant.getText(), textValor.getText(), textCod.getText());

					System.out.println("Conexão com o banco executada com exito");
					
				}else {
					System.out.println("Não foi possivel conectar");
				}
			}
		});
		btnNewButton_1.setBounds(342, 211, 89, 23);
			contentPane.add(btnNewButton_1);
			
			JButton btnNewButton_2 = new JButton("Editar");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Update Window = new Update();
					Window.setVisible(true);
					
				}
			});
			btnNewButton_2.setBounds(243, 211, 89, 23);
			contentPane.add(btnNewButton_2);
			
	}
}
