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
    public double Fitness(String str){
        double[][] ref = (double[][]) Text.readFromFile("_bigrams.bin");
        int i, j;
        char[] c = new char[str.length()];
        c=str.toCharArray();
      //  System.out.println(str);
        double[][] bgram=new double[26][26];
        double[][] dummy=new double[26][26];
        double fitness=0.0;
        for(i=0; i<c.length; i++){
             c[i]= (char)(c[i]-97);
            
            if(c[i]==65439){   //Niekde sa mi tam dostava null
            c[i]='x'-'a';     
           
            }
        }
        
        for(i=0; i<26; i++){
            for(j=0; j<26; j++){
                bgram[i][j]=0;
            }
        }
        
        for(i=0; i<str.length()-1; i++){
       //     System.out.println(i + " " +c[i] + " " + c[i+1]);
       
       bgram[c[i]][c[i+1]]=bgram[c[i]][c[i+1]]+1;
       }
        
        for(i=0; i<26; i++){
            for(j=0; j<26; j++){
                bgram[i][j]=bgram[i][j]/str.length();
                dummy[i][j]=Math.abs(ref[i][j]-bgram[i][j]); //Rozdiel hodnot
                fitness+=dummy[i][j];
            }
        }
        
        
        
        return fitness;
    }
}
