package TCipher;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

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

}
