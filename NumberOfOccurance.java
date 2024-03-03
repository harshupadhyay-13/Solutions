/******************************************************************************
WAP count number of occurance of given element.
*******************************************************************************/
import java.util.Scanner;
public class NumberOfOccurance
{
    static int countOcurranceX(int[] arr, int x){
		    int count =0;
		    for(int i=0;i<arr.length;i++){
		        if(arr[i]==x){
		            count++;
		        }
		    }
		    return count;
		}    
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Size of The Array:");
		int n=sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("enter "+n +" elements:");
		for(int i=0;i<arr.length;i++){
		    arr[i] =sc.nextInt();
		}
		System.out.println("Enter x:");
		int x =sc.nextInt();
		System.out.println("Count of occurance:"+ countOcurranceX(arr,x));
	}
}
