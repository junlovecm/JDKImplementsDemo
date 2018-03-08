package lang.reflect;

public class Person {
	private String name = "CJ";

	public Person() {
		System.out.print("Peson类的无参构造方法,name="+name +"...");
	}
	public Person(String name) {
		this.name = name;
		System.out.print("Peson类的带参构造方法,name="+this.name+"...");
	}
	@Override
	public String toString() {
		return "Peson类的toString()方法...";
	}

	public String getName() {
		System.out.println("Peson getName="+this.name+"...");
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.print("Peson setName="+this.name+"...");
	}
	
}
