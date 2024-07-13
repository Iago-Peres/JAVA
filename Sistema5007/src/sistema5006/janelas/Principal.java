package sistema5006.janelas;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JDesktopPane;// painel que ficara no meio da janela(CENTER)
import java.awt.BorderLayout; // divide a janela em 5 areas para posicionar controles, norte, sul, leste, oeste, e center
import java.awt.Color;
import sistema5006.ferramentas.Menu;
import sistema5006.ferramentas.Ferramentas;
import sistema5006.ferramentas.Status;

public class Principal extends JFrame {

    public static JDesktopPane fundo = new JDesktopPane();
    private BorderLayout layout = new BorderLayout();//layout da janela
    private Menu barrademenu = new Menu();
    private Ferramentas barraFerramentas = new Ferramentas();
    private Status status = new Status();
    
    //construtor
    public Principal() {
        setTitle("Sistema de Gestao - versão 1.0");
        setExtendedState(JFrame.MAXIMIZED_BOTH);//maximizada
        setDefaultCloseOperation(3);
        setLayout(layout);
        setJMenuBar(barrademenu);
        add(status,layout.SOUTH);
        add(barraFerramentas, layout.NORTH);
        add(fundo, layout.CENTER);//coloca o fundo no centro da janela
        fundo.setBackground(Color.LIGHT_GRAY);//cor do painel de fundo
        setVisible(true);
    }
}
