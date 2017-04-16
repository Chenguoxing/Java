//ReturnDdemo
public class ReturnDdemo 
{
	public static void main(String[] args) 
	{
		//break语句
		for (int i = 1;i<=10 ;i++ )
		{
			System.out.println("i = "+i);
			if (i == 5)
			{
				break;
				//return
			}
		}
		System.out.println("----end---------");//return时，结束所在的方法，所以执行
		//return语句
		for (int i = 1;i<=10 ;i++ )
		{
			System.out.println("i = "+i);
			if (i == 5)
			{
				//break;
				return;
			}
		}
		System.out.println("------end---------");//break时，结束所在的方法，所以不执行
	}
}
