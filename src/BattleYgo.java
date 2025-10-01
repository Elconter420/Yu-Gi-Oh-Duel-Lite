import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BattleYgo {

    private JLabel cartaJuCombate;
    private JPanel JugadorCombate;
    private JPanel MaquinaPanel;
    private JPanel mainPanel;
    private JLabel carta1M;
    private JLabel carta2M;
    private JLabel carta3M;
    private JPanel JugadorPanel;
    private JLabel carta1J;
    private JLabel carta2J;
    private JLabel carta3J;
    private JPanel MaquinaCombate;
    private JLabel cartaMa_combate;
    private JButton randomButtonM;
    private JButton ButtonBatle;
    private JButton randomButtonJ;
    private JPanel StatsCombat;
    private JTextArea infoCombate;

    public BattleYgo() {



        randomButtonM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        randomButtonJ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        ButtonBatle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });



    }

    public static void main(String[] args){
        JFrame frame = new JFrame("BattleYgo");
        frame.setContentPane(new BattleYgo().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
    }
}
