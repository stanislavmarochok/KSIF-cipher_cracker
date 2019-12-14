package TCipher;

import helpers.Bigram;
import helpers.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Decrypt {
    public String decrypt(String cipheredText, TranspositionKey key)
    {
        StringBuilder str = new StringBuilder();

        // TODO decrypt implementation here


        return str.toString();
    }

    public static String[] startDecryption (String ciphTxt, int minKeyLength, int maxKeyLength)
    {
        // Generate key here, make pernutations and use decrypt function
        // Then send the result of decrypt function to comparing function
        // Return only the best matches of decrypted text

        String[] decryptedText = new String[4];

        Map<String, Double> ciphRefs = Bigram.getBigram("aabacabcbcbcabcbabbcbbabbc");
        System.out.println(ciphRefs);

        Map<String, Double> refs = createMap();
        System.out.println(refs);

        Map<String, Double> absRefs = Bigram.compareRefs(ciphRefs, refs);
        System.out.println(absRefs);

        return  decryptedText;
    }

    static Map<String, Double> createMap()
    {
        double [][] ref = (double[][])Text.readFromFile("_bigrams.bin");
        HashMap<String, Double> map = new HashMap<>();

        for (int i = 0; i < ref.length; i++)
        {
            for (int j = 0; j < ref[0].length; j++)
            {
                StringBuilder gram = new StringBuilder();
                gram.append((char)('a' + i));
                gram.append((char)('a' + j));
                //System.out.print((char)('a' + i));
                //System.out.println((char)('a' + j) + ": " + ref[i][j]);

                map.put(gram.toString(), ref[i][j]);
            }
            //System.out.println();
        }
        return map;
    }

    public static String decryptWithKey(String cipheredText, String key)
    {
        String str = "huj tebe v rot, a ne perevod";

        return str;
    }
}
