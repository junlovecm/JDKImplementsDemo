package io.Adapter;

/**
 * ������ģʽ�ĺ���:�����Ա�����Adaptee��ɫ���еĽӿ�ת��ΪĿ���ɫTargetƥ��Ľӿڡ� ��Adaptee�Ľӿ���Target�ӿڽ�������.
 */
public class Adapter extends Adaptee implements Targetable {

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}

}
