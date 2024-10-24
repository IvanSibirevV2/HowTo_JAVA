import java.util.Scanner; import java.nio.file.Path; import java.nio.file.Paths; import java.io.File; import java.io.BufferedReader; import java.io.IOException; import java.io.InputStreamReader;
///////////////////////////////////////////////////////////////////////////////////////
public class E_001_DataTypeS {
	public static void main(String[] args) throws IOException {
		Class<?> myClass = E_001_DataTypeS.class;
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
		// Рефлексии для базовых типов данных нет.
		// То есть нельзя создать булеву переменную И узнать ее тип и ее размер.
		
		System.out.println("///////////////////////////////////////////////////////");
		System.out.println("Boolean.class.getTypeName() = "+ Boolean.class.getTypeName());
		boolean _flagA = false; System.out.println("boolean _flagA = "+ _flagA);
		boolean _flagB = true; System.out.println("boolean _flagB = "+ _flagB);
		
		System.out.println("///////////////////////////////////////////////////////");
		System.out.println("Byte.class.getTypeName() = "+ Byte.class.getTypeName());
		System.out.println("Byte.SIZE = "+ Byte.SIZE + " BIT");
		System.out.println("Byte.MIN_VALUE = "+ Byte.MIN_VALUE);
		byte _byte = 8; System.out.println("byte _byte = "+ _byte);
		System.out.println("Byte.MAX_VALUE = "+ Byte.MAX_VALUE);
		
		System.out.println("///////////////////////////////////////////////////////");
		System.out.println("Short.class.getTypeName() = "+ Short.class.getTypeName());
		System.out.println("Short.SIZE = "+ Short.SIZE + " BIT");
		System.out.println("Short.MIN_VALUE = "+ Short.MIN_VALUE);
		short _short = 8; System.out.println("short _short = "+ _short);
		System.out.println("Short.MAX_VALUE = "+ Short.MAX_VALUE);

		System.out.println("///////////////////////////////////////////////////////");
		System.out.println("Integer.class.getTypeName() = "+ Integer.class.getTypeName());
		System.out.println("Integer.SIZE = "+ Integer.SIZE + " BIT");
		System.out.println("Integer.MIN_VALUE = "+ Integer.MIN_VALUE);
		int _int = 8; System.out.println("int _int = "+ _int);
		System.out.println("Integer.MAX_VALUE = "+ Integer.MAX_VALUE);

		System.out.println("///////////////////////////////////////////////////////");
		System.out.println("Long.class.getTypeName() = "+ Long.class.getTypeName());
		System.out.println("Long.SIZE = "+ Long.SIZE + " BIT");
		System.out.println("Long.MIN_VALUE = "+ Long.MIN_VALUE);
		long _long = 8; System.out.println("long _long = "+ _long);		
		System.out.println("Long.MAX_VALUE = "+ Long.MAX_VALUE);

		//double - это совсем отдельная тема...//есть значимая часть
		//есть флаг знака// есть E-324? Это означает ... *10^(-324)
 		System.out.println("///////////////////////////////////////////////////////");
		System.out.println("Double.class.getTypeName() = "+ Double.class.getTypeName());
		System.out.println("Double.SIZE = "+ Double.SIZE + " BIT");
		System.out.println("Double.MIN_VALUE = "+ Double.MIN_VALUE);
		double _double = 8; System.out.println("double _double = "+ _double);	
		System.out.println("Double.MAX_VALUE = "+ Double.MAX_VALUE);

		System.out.println("///////////////////////////////////////////////////////");
		System.out.println("Float.class.getTypeName() = "+ Float.class.getTypeName());
		System.out.println("Float.SIZE = "+ Float.SIZE + " BIT");
		System.out.println("Float.MIN_VALUE = "+ Float.MIN_VALUE);
		float _float = 8F; System.out.println("float _float = "+ _float);	
		System.out.println("Float.MAX_VALUE = "+ Float.MAX_VALUE);

		//UTF-16 
		System.out.println("///////////////////////////////////////////////////////");
		char symbol = '\u0066';
		for(int i = 0; i < 128; i++)System.out.print((char)i);System.out.println("");
		for(int i = 1040; i < 1106; i++)System.out.print((char)i);System.out.println("");	
		for(int i = 9450; i < 9600; i++)System.out.print((char)i);System.out.println("");		
		
		//Ожидание ввода
		Scanner reader = new Scanner(System.in); int n = reader.nextInt(); reader.close();
	}
}