package com.company;
import java.util.*;
import java.util.Scanner;
class Pair{
    int first;
    int second;
    Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
public class Majority_Element {
    public static int largestRectangleArea(int[] heights) {
        int[] left = new int[heights.length];
        int[] right = new int[heights.length];

        // filling left Array: Finding Next Smallest element to the left
        Stack<Pair> stack1 = new Stack<>();
        for(int i = 0; i < heights.length; i++){
            while(!stack1.empty() && stack1.peek().first >= heights[i]){
                stack1.pop();
            }
            if(stack1.empty()){
                left[i] = -1;
            }
            else{
                left[i] = stack1.peek().second;
            }
            stack1.push(new Pair(heights[i], i));
        }

        // filling right Array: Finding Next Smallest element to the right
        Stack<Pair> stack2 = new Stack<>();
        for(int i = heights.length - 1; i >= 0; i--){
            while(!stack2.empty() && stack2.peek().first >= heights[i]){
                stack2.pop();
            }
            if(stack2.empty()){
                right[i] = heights.length;
            }
            else{
                right[i] = stack2.peek().second;
            }
            stack2.push(new Pair(heights[i], i));
        }

        // Filling weight array
        int[] weight = new int[heights.length];
        for(int i = 0; i < weight.length; i++){
            // calculating area = Length * breadth;
            weight[i] = heights[i] * ((right[i] - left[i]) - 1);
        }

        // Now find the largest area of Historgram
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < weight.length; i++){
            max = Math.max(max, weight[i]);
        }
        return max;
    }
    public static int maximalRectangle(int[][] matrix) {
        int height[] = new int[matrix[0].length];
        for(int j = 0; j < matrix[0].length; j++){
            height[j] = matrix[0][j];
        }
        int max = Integer.MIN_VALUE;
        max = Math.max(max, largestRectangleArea(height));
        for(int i = 1; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    height[j] = 0;
                }
                else{
                    height[j] = height[j] + matrix[i][j];
                }
            }
            max = Math.max(max, largestRectangleArea(height));
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 1, 0, 0},{1, 0, 1, 1, 1},{1, 1, 1, 1, 1},{1, 0, 0, 1, 0}};
        System.out.println(maximalRectangle(matrix));
    }
}
