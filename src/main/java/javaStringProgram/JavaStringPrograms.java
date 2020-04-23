package javaStringProgram;

import java.util.*;

public class JavaStringPrograms {
    //Palindrome mean SAS REVERES MUST ALSO BE SAS
    public boolean verifyPalindrome(String str)
    {   Boolean result = false;
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        if (stringBuilder.toString().equals(str))
        {
            result= true;
        }
        return result;
    }
    //Remove Given Character from String
    public String removeGivenCharacter(String str , char a)
    {
       String string= str.replaceAll(Character.toString(a),"");
       return string;

    }
    //Remove Duplicate Character From String Without using dataStructure
    public String removeDuplicateCharcter(String str)
    {
        StringBuilder string = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
           String character = str.substring(i, i+1);
           if(string.indexOf(character)<0) //* need to ask
           {
               string.append(character);
           }


        }
        return string.toString();
    }
    //Remove duplicate character from String Using Data Structure
    public String removeDuplicatedCharacterBySet(String str)
    {
        Set <Character> chars = new HashSet<Character>();
        StringBuilder string = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(chars.add(ch))
            {
                string.append(ch);
            }
        }
        return string.toString();
    }
    //Print duplicate character from string
    public void printDuplicate(String str){
        HashSet<Character> characters = new HashSet<Character>();

        char[] chars = str.toCharArray();
        HashMap<Character,Integer> hashMap= new HashMap<Character, Integer>();

        for (char c:chars) {
            if(!characters.add(c)){
                if(hashMap.containsKey(c)){
                    hashMap.put(c,hashMap.get(c)+1);
                }
                else{
                    hashMap.put(c,1);
                }
            }

        }

        for (Map.Entry<Character, Integer> ent:hashMap.entrySet()) {
            System.out.println(ent.getKey()+"            "+ent.getValue());
        }

    }

//Anagram string is another string that contains same characters, only the order of characters can be different.
    public Boolean angram(String s1, String s2)
    {
    char[] chars = s1.toCharArray();
    char[] chars1 = s2.toCharArray();
    Boolean result=false;

    Arrays.sort(chars);
    Arrays.sort(chars1);

    if(chars.length==chars1.length){
        for (int i = 0; i < chars.length; i++)
        {
            if(chars[i]!=chars1[i]){
                break;
            }
            else {
                result=true;
            }
        }
    }


    return result;
}
    public void firstNonDuplicateChar(String str){
        char[] chars = str.toCharArray();

        HashMap<Character,Integer> map= new LinkedHashMap<Character, Integer>();

        for (char c:chars) {
            map.put(c,map.containsKey(c) ? map.get(c)+1 : 1);
        }

        for (Map.Entry<Character,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
    public Boolean containsOnlyDigits(String str)
    {
        String regex = "\\d+";


        boolean matches = str.matches(regex);

        return matches;
    }
    public Boolean containsOnlyAlpha(String str)
    {
        String regex = "\\D+";

        boolean matches = str.matches(regex);

        return matches;
    }
    public Boolean containsAlphaNumeric(String str){
        String regex = "\\w+";

        boolean matches = str.matches(regex);

        return matches;
    }
    public void countNumberOfVowelsAndConsonants(String str){
        HashMap<String,Integer> hashMap=new HashMap<String, Integer>();
        hashMap.put("vowel",0);
        hashMap.put("consonants",0);


        char vowels[]={'a','e','i','o','u'};

        char[] chars = str.toCharArray();
        for (char c:chars) {
            for (char c1:vowels) {
                if(c==c1){
                    hashMap.put("vowel",hashMap.get("vowel")+1);
                    break;
                }
                else{
                    hashMap.put("consonants",hashMap.get("consonants")+1);
                    break;
                }

            }
        }

        for (Map.Entry<String,Integer> ent: hashMap.entrySet()) {
            System.out.println(ent.getKey()+"            "+ent.getValue());
        }

    }
    public void countNumberOfWordsInGivenString(String str){
        String[] str2 = str.split(" ");
        HashMap<String,Integer> hashMap= new LinkedHashMap<String, Integer>();

        for (String s:str2) {
            hashMap.put(s,hashMap.containsKey(s) ? hashMap.get(s)+1 : 1);
        }

        System.out.println(hashMap);

    }
}
