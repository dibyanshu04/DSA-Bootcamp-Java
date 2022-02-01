package com.kunal;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class SmallestLetter {

    public static void main(String[] args) {

    }

    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;
        //if target element is greater than the greatest element in the entire array then return element at first index
        if(target >= letters[end] )
            return letters[start];
        
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(target < letters[mid]){
                end = mid-1;
            }else {
                start = mid + 1;
            }
        }
//      ans
        return letters[start];
    }
}
