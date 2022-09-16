package pkg12.pkg6;

import java.awt.FlowLayout;//Especifica como os componentes são organizados
import javax.swing.JFrame;//Fornece recursos básicos de janela
import javax.swing.JLabel;//Exibe texto e imagens
import javax.swing.SwingConstants;//Constantes usadas no swing
import javax.swing.Icon;//Interface utilizada para manipulação de imagens
import javax.swing.ImageIcon;//Carrega as imagens

public class LabelFrame extends JFrame{
    private final JLabel label1;//JLabel apenas com texto
    private final JLabel label2;//JLabel construido com texto e icone
    private final JLabel label3;//JLabel com texto e icone adicionados
    //Construtor LabelFrame adiciona JLabels a JFrame
    public LabelFrame(){
        super("Testando JLabel");
        setLayout(new FlowLayout());//Configura o layout de frame
        //Construtor JLabel com um argumento de string
        label1 = new JLabel("Label com texto");
        label1.setToolTipText("Isso é o label1");
        add(label1);//Adiciona o label1 ao JFrame
        
        //Construtor JLabel com string, Icon e argumentos de alinhamento
        Icon bug = new ImageIcon(getClass().getResource("bug1.png"));
        label2 = new JLabel("Label com texto e icone",bug,SwingConstants.LEFT);
        label2.setToolTipText("Esse é o label2");
        add(label2);
        
        label3 = new JLabel();//Construtor JLabel sem argumentos
        label3.setText("Label com icone e texto no botão");
        label3.setIcon(bug);// Adiciona o ícone ao JLabel
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("Esse é o label3");
        add(label3);//Adiciona o label3 ao JFrame
    }



}
