import java.util.*;

public class Main {

    public static int[] findPotientialElements(int[] arr){
        //Taking two values & frequency set because n%3 => [0,1,2] so there can be atmost two distinct potential elements.

        int val1 = arr[0]; //Initialize with the start index
        int freq1 = 1; //Initially, the frequency will be one

        int val2 = -1; //Initialize val2 with -1 or any same as val1 beause it will get initialized with its first values later in the code while traversing
        int freq2 = 0; ///Initially, the frequency will be zero, becuase val2 has not got its first value yet

        for(int i=1; i<arr.length; i++){
            if(arr[i]==val1){ //If val1 found in array, increase the freq1 by one
                freq1++;
            }else if(arr[i]==val2){ //If val2 found in array, increase the freq2 by one
                freq2++;
            }else{
                if(freq1==0){ //If the freq1 becomes zero, which means we have paired all the val1, so set the current element as the new val1 and also freq1 as one and continue the process
                    val1 = arr[i];
                    freq1 = 1;
                }else if(freq2==0){ //If the freq2 becomes zero, which means we have paired all the val2 (or the val2 was not yet set, consider it as the first initialization state for val2), so set the current element as the new val2 and also freq2 as one and continue the process
                    val2 = arr[i];
                    freq2 = 0;
                }else{ // It means val1, val2 and current element are distinct now which can create a new set(val1, val2, arr[i]) , so decrementing freq1 & freq2
                    freq1--;
                    freq2--;
                }
            }
        }
        return new int[]{val1, val2};
    }

    public static boolean isGreaterThanNb3(int val, int[] arr){
        int freq = 0;
        for(int ele: arr){
            if(ele == val){
                freq++;
            }
        }
        return freq > arr.length/3;
    }


    public static ArrayList<Integer> majorityElement2(int[] arr) {
        int[] valArr = findPotientialElements(arr); //returns the potential elements from the array which can be required majority elements
        ArrayList<Integer> res = new ArrayList<>();
        if (isGreaterThanNb3(valArr[0], arr)){ //checking the frequency greater than n/3
            res.add(valArr[0]);
        }
        if (isGreaterThanNb3(valArr[1], arr)){ //checking the frequency greater than n/3
            res.add(valArr[1]);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        ArrayList<Integer> res = majorityElement2(arr);
        System.out.println(res);
    }
}