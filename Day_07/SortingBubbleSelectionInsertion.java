package for_DSA;

class Stud { 
	  private int rno;
	  private String name;
	  private int age;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Stud(int rno, String name, int age) {
		super();
		this.rno = rno;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Stud [rno=" + rno + ", name=" + name + ", age=" + age + "]";
	}
	  
}


public class SortingBubbleSelectionInsertion {
    
	public static void Bubble_sort(int arr[],int n)
	{
	  int i,j,t;
	  int flag = 1;

	  for(i=n-1;((i>=0)&&(flag==1));i--)
	  {
	    flag=0;
	    for(j=0;j<=i-1;j++)
	    {
	     if(arr[j] > arr[j+1])
	     {
	       flag=1;
	       t=arr[j];
	       arr[j] = arr[j+1];
	       arr[j+1] = t;
	     }
	    }
	    if(flag==0)
	       break;
	    System.out.println("\n pass" + i +"  ");
	    display(arr,n);
	  }
	}
	
	public static void Bubble_sort_Stud(Stud arr[],int n)
	{
	  int i,j;
	  Stud t;
	  int flag = 1;

	  for(i=n-1;((i>=0)&&(flag==1));i--)
	  {
	    flag=0;
	    for(j=0;j<=i-1;j++)
	    {
	     if(arr[j].getAge() > arr[j+1].getAge())
	     {
	       flag=1;
	       t=arr[j];
	       arr[j] = arr[j+1];
	       arr[j+1] = t;
	     }
	    }
	    if(flag==0)
	       break;
	   
	  }
	}
	
	public static void selectionSort(int []arr, int n)
	{
		int i,j,t,min;   

		  for(i=0;i < n-1;i++)
		  {
		    min = i;
		    for(j=i+1; j<n ;j++)
		    {
		      if(arr[min] > arr[j])  min=j;
		    }
		    if(i!=min)
		    {
		       t=arr[i];
		       arr[i]=arr[min];
		       arr[min]=t;
		    }
		    System.out.println("\n pass" + i +"  ");
		    display(arr,n);
		  }
	}
  
	public static void insertion_sort(int arr[],int n) {
		int i,j,k;
		for(i=1; i<n; i++) // starts from 2nd array element
		{
		k=arr[i]; /*k is to be inserted at proper place*/
		for(j=i-1; j>=0 && k<arr[j]; j--)//looks at lower part of arr
		arr[j+1]=arr[j];
		arr[j+1]=k;
		}
	}
	
	
	
	public static void display(int []arr, int n)
	{
		int i;
		System.out.println();
		for(i=0;i<n;i++)
			System.out.print(arr[i] + "  ");
	}
	
	public static void display_stud(Stud []arr,int n)
	{
		int i;
		System.out.println();
		for(i=0;i<n;i++)
			System.out.println(arr[i] + "  ");
			
	}
	
	public static boolean isSorted(int []arr,int n)
	{
		if(n == 1)  return true;
		return(arr[n-1] < arr[n-2])?false:isSorted(arr,n-1);
	}
	
	public static void main(String[] args) {
	/*	int arr[] = {12,20,15,30,50,35,22,70,55,60};
		//Bubble_sort(arr,10);
		//selectionSort(arr,10);
		System.out.println(isSorted(arr,10));
		if(isSorted(arr,10))
        	System.out.println("Sorted");
        else
        	System.out.println("Not Sorted");
		
		insertion_sort(arr,10);
		System.out.println("\n After Sort :");
        display(arr,10);
        if(isSorted(arr,10))
        	System.out.println("Sorted");
        else
        	System.out.println("Not Sorted");*/
        	
		Stud arr[] = new Stud[5];
		arr[0] = new Stud(10,"Jitesh",25);
		arr[1] = new Stud(11,"Mayur",20);
		arr[2] = new Stud(16,"Jyoti",22);
		arr[3] = new Stud(15,"Pooja",21);
		arr[4] = new Stud(20,"Rajesh",24);
		
		Bubble_sort_Stud(arr,5);
		display_stud(arr,5);
		
		
	}

}
