package sistema5006.janelas;

import java.awt.Color;
import javax.swing.JWindow;// janela sem bordas e botoes
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;//barra de progresso
import java.lang.Thread; //multitarefa, tem tbm um timer

public class SplashScreen extends JWindow {

    private final ImageIcon img = new ImageIcon("./imgs/logo.png");
    private final JLabel lblimg = new JLabel(img);
    private JProgressBar barra = new JProgressBar();

    public SplashScreen() {
        setSize(256, 256);
        setLayout(null);
        setLocationRelativeTo(null);//centro do video;

        barra.setBounds(1, 248, 254, 5);
        add(barra);

        lblimg.setBounds(0, 0, 255, 255);
        add(lblimg);

        barra.setForeground(Color.RED);
        barra.setBackground(Color.BLACK);

        setVisible(true);

        try {
            int porcentagem = 0;
            while (porcentagem < 100) {
                Thread.sleep(1000);
                barra.setValue(porcentagem);
                porcentagem += 33;
            }
            dispose();
        } catch (Exception ex) {

        }
    }

}
