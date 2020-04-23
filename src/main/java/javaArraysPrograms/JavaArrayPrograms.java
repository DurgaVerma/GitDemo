package javaArraysPrograms;

import java.util.HashSet;

public class JavaArrayPrograms {

    //To Get missing numbers from array
    public int togetMissingNumbers(int[]arr)
    {
        int expected_total;
        int total=0;
        int result;
        expected_total= (arr.length+1)*(arr.length+2)/2;
        for(int i =0;i<arr.length;i++)
        {
            total = total+arr[i];
        }
        result = expected_total-total;
        return result;

    }
    //To RemoveDuplicateFromArray
    public void removeDuplicateFromArray(int[]arr)
    {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for(int i =0;i<arr.length;i++)
        {
            hashSet.add(arr[i]);
        }
        for(int i:hashSet)
        {
            System.out.println(i);
        }




    }
    //To Check if array contain Number
    public void checkArrayContainNumber(int[]arr,int a)
    {
        int li=0;
        int hi= arr.length-1;
        int mi=(li+hi)/2;

        while (li<=hi)
        {
            if (arr[mi] == a) {
                System.out.println("Number is present at index : " + mi);
                break;

            } else if (arr[mi] < a) {
                li = mi + 1;
            } else {
                hi = mi - 1;
            }
            mi = (li + hi) / 2;
        }
        if(li>mi)
        {
            System.out.println("Number not found");
        }
    }
    //Program to find duplicateInArray
    public void toFindDuplicateInArray(int[]arr)
    {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for(int n:arr)
        {
            if(hashSet.add(n)==false)
            {
                System.out.println(n);
            }
        }

    }
    



}

