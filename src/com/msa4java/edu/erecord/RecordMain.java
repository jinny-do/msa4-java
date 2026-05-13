package com.msa4java.edu.erecord;

public class RecordMain {
    public static void main(String[] args) {
        PostDTO postDTO = new PostDTO("제목1", "내용1");
        PostRecord postRecord = new PostRecord("제목2", "내용2");

        // Getter 호출
        System.out.println(postDTO.getTitle());
        System.out.println(postRecord.title()); // 앞에 get이 없음

        System.out.println(postDTO.toString());
        System.out.println(postRecord.toString());

    }
}
