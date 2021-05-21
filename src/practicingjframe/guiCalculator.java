
package practicingjframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class guiCalculator extends JFrame implements ActionListener {

    JTextField text1, text2, text3;
    JButton addition, substraction, multiplication, division;
    
    guiCalculator(){
    setSize(500, 450);  setVisible(true);   setDefaultCloseOperation(EXIT_ON_CLOSE); setLayout(null);
        
        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();
        text3.setEditable(false);
        text1.setBounds(20, 20, 250, 30);
        text2.setBounds(20, 60, 250, 30);
        text3.setBounds(20, 110, 250, 30);
        
        
        addition = new JButton("+");
        substraction = new JButton("-");
        multiplication = new JButton("x");
        division = new JButton("/");
        addition.setBounds(20, 200, 100, 30);
        substraction.setBounds(170, 200, 100, 30);
        multiplication.setBounds(20, 240, 100, 30);
        division.setBounds(170, 240, 100, 30);
        addition.addActionListener(this);
        substraction.addActionListener(this);
        multiplication.addActionListener(this);
        division.addActionListener(this);
        
        /*
        textFieldPanel = new JPanel();
        buttonFieldPanel = new JPanel();
        textFieldPanel.setBounds(0, 20, 495, 225);
        buttonFieldPanel.setBounds(0, 250, 495, 190);
        */
        
        add(text1);  add(text2);  add(text3);
        add(addition); add(substraction); add(multiplication); add(division);
        
        
  }
    
    public void actionPerformed(ActionEvent e){
        String firstString = text1.getText();
        String secondString = text2.getText();
        
        int firstOperand = Integer.parseInt(firstString);
        int secondOperand = Integer.parseInt(secondString);
        
        int operationRseult = 0;
        
        if(e.getSource() == addition){
            operationRseult = firstOperand + secondOperand;
        }
        else if(e.getSource() == substraction){
            operationRseult = firstOperand - secondOperand;
        }
        else if(e.getSource() == multiplication){
            operationRseult = firstOperand * secondOperand;
        }
        else if(e.getSource() == division){
            operationRseult = firstOperand / secondOperand;
        }
        
        text3.setText(String.valueOf(operationRseult));
    }
    
    public static void main(String[] args){
        new guiCalculator();
    }
}
