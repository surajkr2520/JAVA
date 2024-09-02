
public class Student {
	String name;
	int rn;
	public Student(int r,String n)
	{
		rn=r;
		name=n;
	}
	public Student() {
		
	}
	public void set(String name,int rn) {
		this.name = name;
		this.rn = rn;
	}
	
	public void get() {
		System.out.println(name+rn);
		
	}
	
	
	  


class q20
{
	public static void main(String[]args)
		{
			
			Student s1=new Student();
			Student s2=new Student();
			//s.set(suraj, 12);
		}
}}
