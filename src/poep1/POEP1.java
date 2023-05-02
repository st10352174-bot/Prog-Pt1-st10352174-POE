/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poep1;

/**
 *
 * @author kuveshanpillay
 */
public class POEP1 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) 
    {
        String userName = "";
        String passWord = "";
        
        Method object = new Method();
        
        object.checkUserName( userName);
        
        object.CheckPasswordcomplexity(passWord);
        
        object.RegisterUser();
        
        object.userdetails(userName);
        
        object.LoginUser(userName, passWord);
        
        object.returnLoginStatus();
    }
}