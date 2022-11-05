package model;

public class Map {
    private int matrix[][] = {
            {1,1,1,1,1,1,1,1,1},
            {1,0,0,0,0,0,0,0,1},
            {1,0,0,2,2,2,0,0,1},
            {1,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,1},
            {1,1,1,1,1,1,1,1,1},

    };

    public boolean isWall(int x, int y) {

        return matrix[y][x] == 1;
    }

    public int getHeight() {
        return matrix.length;
    }

    public int getWidth() {
        return matrix[0].length;
    }
    public boolean isBall(int x, int y){
        return matrix[y][x] == 4;
    }
    public boolean isPlayer(int x,int y){
        return matrix[y][x] == 3;
    }

    public boolean isNothing(int x, int y) {
       return matrix[y][x] == 0;
    }

    public boolean isBrick(int x, int y) {
        return matrix[y][x]==2;
    }


    public void hitBrick(int ballX, int ballY) {
        matrix[ballY][ballX] = 0;
    }


}
