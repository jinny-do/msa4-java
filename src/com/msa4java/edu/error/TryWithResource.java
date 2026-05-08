package com.msa4java.edu.error;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {
        // 자바 외부에서 다루는 데이터 (DB, Network, File)

        // 아래 처리를 간단히 할 수 있다.
        try(
            FileWriter file = new FileWriter("text.txt")
        ) {
            // finally에서 따로 close할 필요 없음. 알아서 close 해줌
            file.write("안녕");
        } catch(IOException e) {
            e.printStackTrace();
        }


//        FileWriter file = null;
//        try {
//         file  = new FileWriter("test.txt");
//         file.write("안녕");
//        } catch (Exception e) {
//            e.printStackTrace(); // 콘솔에 에러 내용 출력
//        } finally {
//            try {
//                file.close();
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//        }
    }
}
