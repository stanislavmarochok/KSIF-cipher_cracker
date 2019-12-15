/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TCipher;

import java.util.List;

/**
 *
 * @author kajza
 */
public class AllStrings {
    public static String[] allStrings(String str, int len){
        MathHelp m = new MathHelp();
        TranspositionCol tc = new TranspositionCol();
        int n=0, i=0;
        Permutations p = new Permutations();
        
        Integer[] key;
        int limit=m.factorial(len);
        String[] output = new String[limit];

        Integer[] keyperm =new Integer[len];
        for(i=0; i<len; i++){
            keyperm[i]=i+1;
        }
        
        List perms=p.allPerm(keyperm);
        
        
        
        
        for(i=0; i<limit; i++){
        key=(Integer[])perms.get(i);
   //     for(int j=0; j<5; j++){
   //         System.out.print(key[j]);
   //    }
        TranspositionKey tk = new TranspositionKey(key);
        output[i]=tc.decrypt(str, tk);
        }
        return output;
    }
        
        
        
}

