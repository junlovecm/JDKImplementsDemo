package io.Decorator;

public class Decorator implements Component {
	public Component component;
	public Decorator(Component component) {
		this.component = component;
	}
	@Override
	public void CarBrand() {
		this.component.CarBrand();
	}
	@Override
	public void CarType() {
		this.component.CarType();
	}
	//增加被修饰类之外方法
	public void CarRmoule() {
		System.out.println("改造中...");
	}
}
