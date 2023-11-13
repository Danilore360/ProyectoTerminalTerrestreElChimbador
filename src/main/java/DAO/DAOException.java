/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

/**
 *
 * @author Danilore
 */
public class DAOException extends Exception {
    
    public DAOException(String message){
        super(message);
    }
    
    public DAOException(String message, Throwable cause){
        super(message, cause);
    }
    public DAOException(Throwable cause){
        super(cause);
    }
    
}
