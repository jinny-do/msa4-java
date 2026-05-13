package com.msa4java.edu.erecord;

// Record : 데이터 전달을 위한 순수 객체(DTO/VO)를 아주 간결하게 정의할 수 있는 기술
// PostDTO와 기능이 같음
public record PostRecord(
        String title
        , String content
) {}
// 레코드는 불변객체 - 가지고 있는 데이터를 절대 변경할 수 없다 + DTO 역할
