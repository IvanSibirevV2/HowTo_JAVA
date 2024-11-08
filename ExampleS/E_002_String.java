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
			System.out.print("\"Java String\".charAt(8)=");
			System.out.println("Java String".charAt(8));
			System.out.print("\"STR\".equals(\"STR\")="); System.out.println("STR".equals("STR"));  
			System.out.print("\"STR\".equals(\"STr\")=");System.out.println("STR".equals("STR_")); 
			System.out.print("\"STR\".equalsIgnoreCase(\"STR\")="); System.out.println("STR".equalsIgnoreCase("STR"));  
			System.out.print("\"STR\".equalsIgnoreCase(\"STr\")=");System.out.println("STR".equalsIgnoreCase("STR_")); 
			System.out.print("\"STR\".equalsIgnoreCase(\"STr\")=");System.out.println("STR".equalsIgnoreCase("STr"));
		}
		{
			System.out.println("///////////////////////////////////////////////////////");
			System.out.println("<<<String.join(spliterValue, stringValue1, stringValue2, ...)>>>");
			System.out.println(String.join(" ", "Wake up", "Eat", "Play", "Sleep", "Wake up"));
			System.out.println(String.join("_", "Wake up", "Eat", "Play", "Sleep", "Wake up"));
			System.out.println(String.join("-> ", "Wake up", "Eat", "Play", "Sleep", "Wake up"));
		}
		{
			System.out.println("///////////////////////////////////////////////////////");
			System.out.println("<<<String.valueOf(value)>>>");
			double d = 102939939.939;
			System.out.print("double d = 102939939.939; ");
			System.out.println("String.valueOf(d)="+String.valueOf(d)+";");
			
			boolean b = true;
			System.out.print("boolean b = true; ");
			System.out.println("String.valueOf(b)="+String.valueOf(b)+";");
			
			long l = 1232874;
			System.out.print("long l = 1232874; ");
			System.out.println("String.valueOf(l)="+String.valueOf(l)+";");
			
			char[] arr = { 'а', 'б', 'в', 'г', 'д', 'е', 'ё' };
			System.out.print("char[] arr = { 'а', 'б', 'в', 'г', 'д', 'е', 'ё' }; ");
			System.out.println("String.valueOf(arr)="+String.valueOf(arr)+";");
		
		}
		{
			System.out.println("///////////////////////////////////////////////////////");
			System.out.println("<<<str1.сompareTo(str2)>>>");
			
			String str1 = "ABCD"; System.out.println("String str1 = \"ABCD\";");
			String str2 = str1; System.out.println("String str2 = str1;");
			System.out.print("str1.compareTo(str2)=");
			System.out.println( str1.compareTo(str2));
			
			str1 = "ABCD"; System.out.println("str1 = \"ABCD\";");
			str2 = "ABCD"; System.out.println("str2 = \"ABCD\";");
			System.out.print("str1.compareTo(str2)=");
			System.out.println( str1.compareTo(str2));
						
			str1 = "ABCD"; System.out.println("str1 = \"ABCD\";");
			str2 = "ABCDF"; System.out.println("str2 = \"ABCDF\";");
			System.out.print("str1.compareTo(str2)=");
			System.out.println( str1.compareTo(str2));
			
			// если  string1 > string2 , возвращается  положительное  число
			// если  string1 < string2 , возвращается  отрицательное  число
			// если  string1 == string2 , возвращается  0
		}
		{
			System.out.println("///////////////////////////////////////////////////////");
			//System.out.println("<<<int1.сompareTo(int2)>>>");
			//int int1 = 8;int int2 = 8;
			//System.out.println( int1.compareTo(int2));
			// У чисел нет компанатора, ну наверно он есть но это будет не тот компанатор который мы рассматриваем
			// метода сompareTo для классов нет, реализуется самостоятельно
			//https://www.geeksforgeeks.org/java-string-compareto-method-with-examples/
		}

		{
			String str = "Hello World";
			System.out.println("String str = "+str+";");
			char[] dest = new char[5];
			System.out.println("char[] dest = new char[5];");
			str.getChars(2, 7, dest, 0);
			System.out.println("str.getChars(2, 7, dest, 0);");
			for (char _char : dest) System.out.print(_char);
			System.out.println("");
		}
		{
			//https://metanit.com/java/tutorial/7.1.php
			//https://metanit.com/java/tutorial/2.3.php
			//https://metanit.com/java/tutorial/2.13.php
			//https://metanit.com/java/tutorial/2.14.php
			//https://metanit.com/java/tutorial/2.15.php
			
		}
		
        System.out.println();
		//Ожидание ввода
		Scanner reader = new Scanner(System.in); int n = reader.nextInt(); reader.close();
	}
}