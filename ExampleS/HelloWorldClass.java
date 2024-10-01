//package HelloWorld;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorldClass {

	public static void main(String[] args) throws IOException {
		String qwe1 = System.getProperty("user.dir");
        String qwe2 = new File(HelloWorldClass.class.getResource("").getPath()).getAbsolutePath();
		if(qwe1.equals(qwe2))
		{
			//String command = "ping www.codejava.net";
			//String command = "cmd /c echo qwe Notepad++";
			String command = "cmd /c start notepad++ HelloWorldClass.java";
			@SuppressWarnings("deprecation")
			Process process = java.lang.Runtime.getRuntime().exec(command);
			BufferedReader reader2 = new BufferedReader( new InputStreamReader(process.getInputStream()));
			String line; while ((line = reader2.readLine()) != null) {System.out.println(line);}reader2.close(); 
			System.exit(0);
		}else{}
		System.out.println("HelloWorld");
		
		Scanner reader = new Scanner(System.in); 
		int n = reader.nextInt();
		reader.close();
	}
}