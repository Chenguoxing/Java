//最常用的引用类型：String
public class StringDemo
 
{
	public static void main(String[] args) 
	{
		//表示名字陈国兴
		String a="陈国兴";
		System.out.println("我的名字：" + a);//  '+'连接
		
		int age = 20;
		System.out.println("我的年龄：" + age);

		//转译符号练习，输出：“你好世界”
		System.out.println("\"你好世界！\"");

		System.out.println(7 + 8 + "Hello");//结果是：15Hello
		System.out.println(7 +  "Hello" + 8);//结果是：7Hello8
		System.out.println("Hello" + 7 + 8);//结果是："Hello7" + 8 = Hello78

		//int xx = "ABC";  //错误：不兼容的类型，String类无法转换为int类

	}
}
