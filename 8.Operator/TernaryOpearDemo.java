//TernaryOpearDemo
public class TernaryOpearDemo 
{
	public static void main(String[] args) 
	{
		//现在给一个小数，求四舍五入后的结果，该怎么做？
		double num = 4.46;
		//整数部分
		int qNum = (int)num;//4
		System.out.println(qNum);
		//小数部分
		double wNum = num - qNum;//0.599999999996,并不精确
		System.out.println(wNum);

		int ret = wNum >= 0.5 ? qNum + 1 : qNum;
		System.out.println(ret);

		//求两个数的最大值+
		int x = 30;
		int y = 12;
		int max = x >= y ? x : y;
		System.out.println(max);

		//求两个数的最小值
		int u = 30;
		int i = 12;
		int min = u >= i ? i : u;
		System.out.println(min);

		//判断一个数是技术还是偶数
		int q = 30;
		String qwe = q % 2 ==0 ? "偶数" : "奇数";
		System.out.println(qwe);
		//整数除法
		int t = 9888;
		int g = 1000;
		int c = t / g;
		System.out.println("9800 / 1000 = " + c);//9   没有小数，被忽略了



		

	}
}
