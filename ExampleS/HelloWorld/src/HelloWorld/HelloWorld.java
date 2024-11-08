package HelloWorld;

import java.util.Arrays;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths; import java.io.File; import java.io.BufferedReader; import java.io.IOException; import java.io.InputStreamReader;



public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Программыный код писать сюда.

		{
			int[] nums1 = new int[] { 0, 1, 2, 3, 4, 5 };
			int[][] nums2 = { { 0, 1, 2 }, { 3, 4, 5 } };
			int[][] myArray = {{18,28,18},{28,45,90},{45,3,14}};
			System.out.println(Arrays.deepToString(myArray));			
		}
		//Ожидание ввода
		Scanner reader = new Scanner(System.in); int n = reader.nextInt(); reader.close();
	}

}
