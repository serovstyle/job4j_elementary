package ru.job4j.condition;

public class ChessBoard {

    private static boolean isLegal(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    private static boolean isBishop(int x1, int y1, int x2, int y2) {
        return Math.abs(x2 - x1) == Math.abs(y2 - y1);
    }

    public static int way(int x1, int y1, int x2, int y2) {
        int result = 0;
        if (ChessBoard.isLegal(x1) && ChessBoard.isLegal(x2) && ChessBoard.isLegal(y1) && ChessBoard.isLegal(y2)
                && ChessBoard.isBishop(x1, y1, x2, y2)) {
            result = Math.abs(x2 - x1);
        }
        return result;
    }
}
