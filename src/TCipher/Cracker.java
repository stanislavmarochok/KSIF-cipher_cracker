/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TCipher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author kajza
 */
public class Cracker {
    public static String[] crack(String str, int min, int max){
        int count=0;
        MathHelp m = new MathHelp();
        int limit=0, i;
        
        for(i=min; i<=max; i++){
            limit+=m.factorial(i);    //pocet moznych klucov a stringov
        }
        
        
        String[] output=new String[limit], returnoutput= new String[limit];
        
        for(i=min; i<=max; i++){
        output=AllStrings.allStrings(str, i);
        for(int j=0; j<output.length; j++){
            returnoutput[count++]=output[j];
        }
        
        
        
        
        }
        
     return returnoutput;   
    }
}
