package lang;

/**
 * 
 * ��   �� UserInfo Annotation
 * ˵   �� Annotation�п��Զ������������ֻ���ǻ������͡�String��enum��Class���������͵�һά��������
 * ������ C.J
 * ��    �� 2018��2��8������11:30:04
 */
public @interface UserInfo {
	String username();
	String data() default "2017��9��2��";//default�ؼ���Ϊ��������Ĭ��ֵ
	int age();
	SexEnum sex();
	public static enum SexEnum {
		��,Ů,����
	}
}
