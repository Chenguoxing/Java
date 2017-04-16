//三大循环之for循环
public class ForDemo 
{
	public static void main(String[] args) 
	{
		//案例：叫一百声帅哥
		
		for (int i = 1;i <= 100 ;i++ )
		{
			//System.out.println("帅哥"+i);
		}
		
		//案例：从一数到一百
		for (int i = 1;i <= 100 ;i++ )//i定义，和上面的不重复，
		{
			//System.out.println(i);
		}
		//案例：帮大圣解决问题1+。。。。。。。。。。。100的和
		int sum = 0;
		for (int i = 1;i <= 100 ;i++ )//i定义，和上面的不重复，
		{
			sum += i;

		}
			System.out.println("1+....+100为："+sum);
			//System.out.println(i);  找不到i：他只在花括号里有意义

		/*
			for (System.out.println("Hello World!"); ;System.out.println("Hello World!") )
			{
				System.out.println("Hello World!");
			}
		*/

		//for循环转化whlie循环
	}
}
