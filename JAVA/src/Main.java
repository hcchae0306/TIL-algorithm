import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer time = new StringTokenizer(br.readLine());

		int h = Integer.parseInt(time.nextToken());
		int m = Integer.parseInt(time.nextToken());

		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer cook = new StringTokenizer(br2.readLine());

		int t = Integer.parseInt(cook.nextToken());


		h += t/60;
		m += t%60;

        if(m >= 60){
            h += 1;
            m -= 60;
        }
        if(h >= 24){
            h -= 24;
        }
        
        System.out.println(h + " " + m);

		br.close();
		br2.close();

    }
}
