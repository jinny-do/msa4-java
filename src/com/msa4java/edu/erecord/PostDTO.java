package com.msa4java.edu.erecord;

// DTO : 데이터를 옮기기 위한 객체
public class PostDTO {
    // 유저가 전달해준 값 저장할 때 사용
    private final String title;
    private final String content;

    public PostDTO(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }

}
