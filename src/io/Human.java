package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Human implements Serializable {
	private static final long serialVersionUID = 1L;
	private int username;
	private transient String password;

	public Human(int username, String password) {
		this.username = username;
		this.password = "transient " + password;
	}

	@Override
	public String toString() {
		return username + "\n" + password;
	}

	public static void main(String[] args) throws Exception {
		Human human = new Human(1, "123");
		System.out.println("before: \n" + human);
		ByteArrayOutputStream buff = new ByteArrayOutputStream();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(buff);
		objectOutputStream.writeObject(human);
		
		ObjectInputStream objectInputStream = new ObjectInputStream(
				new ByteArrayInputStream(buff.toByteArray()));
		Human human2 = (Human) objectInputStream.readObject();
		System.out.println("after: \n" + human2);
	}
	
	//transient 字段必须在程序中明确保存和恢复,才可以反序列化获取
	private void writeObject(ObjectOutputStream outputStream)
			throws IOException {
		System.out.println(" human writeObject");
		outputStream.defaultWriteObject();
		outputStream.writeObject(password);
	}
	private void readObject(ObjectInputStream inputStream)
			throws ClassNotFoundException, IOException {
		System.out.println(" human readObject");
		inputStream.defaultReadObject();
		password = (String) inputStream.readObject();
	}
}
