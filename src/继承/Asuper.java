package ผฬณะ;

public class Asuper {
	Asuper parent;
	int a;
	public Asuper(){
		parent = Asuper.this;
	}
	
	protected void doSome(){
		System.out.println("Asuper!!");
	}
}
