public class Days{

public static void main(String ar[])throws Exception
{
String s1;
Scanner sc=new Scanner(System.in);
s1=sc.next();

 check(s1);
}
public static void check(String da)
{
if(da.equalsIgnoreCase("Sunday"))
{
System.out.println("false");}
else
System.out.println("true");
}
}
