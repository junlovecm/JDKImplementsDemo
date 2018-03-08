package lang.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		System.out.println("*1 Class newInstance(),调用类默认无参构造函数 实例化类对象*");
		Class<?> defalutClazz = Class.forName("lang.reflect.Person");
		Object defalutObj = defalutClazz.newInstance();
		System.out.println(defalutObj);
		System.out.println("*2 Constructor newInstance(参数值),调用类带参构造函数实例化类对象*");
		Class<?> clazz = Class.forName("lang.reflect.Person");
		Constructor<?> constu = clazz.getConstructor(String.class);
		//Constructor<?> cons[] = clazz.getConstructors();//or get all constructors
		Object constuObj = constu.newInstance("CJ-Constructor");
		System.out.println(constuObj);
		System.out.println("*3 Method 反射调用类中的方法*");
		Method _setName = clazz.getMethod("setName",String.class);
		_setName.invoke(defalutObj, "CJ-setName");
		Method getNameMethod = clazz.getMethod("getName");
		getNameMethod.invoke(defalutObj);
		Method msetNameMethod = defalutObj.getClass().getDeclaredMethod("setName",String.class);
		msetNameMethod.invoke(defalutObj,"CJ-setName");
		Method mgetNameMethod = defalutObj.getClass().getDeclaredMethod("getName", new Class<?>[0]);
		mgetNameMethod.invoke(defalutObj);
		System.out.println("*4 Field类-设置/获取属性内容*");
		Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(defalutObj, "CJ-Field");
        System.out.print(nameField.get(defalutObj));
	}
}