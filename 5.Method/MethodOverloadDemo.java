//方法重载

public class MethodOverloadDemo 
{
	public static void main(String[] args) 
	{
		/*
			两同一不同：
			    两  同：方法必须在同一个类中，并且名字相同
			    一不同：方法各自的参数列表不同（参数类型，参数个数，参数顺序）
		*/

		double ret = getSum(2,3.14);
		System.out.println(ret);

		System.out.println();
		System.out.println('A');
		System.out.println(true);
		System.out.println(1);
		System.out.println(3.14);
	}
	//求两个整数之和
		static int getSum(int x, int y)
		{
			return x + y;
		}
		//求两个小数之和
		static double getSum(double x, double y)
		{
			return x + y;
		}
		//求两个小数和整数之和
		static double getSum(int x, double y)
		{
			return x + y;
		}

}
