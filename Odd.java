package aero;

import java.util.Scanner;

public class ThreeLetters
{  
public static void main(String args[]){  
int a[]={0,17,9,2,7,5};  

int even=0;
int odd =0;

for(int i=0;i<a.length;i++)
{  
if(a[i]%2!=0){  
odd++;
}  else
{
	even++;
}
}
System.out.println("Even Numbers:" +even);
System.out.println("Odd Numbers:" +odd);

}  
}  







