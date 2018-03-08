package io.Adapter;
import io.Adapter.InterFace.Adapter1;
import io.Adapter.InterFace.Adapter2;

//���������ģʽ Test
public class AdapterTest {

	public static void main(String[] args) {
		classAdater();
		System.out.println("***********************");
		classObjectAdater();
		System.out.println("***********************");
		interfaceObjectAdater();
	}
	
	//������ģʽ
	public static void classAdater(){
		Targetable target = new Adapter();  
        target.method1();  
        target.method2();
	}
	//���������ģʽ
	public static void classObjectAdater(){
		Adaptee source = new Adaptee();  
	    Targetable target = new Wrapper(source);  
	    target.method1();  
	    target.method2();
	}
    //�ӿ�����ģʽ
	public static void interfaceObjectAdater(){
		Adapter1 source1 = new Adapter1();
		source1.method1();  
        source1.method2();  
        Adapter2 source2 = new Adapter2();
        source2.method1();  
        source2.method2(); 
	}
}
