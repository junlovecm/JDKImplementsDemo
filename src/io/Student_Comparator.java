package io;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Student_Comparator {
	private String name;
	private int age;
	private float score;

	public Student_Comparator(String name, int age, float score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public String toString() {
		return name + ":" + age + ":" + score;
	}

	protected static class StudentComparator implements Comparator<Student_Comparator> {
		@Override
		public int compare(Student_Comparator o1, Student_Comparator o2) {
			// TODO Auto-generated method stub
			if (o1.getScore() > o2.getScore())
				return -1;
			else if (o1.getScore() < o2.getScore())
				return 1;
			else {
				if (o1.getAge() > o2.getAge())
					return 1;
				else if (o1.getAge() < o2.getAge())
					return -1;
				else
					return 0;
			}
		}

	}

	public static void main(String[] args) {
		Student_Comparator stu[] = {
				new Student_Comparator("zhangsan", 20, 90.0f),
				new Student_Comparator("lisi", 22, 90.0f),
				new Student_Comparator("wangwu", 20, 99.0f),
				new Student_Comparator("sunliu", 22, 100.0f) };
		java.util.Arrays.sort(stu,new StudentComparator());
		for (Student_Comparator s : stu) {
			System.out.println(s);
		}
		List<Student_Comparator> sList = new LinkedList<Student_Comparator>();
		sList.add(new Student_Comparator("zhangsan", 20, 90.0f));
		sList.add(new Student_Comparator("lisi", 22, 90.0f));
		sList.add(new Student_Comparator("wangwu", 20, 99.0f));
		sList.add(new Student_Comparator("sunliu", 22, 100.0f));
		java.util.Collections.sort(sList,new StudentComparator());
		for (Student_Comparator s : sList) {
			System.out.println(s);
		}
	}

}
