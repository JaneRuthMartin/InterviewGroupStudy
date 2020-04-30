package Java;

public class Q3_StringReverse {

    public static void main(String[] args) {
        // StringBuilder way
        String a="Java is fun";
        StringBuilder abc=new StringBuilder(a);
        //DAIR=>delete,append,insert,reverse
        System.out.println(abc.reverse());//reverse
        System.out.println(abc.append(" selenium"));//add
        System.out.println(abc.delete(0,2));//substring
        System.out.println(abc.insert(0,"Pyhton"));

        // 2. way
        String name="Selenium is easy for me";
        String reverse="";
        for(int i=name.length()-1;i>=0;i--){
            //reverse+=name.charAt(i);
            reverse+=name.substring(i,i+1);
        }
        System.out.println(reverse);

        //3. way
        String word= "Today is cold";
        String reverse1="";
        String[]arr= word.split(" ");
        for (int i = arr.length-1; i >=0 ; i--) {
            reverse1+=arr[i]+" ";
        }
        System.out.println(reverse1);

    }

}
