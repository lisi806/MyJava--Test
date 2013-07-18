package 继承;

import 继承.inner.Super;

public class Asuper extends Super{
	Asuper parent;
	int a;
	public Asuper(){
		parent = Asuper.this;
	}
	
	protected void doSome(){
		System.out.println("Asuper!!");
	}
}
