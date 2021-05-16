/* This program is used to explained several
 * Components of swing, which is a class that
 * is fully packed with components to create
 * a GUI program.
 */

package practicingjframe;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LearningSwingClassGUI {
    public static void main(String[] args){
        // Creating instance of the JFrame or windows
        JFrame frame = new JFrame();
        
        // Setting the width & height of the frame or windows
        frame.setSize(400, 250);
        // Setting the close behaviour when the close button is clicked.
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /* Creating panel. This is the same as a div tag in HTML
         * We can create several panels and add them to a specific
         * positions in a JFrame. Inside each panels, We can add
         * text fields, buttons, and other components as well.
         */
        JPanel panel = new JPanel();
        // Adding the above panel to the created Frame or Windows
        frame.add(panel);
        
        /* Calling a user-defined method - for adding components
         * such as textfield, button, label, & etc to the panel
         */
        placeComponents(panel);
    }
    
    
    public static void placeComponents(JPanel panel){
        
        /* We will discuss about layouts in the later
         * sections of this tutorial. For now, We are
         * setting the layout to null, as shown below
         */
        panel.setLayout(null);
        
        
        // Creating JLabel 
        JLabel userLabel = new JLabel("UserName");
        
        
        /* This method specifies the location and size
         * of component. setBounds(x, y, width, height).
         * Here (x, y) are coordinates from the top-left
         * corner and the remaining two arguments are the
         * width and height of the component
         */
        userLabel.setBounds(10, 20, 80, 25);
        
        
        // Adding a JLabel component to the panel
        panel.add(userLabel);
        
        
        /* Creating text-field where user is going 
         * to type in his or her username
         */
        JTextField userNameText = new JTextField(20);   // Can't be more than 20 character long
        /* Since userLabel is taking 10 away from left-hand side of the screen & 80 width long,
         * then, it means 10 + 80 = 90 of horizontal space has been taken.
         * To avoid overlapping of the userLabel, 100 amount of space from the left-side of the 
         * screen, is given to the userNameText below.
         */
        userNameText.setBounds(100, 20, 165, 25);
        // Let's add the text-field components also to the panel
        panel.add(userNameText);
        
        
        // Setting and Adding password label and password text field, using the same process as above
        JLabel userPasswordLabel = new JLabel("Password");
        userPasswordLabel.setBounds(10, 50, 80, 25);    // Setting the position & size
        panel.add(userPasswordLabel);   // Adding the passwordLabel to the panel
        
        /* Let's do the same for the password text.
         * This is similar to text field but JPasswordField hides the character or texts as user
         * enters the texts and it displays dots or asterix instead to protect the password
         * like we normally see on login screens.
         */
        JPasswordField userPasswordText = new JPasswordField(20); // Not more than 20 characters long
        userPasswordText.setBounds(100, 50, 165, 25);   // Setting the position & size.
        panel.add(userPasswordText);    // Adding the passwordText to the panel
        
        
        // Creating login button
        JButton loginButton = new JButton("Sign In");   // Text shows on the button
        loginButton.setBounds(10, 80, 80, 25);  // Setting the position & size
        panel.add(loginButton);        
        
    }   // End of placeComponents
    
}
