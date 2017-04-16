//ContinueDemo
public class ContinueDemo 
{
	public static void main(String[] args) 
	{
		//从一数到十，数到四时，跳过
		for (int i = 1;i<=10 ;i++ )
		{
			if (i == 4)
			{
				continue;//跳过这次循环
			}
			System.out.println(i);
		}
		//输出100到200之间不能被3整除的数
		System.out.println("-----------------------------");
		for (int i= 100;i<=200;i++)
		{
			if (i%5 == 0)
			{
				continue;//跳过这一次循环
			}
			System.out.println(i);
		}
	}
}
