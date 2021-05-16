
package practicingjframe;



import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;



public class PracticeField {
    
    
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
    
}
    
     public static void main(String[] args) {
         new PracticeField();
    }
    
}
