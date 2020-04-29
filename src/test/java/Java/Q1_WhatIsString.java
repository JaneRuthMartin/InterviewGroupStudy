package Java;

public class Q1_WhatIsString {
    public static void main(String[] args) {
        String name="mike";
        System.out.println(name);

        String name1=new String("mike");
        System.out.println(name1);

        char[]name2={'s','c','o','t','t'};
        String name3=new String(name2);
        System.out.println(name3);

        System.out.println(name==name1);

        String name4="java";
        //name4.concat("selenium");//stack memory
        name4=name4.concat("selenium");//heap memory
        System.out.println(name4);

        String number="10";
        int result=Integer.parseInt(number);//primitive==>none
        Integer result1=Integer.parseInt(number);//primitive==>auto-boxing
        System.out.println(result);
        System.out.println(result1);
        String numbers="25";

        int rslt=Integer.valueOf(numbers);//Wrapper==>unboxing
        Integer rslt1=Integer.valueOf(numbers);//Wrapper==>none
        System.out.println(rslt);
        System.out.println(rslt1);
        int num=123;
        String a=Integer.toString(num);
        System.out.println(a);
        int nums=123456;
        String b=String.valueOf(nums);
        System.out.println(b);
    }
}
