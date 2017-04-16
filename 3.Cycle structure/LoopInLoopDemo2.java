public class LoopInLoopDemo2 
{
	public static void main(String[] args) 
	{
		/*   输出一个矩形团
				*****
				*****
				*****
		*/
		//第一行
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");	
		System.out.print("*");
		System.out.println();
		//第二行
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");	
		System.out.print("*");
		System.out.println();
		//第三行
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");	
		System.out.print("*");
		System.out.println();
		System.out.println("--------------------------------");
		
			for (int j = 0;j <3 ;j++ )
			{
					for (int i = 0;i <=5 ;i++)
					{
						System.out.print("$");
						
					}
					System.out.println();
			}

		//输出一个三角形
		System.out.println("^");
		System.out.println("^^");
		System.out.println("^^^");
		System.out.println("^^^^");
		System.out.println("^^^^^");
		
		for (int a = 0;a <1 ;a++ ){
			System.out.print("!");
			}
		System.out.println();
		for (int a = 0;a <2 ;a++ ){
			System.out.print("!");
			}
		System.out.println();
		for (int a = 0;a <3 ;a++ ){
			System.out.print("!");
			}
		System.out.println();
		for (int a = 0;a <4 ;a++ ){
			System.out.print("!");
			}
		System.out.println();
		for (int a = 0;a <5 ;a++ ){
			System.out.print("!");
			}
		System.out.println();
		System.out.println("--------------------------------");
		
		for (int line = 0;line <=5 ;line++ )
		{
		
			for (int z = 0;z < line ;z++ )
				{
				System.out.print("@");
				}
			System.out.println();
		}
		
		}
}
