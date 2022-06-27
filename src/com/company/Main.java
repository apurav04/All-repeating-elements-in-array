package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s= new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        repeatingelement(arr);
      //  for(int i=0;i<=arr.length-1;i++){
        //    System.out.print(arr[i]);
        //}

    }
    public static void repeatingelement(int[] arr){
        Arrays.sort(arr);

        for(int i=0;i< arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.print(arr[i]);
            }
        }

    }
}
