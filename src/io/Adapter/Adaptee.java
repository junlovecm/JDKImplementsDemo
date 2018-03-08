package io.Adapter;

//被适配角色（Adaptee)：定义一个已经存在并已经使用的接口，这个接口需要适配
public class Adaptee {
	public void method1() {
		System.out.println("this is original-Adaptee method!");
	}
}
