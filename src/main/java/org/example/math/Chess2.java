package org.example.math;

import static java.lang.Math.*;

public class Chess2 {
    public static void main(String[] args) {
        // мы на месте
        System.out.println(isReachableInTwoMovements(7, 0, 7, 0));

        // доходим за один ход
        System.out.println(isReachableInTwoMovements(7, 0, 6, 2));
        System.out.println(isReachableInTwoMovements(7, 0, 5, 1));

        // доходим за два хода
        System.out.println(isReachableInTwoMovements(7, 0, 3, 2));
        System.out.println(isReachableInTwoMovements(7, 0, 4, 3));

        // false, т.к. пытаемся от начала доски дойти до конца доски
        System.out.println(isReachableInTwoMovements(7, 0, 0, 7));
    }

    public static boolean isReachableInTwoMovements(int startingRow, int startingColumn, int objectiveRow, int objectiveColumn){
        int[][] knightMoves = {
                {2, 1}, {1, 2}, {-2, 1}, {-2, -1},
                {1, -2}, {-1, -2}, {-1, 2}, {2, -1}
        };

        if (startingRow == objectiveRow && startingColumn == objectiveColumn){
            return true;
        }

        /**
         * нужны 2 проверки: за один ход и за две
         */
        if (isReachableInOneMovement(startingRow, startingColumn, objectiveRow, objectiveColumn)){
            return true;
        }

        /**
         * фактически, нам нужно сделать ход от первого хода
         * надо проверить, можно ли для каджого возможного хода, сделав еще один из возможных ходов
         * дойти до objectiveRow и objectiveColumn
         */
        for (int i = 0; i < knightMoves.length; i++) {
            int firstRowMove = startingRow + knightMoves[i][0];
            int firstColumnMove = startingColumn + knightMoves[i][1];

            if (isOnBoard(firstRowMove, firstColumnMove)){
                return isReachableInOneMovement(firstRowMove, firstColumnMove, objectiveRow, objectiveColumn);
            }
        }

        return false;
    }

    private static boolean isReachableInOneMovement(int startingRow , int startingColumn , int objectiveRow , int objectiveColumn) {
        if (!isOnBoard(objectiveRow, objectiveColumn)){
            return false;
        }

        /**
         * startRow = 7
         * objRow = 6
         * startCol = 0
         * objCol = 2
         *
         * 1, 2
         * 2, 1
         */

        int deltaRow = abs(objectiveRow - startingRow);
        int deltaColumn = abs(objectiveColumn - startingColumn);

        return (deltaRow == 2 && deltaColumn == 1) || (deltaRow == 1 && deltaColumn == 2);
    }

    private static boolean isOnBoard(int row, int column){
        return row >=0 && row < 8 && column >=0 && column < 8;
    }
}
