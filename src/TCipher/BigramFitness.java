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

    public static String[][] findDecrypt(String txt, int min, int max) {

        int limit=4;

        String[][] output = Cracker.crack(txt, min, max);
        String[][] finArr = new String[limit][2];
        Double fit;

        double [][] arr = new double[output.length][2];

        for (int i = 0; i < output.length; i++)
        {
            arr[i][0] = fitness(output[i][0]);
            arr[i][1] = i;
        }

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j][0] < arr[i][0])
                {
                    double temp_fit = arr[i][0];
                    double temp_place = arr[i][1];

                    arr[i][0] = arr[j][0];
                    arr[i][1] = arr[j][1];

                    arr[j][0] = temp_fit;
                    arr[j][1] = temp_place;
                }
            }
        }

        for (int i = 0; i < limit; i++) {
            finArr[i][0] = output[(int) arr[i][1]][0];
            finArr[i][1] = output[(int) arr[i][1]][1];

            System.out.println(arr[i][0]);
        }

        return finArr;
    }

    private static double fitness(String str){

        double[][] bgram = new double[26][26], dummy = new double[26][26], ref = (double[][]) Text.readFromFile("_bigrams.bin");
        double fitness = 0.0;

        char[] c = str.toCharArray();

        for(int i = 0; i < c.length; i++){
            c[i] = (char)(c[i] - 'a');
            
            if(c[i] == 65439){   //Niekde sa mi tam dostava null
                c[i] = 'x' - 'a';
            }
        }
        
        for(int i = 0; i < 26; i++){
            for(int j = 0; j < 26; j++){
                bgram[i][j] = 0;
            }
        }
        
        for(int i = 0; i < str.length() - 1; i++){
            bgram[c[i]][c[i + 1]] = bgram[c[i]][c[i + 1]] + 1;
        }
        
        for(int i = 0; i < 26; i++){
            for(int j = 0; j < 26; j++){
                bgram[i][j] = bgram[i][j] / str.length();
                dummy[i][j] = Math.abs(ref[i][j] - bgram[i][j]); //Rozdiel hodnot
                fitness += dummy[i][j];
            }
        }

        return fitness;
    }
}
