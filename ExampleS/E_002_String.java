import java.util.Scanner; import java.nio.file.Path; import java.nio.file.Paths; import java.io.File; import java.io.BufferedReader; import java.io.IOException; import java.io.InputStreamReader;
///////////////////////////////////////////////////////////////////////////////////////
public class E_002_String {
	public static void main(String[] args) throws IOException {
		Class<?> myClass = E_002_String.class;
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
		String str1 = "Строка однострочная";
		System.out.println(str1);
		String str2 =
"""
Строка \n не дословная 
многострочная
"""
		;
		System.out.println(str2);
		String str3 ="Спец символы \n"
			+"нужно экранировать"
		;
		System.out.println(str3);
		
		
		//Ожидание ввода
		Scanner reader = new Scanner(System.in); int n = reader.nextInt(); reader.close();
	}
}