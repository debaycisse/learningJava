/* This program is used to explained lightly
 * on the swing class with its methods.
 */

package practicingjframe;

import java.awt.*;
import javax.swing.JFrame;

public class PlayFieldForJframe {

    public static void main(String[] args) {
        JFrame frameWindow = new JFrame();
        frameWindow.setTitle("Tesing JFrame");
//        frameWindow.setBackground(Color.yellow);    // first way to set color
        frameWindow.setVisible(true);
        frameWindow.setSize(300,200);    // setting the width & height of the window or frame
        frameWindow.setResizable(false);    // this allows user to either resize window or not, based on its parameter
        frameWindow.setLocation(100, 200);    // setting the x-axis and y-axis of the window or frame
        Container containerWindowFromFrame = frameWindow.getContentPane();  // This is a container object
        containerWindowFromFrame.setBackground(Color.BLUE);
//        frameWindow.setBounds(100,100,250,300); // setting both x-axis, y-axis & width, height at a go
        frameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
