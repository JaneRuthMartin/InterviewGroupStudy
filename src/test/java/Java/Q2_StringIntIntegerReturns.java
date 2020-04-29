package Java;

public class Q2_StringIntIntegerReturns {
    public static void main(String[] args) {

        //String -->  int or Integer
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
        //Integer to int - int to Integer arasında boxingler

        //------------------------------------------
        //int --> String

        int num=123;
        String a=Integer.toString(num);
        System.out.println(a);

        int nums=123456;
        String b=String.valueOf(nums);
        System.out.println(b);
    }
}
