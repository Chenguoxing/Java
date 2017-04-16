//小数类型（float、double）
public class DecimalDemo 
{
	public static void main(String[] args) 
	{
		/*
			小数的常量
			方式1：直接用小数点表示
			方式2：科学计数法表示
			小数的常量默认double类型。float = 3.14；是错的
			所以一般用double
		*/
		System.out.println(3.14);
		System.out.println(3.14E2);//3.14E2，表示3.14的十的二次方，float后面加f/F
		System.out.println("------------------------");
		//小数的变量
		float pi = 3.14f;
		System.out.println(pi);

		double pp = 123.456789;
		System.out.println(pp);
		//无论float或者double都不能精确表示一个小数
		//在开发中用BigDecimal类，如金钱时）表示一个精确地小数

	}
}
