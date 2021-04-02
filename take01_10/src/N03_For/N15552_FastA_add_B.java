package N03_For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class N15552_FastA_add_B {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedReader로 버퍼읽기(InputStreamReader) 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // BufferedWriter로 데이터 저장(OutputStrimWriter)
		int N = Integer.parseInt(br.readLine());
        // BufferedReader로 읽은 데이터 int형 변환
		StringTokenizer st;
        // StringTokenizer 호출
		for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
		}
		br.close();
		bw.flush();
		bw.close();
    }
}
