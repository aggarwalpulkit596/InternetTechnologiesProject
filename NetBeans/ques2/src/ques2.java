class Prime
{
public static void main(String args[])
{
int n,i=2;
n=Integer.parseInt(args[0]);
while(i<n)
{
if(n%i==0)
{
i+=n;
}
i++;
}
if(i>n)
{
System.out.println(n+" is not a Prime No.");
}
else
{
System.out.println(n+" is a Prime No.");
}
}
}
