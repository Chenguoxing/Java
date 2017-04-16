//整数类型（byt short int long）
public class IntegerDemo

{
	public static void main(String[] args) 
	{
		/*
		   你好


		*/
		//整数的常量表示
		System.out.println(250);//十进制
		System.out.println(0b11111010);//二进制
		System.out.println(0372);//八进制
		System.out.println(0xFA);//十六进制
			System.out.println("----------------------------");
		//整数的常量表示
		byte day = 90;//两个字节，16位
		System.out.println(day);

		int ddd = 100;//四个字节，32位
		System.out.println(ddd);
		int bin = 0b00000000_00000000_00000000_11111010;//250的二进制的四字节，32位
		System.out.println(bin);

		//java7可以用‘_’分割数字
		System.out.println(1_2_3);

		long id = 110L;
		System.out.println(id);

	}
}
