package HelloWorld;

import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths; import java.io.File; import java.io.BufferedReader; import java.io.IOException; import java.io.InputStreamReader;


public class MyClass
{
	public int p_int=0;
} 

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Программыный код писать сюда.
		{
			String str = "Hello World";
			System.out.println("String str = "+str+";");
			char[] dest = new char[5];
			System.out.println("char[] dest = new char[5];");
			str.getChars(2, 7, dest, 0);
			System.out.println("str.getChars(2, 7, dest, 0);");
			
			System.out.println(dest.toString());
			

		}
		//Ожидание ввода
		Scanner reader = new Scanner(System.in); int n = reader.nextInt(); reader.close();
	}

}
