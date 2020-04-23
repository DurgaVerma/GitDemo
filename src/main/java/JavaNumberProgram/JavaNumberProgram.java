package JavaNumberProgram;

public class JavaNumberProgram {
    //Swap To numbers using ThirdVariable
    public void swapTwoNumbersUsingThirdVariable(int a,int b)
    {
        int temp =0;
        temp = a;
        a=b;
        b=temp;
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }
    //Swap To numbers without using ThirdVariable
    public void swapTwoNumbersWithoutUsingThirdVariable(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a ="+a);
        System.out.println("b ="+b);
    }
    //To print prime no
    public void primeNumber(int a)
    {   boolean result = false;
        int i;
        if(a!=1)
        {
            for( i=2;i<a;i++)
            {
                if(a%i==0)
                {
                    break;
                }

            }
            if(a==i)
            {
                System.out.println(i);
                result=true;
            }
        }
    }
}
