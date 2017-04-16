//AssigingOpeatDemo
public class AssigingOpeatDemo
{
	public static void main(String[] args) 
	{
		int age;
		age = 10;//赋值运算符，从右往左运算
		int x = 10;
		x +=5;//等价于：x = x + 5;
		System.out.println(x);

		/*
			AssigingOpeatDemo.java:13: 错误: 不兼容的类型: 从int转换到short可能会有损失
			/*short s = 123;
			s = s + 10; 
		*/
		short s = 123;
		s += 10;
		System.out.println(s);//133
	}
}
