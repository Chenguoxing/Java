//BitOpearDemo,二进制的位运算
public class BitOpearDemo 
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 3;
		/*
			a:0b00000101
			b:0b00000011
			+
		------------------------
			  0b00000001
			  相同为1，不同为0
		*/
		System.out.println(a & b);
		/*
			a:0b00000101
			b:0b00000011
			|
		------------------------
			  0b00000111        = 7
			  相同为1，不同为0
		*/
		System.out.println(a | b);//7
		/*
			a:0b00000101
			b:0b00000011
			^
		------------------------
			  0b00000110        
			  相同为0，不同为1    = 6
		*/
		System.out.println(a ^ b);//6

		System.out.println(~5);//-6
		/*
			a:0b00000101
			~
			-------------------------
			b:0b11111010     = -6
			*/
		//操作负数：得到原码-->反码-->补码-->操作
		System.out.println(~-5);//4
		/*
			(5)00000101
		   (-5)11111011
		   ~
		   ---------------
		      00000100      (4)

		*/
		//交换两个变量值操作
		int xx = 10;
		int yy = 20;
		System.out.println("xx="+xx+",yy="+yy);

		/*
		int temp = xx;
		xx = yy;
		yy = temp;
		*/
		System.out.println("xx="+xx+",yy="+yy);
		System.out.println("----------------------------");		
		//两个变量直接换
		xx = xx ^ yy;
		yy = xx ^ yy;
		xx = xx ^ yy;
		
		
		System.out.println("xx="+xx+",yy="+yy);//画二进制图的结果
		System.out.println("----------------------------");		
		int j = 2;
		/*
			2的二进制：
			0b00000010
			0b减去三位00010——用零补位000
		
		*/
		System.out.println(j << 3);
		//操作负数：原码-->反码-->补码-->操作:取反-->补码

		System.out.println(-123 << 3);




		
		}
}
