/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TCipher;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kajza
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        String OT, ZT;
     /*   Integer[] tkp = new Integer[]{5, 3, 2, 1, 4, 6, 7};
        Integer[] test = new Integer[tkp.length];
        List perm = new ArrayList<Integer>();
        Permutations p = new Permutations();
       /* 
        test=(Integer[]) p.nthPerm(3, tkp);
        System.out.print(tkp);
        System.out.println(test);
        
        OT = "sifrovaniepomocoutranspozicie";
        TranspositionRow tc = new TranspositionRow();
        
       TranspositionKey tk = new TranspositionKey(tkp);
       TranspositionKey ttt = new TranspositionKey(tkp);
        
        /*
        ZT = tc.encrypt(OT, tk);
        System.out.println("ZT: " + ZT);
        OT = tc.decrypt(ZT, tk);
        System.out.println("OT: " + OT);

        */
        //tk = new TranspositionKey(tkp);
      /*  OT = "sifrovaniepomocoutranspozicie";
        ZT = tc.encrypt(OT, tk);
        System.out.println("ZT: " + ZT);
        OT = tc.decrypt(ZT, tk);
        System.out.println("OT: " + OT);
        
        
        
      
        OT = "sifrovaniepomocoutranspozicie";
        TranspositionCol tcc = new TranspositionCol();
      
        ZT=tcc.encrypt(OT, tk);
        System.out.println(ZT);
        
        OT=tcc.decrypt(ZT, tk);
        System.out.println(OT);*/
        Math m= new Math();
        int limit=0, min=4, max=5;
        for(i=min; i<=max; i++){
            limit+=m.factorial(i);
        }
      
        TranspositionCol tc = new TranspositionCol();
        OT= "sifrovaniepomocoutranspozicie";
        Integer[] tk=new Integer[]{1, 2, 3, 5, 4};
        TranspositionKey tkp= new TranspositionKey(tk);
        ZT = tc.encrypt(OT, tkp);
        String[] output = Cracker.crack(ZT);
        System.out.println("\n limit " +limit);
        for(i=0; i<limit; i++){
        System.out.println(i + "  " + output[i]);
        }
      
    }
    
}
