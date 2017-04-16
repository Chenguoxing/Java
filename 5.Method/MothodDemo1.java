public class MothodDemo1
{
	//无参数返回：定义一个打印Hello的方法
	static void p()
	{
		System.out.println("Hello");
	}
	//有参无返回
	static void p2(String data)
	{
		System.out.println(data);
	}
	//无参有返回
	static int getAge()
	{
		return 17;
	}
	//有参有返回:该方法接受一个名字，返回Hello+名字
	static String sayHello(String name)
	{
		return  "Hello " + name;
	}
	public static void main(String[] args) 
	{
		MothodDemo1.p();//调用p方法
		p2("师姐");
		p2("师兄");
		p2("师妹");

		int age = getAge();
		System.out.println(age);

		String ret = sayHello("Lucy");
		System.out.println(ret);
		
		ret = sayHello("Naocan");
		System.out.println(ret);

		//3 和 4的和
		int a = 3;int b = 4;
		int sum = getSum(3,4);
		System.out.println(sum);


	}
	//定义一两个整数的和
	static int getSum(int x,int y)
	{
		int z = x + y;
		return x + y;
	}
}
