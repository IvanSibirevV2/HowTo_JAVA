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
		{
			System.out.println("HelloWorld");
			String str ="";
			str = "Строка однострочная"; System.out.println(str);
			str =
	"""
	Строка \n не дословная 
	многострочная
	"""
			;System.out.println(str);
			str ="Спец символы \n"
				+"нужно экранировать"
			;System.out.println(str);
		}
		{
			System.out.println("///////////////////////////////////////////////////////");
			System.out.print("\"Java\".length()=");System.out.println("Java".length());
			String str1 = "str1"; System.out.println(str1);
			String str2 = new String(); // пустая строка
			System.out.println(str2); System.out.println("-Пустая строка");
			String str3 = new String(new char[] {'s', 't', 'r', '3'});
			System.out.println(str3);
			String str4 = new String(new char[]{'w', 'e', 'l','s', 't', 'r', '4', 'c', 'o', 'm', 'e'}, 3, 4);//3 -начальный индекс, 4 -кол-во символов
			System.out.println(str4); // str4
		}		
		{
			System.out.println("///////////////////////////////////////////////////////");
			for (
				char _char :
				new String(new char[] {'h', 'e', 'l', 'l', 'o'})
					.toCharArray()
			)
				System.out.print(_char);
			System.out.println("");
		}
		{
			System.out.println("///////////////////////////////////////////////////////");
			String s = "";   // пустая строка
			if(s.length() == 0) System.out.println("String is empty (s.length() == 0)");
			if(s.isEmpty()) System.out.println("String is empty (s.isEmpty())");		
			s = null;   // строка не указывает на объект
			if(s == null) System.out.println("String is null (s == null)");			
		}
		{
			System.out.println("///////////////////////////////////////////////////////");
			System.out.println("\"Geeks\".concat(\"for Geeks\")="+"Geeks".concat(" for Geeks"));
		}
		
		
        System.out.println();
		//Ожидание ввода
		Scanner reader = new Scanner(System.in); int n = reader.nextInt(); reader.close();
	}
}