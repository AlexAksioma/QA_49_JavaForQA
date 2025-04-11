package lesson08_oop;

public class HomeWork07_solution {
    /*
    1. public static void printCapitals(String s)
	    s-->"Hello Course QA 49"
	    output:
	    "HCQ4"

	  2.public static void printLastLettersReverse(String s)
	    s-->"Hello Course QA 49"
	    output:
	    "9Aeo"

	  3.public static String insertFrom(String s, int index, String ins)
	        012345678910
	    s->"hello world"
	    ins -->"my "
	    index --> 6
	    result str --> "hello my world" to return

       4*.public static String toCamelCase(String input)
        "hello java world" --> "helloJavaWorld"
     */
    public static void main(String[] args) {
        printLastLettersReverse("Hello Course QA 49");
    }

    public static String toCamelCase(String input) {  //"Hello course QA 49"
        if (input == null || input.isBlank()) {
            System.out.println("Str is null or empty");
            return null;
        }
        String[] arrayStr = input.trim().split(" ");
        StringBuilder result = new StringBuilder(arrayStr[0].trim().toLowerCase());
        for (int i = 1; i < arrayStr.length; i++) {
            char firstChar = Character.toUpperCase(arrayStr[i].charAt(0)); //C Q
            result.append(firstChar).append(arrayStr[i].substring(1).toLowerCase());
        }
        //helloCourseQa
        return result.toString();
    }

    public static String insertFrom(String s, int index, String ins) {
        if (s == null || ins == null || s.isEmpty() || index < 0 || index > s.length() - 1) {
            System.out.println("Str is null or empty");
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.insert(index, ins);
        return stringBuilder.toString();
    }

    public static void printCapitals(String s) {
        if (s == null || s.isBlank()) {
            System.out.println("Str is null or empty");
            return;
        }
        String[] arrayStr = s.trim().split(" ");
        for (String str : arrayStr) {
            System.out.print(str.charAt(0));
        }
        System.out.println();
    }

    public static void printLastLettersReverse(String s) {
        if (s == null || s.isBlank()) {
            System.out.println("Str is null or empty");
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        String resultStr = stringBuilder.toString();
        printCapitals(resultStr);
    }


}
