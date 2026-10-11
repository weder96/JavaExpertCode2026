package br.com.wsousa.string;

public class ExecutoraTestBuilder {
    public static void main(String[] args) {
        StringBuffer sbr = new StringBuffer("Geeks");
        StringBuilder sbdr = new StringBuilder("Hello");

        // conversion from StringBuffer object to String
        String str = sbr.toString();

        System.out.println("StringBuffer object to String : ");
        System.out.println(str);

        // conversion from StringBuilder object to String
        String str1 = sbdr.toString().toUpperCase();
        System.out.println("StringBuilder object to String : ");
        System.out.println(str1);
        System.out.println(sbdr.toString());

        // changing StringBuffer object sbr
        // but String object(str) doesn't change
        sbr.append("ForGeeks");
        System.out.println(sbr);
        System.out.println(str);
    }
}
