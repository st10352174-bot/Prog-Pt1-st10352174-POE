/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poep1;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author kuveshanpillay
 */
class Method 
{
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kuveshanpillay
 */    
    String userName;
    String passWord;
    String name;
    String surname;
    String inputUsername = "";
    String inputPassword = "";
    

public boolean checkUserName(String userName){
    if( userName.length() <= 5 && userName.contains("_")){
        return true;
    }else {
        return false;
    }
  }
public boolean CheckPasswordcomplexity(String passWord){
    String regex = "^(?=.[A-Z])(?=.\\d)(?=.[@$!%?&])[A-Za-z\\d@$!%*?&]+$";
    if (passWord.length() >= 8 && passWord.matches(regex)){
         return true;
    }else {
            return false;
    }
  }
public void RegisterUser(){
    while(true) {
        userName = JOptionPane.showInputDialog(null, "Enter your username: ");
        if(!checkUserName(userName)){
            JOptionPane.showMessageDialog(null , "Username is not correctly formatted.");
        }else {
            JOptionPane.showInternalMessageDialog(null, "Username captured successfully");
            break;
        }
    }
while(true) {
    passWord = JOptionPane.showInputDialog(null, "Enter your password: ");
    if (!CheckPasswordcomplexity(passWord)){
        JOptionPane.showMessageDialog(null, "You have been successfully registred");
       break;
  } else {
      JOptionPane.showMessageDialog(null, "Password is not correctly formatted.");
    }
  }
}
public void userdetails(String userName){
    name = JOptionPane.showInputDialog(null, " Enter your name: ");
     surname = JOptionPane.showInputDialog(null, " Enter your surname: ");
 }

public boolean LoginUser(String inputUserName, String inputPassword){
if(userName.equals(inputUserName) && passWord.equals(inputPassword)){
    return true;
  }  else {
    return false;  
 } 
}

 public String returnLoginStatus(){
 
    
     JPanel loginPanel = new JPanel(new GridLayout(0,1));
     loginPanel.add(new JLabel("username:"));
     JTextField usernameField = new JTextField();
     loginPanel.add(usernameField);
     loginPanel.add(new JLabel("password:"));
     JPasswordField passwordField = new JPasswordField();
     loginPanel.add(passwordField);
     
     while(true) {
         int loginResult = JOptionPane.showConfirmDialog(null, loginPanel , "Login",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
         if (loginResult == JOptionPane.OK_OPTION) {
         inputUsername = usernameField.getText();
         inputPassword = new String(passwordField.getPassword());
         if(LoginUser(inputUsername, inputPassword)) {
             JOptionPane.showMessageDialog(null, "Login successful");
             JOptionPane.showMessageDialog(null, "Welcome " + name + " " + surname + " it is great to see you again");
          break;
         }else {
             JOptionPane.showMessageDialog(null, " Login failed, try again");
         }
      } else {
     }
  }
  return null;   
 }
}