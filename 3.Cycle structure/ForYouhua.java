//For 优化实例
{
	public static void testFunction(int i, int j, int k) {  
        System.out.print("");   // 注：该方法不影响整体优化，这里只有简单输出  
		
    }  
  
    public static void testA() {  
        long start = System.nanoTime();  
        for (int i = 0; i < 1000; i++)  
            for (int j = 0; j < 100; j++)  
                for (int k = 0; k < 10; k++)  
                    testFunction(i, j, k);  
        System.out.println("testA time>>" + (System.nanoTime() - start));  
    }  
  public class ForYouhua 

    public static void testB() {  
        long start = System.nanoTime();  
        for (int i = 0; i < 10; i++)  
            for (int j = 0; j < 100; j++)  
                for (int k = 0; k < 1000; k++)  
                    testFunction(k, j, i);  
        System.out.println("testB time>>" + (System.nanoTime() - start));  
    }  
  
    public static void testC() {  
        long start = System.nanoTime();  
        int i;  
        int j;  
        int k;  
        for (i = 0; i < 10; i++)  
            for (j = 0; j < 100; j++)  
                for (k = 0; k < 1000; k++)  
                    testFunction(k, j, i);  
        System.out.println("testC time>>" + (System.nanoTime() - start));  
}  
	
}
