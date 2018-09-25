class Welcome{
public void entryPoint()
{
	System.out.println("This is the entry point.");
	Welcome ob=new Welcome();
	ob.middlePoint();
}
public void middlePoint()
{
System.out.println("This is the middle point.");


}
public static void main(String[] args)
{
	System.out.println("hello world");
	Welcome ob1=new Welcome();
	ob1.entryPoint();
	ob1.middlePoint();
	Exit ob2=new Exit();
	ob2.exitPoint();
	Exit1 ob3=new Exit1();
	ob3.exitPoint();
	
	
}
}
class Exit1{
public static void exitPoint()
{
	System.out.println("This is the exit point1.");
}
}



