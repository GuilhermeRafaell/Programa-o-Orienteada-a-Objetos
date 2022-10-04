import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class Janela extends JFrame{
    private JLabel labell;
    private JTextField campoTexto;
    private JButton botao;
    private JCheckBox checkBold;
    private JCheckBox checkItalico;
    private String nomes[] = {"Um","DOis","Tres","Quatro","Cinco"};
    private JComboBox combo;

    public Janela(){
        super("Janela Exemplo");
        setLayout(new FlowLayout());

        labell = new JLabel("Texto Qualquer");
        add(labell);

        campoTexto = new JTextField(25);
        add(campoTexto);

        botao = new JButton("Botão de Teste");
        add(botao);

        checkBold = new JCheckBox("Negrito");
        add(checkBold);

        checkItalico = new JCheckBox("Itálico");
        add(checkItalico);

        combo = new JComboBox(nomes);
        add(combo);
    }
}
