//三大循环之While循环
public class WhileDemo 
{
	public static void main(String[] args) 
	{
		//案例：叫一百声帅哥
		int count = 1;//计数器，记录叫了多少次帅哥

		while (count <= 100)
		{
			System.out.println("帅哥"+count);//print(输出)----ln(换行)
			count++;
		}
		System.out.println("------------------------------------");
	
		//案例：从一数到一百
		int num = 0;
		while (num <= 100)
		{
			System.out.println(num);//100,先打印，后自增
			num++;//每次递增
			
		}
		System.out.println("----------------------------------");
		int nm = 0;
		while (nm <= 100)
		{
			nm++;//每次递增
			//System.out.println(nm);	//101，先自增，后打印
		}

		//案例：帮大圣解决问题1+。。。。。。。。。。。100的和
		//先求出每一个加数，后加
		int x = 1;
		int sum = 0;//前n个数的和
		while (x <= 100)
		{
			//sum = sum + x;等于下一条
			sum+= x;
			x++;
		}
		System.out.println("1++...+100的和为："+sum);
	}
}
