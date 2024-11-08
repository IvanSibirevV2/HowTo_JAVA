package HelloWorld;

import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths; import java.io.File; import java.io.BufferedReader; import java.io.IOException; import java.io.InputStreamReader;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Программыный код писать сюда.
		System.out.println("HelloWorld");
		String str1 = "Строка однострочная";
		System.out.println(str1);
		String str2 =
				@"""
				Строка 
			многострочная
			"""
			;
		System.out.println(str2);
		Scanner reader = new Scanner(System.in); int n = reader.nextInt(); reader.close();
	}

}
