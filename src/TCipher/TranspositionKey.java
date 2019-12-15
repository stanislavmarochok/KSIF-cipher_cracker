/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TCipher;

import Helpers.Permutations;

/**
 *
 * @author kajza
 */
public class TranspositionKey implements Key{

    int blockSize;
    Integer[] encPerm;
    Integer[] decPerm;

    public TranspositionKey(Integer[] encPerm) {
        
        
        
        this.blockSize = encPerm.length;
        
        this.encPerm=new Integer[this.blockSize];
        for(int i=0; i<encPerm.length; i++){
            this.encPerm[i]=encPerm[i]-1;
        }
        
        this.decPerm = Permutations.inverse(this.encPerm);
    }

    public int getBlockSize() {
        return blockSize;
    }

    public Integer[] getDecPerm() {
        return decPerm;
    }

    public Integer[] getEncPerm() {
        return encPerm;
    }
}
    

