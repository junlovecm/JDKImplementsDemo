package io.Adapter;
import io.Adapter.InterFace.Adapter1;
import io.Adapter.InterFace.Adapter2;

//类的适配器模式 Test
public class AdapterTest {

	public static void main(String[] args) {
		classAdater();
		System.out.println("***********************");
		classObjectAdater();
		System.out.println("***********************");
		interfaceObjectAdater();
	}
	
	//类适配模式
	public static void classAdater(){
		Targetable target = new Adapter();  
        target.method1();  
        target.method2();
	}
	//类对象适配模式
	public static void classObjectAdater(){
		Adaptee source = new Adaptee();  
	    Targetable target = new Wrapper(source);  
	    target.method1();  
	    target.method2();
	}
    //接口适配模式
	public static void interfaceObjectAdater(){
		Adapter1 source1 = new Adapter1();
		source1.method1();  
        source1.method2();  
        Adapter2 source2 = new Adapter2();
        source2.method1();  
        source2.method2(); 
	}
}
