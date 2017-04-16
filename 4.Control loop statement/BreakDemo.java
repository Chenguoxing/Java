//BreakDemo
public class BreakDemo 
{
	public static void main(String[] args) 
	{
		//从1数到10，数到5时停下来
		for (int i = 1;i<=10;i++)
		{
			if (i == 5)
			{
				break;
			}
			System.out.println("i = "+i);//i=1234
		}
		System.out.println("------------------------------");
		for (int q = 1;q<=10;q++)//其实没必要改i为q,只在for内有意义
		{
			
			System.out.println("i = "+q);//i=12345
			if (q == 5)
			{
				break;//后面的语句无法访问，执行
				//      System.out.print("呵呵");//BreakDemo.java:23: 错误: 无法访问的语句

			}
		}
		System.out.println("------------------------------");
		//打印出100以内前5个3的倍数的数字
		//定义一个计数器
		//当计数器增加到5时，停止
		int count = 0;
		for (int i = 1;i<=100 ;i++ )
		{
			if (i % 3 == 0)
			{
				System.out.println(i);
				count++;

			}
			if (count == 5)
			{
				break;//结束他当前所在的循环
			}
		}
		System.out.println("------------------------------");
		System.out.println("输出个数为："+count);
		
		}
}
