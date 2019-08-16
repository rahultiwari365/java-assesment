import java.util.*;
import java.lang.*;
import java.io.*;

class assesment 
{ 
static void digit(int x, int prime[]) 
{ 
    prime[0] = prime[1] = 1; 
  
    for (int i = 2; i * i <= x; i++)  
    { 
        if (prime[i]==0) 
        { 
            for (int j = 2 * i;j<=x; j+=i) 
                prime[j] = 1; 
        } 
    } 
} 
  
static int digitSum(int n) 
{ 
    int sum = 0; 
    while (n > 0)  
    { 
        sum += n % 10; 
        n = n / 10; 
    } 
    return sum; 
} 
  
static void printSumPrime(int arr[], int n) 
{ 
  
    int maxEle = Arrays.stream(arr).max().getAsInt(); 
  
    int prime[] = new int[maxEle + 1];
 
    digit(maxEle, prime); 
  
    for (int i = 0; i < n; i++)  
    { 
  
        if (prime[arr[i]] == 0)  
        { 
            int sum = digitSum(arr[i]); 
  
            if (prime[sum] == 0) 
                System.out.print(arr[i]+" "); 
        } 
    } 
} 

public static void main(String[] args) {
	int arr[] = {2,4,6,11,12,18,7,21,23,31};
	
	int x=arr.length;	

	printSumPrime(arr,x);
	}
}
 