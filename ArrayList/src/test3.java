import java.util.*;

class Student
{
	String name;
	int rn;
	int age;
	public Student(String n,int r,int a)
	{
		rn=r;
		name=n;
		age=a;
	}
	public void display() 
	{
		System.out.println("Name is "+name);
		System.out.println("Roll No is "+rn);
		System.out.println("Age is "+age);
	}
}

class rollComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'compare'");
	}
	
}

public class test3{

	public static void main(String[] args) {
		/* ArrayList<Student> AL=new ArrayList<Student>();
		AL.add(new Student("Pramtyush",12,20));
		AL.add(new Student("Bimky",14,3));
		AL.add(new Student("Anubhab",23,40));
		AL.add(new Student("Natis",34,5));
		AL.add(new Student("Mayank",40,60));
		AL.add(new Student("Suraj",19,1));
		
		//for(int i=0;i<AL.size();i++)
		//{
			//Student s=AL.get(i);
			//s.display();
		//}
		Iterator<Student> i=AL.iterator();
	    while(i.hasNext())
		{
			Student s=((Student) i.next());
			s.display();
		} */
		
	}}

