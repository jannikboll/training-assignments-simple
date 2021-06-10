package eu.sig.training.ch02;

public class BoardFactory {
    // tag::createBoard[]
    public Board createBoard(Square[][] grid) {
        assert grid != null;
        Board board = new Board(grid);
        return board;
    }
    // end::createBoard[]

    private void linkBoards(Square[][] grid, int x, int y) {

    }
}

class Board {

    private  Square[][] grid;
    @SuppressWarnings("unused")
    public Board(Square[][] grid) {
        calculateGrid();
    }

    public int getWidth() {
        return 0;
    }

    public int getHeight() {
        return 0;
    }

    private void calculateGrid() {
        int width = getWidth();
        int height = getHeight();
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Square square = grid[x][y];
                for (Direction dir : Direction.values()) {
                    int dirX = (width + x + dir.getDeltaX()) % width;
                    int dirY = (height + y + dir.getDeltaY()) % height;
                    Square neighbour = grid[dirX][dirY];
                    square.link(neighbour, dir);
                }
            }
        }
    }
}

class Square {
    @SuppressWarnings("unused")
    public void link(Square neighbour, Direction dir) {}

    public void linkToGrid(Square[][] grid) {

    }
}

class Direction {

    public static Direction[] values() {
        return null;
    }

    public int getDeltaY() {
        return 0;
    }

    public int getDeltaX() {
        return 0;
    }
}
