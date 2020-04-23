package javaStringProgram_Test;

import javaStringProgram.JavaStringPrograms;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaStringProgram_Test {
    JavaStringPrograms javaStringPrograms = new JavaStringPrograms();
    @Test(enabled = false)
    public void verifyPalindromeTest()
    {
        boolean result = javaStringPrograms.verifyPalindrome("amar");
        Assert.assertEquals(result, false);
    }
    @Test(enabled = false)
    public void removeGivenCharacterTest()
    {
        String string = javaStringPrograms.removeGivenCharacter("durga", 'r');
        Assert.assertEquals(string, "duga");
    }
    @Test(enabled = false)
    public void removeDuplicateCharacterTest()
    {
        String string = javaStringPrograms.removeDuplicateCharcter("durgaverma");
        System.out.printf(string);
        Assert.assertEquals(string, "durgavem");
    }
    @Test(enabled = false)
    public void removeDuplicateCharacterBySetTest()
    {
        String string=javaStringPrograms.removeDuplicatedCharacterBySet("durgaverma");
        System.out.printf(string);
        Assert.assertEquals(string, "durgavem");
    }
    @Test(enabled = false)
    public void printDuplicateTest(){
        javaStringPrograms.printDuplicate("amarsinghtanwar");
    }
    @Test(enabled = false)
    public void anagram(){
        Boolean angram = javaStringPrograms.angram("anar", "rama");
        System.out.println(angram);
    }
    @Test(enabled = false)
    public void printFirstNonDuplicate(){
        javaStringPrograms.firstNonDuplicateChar("amar");
    }
    @Test(enabled = false)
    public void containOnlyDigitTest()
    {
        Boolean result = javaStringPrograms.containsOnlyDigits("1232ad");
        System.out.println(result);
    }
    @Test(enabled = false)
    public void containOnlyAlpha()
    {
        Boolean result = javaStringPrograms.containsOnlyAlpha("amar");
        System.out.println(result);
    }
    @Test
    public void getCountOfVowelsAndConsonants()
    {
        javaStringPrograms.countNumberOfVowelsAndConsonants("amarsinghtanwar");
    }
    @Test
    public void countNumberOfWordsInGivenString()
    {
        javaStringPrograms.countNumberOfWordsInGivenString("This this is is done by Saket Saket");
    }
}
