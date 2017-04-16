//三大循环之DoWhile循环
public class DoWhileDemo 
{
	public static void main(String[] args) 
	{
		//案例：叫一百声帅哥
		int count = 1;
		do
		{
			System.out.println("叫帅哥"+count);
			count++;
		}while (count <= 100);
		System.out.println("------------------------------");
		//案例：从一数到一百
		int num = 1;
		do
		{
			System.out.println(num);
			num++;
		}
		while(num <= 100);
		//案例：帮大圣解决问题1+。。。。。。。。。。。100的和
		int x = 1;
		int sum = 0;
		do
		{
			sum += x;//sum = sum + x;
			x++;
		}
		while (x <= 100);
		System.out.println("1++....100为："+sum);
		/*
			do
			{
				语句
			}
			while(循环条件);
		*/
		}
}
