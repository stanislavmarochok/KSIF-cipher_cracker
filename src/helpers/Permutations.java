package Helpers;


import Helpers.MathHelp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Permutations {

   public static Character[] inverse(Character[] perm) {
        Character[] inv = new Character[perm.length];
        for (int i = 0; i < perm.length; i++) {
            inv[perm[i] - 'a'] = (char) (i + 'a');
        }
        return inv;
    }
     /* Vstup: M = {0, .... m-1}*/
     public static Integer[] inverse(Integer[] perm) {
        Integer[] inv = new Integer[perm.length];
        for (int i = 0; i < perm.length; i++) {
            inv[perm[i]] = i;
        }
        return inv;
    }
     
     public static List allPerm(Object input[]) {
        List<Object[]> retVal = new ArrayList(MathHelp.factorial(input.length));
        allPerm(0, input, retVal);
        return retVal;
    }

    private static void allPerm(int fixed, Object input[], List output) {
        Object in[] = input.clone();
        if (fixed == input.length) {
            output.add(input);
        } else {
            for (int i = fixed; i < input.length; i++) {
                // swap
                Object tmp = in[i];
                in[i] = in[fixed];
                in[fixed] = tmp;
                // recursion
                allPerm(fixed + 1, in, output);
            }
        }
    }
    
    public static Object[] nthPerm(int n, Object []m) {
        
        List<Integer> koeficienty = new ArrayList<>();
        int i=1;
        koeficienty.add(n%i);
        n = n/i;
        // postupne delim a ukladam si zvysok ako koeficient
        while(n > 0){
           i++;
           koeficienty.add(n%i);
           n = n/i; 
        } 
        Collections.reverse(koeficienty); // otocim aby to islo od posledneho koeficientu
        System.out.println("koeficienty: "+koeficienty.toString());
        // teraz tu permutaciu z fakt. rozkladu a mnoziny m
        List prvky = new ArrayList<>(Arrays.asList(m.clone()));
        Collections.sort(prvky); // zoradime
        Object retVal[]= new Object[m.length];
        for(int c=0; c < koeficienty.size(); c++){
            // postupne
            int ai = koeficienty.get(c); // koeficient
            Object el = prvky.get(ai); // zadava index pri usp. m
            prvky.remove(el); // odstranim z nepouzitych
            retVal[c] = el; 
        }
        return retVal;
    }

}
