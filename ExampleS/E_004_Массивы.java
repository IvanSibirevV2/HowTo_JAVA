import java.util.Scanner; import java.nio.file.Path; import java.nio.file.Paths; import java.io.File; import java.io.BufferedReader; import java.io.IOException; import java.io.InputStreamReader;import java.util.Arrays;
///////////////////////////////////////////////////////////////////////////////////////

public class E_004_Массивы {
	public static void main(String[] args) throws IOException {
		Class<?> myClass = E_004_Массивы.class;
		String qwe1 = System.getProperty("user.dir");
		String qwe2 = new File(myClass.getResource("").getPath()).getAbsolutePath();
		System.out.println(qwe2+"\\"+myClass.getSimpleName()+".java");		
		if(qwe1.equals(qwe2))
		{
			@SuppressWarnings("deprecation")
			Process process = java.lang.Runtime.getRuntime().exec(
			//"ping www.codejava.net");
			//"cmd /c echo qwe Notepad++");
			"cmd /c start notepad++ "+myClass.getSimpleName()+".java");			
			BufferedReader reader2 = new BufferedReader( new InputStreamReader(process.getInputStream())); String line;
			while ((line = reader2.readLine()) != null) {System.out.println(line);}reader2.close(); System.exit(0);
		}else{}
///////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////
		//Программыный код писать сюда.
		
		System.out.println("HelloWorld");
		System.out.println("///////////////////////////////////////////////////////");
	
		{
			int nums[] = new int[4];    // массив из 4 чисел
			int[] nums2 = new int[5];   // массив из 5 чисел		
		}
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
			int last = nums[nums.length-1];
			System.out.print("int last =");
			System.out.println(last);
		}
		{
			int[] nums1 = new int[] { 0, 1, 2, 3, 4, 5 };
			int[][] nums2 = { { 0, 1, 2 }, { 3, 4, 5 } };
			int[][] myArray = {{18,28,18},{28,45,90},{45,3,14}};
			//import java.util.Arrays;
			System.out.println(Arrays.deepToString(myArray));			
		}
		{
			int[] array = new int[] { 1, 2, 3, 4, 5 };
			for (int i : array){
				System.out.println(i);
			}
		}
		{
			int[] array = new int[] { 1, 2, 3, 4, 5 };
			for (int i = 0; i < array.length; i++){
				System.out.println(array[i]);
			}
		}
		{
			int[][] nums = new int[][] 
			{ 
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
			};
			for (int i = 0; i < nums.length; i++){
				for(int j=0; j < nums[i].length; j++){
						 
					System.out.printf("%d ", nums[i][j]);
				}
				System.out.println();
			}
		}
		{
			// https://metanit.com/java/tutorial/2.7.php
			// https://metanit.com/java/tutorial/2.16.php
			// https://metanit.com/java/tutorial/2.17.php
			// лямбда выражения
			// https://metanit.com/java/tutorial/2.10.php
		}
        System.out.println();
		//Ожидание ввода
		Scanner reader = new Scanner(System.in); int n = reader.nextInt(); reader.close();
	}
}