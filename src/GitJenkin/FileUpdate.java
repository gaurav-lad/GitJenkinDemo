package GitJenkin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUpdate {
	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		for (int i = 1; i < 5; i++) {
			System.out.println("value of i is: " + i);
		}
		try {
			in = new FileInputStream("C:/Users/xeadmin/eclipse-workspace/GitJenkin/src/Test.txt");
			out = new FileOutputStream("C:/Users/xeadmin/eclipse-workspace/GitJenkin/src/Test2.txt");
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
