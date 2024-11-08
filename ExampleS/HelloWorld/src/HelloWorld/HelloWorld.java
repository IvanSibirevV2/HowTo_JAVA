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
			int[] nums = new int[] { 1, 2, 3, 5 };
			int[] nums2 = { 1, 2, 3, 5 };	
			for (int _nums : nums) System.out.print(_nums); System.out.println("");
			System.out.print(nums2);// Мне кажется мы колучили указатель... =)
		}
		{
			int[] nums = {1, 2, 3, 4, 5};
			System.out.println("int[] nums = {1, 2, 3, 4, 5};");
			int length = nums.length; 
			System.out.print("int length = ");
			System.out.println(length);
		}
		//Ожидание ввода
		Scanner reader = new Scanner(System.in); int n = reader.nextInt(); reader.close();
	}

}
