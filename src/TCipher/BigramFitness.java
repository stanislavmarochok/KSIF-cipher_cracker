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
public class BigramFitness {
    public void Fitness(String str){
        double[][] ref = (double[][]) Text.readFromFile("_bigrams.bin");
        char[] c = new char[str.length()];
        c=str.toCharArray();
        
        
        
    }
}
