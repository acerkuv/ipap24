package org.example.exceptions;

import java.lang.Throwable.*;
public class Login{
    public String myLogin;
    public String myPassword;
    public String confirmPassword;



    public String inputD(String myLogin, String myPassword, String confirmPassword )  throws PasswordException{
        if(!myPassword.equals(confirmPassword)) {
              throw new PasswordException("Figa") ;
        }




        return "";
    }
}
