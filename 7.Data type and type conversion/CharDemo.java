//字符类型（Char）
public class CharDemo
{
	public static void main(String[] args) 
	{
		//unicode:世界上所有国家的字节符号

		//Char的常量表示
		//char的变量表示
		System.out.println("︻︼");
		System.out.println("A");
		System.out.println("a");

		char a = 66;
		char b = 67;
		System.out.println(a);//输出66位置的符号：B
		System.out.println(b);//输出66位置的符号：C
		System.out.println("--------------------");
		char q = 95;
		char ww = '\u0061';//十六进制表示方法：a
		System.out.println(q);
		System.out.println(ww);


	}
}
