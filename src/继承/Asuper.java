package ผฬณะ;

import ผฬณะ.inner.Super;

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
