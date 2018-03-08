package io;
import java.util.LinkedList;
import java.util.List;

public class Student_Comparable implements Comparable<Student_Comparable> {
	private String name;
	private int age;
	private float score;

	public Student_Comparable(String name, int age, float score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String toString() {
		return name + ":" + age + ":" + score;
	}

	@Override
	public int compareTo(Student_Comparable o) {
		if (this.score > o.score)
			return -1;
		else if (this.score < o.score)
			return 1;// 由低到高排序
		else {
			if (this.age > o.age)
				return 1;// 由低到高排序
			else if (this.age < o.age)
				return -1;
			else
				return 0;
		}
	}
	
	public static void main(String[] args) {
		Student_Comparable stu[]={new Student_Comparable("zhangsan",20,90.0f),
                new Student_Comparable("lisi",22,90.0f),
                new Student_Comparable("wangwu",20,99.0f),
                new Student_Comparable("sunliu",22,100.0f)};
        java.util.Arrays.sort(stu);
        for(Student_Comparable s:stu)
        {
            System.out.println(s);
        }
        List<Student_Comparable> sList = new LinkedList<Student_Comparable>();
        sList.add(new Student_Comparable("zhangsan",20,90.0f));
        sList.add(new Student_Comparable("lisi",22,90.0f));
        sList.add(new Student_Comparable("wangwu",20,99.0f));
        sList.add(new Student_Comparable("sunliu",22,100.0f));
        java.util.Collections.sort(sList);
        for(Student_Comparable s:sList)
        {
            System.out.println(s);
        }
    }

}
