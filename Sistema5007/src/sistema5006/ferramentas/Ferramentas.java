package sistema5006.ferramentas;

import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Ferramentas extends JToolBar {

    protected JButton btclientes = new JButton(new ImageIcon("./imgs/clientes_ico.png"));
    protected JButton btfornecedores = new JButton(new ImageIcon("./imgs/fornecedores_ico.png"));
    protected JButton btprodutos = new JButton(new ImageIcon("./imgs/produtos_ico.png"));
    protected JButton btajuda = new JButton(new ImageIcon("./imgs/ajuda_ico.png"));
    protected JButton btsair = new JButton(new ImageIcon("./imgs/sair_ico.png"));
    protected JButton btcalculadora = new JButton(new ImageIcon("./imgs/calculadora_ico.png"));

    public Ferramentas() {
        add(btclientes);
        btclientes.setToolTipText("clientes");
        add(btfornecedores);
        btfornecedores.setToolTipText("fornecedores");
        add(btprodutos);
        btprodutos.setToolTipText("produtos");
        add(btajuda);
        btajuda.setToolTipText("ajuda");
        add(btsair);
        btsair.setToolTipText("sair");
        add(btcalculadora);
        btcalculadora.setToolTipText("calculadora");
        setFloatable(false);
    }

}
