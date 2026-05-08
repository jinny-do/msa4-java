package com.msa4java.edu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        // 정규표현식
        // String 객체 이용
        String str = "djh0715";
        String pattern1 = "[a-zA-Z]+";
        String pattern2 = "[0-9]+";
        String pattern3 = "[a-z0-9]{6,20}";

        System.out.println(str.matches((pattern1))); // false
        System.out.println(str.matches((pattern2))); // false
        System.out.println(str.matches((pattern3))); // true

        // Pattern 객체 이용
        // 미리 패턴을 만들어 놓고 필요한 곳에서 사용
        Pattern pattern4 = Pattern.compile("[a-zA-Z]+");

        // 문자열 검사, 필터링 후 matcher객체로 반환
        Matcher matcher4 = pattern4.matcher(str);

        System.out.println(matcher4.matches());
    }
}
