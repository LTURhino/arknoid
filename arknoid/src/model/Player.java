package model;

public class Player {
     int playerX; // x coordinate of player

     static int  playerY = 8;
    private int speed; // speed of player

    public Player( int playerX) {
        this.playerX = playerX;

        this.speed = 1;
    }

    public int getPlayerX() {
        return playerX;
    }

    public static int getPlayerY() {
        return playerY;
    }

    public void setPlayerX(int playerX) {
        this.playerX = playerX;
    }

    // move player to the right
    public void moveRight() {
        playerX += speed;
    }

    // move player to the left
    public void moveLeft() {
        playerX -= speed;
    }

}
