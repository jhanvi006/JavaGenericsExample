package com.bridgelabz;

/**
 * Purpose - To find maximum value using generics
 * @author -Jhanvi Kanakhara
 * @since - 2022-05-02
 */
public class FindMaxValueUsingGenerics {
    public static void findMaxValue(Integer num1, Integer num2, Integer num3){
        Integer max = num1;
        if (num2.compareTo(max)>0)
            max = num2;
        if (num3.compareTo(max)>0)
            max = num3;
        System.out.println("Maximum of "+num1+", "+num2+", "+num3+" is "+max);
    }
    public static void main(String[] args) {
        FindMaxValueUsingGenerics.findMaxValue(20, 12, 15);
    }
}
