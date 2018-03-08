package lang;

/**
 * 
 * 描   述 UserInfo Annotation
 * 说   明 Annotation中可以定义的属性类型只能是基本类型、String、enum、Class及上述类型的一维数组类型
 * 开发者 C.J
 * 日    期 2018年2月8日上午11:30:04
 */
public @interface UserInfo {
	String username();
	String data() default "2017年9月2日";//default关键字为属性设置默认值
	int age();
	SexEnum sex();
	public static enum SexEnum {
		男,女,其他
	}
}
