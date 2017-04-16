//递归操作
public class RecursionDemo 
{
	public static void main(String[] args) 
	{
		/*
			斐波那契数列。起通项公式为：
			F（0）=0  F（1）=1 ...F（n）=F(n-1)+F(n-2)  （n>=3,n∈N※）

			求F5的值
		*/
		int ret = fn(24);
		System.out.println(ret);
	}
	static int fn(int n)
	{
		if (n == 0)
		{
			return 0;
		}
		
		else if (n == 1)
		{
			return 1;
		}else
		{
			return fn(n-1) + fn(n-2);
		}

	}
}
