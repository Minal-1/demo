import java.lang.*; 
import java.util.*; 
class Break 
{ 
public static void main(String arg[]) 
{ 
int n,sum=0,i; 
Scanner sc = new Scanner(System.in); 
for(i=1;i<=10;i++) 
{ 
System.out.println("Enter a number :- "); 
n = sc.nextInt(); 
if(n>99) 
break;  
sum+=n; 
} 
System.out.println("Sum is:- " +sum); 
} 
}  