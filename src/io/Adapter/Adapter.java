package io.Adapter;

/**
 * 适配器模式的核心:它将对被适配Adaptee角色已有的接口转换为目标角色Target匹配的接口。 对Adaptee的接口与Target接口进行适配.
 */
public class Adapter extends Adaptee implements Targetable {

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}

}
