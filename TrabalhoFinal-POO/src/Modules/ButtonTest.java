import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ButtonTest extends JFrame{

    private JButton botao1, botao2;
    private JLabel label = new JLabel("Aperte um dos botoes");

    public ButtonTest(){
        super("Testando botoes");
        setLayout(new FlowLayout());

        TrataBotoes tratador = new TrataBotoes();
        add(label);

        botao1 = new JButton("Botao um");
        botao1.addActionListener(tratador);
        add(botao1);

        botao2 = new JButton("Botao dois");
        botao2.addActionListener(tratador);
        add(botao2);
    }

    private class TrataBotoes implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == botao1){
                label.setText("Pressionado botao 1");
            }else{
                label.setText("Pressionado botao 2");
            }
        }
    }
}
