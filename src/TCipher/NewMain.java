/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TCipher;

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
        Integer[] tkp = new Integer[]{5, 3, 2, 1, 4, 6, 7};
        Integer[] test = new Integer[]{1, 3 ,2};
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
        OT = "sifrovaniepomocoutranspozicie";
        ZT = tc.encrypt(OT, tk);
        System.out.println("ZT: " + ZT);
        OT = tc.decrypt(ZT, tk);
        System.out.println("OT: " + OT);
        
        
        
      
        OT = "sifrovaniepomocoutranspozicie";
        TranspositionCol tcc = new TranspositionCol();
      
        ZT=tcc.encrypt(OT, tk);
        System.out.println(ZT);
        
        OT=tcc.decrypt(ZT, tk);
        System.out.println(OT);
        
        
      
    }
    
}
