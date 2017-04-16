//LogicalOperaDemo
public class LogicalOperaDemo 
{
	public static void main(String[] args) 
	{
		//&操作 都为true是才为true
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & true);
		System.out.println(false & false);

		//System.out.println(false & (1 / 0 == 0));//报错，(1 / 0 == 0)执行了，短路，&不具有短路效果
		
		//&&操作 都为true是才为true
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		System.out.println(false && (1 / 0 == 0));//没报错，(1 / 0 == 0)没执行，没有短路，&&具有短路效果

		//|操作 一个为true，就才为true。没有短路功能
		System.out.println(true | true);
		System.out.println(true | false);
		System.out.println(false | true);
		System.out.println(false | false);

		//||操作 一个为true，就才为true。具有短路功能
		
		System.out.println(true || true);
		System.out.println(true ||false);
		System.out.println(false || true);
		System.out.println(false || false);

		System.out.println(!!!!!false);//单反，双不变

	}
}
