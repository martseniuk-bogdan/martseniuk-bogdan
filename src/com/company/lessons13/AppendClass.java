package com.company.lessons13;

public class AppendClass {
    public static void main(String[] args) {
        String s, s2, s3;
        int a = 3;
        int b = 56;

        StringBuilder sb = new StringBuilder(10);
        StringBuilder sb2 = new StringBuilder(10);
        StringBuilder sb3 = new StringBuilder(10);
        s = sb.append(a).append("+").append(b).append("=").append(a + b).toString();
        System.out.println(s);
        s2 = sb2.append(a).append("-").append(b).append("=").append(a - b).toString();
        System.out.println(s2);
        s3 = sb3.append(a).append("*").append(b).append("=").append(a * b).toString();
        System.out.println(s3);
        sb.deleteCharAt(4);
        sb.insert(4, " Равно ");
        sb2.deleteCharAt(4);
        sb2.insert(4, " Равно ");
        sb3.replace(4, 5, " Равно ");
        System.out.println(sb + "\t" + sb2 + "\t" + sb3);
    }
}
