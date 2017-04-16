//MethodDome1
public class MethodDome1 
{
	//无参数无返回：定义一个打印Hello的方法
	static void p()
	{
		System.out.println("Hello");
	}
	//无参数有返回
	static void p2(String data)
	{
		System.out.println(data);
	}
	//有参数无返回
	static int getAge()
	{
		return 17;
	}
	//有参数有返回:该方法接受一个名字，返回Hello名字
	static String sayHello(String name)
	{
		return "Hello " + name;
	}
	public static void main(String[] args) //主方法:程序的入口
	{
		p();//调用p这个方法
		MethodDome1.p();//调用p这个方法(严格):类的p方法
		
		p2("师姐");
		p2("师 妹");//方法可以被重复调用，可变
		p2("师  哥");

		int age = getAge();
		System.out.println(age);

		String ret = sayHello("Lucy");
		System.out.println(ret);
		ret = sayHello("火星一号");
		System.out.println(ret);

		//求3+4的和
		int a = 3;
		int b = 4;
		int sum = getSum(a,b);
		System.out.println("3 + 4 = "+sum);
	}
	//定义两个数求和的功能
	
	static int getSum(int x,int y)//可以在主程序上，也可以在下
	{
		System.out.println(x);
		System.out.println(y);

		int z = x + y;//3 赋给第一个，4 赋给第二个
		return x + y;
	}
}
