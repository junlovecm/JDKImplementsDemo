package io.Decorator;

public class ConcreteDecorator extends Decorator {
	public ConcreteDecorator(Component component) {
		super(component);
	}
	public void CarBrand() {
		this.component.CarBrand();
	}
	public void CarType() {
		this.component.CarType();
	}
	public void CarRmoule() {
		System.out.println("º”»Î ÃÏ¥∞...");
	}
}
