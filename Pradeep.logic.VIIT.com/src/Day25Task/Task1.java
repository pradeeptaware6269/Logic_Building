package Day25Task;

public class Task1 {
	public void print(int n)
	{
		int i=0;
		int j=0;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	public void print1(int n)
	{
		int i=0;
		int j=0;
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void print2(int n)
	{
		int i=0;
		int j=0;
		for(i=0;i<n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	
	public void print3(int n)
	{
		int i=0;
		int j=0;
		for(i=0;i<n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	
	public void print4(int n)
	{
		int i=0;
		int j=0;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i+1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void print5(int n)
	{
		int i=0;
		int j=0;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i+1;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	
	public void print6(int n)
	{
		int i=0;
		int j=0;
		for(i=0;i<n;i++)
		{
			
			// for the spaces
			for(int k=0;k<n-i-1;k++)
			{
				System.out.print(" ");
				
			}
			
			// for the stars
			for(j=0;j<2*i+1;j++)
			{
				System.out.print("*");
			}
			
			// spaces
			for(int k=0;k<n-i-1;k++)
			{
				System.out.print(" ");	
			}
			
			System.out.println();
		}
	}
	
	
	public void print7(int n)
	{
		int i=0;
		int j=0;
		for(i=0;i<n;i++)
		{
			
			// for the spaces
			for(int k=0;k<=i;k++)
			{
				System.out.print(" ");
				
			}
			
			// for the stars
			for(j=1;j<=((2*n)-(2*i)-1);j++)
			{
				System.out.print("*");
			}
			
			// spaces
			for(int k=0;k<=i;k++)
			{
				System.out.print(" ");	
			}
			
			System.out.println();
		}
	}
	
	
	
	public void print8(int n)
	{
		int i=0;
		int j=0;
		for(i=0;i<n;i++)
		{
			
			// for the spaces
			for(int k=0;k<n-i-1;k++)
			{
				System.out.print(" ");
				
			}
			
			// for the stars
			for(j=0;j<2*i+1;j++)
			{
				System.out.print("*");
			}
			
			// spaces
			for(int k=0;k<n-i-1;k++)
			{
				System.out.print(" ");	
			}
			
			System.out.println();
		}
		
		for(i=0;i<n;i++)
		{
			
			// for the spaces
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
				
			}
			
			// for the stars
			for(j=1;j<=((2*n)-(2*i)-1);j++)
			{
				System.out.print("*");
			}
			
			// spaces
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");	
			}
			
			System.out.println();
		}
	}
	
	public void print9(int n) {
		
		int star=0;
		for(int i=0;i<2*n-1;i++)
		{
			if(i>n)
			{
			star=2*n-i;
			}
			else
			{
				star=i;
			}
			for(int j=1;j<star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	public void print10(int n) {
		int start=0;
	
		for(int i=0;i<n;i++)
		{
			if(i%2==0) start=1;
			else start=0;
			for(int j=0;j<i;j++)
			{
				System.out.print(start);
				start=1-start;
			}
			System.out.println();
		}
		
		
	}
	
	public void print11(int n)
	{
		int spaces=2*(n-1);
		for(int i=0;i<n;i++)
		{
			//numbers
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
					
			
			//spaces
			for(int j=1;j<spaces;j++)
			{
				System.out.print(" ");
			}
			
			///numbers
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
			spaces=spaces-2;
		}
	}
	
	public void print12(int n)
	{
		int count=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
	
	
	public void print13(int n)
	{
	
		for(int i=0;i<n;i++)
		{
			for(char j='A';j<='A'+ i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	
	public void print14(int n)
	{
	
		for(int i=0;i<n;i++)
		{
			for(char j='A';j<='A'+ (n-i-1);j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public void print15(int n)
	{
		char ch='A';
	for(int i=0;i<n;i++)
	{
		ch=(char) ('A'+ i);
		for(int j=0;j<=i;j++)
		{
			System.out.print(ch);	
		}
		System.out.println();
	}
	}
	
	public static void main(String[] args) {
		Task1 t=new Task1();
//		t.print(4);
//		System.out.println("----------------------");
//		t.print1(4);
//		System.out.println("----------------------");
//		t.print2(5);
//		System.out.println("----------------------");
//		t.print3(5);
//		System.out.println("----------------------");
//		t.print4(5);
//		System.out.println("----------------------");
//		t.print5(5);
//		System.out.println("----------------------");
//		t.print6(5);
//		System.out.println("----------------------");
//		t.print7(5);
//		System.out.println("----------------------");
//		t.print8(5);
		
//		System.out.println("----------------------");
//		t.print9(5);
//		System.out.println("----------------------");
//		t.print10(5);
		
//		System.out.println("----------------------");
// 		t.print11(5);
// 		System.out.println("----------------------");
// 		t.print12(5);
 		
// 		System.out.println("----------------------");
// 		t.print13(5);
		
//		System.out.println("----------------------");
// 		t.print14(5);
		
		System.out.println("----------------------");
 		t.print15(5);
		
		
	}

}
