package login2;

import javax.swing.JOptionPane;

public class Login2 {

    public static void main(String[] args) 
    {
        String firstName;
        firstName = JOptionPane.showInputDialog (null,
        "Please enter your first name",
        "Register first name", //labels
           JOptionPane.QUESTION_MESSAGE);                 
        String lastName;
        lastName = JOptionPane.showInputDialog (null,
         "Please enter last name",
         "Register last name", //labels
           JOptionPane.QUESTION_MESSAGE);         
        String username;
        username = JOptionPane.showInputDialog (null,
         "Please enter username",
         "Register a username", //labels
           JOptionPane.QUESTION_MESSAGE);
            //username must be no more than 5 characters and must include an "_"                            
        String password;
        password = JOptionPane.showInputDialog (null,
         "Please enter a password",
         "Register a password",
           JOptionPane.QUESTION_MESSAGE);
         //password will undergo password checker
         
        
        if(password.length() >=8 
           && username.length() == 5 && username.matches(".*_") && password.matches(".*[0-9]") && password.matches(".*[',~,!,@,#,$,%,^,&,*]") && password.matches(".*[A-Z]")) 
        {
            JOptionPane.showMessageDialog(null,
                     "Account successfully created." + "\nWelcome, " + firstName +" " + lastName);    
        }else
        {
            JOptionPane.showMessageDialog(null,
                   "Account failed to be created." + "Please ensure that the:"
                           + "\nUSERNAME was correctly formatted - contains an underscore and is no more than 5 characters in length"
                           + "\nPASSWORD was correctly formatted - contains at least 8 characters, a capital letter, a number and a special character");
                          
        }
         
             
    }
    
}
