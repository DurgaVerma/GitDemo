package JavaNumberProgramTest;

import JavaNumberProgram.JavaNumberProgram;
import org.testng.annotations.Test;

public class JavaNumberProgramTest {
    JavaNumberProgram javaNumberProgram = new JavaNumberProgram();
    @Test(enabled = false)
    public void swapTwoNumberUsingThirdVariableTest()
    {
       javaNumberProgram.swapTwoNumbersUsingThirdVariable(10, 12);
    }
    @Test
    public void swapTwoNumbersWithoutUsingThirdVariableTest()
    {
        javaNumberProgram.swapTwoNumbersWithoutUsingThirdVariable(10, 20);
    }
}
