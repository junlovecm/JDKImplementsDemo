package lang;

/**
 * 
 * �� �� City Annotation 
 */
public @interface City {
	String username() default "������";
	String[] value();
}
