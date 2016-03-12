package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ContatoView extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JTextField txtTelefone;
	JButton btnInserir = new JButton("Inserir");
	JLabel lblResultado = new JLabel("");

	/**
	 * Create the frame.
	 */
	public ContatoView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 338, 209);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel painelCampos = new JPanel();
		contentPane.add(painelCampos, BorderLayout.NORTH);
		painelCampos.setLayout(new GridLayout(3, 2, 0, 0));
		
		JLabel lblNome = new JLabel("Nome");
		painelCampos.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setText("Nome");
		painelCampos.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		painelCampos.add(lblSobrenome);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setText("Sobrenome");
		painelCampos.add(txtSobrenome);
		txtSobrenome.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		painelCampos.add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setText("Telefone");
		painelCampos.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		contentPane.add(btnInserir, BorderLayout.SOUTH);
		
		lblResultado.setForeground(Color.RED);
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblResultado, BorderLayout.CENTER);
	}

	public JButton getBtnInserir() {
		return btnInserir;
	}

	public String getNome() {
		return txtNome.getText();
	}
	
	public String getSobreNome() {
		return txtSobrenome.getText();
	}
	
	public String getTelefone() {
		return txtTelefone.getText();
	}

	public void setResultado(String visualizacao) {
		lblResultado.setText(visualizacao);
	}
	
	
	
	
	
	
	
	
	
}
