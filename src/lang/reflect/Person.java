package lang.reflect;

public class Person {
	private String name = "CJ";

	public Person() {
		System.out.print("Peson����޲ι��췽��,name="+name +"...");
	}
	public Person(String name) {
		this.name = name;
		System.out.print("Peson��Ĵ��ι��췽��,name="+this.name+"...");
	}
	@Override
	public String toString() {
		return "Peson���toString()����...";
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
