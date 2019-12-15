/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decryption;

import Helpers.AllStrings;
import Helpers.MathHelp;

/**
 *
 * @author kajza
 */
public class Cracker {
    public static String[][] crack(String str, int min, int max){

        int count=0;
        int limit=0;
        
        for(int i = min; i <= max; i++){
            limit += MathHelp.factorial(i);    //pocet moznych klucov a stringov
        }

        String[][] output = new String[limit][2], returnoutput = new String[limit][2];
        
        for(int i = min; i <= max; i++){
            output = AllStrings.allStrings(str, i);

            for(int j = 0; j < output.length; j++){
                returnoutput[count++] = output[j];
            }
        }
        
     return returnoutput;   
    }
}
