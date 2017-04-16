//分支语句，If的第一种结构
public class IfDemo 
{
	public static void main(String[] args) 
	{
		//如果你是男的，就去男厕所
		boolean   isMan = true;

		/*
			if(isMan == true) //判断是否为男的 
			{
				System.out.println("就去男厕所");
			}
		*/	
		if(isMan) //判断是否为男的 
			{
				System.out.println("就去男厕所");
			}	
		System.out.println("就去女厕所");
	}

}
