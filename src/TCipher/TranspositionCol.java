/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TCipher;

import java.util.Arrays;

/**
 *
 * @author kajza
 */
public class TranspositionCol {
        
    public String encrypt(String pt, Key k) {
        
        TranspositionKey mk = (TranspositionKey) k;

        int i;
        StringBuilder pt2 = new StringBuilder(pt);
        int missing =  mk.blockSize - (pt.length() % mk.blockSize);

        for (i = 0; i < missing; i++) {
            pt2.append('x');
        }
        System.out.println("Dlzka OT: "+pt.length());
 
        
        System.out.println("Dlzka kluca: "+mk.blockSize);
        System.out.println("Pocet doplnenych znakov:" + missing);
        String output= new String(pt2);
        System.out.println(output);

        char[][] c=new char[output.length()/mk.blockSize][mk.blockSize];
        int count=0;
        for(i=0; i<output.length()/mk.blockSize; i++){
            for(int j =0; j<mk.blockSize; j++){
                
                c[i][j]=output.charAt(count++);
                
            }
        }
        count=0;
        
        char[] out= new char[output.length()];
        int l;
        for(i=0; i<mk.blockSize; i++){
            for(int j=0; j<output.length()/mk.blockSize; j++){
                l=mk.encPerm[i];
                out[count]=c[j][l];
                
                count++;
            }
        }
     
        output=new String(out);
        ;
        return output;
    }
    
    
      public static String decrypt(String pt, Key k) {
    TranspositionKey mk = (TranspositionKey) k;
        
        int i;
        StringBuilder pt2 = new StringBuilder(pt);

        String output= new String(pt2);
     //   System.out.println(output);
        char[][] c=new char[mk.blockSize][output.length()/mk.blockSize];
        int count=0;
        for(i=0; i<mk.blockSize; i++){
            for(int j =0; j<output.length()/mk.blockSize; j++){
                
                c[i][j]=output.charAt(count++);
                
            }
        }
        
       // System.out.println(Arrays.deepToString(c));
        
        char[] out= new char[output.length()];
        
        count=0;
        int l;
        for(int j=0; j<output.length()/mk.blockSize; j++){
        for(i=0; i<mk.blockSize; i++){
            {
                l=mk.decPerm[i];
                
                out[count]=c[l][j];
                
                count++;
            }
        }
     
        output=new String(out);
        
        
    }return output;
}
      
}