package ÄÚ²¿Àà;

public class OutClass {
	public int aOut;
	public class InnerClass {
		public int aInner;
		public void print() {
			System.out.println("Inner");
		}
	}
	
	public static class InnerStaticClass {
		public int aInnerStatic;
		public static void print() {
			System.out.println("Inner");
		}
	}
	public void print(){
		InnerStaticClass a = new InnerStaticClass();
		System.out.println(a.aInnerStatic);
		InnerStaticClass.print();
	}
}
