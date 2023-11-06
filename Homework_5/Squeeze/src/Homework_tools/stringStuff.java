package Homework_tools;

import java.util.HashSet;

public class stringStuff {
    public static String changeCase(String a)
    {
        // builder is nice for not creating a duplicate of string manually
        StringBuilder changed = new StringBuilder(a.length());

        for(char b : a.toCharArray())
        {
            if(Character.isUpperCase(b))
            {
                changed.append(Character.toLowerCase(b));
            }
            if(Character.isLowerCase(b))
            {
                changed.append(Character.toUpperCase(b));
            }
            //this was needed for non alphabetic character like  123!''
            if((!Character.isUpperCase(b) && !Character.isLowerCase(b)))
            {
                changed.append(b);
            }
        }

        return changed.toString();
    }


    // if needed to nonsensitive for state of letter case, upper function can be used .
    public static String squeeze(String a , String b)
    {
        StringBuilder aMINUSb = new StringBuilder();

        //uniqe set of b to subtract from a (note to myself :This set also not get any duplicate characters and order of them because of hashset operates . for order Linked modification needed)
        HashSet<Character> bCharacters = new HashSet<>();
        for(char B : b.toCharArray())
            bCharacters.add(B);
    

        
        for(char A : a.toCharArray())
            if(!bCharacters.contains(A))
                aMINUSb.append(A);
        

         //note for myself this is a class so dont forget! Turn it into string to return...       
        return aMINUSb.toString();
    }
}
