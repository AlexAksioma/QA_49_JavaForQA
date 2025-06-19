package lesson24_reg_exp.reg_exp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp1 {
    /*
    .  - любой  символ  a.b  --> asb  aAb ....
    \.  --> .
    ^  - начало строки  ^hello --> hello my friend
    $  - конец строки   $end -->  this is the end
    \d -  0,1 ..9
    \D - кроме 0,1 ..9 --> A,b ....
    a-z   a,b,c,d ... z abcd...z
    A-Z   A,B .....
    \s    пробелы
    \w    A-Za-z0-9_
    \W    все оcтальные символы \w   !,){
    [A-Z]
    + 1 или более символов
    a{3}   --> aaa
    a{3,}  --> aaa aaaaa aaaaaa
    a{2-4} --> aa aaa aaaa
    */
    public static void main(String[] args) {
        //System.out.println("\\.");
        String source1 = "1111a!b1111";
        String source2 = "a b1111a!b1111";
        String source3 = "1111a!b1111aZb";
        String regExp = "a.b";
        Pattern pattern = Pattern.compile(regExp);  // reg exp
        Matcher matcher = pattern.matcher(source1);
        System.out.println(matcher.find());   //equals part of str
        System.out.println(matcher.matches());//equals all str
        System.out.println("=======================");
        Pattern pattern1 = Pattern.compile("^a.b");
        Matcher matcher1 = pattern1.matcher(source2);
        System.out.println(matcher1.find());
        Pattern pattern2 = Pattern.compile("a.b$");
        Matcher matcher2 = pattern2.matcher(source3);
        System.out.println(matcher2.find());
        System.out.println("=============================");
        //  .com
        Pattern patternCom = Pattern.compile("\\.com$");
        Matcher matcherCom = patternCom.matcher("mail@mail.com");
        System.out.println(matcherCom.find());
        System.out.println("============================");
        System.out.println("isDigit -->" + isDigit("1"));
        System.out.println("isDigit -->" + isDigit("a"));
        System.out.println("isDigit -->" + isDigit("123"));
        System.out.println("============================");
        System.out.println("isPhoneNumber --> " + isPhoneNumber("+972-53-123-45-56"));
        System.out.println("isPhoneNumber --> " + isPhoneNumber("+172-53-123:45-56"));
        System.out.println("============================");
        System.out.println("isEmail --> " + isEmail("-my_email.123@gmail.com"));
    }

    //split("\\W+")   To   be, or no t ot be!   not A-z a-z 0-9 _

    static boolean isEmail(String str) {      //myemail@gmail.com
        String regExp = "^[\\w\\.-]+@\\w+\\.[A-Za-z]{3}$";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    static boolean isPhoneNumber(String str) {   //+972-53-123-45-56
        String regExp = "^\\+\\d{3}-\\d{2}-\\d{3}-\\d{2}-\\d{2}$";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    static boolean isDigit(String str) {
        //Pattern pattern = Pattern.compile("\\d+");
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }


}
