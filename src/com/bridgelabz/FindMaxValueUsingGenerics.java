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
    public static void findMaxValue(Float num1, Float num2, Float num3){
        Float max = num1;
        if (num2.compareTo(max)>0)
            max = num2;
        if (num3.compareTo(max)>0)
            max = num3;
        System.out.println("Maximum of "+num1+", "+num2+", "+num3+" is "+max);
    }
    public static void findMaxValue(String str1, String str2, String str3){
        String max = str1;
        if (str2.compareTo(max)>0)
            max = str2;
        if (str3.compareTo(max)>0)
            max = str3;
        System.out.println("Maximum of "+str1+", "+str2+", "+str3+" is "+max);
    }
    public static void main(String[] args) {
        FindMaxValueUsingGenerics.findMaxValue(20, 12, 15);
        FindMaxValueUsingGenerics.findMaxValue(20.3f, 22.1f, 15.9f);
        FindMaxValueUsingGenerics.findMaxValue("Apple", "Peach", "Banana");
    }
}
