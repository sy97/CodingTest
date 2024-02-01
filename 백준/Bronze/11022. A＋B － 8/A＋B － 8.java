import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i = 0; i < cnt; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            bw.write("Case #"+(i+1)+": "+num1+ " + " + num2 + " = "+ (num1 +num2)+"\n");
            /*bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+"\n");*/
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
