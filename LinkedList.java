package Min.Project_2141019056;

import java.util.Scanner;

public class LinkedList {
	Node start;
	
	void create()
	{
		Scanner sc= new Scanner(System.in);
		Node p=new Node();
		System.out.println("Enter a value.");
		p.info=sc.nextInt();
		p.link=null;
		start=p;
		
		System.out.println("Add one more? 1-yes");
		int op=sc.nextInt();
		while(op==1)
		{
			Node q =new Node();
			System.out.println("Enter a value");
			q.info=sc.nextInt();
		    q.link=null;
			p.link=q;
			p=q;
			System.out.println("Add one more? 1-yes");
			op=sc.nextInt();
		}
		
		
	}
	
	void display()
	{
		Node temp;
		temp=start;
		while(temp!=null)
		{
			System.out.print(temp.info+"---->");
			temp=temp.link;
		}
	}
	
	
	int find2ndMax() 
    {
        if (checkNotNull() & checkNotSingle() & checkNotUniValue())
        {
            int largest=start.info , second = 0;
            Node temp = start.link;
            while(temp!=null)
            {
                if (temp.info > largest)
                {
                    second = largest;
                    largest = temp.info;
                }
                temp = temp.link;
            }
            return second;
        }
        System.out.print("Return 0 because 2nd largest can't be found! - ");  
        return 0;
    }
	
	void search(int n)
    {
        if (checkNotNull())
        {
            Node temp = start;
            int i=1;
            System.out.print(n+" is present in Nodes(position): [");
            while(temp!=null)
            {
                if (temp.info==n)
                    System.out.print(i+",");
                i++;
                temp = temp.link;
            }
            System.out.println("]");
        }
    }
	
    void removeDuplicate()
    {
        if (checkNotNull() & checkNotSingle())
        {
            Node temp1 = start;
            Node temp2;
            while(temp1!=null)
            {
                temp2 = temp1;
                while (temp2.link!=null)
                {
                    if (temp2.link.info == temp1.info)
                    {
                        temp2.link = temp2.link.link;
                    }
                    else
                        temp2 = temp2.link;
                     //if (temp2==null)
                    //     break;
                }
                temp1 = temp1.link;
            }
        }
    }
    
    int countUnique()
    {
        if (checkNotNull())
        {
            if (checkNotSingle())
            {
                boolean[] arr = new boolean[count()];
                int count=0, i=0,j=0;
                Node temp1 = start;
                Node temp2;
                while (temp1!=null)
                {
                    temp2 = temp1;
                    while(temp2!=null)
                    {
                        if (i==j && arr[j]==false){
                            arr[j]=true;
                            count++;
                        }
                        if (temp1.info==temp2.info && arr[j]==false){
                            arr[j]=true;
                        }
                        j++;
                        temp2 = temp2.link;
                    }
                    i++;
                    j=i;
                    temp1 = temp1.link;
                }
                return count;
            }
            return 1;
        }
        return 0;
    }




























/*
--------------------------------------------------------------------------------------------------------
        Other Methods, that were required
*/

//Needed in countUnique()
int count()
  {
	Node temp;
	temp=start;
	int c=0;
	while(temp!=null)
	{
		c=c+1;
		temp=temp.link;
	}
	return c;
	
  }

//Needed in all methods except create()
boolean checkNotNull()
{
    if (start==null)
    {
        System.out.println("THE LINKED LIST IS EMPTY");
        return false;
    }
    return true;
}

//Needed in find2ndMax(), removeDuplicate() & countUnique()
boolean checkNotSingle()
{
    if (start.link == null)
    {
        System.out.println("THIS LIST HAS ONLY SINGLE NODE");
        return false;
    }
    return true;
}

//Needed in find2ndMax()
boolean checkNotUniValue()
{
    Node temp = start;
    while (temp.link!=null)
    {
        if (temp.info!=temp.link.info)
            return true;
        temp = temp.link;    
    }
    return false;
}
}























