package com.company;
import java.util.Arrays;

public class Main {
	static int combo(Integer[] arr,int i,int n, int sum){
		if (n==0)
			return sum;
		if(i == 0)
			return -1;
		if(arr[i]>n)
			return combo(arr,i-1,n,sum);

		else{
			int minnum1=combo(arr,i,n-arr[i],sum+1);
			int minnum2=combo(arr,i-1,n,sum);
			if(minnum1==-1)
				return minnum2;
			else if(minnum2==-1)
				return minnum1;
			else if (minnum1<minnum2)
				return minnum1;
			else
				return minnum2;
		}
	}

    public static void main(String[] args) {
	Integer [] arr={7,3,11,16};
	int n=53;
	Arrays.sort(arr);
		int min=combo(arr, arr.length-1, n,0);
		System.out.println(min);
    }
}
