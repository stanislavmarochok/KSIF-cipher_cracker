/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TCipher;

import helpers.Bigram;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
    
        MathHelp m= new MathHelp();
        int limit=0, min=5, max=8;
        for(i=min; i<=max; i++){
            limit+=m.factorial(i);
        }
      
        TranspositionCol tc = new TranspositionCol();
       // OT= "sifrovaniepomocoutranspozicie";
        OT="ijustreturnedfromthegreatestsummervacationitwassofantasticineverwantedittoendispenteightdaysinparisfrancemybestfriendshenryandstevewentwith";
        OT="ijustreturnedfromthegreatestsummervacationitwassofantasticineverwantedittoendispenteightdaysinparisfrancemybestfriendshenryandstevewentwithmewehadabeautifulhotelroominthelatinquarteranditwasntevenexpensivewehadabalconywithawonderfulview";
      /*
        BigramFitness bigram = new BigramFitness();
        
        Integer[] tk=new Integer[]{4, 1, 3, 6, 5, 2, 7};
        TranspositionKey tkp= new TranspositionKey(tk);
        ZT = tc.encrypt(OT, tkp);
        String[][] output = Cracker.crack(ZT, min, max);
        Double fit = bigram.Fitness(OT);
        
     //   System.out.println(fit);
        double minimV=1000.0;
        double minimF=0.0;
        for(i=0; i<limit; i++){
        fit = bigram.Fitness(output[i]);
        
        if(fit<minimV){
            minimV=fit;
            minimF=(double)i;
        }
        
   //     System.out.println(fit);
        }
        System.out.println("\n limit " +limit);
        System.out.println("min " +minimF + " value " +minimV);
        
      //  for(i=0; i<limit; i++){
        System.out.println(i + "  " + output[(int)minimF]);
      //  }
      */
      
    }
    
}
