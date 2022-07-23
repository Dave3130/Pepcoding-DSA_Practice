# Majority Element - I

![](https://badgen.net/badge/Level/Easy/cyan?scale=1.3)

## Question 
- ##### Give an array of size **'n'**.
- ##### Find Majority element and print it(if exist), otherwise print "No Majority Element exist".
- ##### Majority element-> if frequency of an element is more than n/2, then that element is majority element.
- ##### **Note** : solve the problem in linear time and in O(1) space.
 

## Input Fromat
```
Array = [2,2,1,1,1,2,2]
Array = [1, 1, 5, 5, 3, 6]
```

## Output Format
```
2
No Majority Element exist
```

## Constraint
- ##### 1 <= arr.length <= 10^4
- ##### -10 ^ 9 <= arr[i] <= 10^9
- ##### Time Complexity - O(n)
- ##### Space Complexity - O(1)

## Solution

#### 1. Brute Force:
- ##### Sort the array.
- ##### Count the frequency of elements linearly, if any element's frequency gets more than n/2 return it.
```
- Time Complexity - O(nlogn)
- Space Complexity - O(1)
```

#### 2. Brute Force - Using HashMap:
- ##### Traverse the given array
- ##### Create a HashMap for the unique elements of array and store its frequency.
- ##### Traverset the Hashmap and check if any element's frequency gets more than n/2 return it.
```
- Time Complexity - O(n)
- Space Complexity - O(n)
```

#### 3. Final Solution:
- #### We can divide the problem into two parts:
    ##### 1. Find the potential number which can have the required frequency:
    - #####  Pair the distinct elements which will eleminate all the other numbers and only potential number will be left which can be our required answer.
    ##### 2. Traverse the array and check if that potential number has the required frequency.
```
- Time Complexity - O(n)
- Space Complexity - O(1)
```