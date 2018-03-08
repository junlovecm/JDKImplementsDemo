package io.Decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		Decorator decorator = new ConcreteDecorator(new ConcretComponent());
		//调用被装饰类具体子ConcretComponent方法
		decorator.CarBrand();
		decorator.CarType();
		//装饰类新增方法
		decorator.CarRmoule();
		Decorator decorator_ = new ConcreteDecorator(new ConcretComponentB());
		decorator_.CarBrand();
		decorator_.CarType();
		decorator.CarRmoule();
		
		System.out.println("****************************");
		Component component = new ConcreteDecorator(new ConcretComponent());
		//调用被装饰类具体子ConcretComponent方法
		component.CarBrand();
		component.CarType();
		Component componentB = new ConcreteDecorator(new ConcretComponentB());
		componentB.CarBrand();
		componentB.CarType();
	}
}
