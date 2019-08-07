/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

import java.util.Arrays;

/**
 *
 * @author rife-
 */
public class Anagrama {
    
    public String anagrama (String palavra1, String palavra2){
        char[] a = palavra1.toCharArray();
        char[] b = palavra2.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        if(Arrays.equals(a, b)){
            return "É um anagrama";
        } else {
            return "Não é um anagrama";
        }
    }
    
}
