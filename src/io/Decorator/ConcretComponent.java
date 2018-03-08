package io.Decorator;

public class ConcretComponent implements Component{
	@Override
	public void CarBrand() {
		System.out.print("±¦Âí:");
	}

	@Override
	public void CarType() {
		System.out.println("SUV");
	}

}
