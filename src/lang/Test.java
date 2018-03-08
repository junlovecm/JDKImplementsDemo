package lang;

import java.lang.annotation.Annotation;
/**
author:cj
*/
@City(value = { "����", "�人", }, username = "CJ")
@UserInfo(age = 28, sex = UserInfo.SexEnum.��, username = "CJ", data = "2017.9.2 15:03")
public class Test {

	public static void main(String[] args) {
		Annotations();
	}

	public static void Annotations() {
		try {
			Class<?> c = Class.forName("lang.UserInfo");
			Annotation ann[] = c.getAnnotations() ; // ȡ��ȫ����Annotation  
	        for(Annotation a:ann){  // ���  
	            System.out.println(a) ;  
	        } 
			UserInfo u = c.getAnnotation(UserInfo.class);
			System.out.println(u.age() + " "+ u.username() + " "+ u.sex());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
