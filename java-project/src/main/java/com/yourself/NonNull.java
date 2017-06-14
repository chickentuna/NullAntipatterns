// { autofold
package com.yourself;

public class NonNull {
    // }

    
    
    /**
     * This method requires a non null String
     * A NullPointerException will be thrown if it not the case. However, take a look at the line where the NPE would occur.
     */    
    public static boolean containsVowels(String word) {
        String[] vowels = { "a", "e", "i", "o", "u" };
              
        for (int i = 0; i < 5; ++i) {
            // If the following line generates a crash during runtime, it is not clear wether `word` or `vowel` is null. 
            if (word.contains(vowels[i])) {
                return true;
            }
        }
        return false;
    }

    //{ autofold
}
//}