# Majority Element - II

![](https://badgen.net/badge/Level/Easy/cyan?scale=1.3)

## Question 
- ##### Give an array of size **'n'**.
- ##### Find all elements that appear more than n / 3 times and return it in an arraylist.
- ##### **Note** : solve the problem in linear time and in O(1) space.
 

## Input Fromat
```
3
3 2 3
```

## Output Format
```
[3]
```

## Constraint
- ##### 1 <= arr.length <= 10^4
- ##### -10 ^ 9 <= arr[i] <= 10^9
- ##### Time Complexity - O(n)
- ##### Space Complexity - O(1)

## Solution
`  
#### Note: Here, we need to find the all the elements which appears more than n/3 times in the array.
#### so, n%3 => [0,1,2] so there can be atmost two distinct potential elements.


- #### We can divide the problem into two parts:
    ##### 1. Find the two potential numbers which can have the required frequency:
    - #####  Pair the distinct elements in the group of three which will eleminate all the other numbers and only potential numbers will be left which can be our required answer.
    ##### 2. Traverse the array and check if that potential numbers has the required frequency.
```
- Time Complexity - O(n)
- Space Complexity - O(1)
```
