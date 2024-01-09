package ex15;

import java.io.*;

// 상대 경로 : 실행되는 위치(프로젝트폴더)를 기반으로 경로 정하는 것
// 절대 경로 : 루트에서 부터 경로를 찾는 것
// 윈도우 : c:\\workspace\\hello.txt
// 맥, 리눅스 : /workspace/hello.txt
public class StreamEx05 {
    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        try {

            //inputStream = new BufferedReader(new FileReader("D:\\workspace\\put\\input.txt"));
            inputStream = new BufferedReader(new FileReader("src\\ex15\\input.txt"));
            outputStream = new PrintWriter(new FileWriter("D:\\workspace\\put\\output.txt"));
            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();

            }
        }



    }
}
