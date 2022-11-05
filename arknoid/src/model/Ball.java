package model;

public class Ball {
    private int ballX; // x coordinate of ball
    private int ballY; // y coordinate of ball
    private int ballXDirection; // x direction of ball
    private int ballYDirection; // y direction of ball

    public Ball(int x, int y, int xDirection, int yDirection) {
        ballX = x;
        ballY = y;
        ballXDirection = xDirection;
        ballYDirection = yDirection;
    }

    // getters and setters
    public int getBallX() {
        return ballX;
    }

    public void setBallX(int x) {
        ballX = x;
    }

    public int getBallY() {
        return ballY;
    }

    public void setBallY(int y) {
        ballY = y;
    }

    public int getBallXDirection() {
        return ballXDirection;
    }

    public void setBallXDirection(int xDirection) {
        ballXDirection = xDirection;
    }

    public int getBallYDirection() {
        return ballYDirection;
    }

    public void setBallYDirection(int yDirection) {
        ballYDirection = yDirection;
    }

    public void changeDirection(){
        ballYDirection = -ballYDirection;
        if(ballXDirection == 0){
            ballXDirection = 1;
        }else {
            ballXDirection = -ballXDirection;
        }
    }
    // move the ball
    public void move() {
        ballX += ballXDirection;
        ballY += ballYDirection;


    }

    public void hitWallChangeDirection() {
        if (ballY <= 0) { // top border
            ballYDirection = -ballYDirection;
        }
        if (ballX <= 0) { // left border
            ballXDirection = -ballXDirection;
        }
        if (ballX >= 8) { // right border
            ballXDirection = -ballXDirection;
        }
    }

    public void hitPlayerChangeDirection() {
        ballYDirection = -ballYDirection;
        /*if(ballXDirection != 0){
            ballXDirection = 0;
        }else if(ballXDirection == 0 ){
            ballXDirection = 1;
        }else {
            ballXDirection = -ballXDirection;
        }*/

    }
}
