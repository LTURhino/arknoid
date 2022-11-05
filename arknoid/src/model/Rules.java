package model;

public class Rules {

    private Player player;
    private Ball ball;
    private Map map;
    private int bricks = 2;
    public boolean gameOver = false;

    public Rules(Player player, Ball ball, Map map) {
        this.player = player;
        this.ball = ball;
        this.map = map;
    }


    public void moveElements() {
        if(!hitWall(ball)){
            if(!hitPlayer(ball)){
                if(hitBrick(ball)){
                   map.hitBrick(ball.getBallX(), ball.getBallY());
                   bricks--;
                   ball.changeDirection();
                }else{
                    ball.move();
                }
            }else {
                ball.hitPlayerChangeDirection();
                ball.move();
            }

        }else{
            ball.hitWallChangeDirection();
            ball.move();

        }
        if(bricks == 0){
            gameOver = true;
            System.out.println("You Win!");
        }

        if(ball.getBallY() == map.getHeight()){
            gameOver = true;
            System.out.println("You Lose!");
        }
    }
    public boolean hitPlayer(Ball ball){
        return ball.getBallX() == player.playerX && ball.getBallY() == player.playerY;
    }
    public boolean hitWall(Ball ball){
        return map.isWall(ball.getBallX(), ball.getBallY());
    }
    public boolean hitBrick(Ball ball){

        return map.isBrick(ball.getBallX(),ball.getBallY());
    }
    public void processUserInput(int userInput) {
        switch(userInput) {
            case 'q':
                gameOver = true;
                break;
            case 'a':
                if (map.isWall(player.playerX-1, player.playerY) == false)
                    player.moveLeft();
                break;
            case 'd':
                if (map.isWall(player.playerX+1, player.playerY) == false)
                   player.moveRight();
                break;

        }
    }
}
