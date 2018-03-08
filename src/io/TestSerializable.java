package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;

public class TestSerializable implements Serializable {
	private static final long serialVersionUID = 1L;
	public static String staticVar = "static";
	public String name = "cj";
	private static ObjectInputStream oin1;
	private static ObjectInputStream oin2;

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//		staticFiledTest();
//		saveRule();
	}

	public static void saveRule() throws FileNotFoundException, IOException, ClassNotFoundException{
		// 2序列化存储规则:同对象只保存一次
		ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("result2.obj"));
		TestSerializable testS = new TestSerializable();
		testS.setName("1");
		out.writeObject(testS);
		out.flush();
		System.out.print(new File("result2.obj").length() +" ");
		testS.setName("2");
		out.writeObject(testS);
		System.out.print(new File("result2.obj").length()+" ");
		out.close();
		oin2 = new ObjectInputStream(new FileInputStream("result2.obj"));
		TestSerializable t1 = (TestSerializable) oin2.readObject();
		TestSerializable t2 = (TestSerializable) oin2.readObject();
		System.out.print(t1 == t2);
		System.out.println(" " +t1.getName() +" " + t2.getName());
	}
	public static void staticFiledTest() throws FileNotFoundException,
			IOException {
		TestSerializable t;
		try {
			// 1 static不保存至序列化文件内
			TestSerializable m = new TestSerializable();
			m.setName("cm");
			// 初始时staticVar为5
			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream("result.obj"));
			out.writeObject(m);
			out.close();
			// 序列化后修改为10
			TestSerializable mupdage = new TestSerializable();
			mupdage.staticVar = "staticUpdate";
			mupdage.setName("cmUpdate");
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream(
					"result.obj"));
			t = (TestSerializable) oin.readObject();
			oin.close();
			System.out.println(t.staticVar + " " + t.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
