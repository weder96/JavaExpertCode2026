package br.com.wsousa.string;

public class ExampleWorkString {

    public void testCharAt() {
        // public char charAt(int index)
        String myStr = "Hello";
        char result = myStr.charAt(0);
        System.out.println(result);
    }

    public void testCodePointAt() {
        // public int codePointAt(int index)
        String myStr = "Hello";
        int result = myStr.codePointAt(0);
        System.out.println(result);
    }

    public void testCodePointBefore() {
        String myStr = "Hello";
        int result = myStr.codePointBefore(1);
        System.out.println(result);
    }

    public void testCodePointCount() {
        String myStr = "Hello";
        int result = myStr.codePointCount(0, 5);
        System.out.println("testCodePointCount " +result);
    }

    public void testCompareTo() {
        String myStr1 = "Hello";
        String myStr2 = "Hello";
        System.out.println(myStr1.compareTo(myStr2)); // Returns 0 because they are equal
    }

    public void testCompareToIgnoreCase() {
        String myStr1 = "HELLO";
        String myStr2 = "hello";
        System.out.println(myStr1.compareToIgnoreCase(myStr2));
    }

    public void testConcat() {
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));
    }


    public void testContains() {
        String myStr = "Hello";
        System.out.println(myStr.contains("Hel"));   // true
        System.out.println(myStr.contains("e"));     // true
        System.out.println(myStr.contains("Hi"));    // false
    }


    public void testContentEquals() {
        String myStr = "Hello";
        System.out.println(myStr.contentEquals("Hello"));  // true
        System.out.println(myStr.contentEquals("e"));      // false
        System.out.println(myStr.contentEquals("Hi"));     // false
    }


    public void testCopyValueOf() {
        char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
        String myStr2 = "";
        myStr2 = myStr2.copyValueOf(myStr1, 0, 5);
        System.out.println("Returned String: " + myStr2);
    }

    public void testEndsWith() {
        String myStr = "Hello";
        System.out.println(myStr.endsWith("Hel"));   // false
        System.out.println(myStr.endsWith("llo"));   // true
        System.out.println(myStr.endsWith("o"));     // true
    }

    public void testEquals() {
        String myStr1 = "Hello";
        String myStr2 = "Hello";
        String myStr3 = "Another String";
        System.out.println(myStr1.equals(myStr2)); // Returns true because they are equal
        System.out.println(myStr1.equals(myStr3)); // false
    }

    public void testEqualsIgnoreCase() {
        String myStr1 = "Hello";
        String myStr2 = "HELLO";
        String myStr3 = "Another String";
        System.out.println(myStr1.equalsIgnoreCase(myStr2)); // true
        System.out.println(myStr1.equalsIgnoreCase(myStr3)); // false
    }


    public void testHashCode() {
        String myStr = "Hello";
        System.out.println(myStr.hashCode());
    }

    public void testIndexOf() {
        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.indexOf("planet"));
    }

    public void testIsEmpty() {
        String myStr1 = "Hello";
        String myStr2 = "";
        System.out.println("testIsEmpty 1:"+myStr1.isEmpty());
        System.out.println("testIsEmpty 2:"+myStr2.isEmpty());
    }


    public void testLastIndexOf() {
        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println("testLastIndexOf :"+myStr.lastIndexOf("planet"));
    }


    public void testLastLenght() {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(txt.length());
    }


    public void testReplace() {
        String myStr = "Hello";
        System.out.println(myStr.replace('l', 'p'));
    }

    public void testStartsWith() {
        String myStr = "Hello";
        System.out.println(myStr.startsWith("Hel"));   // true
        System.out.println(myStr.startsWith("llo"));   // false
        System.out.println(myStr.startsWith("o"));     // false
    }


    public void testToUpperCase() {
        String txt = "Hello World";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
    }

    public void testTrim() {
        String myStr = "       Hello World!       ";
        System.out.println(myStr);
        System.out.println(myStr.trim());
    }


    public void testSplitJava(){
        String frase = "nome;teste;10";
        String array[] = new String[3];
        array = frase.split(";");

        System.out.println("testSplitJava: "+array);
        for(String s: array){
            System.out.println("arr"+s);
        }
    }
}
