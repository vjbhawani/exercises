package algorithm.dynamicporgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 0/1 means either you pick once or not-pick at all
 */
public class Knapsack0_1 {
    public static void main(String[] args) {
        //input
        int[] weights = new int[]{1,3,4,5};
        int[] values =  new int[]{1,4,5,7};
        int maxWeight = 7;

        //output
        int maxValue;
        List<Integer> resultWeights = new ArrayList<>();

        //solution
        int[][] matrix = new int[weights.length][maxWeight+1];

        for(int i = 0; i < weights.length; i++) {
            for(int j = 1; j < maxWeight + 1; j++) {
                int weight = weights[i];

                if(weight <= j) {
                    int value = values[i];

                    int leftWeight = j - weight;
                    int leftValue = 0;

                    int maxValueIfThisWeighNotSelected = 0;
                    if(i != 0) {
                        leftValue = matrix[i-1][leftWeight];
                        maxValueIfThisWeighNotSelected = matrix[i-1][j];
                    }
                    matrix[i][j] = Math.max(value+leftValue, maxValueIfThisWeighNotSelected);
                } else {
                    if(i != 0) {
                        matrix[i][j] = matrix[i-1][j];
                    }
                }
                System.out.print(matrix[i][j] + " ,");
            }
            System.out.println("");
        }

        System.out.println("value:" + matrix[weights.length-1][maxWeight]);

        int row = weights.length - 1;
        int col = maxWeight;

//        while (row != 0 && col != 0) {
//            int val = matrix[row][col];
//            int topVal = 0;
//            if(row != 0) {
//                topVal = matrix[row-1][col];
//            }
//            if(val == topVal) {
//                row--;
//            } else {
//                resultWeights.add(weights[row]);
//                row--;
//                col -= weights[row];
//            }
//        }

        backTrackResultWeight(matrix, row, col, weights, resultWeights);
        resultWeights.stream().forEach(System.out::println);
    }

    private static void backTrackResultWeight(int[][] matrix, int row, int col, int[] weights, List<Integer> resultWeights) {
        if(row != 0 && col != 0) {
            int val = matrix[row][col];
            int topVal = 0;
            if (row != 0) {
                topVal = matrix[row - 1][col];
            }
            if (val == topVal) {
                row--;
            } else {
                resultWeights.add(weights[row]);
                row--;
                col -= weights[row];
            }
            backTrackResultWeight(matrix, row, col, weights, resultWeights);
        }
    }

}
