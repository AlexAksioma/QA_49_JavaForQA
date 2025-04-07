package lesson07_string_builder;

public class StringBuilderMethods {
    public static void main(String[] args) {
        String str = "My string";
        String strNew = str.toUpperCase();
        System.out.println(str);
        System.out.println(strNew);

        StringBuilder stringBuilder1 = new StringBuilder();  //capacity = 16
        System.out.println(stringBuilder1.length());
        System.out.println(stringBuilder1.capacity());

        StringBuilder stringBuilder2 = new StringBuilder(100);
        System.out.println(stringBuilder2.length());
        System.out.println(stringBuilder2.capacity());

        StringBuilder stringBuilder3 = new StringBuilder(str);
        System.out.println(stringBuilder3.length());
        System.out.println(stringBuilder3.capacity());
        System.out.println("=============================================");
        StringBuilder stringBuilder4 = new StringBuilder("Hello");
        System.out.println(stringBuilder4);
        stringBuilder4.append(123);

        System.out.println(stringBuilder4);
        stringBuilder4.append(true).append(356.5f).append(" ").append("string").append('A');
        System.out.println(stringBuilder4);
        System.out.println("=============================================");
        stringBuilder4.insert(0, false);
        System.out.println(stringBuilder4);
        System.out.println("=============================================");
        stringBuilder4.delete(2, 5);
        System.out.println(stringBuilder4);
        stringBuilder4.delete(0, stringBuilder4.length());
        System.out.println("--> "+stringBuilder4);
        System.out.println("=============================================");
        stringBuilder4.append("To be or not to be");
        System.out.println("--> "+stringBuilder4);
        System.out.println("=============================================");
        stringBuilder4.replace(3, 5, "My str");
        System.out.println("--> "+stringBuilder4);
        System.out.println("=============================================");
        stringBuilder4.reverse();
        System.out.println("--> "+stringBuilder4);
        System.out.println("=============================================");
        stringBuilder4.reverse();
        System.out.println("--> "+stringBuilder4.append(" str"));
        System.out.println(stringBuilder4.indexOf("str"));
        System.out.println(stringBuilder4.lastIndexOf("str"));
        System.out.println(stringBuilder4.indexOf("Hello"));
        System.out.println("=============================================");
        System.out.println("--> "+stringBuilder4.append(" str"));
        System.out.println(stringBuilder4.indexOf("to", 7));
        System.out.println(stringBuilder4.lastIndexOf("str", 15));
        System.out.println("=======================return string======================");
        String str1 = stringBuilder4.toString();
        String subStr = stringBuilder4.substring(3, 7);
        System.out.println(str1);
        System.out.println(subStr);
        System.out.println(stringBuilder4.charAt(15));
        System.out.println(stringBuilder4.deleteCharAt(15));
    }
}
