package cadastro;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.ParseException;

public class CadastroAluno extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textFieldNome;
    private JTextField textFieldEndereco;
    private JFormattedTextField formattedTextFieldTelefone;
    private JFormattedTextField formattedTextFieldCPF;
    private JComboBox<String> comboBoxTipoSanguineo;
    private JComboBox<String> comboBoxFatorRh;
    private JComboBox<String> comboBoxCurso;
    private JTextField textFieldContatoEmergencia;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CadastroAluno frame = new CadastroAluno();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public CadastroAluno() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JLabel lblNewLabel = new JLabel("Nome:");
        JLabel lblNewLabel_1 = new JLabel("Endereço:");
        JLabel lblNewLabel_2 = new JLabel("Telefone:");
        JLabel lblNewLabel_3 = new JLabel("CPF:");
        JLabel lblNewLabel_4 = new JLabel("Tipo Sanguíneo:");
        JLabel lblNewLabel_5 = new JLabel("Curso:");
        JLabel lblNewLabel_6 = new JLabel("Contato de emergência:");

        JButton btnInserir = new JButton("Inserir");
        btnInserir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Ao pressionar o botão "Inserir", exibir as informações inseridas
                String nome = textFieldNome.getText();
                String endereco = textFieldEndereco.getText();
                String telefone = formattedTextFieldTelefone.getText();
                String cpf = formattedTextFieldCPF.getText();
                String tipoSanguineo = comboBoxTipoSanguineo.getSelectedItem().toString();
                String fatorRh = comboBoxFatorRh.getSelectedItem().toString();
                String curso = comboBoxCurso.getSelectedItem().toString();
                String contatoEmergencia = textFieldContatoEmergencia.getText();
                
                // Aqui você pode implementar o que deseja fazer com as informações inseridas
                System.out.println("Nome: " + nome);
                System.out.println("Endereço: " + endereco);
                System.out.println("Telefone: " + telefone);
                System.out.println("CPF: " + cpf);
                System.out.println("Tipo Sanguíneo: " + tipoSanguineo + fatorRh);
                System.out.println("Curso: " + curso);
                System.out.println("Contato de emergência: " + contatoEmergencia);
            }
        });

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Ao pressionar o botão "Cancelar", fechar a janela
                dispose();
            }
        });

        textFieldNome = new JTextField();
        textFieldNome.setColumns(10);

        textFieldEndereco = new JTextField();
        textFieldEndereco.setColumns(10);

        try {
            MaskFormatter telefoneFormatter = new MaskFormatter("(##) #####-####");
            formattedTextFieldTelefone = new JFormattedTextField(telefoneFormatter);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            MaskFormatter cpfFormatter = new MaskFormatter("###.###.###-##");
            formattedTextFieldCPF = new JFormattedTextField(cpfFormatter);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        comboBoxTipoSanguineo = new JComboBox<>();
        comboBoxTipoSanguineo.addItem("A");
        comboBoxTipoSanguineo.addItem("B");
        comboBoxTipoSanguineo.addItem("AB");
        comboBoxTipoSanguineo.addItem("O");

        comboBoxFatorRh = new JComboBox<>();
        comboBoxFatorRh.addItem("+");
        comboBoxFatorRh.addItem("-");

        comboBoxCurso = new JComboBox<>();
        comboBoxCurso.addItem("Ciência da Computação");
        comboBoxCurso.addItem("Enfermagem");
        comboBoxCurso.addItem("Medicina");
        comboBoxCurso.addItem("Direito");
        comboBoxCurso.addItem("Administração");
        comboBoxCurso.addItem("Engenharia");
        comboBoxCurso.addItem("Pedagogia");

        textFieldContatoEmergencia = new JTextField();
        textFieldContatoEmergencia.setColumns(10);

        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
        	gl_contentPane.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_contentPane.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
        				.addGroup(gl_contentPane.createSequentialGroup()
        					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblNewLabel_1))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
        						.addComponent(textFieldEndereco, GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
        						.addComponent(textFieldNome, GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)))
        				.addGroup(gl_contentPane.createSequentialGroup()
        					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblNewLabel_2)
        						.addComponent(lblNewLabel_3)
        						.addComponent(lblNewLabel_4))
        					.addPreferredGap(ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
        					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
        						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
        							.addComponent(formattedTextFieldCPF, Alignment.TRAILING)
        							.addComponent(formattedTextFieldTelefone, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
        						.addGroup(gl_contentPane.createSequentialGroup()
        							.addComponent(comboBoxTipoSanguineo, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        							.addGap(65)
        							.addComponent(comboBoxFatorRh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addGap(24))))
        				.addGroup(gl_contentPane.createSequentialGroup()
        					.addComponent(lblNewLabel_5)
        					.addGap(141)
        					.addComponent(comboBoxCurso, 0, 256, Short.MAX_VALUE))
        				.addGroup(gl_contentPane.createSequentialGroup()
        					.addComponent(lblNewLabel_6)
        					.addGap(57)
        					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
        						.addGroup(gl_contentPane.createSequentialGroup()
        							.addComponent(btnInserir, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(btnCancelar, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
        						.addComponent(textFieldContatoEmergencia, GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))))
        			.addContainerGap())
        );
        gl_contentPane.setVerticalGroup(
        	gl_contentPane.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_contentPane.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
        				.addComponent(textFieldNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNewLabel_1)
        				.addComponent(textFieldEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNewLabel_2)
        				.addComponent(formattedTextFieldTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNewLabel_3)
        				.addComponent(formattedTextFieldCPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNewLabel_4)
        				.addComponent(comboBoxTipoSanguineo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(comboBoxFatorRh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNewLabel_5)
        				.addComponent(comboBoxCurso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNewLabel_6)
        				.addComponent(textFieldContatoEmergencia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnInserir, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
        			.addGap(19))
        );
        contentPane.setLayout(gl_contentPane);
    }
}

