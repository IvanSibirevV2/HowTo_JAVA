import java.util.Scanner; import java.nio.file.Path; import java.nio.file.Paths; import java.io.File; import java.io.BufferedReader; import java.io.IOException; import java.io.InputStreamReader;
///////////////////////////////////////////////////////////////////////////////////////

public class E_003_Циклы {
	public static void main(String[] args) throws IOException {
		Class<?> myClass = E_003_Циклы.class;
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
	
		System.out.println("HelloWorld");
		{
			System.out.println("///////////////////////////////////////////////////////");
			for (int i = 1; i < 9; i++){
				System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
			}
		}
		{
			System.out.println("///////////////////////////////////////////////////////");
			int i = 1;
			for (; i<9;){
				System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
				i++;
			}
		}
		{
			System.out.println("///////////////////////////////////////////////////////");
			int n = 10;
			for(int i=0, j = n - 1; i < j; i++, j--){
				System.out.println(i * j);
			}
		}
		{
			System.out.println("///////////////////////////////////////////////////////");
			int j = 7;
			do{
				System.out.println(j);
				j--;
			}
			while (j > 0);
		}
		{	
			System.out.println("///////////////////////////////////////////////////////");
			int j = -1;
			do{
				System.out.println(j);
				j--;
			}
			while (j > 0);
		}
		{
			System.out.println("///////////////////////////////////////////////////////");
			int j = 6;
			while (j > 0){
			 
				System.out.println(j);
				j--;
			}
		}
		{
			System.out.println("///////////////////////////////////////////////////////");
			for (int i = 0; i < 10; i++){
				if (i == 5)
					break;
				System.out.println(i);
			}
		}
		{
			System.out.println("///////////////////////////////////////////////////////");
			for (int i = 0; i < 10; i++){
				if (i == 5)
					continue;
				System.out.println(i);
			}
		}
		
		
        System.out.println();
		//Ожидание ввода
		Scanner reader = new Scanner(System.in); int n = reader.nextInt(); reader.close();
	}
}