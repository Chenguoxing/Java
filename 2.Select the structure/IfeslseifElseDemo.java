public class IfeslseifElseDemo 
{
	public static void main(String[] args) 
	{·
		int score = 15;//分数
		/*	if (score >= 90)
			{
				System.out.println("优");
			}
			if (score >= 80 && score <90)
			{
				System.out.println("良");
			}
			if (score >= 70 && score < 80)
			{
				System.out.println("中");
			}else{
				System.out.println("多多努力");
		*/
		//等价于上面的 &&  ==  else if
		if (score >= 90)
			{
				System.out.println("优");
			}
			else if (score >= 80)
			{
				System.out.println("良");
			}
			else if (score >= 70)
			{
				System.out.println("中");
			}else{
				System.out.println("多多努力");
			}
			System.out.println("---------------------");
			//星期判断
			int today = 2;
			if (today == 1)
			{
				System.out.println("星期一");
			}
			else if(today == 2)
			{
				System.out.println("星期二");
			}
			else if(today == 3)
			{
				System.out.println("星期二");
			}
			else if(today == 4)
			{
				System.out.println("星期四");
			}
			else if(today == 5)
			{
				System.out.println("星期五");
			}
			else if(today == 6)
			{
				System.out.println("星期六");
			}
			else if(today == 7)
			{
				System.out.println("星期日");
			}
			else 
			{	
				System.out.println("亲，没有这一天");
			}
	}
		
}
