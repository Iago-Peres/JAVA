package sistema5006.ferramentas;

import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;//bordas
import java.util.Date;
import java.text.SimpleDateFormat;//cria formatos de data e hora

public class Status extends JToolBar{
    
    private Date data = new Date();//data e hora
    private SimpleDateFormat fdata = new SimpleDateFormat("dd/MM/YYYY");
    private SimpleDateFormat fhora = new SimpleDateFormat("HH:mm:ss");
    
    public static JLabel lblhora = new JLabel("HH:mm:ss");
    public static JLabel lbldata = new JLabel("data");
    public static JLabel lblusuario = new JLabel("usuario1");
    
    private ImageIcon imgrelogio = new ImageIcon("./imgs/relogio_ico.png");
    private ImageIcon imgcalendario = new ImageIcon("./imgs/calendario_ico.png");
    
    private JLabel lblimgrelogio = new JLabel(imgrelogio);
    private JLabel lblimgcalendario = new JLabel(imgcalendario);
    
    private JLabel espaco1 = new JLabel("   |   ");
    private JLabel espaco2 = new JLabel("   |   ");
    
    public Status(){
        add(lblimgcalendario);
        add(lbldata);
        lbldata.setText(fdata.format(data));
        add(espaco1);
        
        add(lblimgrelogio);
        add(lblhora);
        lblhora.setText(fhora.format(data));
        add(espaco2);
        
        add(lblusuario);
        lblusuario.setBorder(BorderFactory.createBevelBorder(1));//borda
        
        setFloatable(false);
    }
    
}
