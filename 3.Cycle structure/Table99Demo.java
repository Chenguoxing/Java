//99乘法表
public class Table99Demo 
{
	public static void main(String[] args) 
	{
		//第一行
		System.out.print("1*1=1");
		System.out.println("");//空行
		//第二行
		System.out.print("1*2=2");
		System.out.print(" "+"2*2=4");
		System.out.println("");//空行
		//...................................
		
		/*/第一行
		for (int a=1;a<=1;a++){
			System.out.print(a + "*1=1");
		}
		System.out.println("");//空行
		//第二行
		for (int a=1; a<=2;a++){
			System.out.print(a+"*2="+a*2);
		}
		System.out.println("");//空行
		//第三行
		for (int a=1;a<=3;a++){
			System.out.print(a+"*3="+a*3);
		}
		System.out.println("");//空行
		//第二行
		for (int a =1;a<=4;a++){
			System.out.print(a+"*4="+a*4);
		}
		System.out.println("");//空行
		//第二行
		for (int a=1;a<=5;a++){
			System.out.print(a+"*5="+a*5);
		}
		System.out.println("");//空行
		//第二行
		for (int a=1;a<=6;a++){
			System.out.print(a+"*6="+a*6);
		}
		System.out.println("");//空行
		//第二行
		for (int  a = 1;a <=7 ;a++ ){
			System.out.print(a + "*7=" + a*7);
		}
		System.out.println("");//空行
		//第二行
		for (int  a = 1;a <=8 ;a++ ){
			System.out.print(a + "*8=" + a*8);
		}
		System.out.println("");//空行//第二行
		for (int  a = 1;a <=9 ;a++ ){
			System.out.print(a + "*29=" + a*9);
		}
		System.out.println("");//空行
		*/

		for (int line=  1;line <= 99;line ++)
		{
			for (int i = 1;i<=line;i++){
				System.out.print(i + "*" + line + "=" + i*line  + "\t");
			}
			System.out.println("");//空行
		}

	}
}
