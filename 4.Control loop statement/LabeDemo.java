//控制外层循环
public class LabeDemo 
{
	public static void main(String[] args) 
	{
		outer:for (int i = 1;i<=5 ;i++ )
		{
			for (int j = 1;j<=4 ;j++ )
			{
				//当i=3时终止循环4  5 不受影响
				if (i == 3)
				{
					break outer;//结束外循环，continue也一样
				}
				System.out.println("i = "+i +",j = "+j);//i为1 2 没有 3  4 5 。
			}
		}
	}
}
