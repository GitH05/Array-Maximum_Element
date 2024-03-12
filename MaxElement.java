//max elements in the array:
import java.util.Scanner;
class MaxElement
{
public static void main(String[] args)
{

int i,j,size;
Scanner s=new Scanner(System.in);
System.out.println("Size of the array:");
size=s.nextInt();
int a[] =new int[size];
for(i=0;i<size;i++)
{
a[i]=s.nextInt();
}
System.out.print("\nThe elements are:");
for(i=0;i<size;i++)
{
System.out.print(a[i]+" ");
}

int max=a[0];
for(i=0;i<size;i++)
{
if (a[i]>max)	//for maximum elements:
{
max=a[i];
}
}
System.out.println("\nMaximum number is: "+max);

}
}