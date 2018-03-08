package io.Decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		Decorator decorator = new ConcreteDecorator(new ConcretComponent());
		//���ñ�װ���������ConcretComponent����
		decorator.CarBrand();
		decorator.CarType();
		//װ������������
		decorator.CarRmoule();
		Decorator decorator_ = new ConcreteDecorator(new ConcretComponentB());
		decorator_.CarBrand();
		decorator_.CarType();
		decorator.CarRmoule();
		
		System.out.println("****************************");
		Component component = new ConcreteDecorator(new ConcretComponent());
		//���ñ�װ���������ConcretComponent����
		component.CarBrand();
		component.CarType();
		Component componentB = new ConcreteDecorator(new ConcretComponentB());
		componentB.CarBrand();
		componentB.CarType();
	}
}
