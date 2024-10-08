package org.example.exceptions;

public class PasswordException extends Exception {
    public PasswordException(){
        super("Done");
    }
    public PasswordException(String message){
        super("Invalid password: " + message);
    }
}
