package com.String;

import java.util.Locale;

// good reedited file done!!!!

public class StringDemo {

    public static void main(String[] args) {

        String name="sakthi";
        System.out.println(name.hashCode());
        name="mani";
        System.out.println(name.hashCode());     // string immutable
        System.out.println(name);


        StringBuffer buffer=new StringBuffer("ram");
        buffer.append("sakthii");
        System.out.println(buffer.hashCode());
        System.out.println(buffer);
        System.out.println(buffer.hashCode());
        buffer.append("kumar");



        StringBuffer stringBuffer=new StringBuffer("ram");
        stringBuffer.insert(0,"a");

        System.out.println(stringBuffer);
        stringBuffer.replace(0,3,"lro");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());


        StringBuilder stringBuilder=new StringBuilder("sakthi");    // same functions is same
        stringBuilder.append("raam");
        stringBuilder.replace(0,1,"mo");
        System.out.println(stringBuilder);

        String name1="kavi";
        StringBuilder stringBuilder1=new StringBuilder("raam");
        System.out.println(stringBuilder1.hashCode());
        System.out.println(name1.hashCode());
        name1="ramm";

        stringBuilder.append("anbu");
        System.out.println(stringBuilder1.hashCode());
        System.out.println(name1.hashCode());
        System.out.println(name1);


        String na="amma";
        System.out.println(na.concat("sakhti"));
        System.out.println(na);

        String name3="kaviyarasu";
        name3.toUpperCase(Locale.ROOT);
        System.out.println(name3.startsWith("p"));

        String n1="kavi";
        String n2="kavi";
        n1="kavitha";
        System.out.println(n1+"  "+n2);







    }
}
