package io.Adapter;

public class Wrapper implements Targetable {
	private Adaptee source;
	public Wrapper(Adaptee source) {
		super();
		this.source = source;
	}

	//适配器将Adaptee被适配方法扩展到目标接口类中
	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");  
	}

}
