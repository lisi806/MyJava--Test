﻿package static测试;

public class VariantTest
{
		public static int staticVar = 0; 
		public int instanceVar = 0; 
		public VariantTest()
		{
			staticVar++;
			instanceVar++;
			System.out.println("staticVar=" + staticVar + ",instanceVar=" + instanceVar);
		}
		public static void main(String []args){
			VariantTest v = new VariantTest();
			
		}
		
}
