import java.util.*;

public class solution {
    public static int findPotentialValue(int[] arr) {
        int val = arr[0]; //Initialize with the start index
        int freq = 1; //Initially, the frequency will be one

        for(int i=1; i<arr.length; i++){
            if(arr[i]==val){ //If same element found in array, increase the freq by one
                freq++;
            }else{ //If distinct element found in array, decrease the freq by one
                freq--;
            }
            if(val==0){ //If the frequency becomes zero, which means we have paired all the distinct elements, so set the current element as the new value and also freq as one and continue the process
                val = arr[i];
                freq = 1;
            }
        }
        return val;
    }
    public static void printMajorityElement(int[] arr) {
        int val = findPotentialValue(arr); //returns the potential element from the array which can be required majority element
        int freq = 0;
        for(int ele: arr){ //checking the frequency
            if(ele == val){
                freq++;
            }
        }
        if(freq > arr.length/2){
            System.out.println(val);
        }else{
            System.out.println("No Majority Element exist");
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        printMajorityElement(arr);
    }
}