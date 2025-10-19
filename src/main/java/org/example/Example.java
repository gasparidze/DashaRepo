package org.example;

public class Example {
    public static void main(String[] args) {
        int[][] A = {{1, 2}, {2, 3}};
        System.out.println(diagonalDominantIndex(A));
    }
    public static int diagonalDominantIndex(int[][] A){
        int status = -1;
        int diagonalIndex = 0;
        for(int i = 0; i < A.length; i++){
            int rowSum = 0;
            for(int j = 0; j < A[i].length; j++){
                if(diagonalIndex != j){
                    rowSum += A[i][j];
                }
            }
            if(A[i][diagonalIndex] > rowSum){
                status = i;
                break;
            }
            diagonalIndex++;
        }
        return status;
    }
}
