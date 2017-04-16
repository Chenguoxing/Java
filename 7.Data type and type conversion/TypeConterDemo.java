//TypeConterDemo
public class TypeConterDemo 
{
	public static void main(String[] args) 
	{
		//自动类型转换
		byte b = 17;
		short s = b;
		int q = s;
		float w = q;
		double e = w;

		//byte r = e;//提示错误，可能会有损失
		System.out.println(e);

		//需求：强制把double转换为int类型:(int)
		int num = (int)e;
		System.out.println(num);

		int num2 = (int)3.1415926;
		System.out.println(num2);//输出：3 （损失小数点后面的数字）

		byte v = 5;//隐式转换
		System.out.println("----------------------------");

		double re = 32 + 32l + 32F + 99.9999;
		System.out.println(re);//99.9999的数据类型最高最精确，所以用double类型，输出195.9999

		String  rte = 32 + 32l + 32F + 99.9999 + "xx";
		System.out.println(rte);//输出195.9999 + xx = 195.9999xx

		int m = 'A' + 1;
		System.out.println(m);//输出A(65) + 1 = 66

		//面试：
		short  f = 123;
		System.out.println(f);//123



	}
}
