
package practicingjframe;



import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PracticeField extends JFrame implements ActionListener{
    
//    JPanel textFieldPanel, buttonFieldPanel;
    JTextField text1, text2, text3;
    JButton addition, substraction, multiplication, division;
    
    
    PracticeField(){
        
     /*
     // BorderLayout
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setSize(300, 350);
    frame.setLayout(new BorderLayout());
    
    JButton jb1 = new JButton("NORTH");
    jb1.setSize(25,50);
    JButton jb2 = new JButton("SOUTH");
    JButton jb3 = new JButton("EAST");
    JButton jb4 = new JButton("WEST");
    JButton jb5 = new JButton("CENTER");
    
    frame.add(jb1, BorderLayout.NORTH);
    frame.add(jb2, BorderLayout.SOUTH);
    frame.add(jb3, BorderLayout.EAST);
    frame.add(jb4, BorderLayout.WEST);
    frame.add(jb5, BorderLayout.CENTER);
    */
     
     
     
     
     /*
     // GridLayout
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setSize(300, 350);
    frame.setLayout(new GridLayout(2, 4));
    
    JButton r1c1 = new JButton("FIRST ROW - FIRST COLUMN");
    JButton r1c2 = new JButton("FIRST ROW - SECOND COLUMN");
    JButton r1c3 = new JButton("FIRST ROW - THIRD COLUMN");
    JButton r1c4 = new JButton("FIRST ROW - FOURTH COLUMN");
    JButton r2c1 = new JButton("SECOND ROW - FIRST COLUMN");
    JButton r2c2 = new JButton("SECOND ROW - SECOND COLUMN");
    JButton r2c3 = new JButton("SECOND ROW - THIRD COLUMN");
    JButton r2c4 = new JButton("SECOND ROW - FOURTH COLUMN");
    
    
    frame.add(r1c1);
    frame.add(r1c2);
    frame.add(r1c3);
    frame.add(r1c4);
    frame.add(r2c1);
    frame.add(r2c2);
    frame.add(r2c3);
    frame.add(r2c4);

    */
    
    
    
     
    /*
    // FlowLayout
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setSize(300, 350);
    frame.setLayout(new FlowLayout(FlowLayout.RIGHT));
    
    JButton jb1 = new JButton("1");
    JButton jb2 = new JButton("2");
    JButton jb3 = new JButton("3");
    JButton jb4 = new JButton("4");
    JButton jb5 = new JButton("5");
    
    frame.add(jb1);
    frame.add(jb2);
    frame.add(jb3);
    frame.add(jb4);
    frame.add(jb5);
    */
    
    
    
    
    // BoxLayout
    // here is the link -> https://www.javatpoint.com/BoxLayout
    
    
    // CardLayout    :  https://www.javatpoint.com/CardLayout
    
        
        
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
    
     public static void main(String[] args) {
         new PracticeField();
    }

    
    
}
