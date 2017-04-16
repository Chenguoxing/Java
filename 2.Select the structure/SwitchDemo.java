//Switch
public class SwitchDemo 
{
	public static void main(String[] args) 
	{
		int today = 3;
		//判断today的不同结果值，输出不同的值
		/*
			语法结构如下：
			switch (   )
			{
				case 1: System.out.println("星期一");break;
				case
				case
				case
				case

				default : System.out.println("");
			}
			*/
		switch (today)
		{

		case 1: System.out.println("星期一");break;
		case 2: System.out.println("星期二");break;
		case 3: System.out.println("星期三");//break;
		//输出，周三周四，说明switch遇到入口就进入。除非break或者return
		case 4: System.out.println("星期四");break;
		case 5: System.out.println("星期五");break;
		case 6: System.out.println("星期六");break;
		case 7: System.out.println("星期日");break;
		default : System.out.println("傻逼，没有这一天");
		
		}
		//switch 整数类型byte char short int ，但是没有long。
		char c = 'C';
		switch (c)
		{
		case 'A':System.out.println("AA");break;
		case 'B':System.out.println("BB");break;
		case 'C':System.out.println("CC");break;
		default : System.out.println("脑残");
		
		}
		System.out.println("--------------------------");
		//java7开始支持String
		String  ch = "A";
		switch (ch)
		{
		case "A":System.out.println("AA");break;
		case "B":System.out.println("BB");break;
		case "C":System.out.println("CC");break;
		default : System.out.println("脑残");
		System.out.println("Hello World!");
		}
		System.out.println("--------------------------");
		//判断是休息日还是工作日
		int riqi = 6;
		switch (riqi)
		{

		case 1:
		case 2: 
		case 3:
		case 4: 
		case 5:
			System.out.println("工作日");
		break;
		case 6:
		case 7: 
			System.out.println("休息日");
		break;
		default : System.out.println("傻逼，没有这一天");
		
		}
//对于所有条件语句，if都能 可以
//switch 只能用于结果为数值判断情况
//结果如果为Boolean类型，switch不能用
//当if中出现数值是switch会更简单
	}
}
