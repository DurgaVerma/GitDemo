package javaArraysProgramTest;

import javaArraysPrograms.JavaArrayPrograms;
import org.testng.annotations.Test;

public class JavaArraysProgramTest {
    JavaArrayPrograms javaArrayPrograms = new JavaArrayPrograms();
    @Test(enabled = false)
    public void togetMissingNumber()
    {
        int[]a={1,2,4,5,6};
      int result =  javaArrayPrograms.togetMissingNumbers(a);
        System.out.println(result);
    }
    @Test(enabled = false)
   public void removerDuplicateFromArrayTest()
    {
        int[]a={1,3,9,7,6,9,7,1};
        javaArrayPrograms.removeDuplicateFromArray(a);
    }
    @Test(enabled = false)
    public void checkArrayContainNumberTest()
    {
        int[]a={1,2,3,4,8,9,11,56,78,87};
        javaArrayPrograms.checkArrayContainNumber(a, 4);
    }
    @Test(enabled = false)
    public void tofindDuplicateInArray()
    {
        int[]a={1,5,8,9,4,5,6};
        javaArrayPrograms.toFindDuplicateInArray(a);
    }
}
