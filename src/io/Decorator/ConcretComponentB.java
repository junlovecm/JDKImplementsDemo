package io.Decorator;

public class ConcretComponentB implements Component{
	@Override
	public void CarBrand() {
		System.out.print("���:");
	}

	@Override
	public void CarType() {
		System.out.println("��ͨ");
	}
}
