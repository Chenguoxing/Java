public class  LoopInLoopDemo
{
	public static void main(String[] args) 
	{
		//现在Boss要让师徒四人都从1数到一百
			/*for (int i = 1;i <= 100 ;i++ )
			{
				System.out.println(i);
			}
			System.out.println("------------------------------------");
			for (int i = 1;i <= 100 ;i++ )
			{
				System.out.println(i);
			}
			System.out.println("------------------------------------");
			for (int i = 1;i <= 100 ;i++ )
			{
				System.out.println(i);
			}
			System.out.println("------------------------------------");
			for (int i = 1;i <= 100 ;i++ )
			{
				System.out.println(i);
			}
		*/
		//嵌套循环
		for (int count = 1;count <= 4;count++)
		{
				for (int i = 1;i <= 10 ;i++)
				{
					System.out.println(i);
					
				}
					System.out.println("------------------------------------");
		}
		//嵌套for循环优化实例
		/*
				for(int i = 0;i<1000;i++){
					for (int j = 0;j<100){
						for (int k = 0;k<10;k++){
							循环体
						}
					}
				}

				优化
				int i,j,k;
				for(int i = 0;i<10;i++){
					for (int j = 0;j<100){
						for (int k = 0;k<1000;k++){
							循环体
						}
					}
				}
		*/

	}
}
