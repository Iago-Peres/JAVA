package sistema5006.ferramentas;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;

public class Menu extends JMenuBar{
    private JMenu Cadastro = new JMenu("cadastro");
    private JMenu Movimento = new JMenu("movimento");
    private JMenu Caixa = new JMenu("caixa");
    private JMenu Relatorios = new JMenu("relatorios");
    private JMenu Ajuda = new JMenu("ajuda");
    private JSeparator s1 = new JSeparator();
    
    private JMenu Ferramentas = new JMenu("ferramentas");
    
    protected JMenuItem Clientes = new JMenuItem("Clientes",new ImageIcon("./imgs/clientes_ico.png"));
    protected JMenuItem Fornecedores = new JMenuItem("fornecedores",new ImageIcon("./imgs/fornecedores_ico.png"));
    protected JMenuItem Produtos = new JMenuItem("produtos",new ImageIcon("./imgs/produtos_ico.png"));
    protected JMenuItem Usuarios = new JMenuItem("usuarios",new ImageIcon("./imgs/usuarios_ico.png"));
    protected JMenuItem Sair = new JMenuItem("sair",new ImageIcon("./imgs/sair_ico.png"));
    protected JMenuItem Comprar = new JMenuItem("comprar",new ImageIcon("./imgs/comprar_ico.png"));
    protected JMenuItem Vender = new JMenuItem("vender",new ImageIcon("./imgs/vender_ico.png"));
    protected JMenuItem Entradas = new JMenuItem("entradas",new ImageIcon("./imgs/entradas_ico.png"));
    protected JMenuItem Saidas = new JMenuItem("saidas",new ImageIcon("./imgs/saidas_ico.png"));
    protected JMenuItem Sobre = new JMenuItem("sobre",new ImageIcon("./imgs/sobre_ico.png"));
    protected JMenuItem Calculadora = new JMenuItem("calculadora",new ImageIcon("./imgs/calculadora_ico.png"));
    protected JMenuItem Backup = new JMenuItem("backup",new ImageIcon("./imgs/backup_ico.png"));
   
    //construtor
    public Menu(){
        add(Cadastro);
        add(Movimento);
        add(Caixa);
        add(Relatorios);
        add(Ferramentas);
        add(Ajuda);
        
        Cadastro.add(Clientes);
        Cadastro.add(Fornecedores);
        Cadastro.add(Produtos);
        Cadastro.add(Usuarios);
        Cadastro.add(s1);
        Cadastro.add(Sair);
        
        Movimento.add(Comprar);
        Movimento.add(Vender);
        
        Caixa.add(Entradas);
        Caixa.add(Saidas);
        
        Ferramentas.add(Backup);
        Ferramentas.add(Calculadora);
        
        Ajuda.add(Sobre);
        
    }
}
