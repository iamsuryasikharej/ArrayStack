import java.util.*;
class ArrayStack
{
	int top=-1;
	Object S[];
	int size;
	Object elem=new Object();

	ArrayStack(int size)
	{
	this.size=size;
	S=new Object[size];
	}

	public boolean isFull()
	{
	if ((top+1)==size)
		return true;
	else 
		return false;
}
	



	public boolean isEmpty()
	{
    if (top<0)
    	return true;
    else 
    	return false;
	}




	public void push(Object obj)throws Exception
	{
	if (isFull()==true)
	{throw new Exception("Stack Overflow");}
	else
	{
	top=top+1;
	S[top]=obj;
	//System.out.println("contents of stack");
	//f/or(int i=0;i<S.length;i++)
	//System.out.println(S[i]);
	operation();
	}
	
	}

	public Object pop()throws Exception
	{
	if (isEmpty()==true)
	{
		throw new Exception("Stack is empty");
	}
	else
		
	elem=S[top];		
	S[top]=null;
	top=top-1;
	return elem;
	}
	






	public void operation()
	{
		
		int x;
		System.out.println("enter 1 for inserting \nenter 2 to traverse");
		Scanner sc=new Scanner(System.in);
		 x=sc.nextInt();

		if (x==1)
		{
			System.out.println("enter the number you wnat to insert");
			Scanner sc1=new Scanner(System.in);
			int z=sc1.nextInt();		
			try{
			push(z);
		}
		
			catch (Exception e){
				System.out.println(e.getMessage());}
			
			}

		
		else if(x==2)
		{
			traverse();
		
		}
		else 
			{
				System.out.println("wrong entry");
			}
		
	}


	public void traverse()
	{
		System.out.println("traversed");
		for(int i=0;i<S.length;i++)

		{
			System.out.println(S[i]);
		}
		operation();
		
	}



}







class Example21
{
	public static void main(String[] args)
	{
		ArrayStack a= new ArrayStack(5);
		
		a.operation();
	}
	
}





