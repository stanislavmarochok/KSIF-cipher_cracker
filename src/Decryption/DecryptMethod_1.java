package Decryption;

import TCipher.TranspositionCol;
import TCipher.TranspositionKey;
import Helpers.Helper;

public class DecryptMethod_1 {

    public static String[][] decryptWithoutKey(String ciphTxt, int minKeyLength, int maxKeyLength)
    {
        return BigramFitness.findDecrypt(ciphTxt, minKeyLength, maxKeyLength);
    }

    public static String encryptText(String plainText, String key)
    {
        Integer[] intKey = Helper.convertKey(key);

        return TranspositionCol.encrypt(plainText, new TranspositionKey(intKey));
    }

    public static String decryptWithKey(String cipheredText, String key)
    {
        Integer[] intKey = Helper.convertKey(key);

        return TranspositionCol.decrypt(cipheredText, new TranspositionKey(intKey));
    }
}
