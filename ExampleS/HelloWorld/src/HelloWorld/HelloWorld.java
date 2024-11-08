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
			MyClass _MyClassA=new MyClass();
			MyClass _MyClassB=new MyClass();
			System.out.println( _MyClassA.compareTo(_MyClassB));
		}
		//Ожидание ввода
		Scanner reader = new Scanner(System.in); int n = reader.nextInt(); reader.close();
	}

}
