package sistema5006.janelas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField; //caixa de senha

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Autenticacao extends JFrame {

    private JLabel lblusuario = new JLabel("login:");
    private JLabel lblsenha = new JLabel("senha:");

    private JLabel lblimgusuario = new JLabel(new ImageIcon("./imgs/usuario_ico.png"));
    private JLabel lblimgsenha = new JLabel(new ImageIcon("./imgs/chave_ico.png"));

    protected JTextField txtusuario = new JTextField();
    protected JTextField txtsenha = new JPasswordField();

    protected JButton btok = new JButton("Ok", new ImageIcon("./imgs/ok.png"));
    protected JButton btcancelar = new JButton("Cancelar", new ImageIcon("./imgs/sair_ico.png"));

    public Autenticacao() {
        setTitle("Autenticacao");
        setSize(300, 200);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);

        lblusuario.setBounds(10, 10, 100, 22);
        add(lblusuario);

        lblimgusuario.setBounds(60, 10, 20, 20);
        add(lblimgusuario);

        txtusuario.setBounds(85, 10, 100, 22);
        add(txtusuario);

        lblsenha.setBounds(10, 40, 100, 22);
        add(lblsenha);

        txtsenha.setBounds(85, 40, 100, 22);
        add(txtsenha);

        lblimgsenha.setBounds(60, 40, 20, 20);
        add(lblimgsenha);

        btok.setBounds(10, 120, 100, 22);
        add(btok);

        btcancelar.setBounds(120, 120, 100, 22);
        add(btcancelar);

        setVisible(true);
    }

}
