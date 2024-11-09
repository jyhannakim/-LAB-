import java.io.*;
import java.util.StringTokenizer;
import java.util.concurrent.locks.StampedLock;

public class BufferedReaderClass {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String s = in.readLine();
		
		while (!s.equalsIgnoreCase("QUIT")) {
			try {
				
				StringTokenizer stk = new StringTokenizer(s);
				
				System.out.println("There are " + Integer.toString(stk.countTokens()) + " words in this line.");
				
				s = in.readLine();
				
			} catch (Exception e) {
				System.out.println("IOException");
			}
		}
	}
}
