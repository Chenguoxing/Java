//算数运算符
public class ArithmeticOperatorsDemo//驼峰表示法
{
	public static void main(String[] args) 
	{
		char c = 'A';
		char e = (char)(c + 12);
		int i = c + 12;

		System.out.println(i);//77
		System.out.println(e);//M
		System.out.println("AAA" + 8 + 7);//AAA87

		//Exception in thread "main" java.lang.ArithmeticException: / by zero：除数不能为零
		//System.out.println(1/0);
		System.out.println(1.0/0);//等价于：1/0.0    等于Infinity：正无穷大
		System.out.println(-1.0/0);//等价于：1/0.0     等于-Infinity：正无穷小

		System.out.println(0.0/0);//NaN:Not a Number 
		double x = 0.0/0.0;
		System.out.println(x == x);//false：NaN表示永远不等于自己

		//需求，10除以3的余数
		System.out.println(10 % 3);

		System.out.println("---------------------------------");
		//自增操作
		int a = 10;
		a = a + 1;
		System.out.println(a);
		
		int b = 10;
		b = b + 1;
		System.out.println(b);
		System.out.println("=======================================");
		/*
			当int y1 = ++x1;
				++前缀时，表示想先自增1
				再把值赋给y1
		*/
		int x1 = 10;
		int y1 = ++ x1;
		System.out.println("x1=" + x1);//11
		System.out.println("y1=" + y1);//11
		System.out.println("=======================================");
		/*
			当int y2 = x2 ++;
				++后缀时，表示x2先递增
				但是取出的值是x2的原始赋值（10）,再去做运算
				
		*/
		int x2 = 10;
		int y2 = x2 ++;
		System.out.println("x2=" + x2);//x2 = 10自增 = 11
		System.out.println("y2=" + y2);//y2 = 10，还没自增 = 10


	}
}
