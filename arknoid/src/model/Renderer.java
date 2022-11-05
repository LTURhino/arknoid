package model;

public class Renderer {
    private Player player;
    private Ball ball;
    private Map map;

    public Renderer(Player player, Ball ball, Map map) {
        this.player = player;
        this.ball = ball;
        this.map = map;
    }

    public void renderGame() {
        for (int y=0; y<map.getHeight(); y++) {
            for (int x=0; x<map.getWidth(); x++) {

                if (player.playerX==x && Player.playerY == y) {

                    System.out.print("-");
                }
                else
                if (ball.getBallX()==x && ball.getBallY() == y)
                    System.out.print("O");
                else
                if (map.isNothing(x, y))
                    System.out.print(" ");
                else
                if (map.isWall(x, y))
                    System.out.print("|");
                else
                if (map.isBrick(x, y))
                    System.out.print("#");
                else
                if (map.isPlayer(x, y))
                    System.out.print("-");
                else
                if (map.isBall(x, y))
                    System.out.print("O");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }


}
