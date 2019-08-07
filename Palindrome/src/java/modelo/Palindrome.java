/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author rife-
 */
public class Palindrome {
    
    public static String palindrome(String parametro){
        String palavra = parametro;
        String invertida = new StringBuffer(palavra).reverse().toString(); 
        String palindrome;
        if(palavra.equals(invertida)){
          palindrome = "É palindrome";
        }else{
          palindrome = "Não é palindrome";
        }
        return palindrome;
    } 
}
