package comprator;
import java.util.*;


public class test {

	public static void main(String[] args) {
		ArrayList<Student> arr=new ArrayList<Student>();
		arr.add(new Student(15,45,"mayank"));
		arr.add(new Student(6,55,"ramesh"));
		Iterator<Student> i=arr.iterator();
		
		while(i.hasNext())
		{
			
			i.next().display();	
		}
		ageComperator c1=new ageComperator();
		Collections.sort(arr,c1);
		Iterator<Student> i2=arr.iterator();
		
		while(i2.hasNext())
		{
			
			i2.next().display();	
		}
		
	}

}
class Student
{
	int roll;
	int age;
	String name;
	Student(int r,int g,String n)
	{
		roll=r;
		age=g;
		name=n;
	}
	void display()
	{
		System.out.println("Roll no is "+roll);
		System.out.println("Age is ="+age);
		System.out.println("Name is "+name);
	}
}
class rollComperator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		if(s1.roll>s2.roll) return 1;
		else if(s1.roll<s2.roll)return -1;
		else return 0;
	}
}
class ageComperator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		if(s1.age>s2.age)return 1;
		else if(s1.age<s2.age)return -1;
		else return 0;
	}
}
class nameComperator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		return s1.name.compareTo(s2.name);
	}
}