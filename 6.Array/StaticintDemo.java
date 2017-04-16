//数组的静态初始化
public class StaticintDemo
{
	public static void main(String[] args) 
	{
		//存储5个数
		int[] nums = new int[]{1,3,5,7,9};
		System.out.println("length="+nums.length);//数组长度（几个元素）
		//创建新的数组，并赋值给nums变量
		nums = new int[]{2,4,6};
		System.out.println("length="+nums.length);
	}
}
