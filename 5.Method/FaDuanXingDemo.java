//发短信
public class FaDuanXingDemo 
{
	//返回结果
	/*	0：发送成功
		1：发送失败
		2：发送中
	*/

	static int sendMsg(String tel,String content)
	{
		System.out.println("给"+tel+"，发送："+content);
		System.out.print(" ");
		return 0;
	}

	public static void main(String[] args) 
	{
		int ret = sendMsg("10086","我喜欢10010。");
			ret = sendMsg("110","我是小偷哦。");
		//.............
		System.out.println(ret);
	}
}
