package IO;

//: io/BufferedInputFile.java
import java.io.*;

public class BufferedInputFile {
	public static String read(String filename) throws IOException {
		// Reading input by lines:
		BufferedReader in = new BufferedReader(new FileReader(filename)); //文本类型才可以用Reader或Writer
		String s;
		StringBuilder sb = new StringBuilder();
		while ((s = in.readLine()) != null){
			sb.append(s + "\n");
		}
		in.close();
		return sb.toString();
	}

	public static void main(String[] args) throws IOException {
		System.out.println(read("BufferedInputFile.java"));
	}
} /* (Execute to see output) */// :~
