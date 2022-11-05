package model;

import java.io.IOException;

public class Game {
    public static void main(String a[]) throws IOException {

        Player player = new Player(3);


        Ball ball = new Ball(3,7,0,-1);
        Map map = new Map();

        Renderer renderer = new Renderer(player,ball,map);
        Rules rules   = new Rules(player,ball, map);

        while(rules.gameOver == false) {

            renderer.renderGame();

            byte userInput = readUserInput();

            rules.processUserInput(userInput);

            rules.moveElements();

        }

    }
    private static byte readUserInput() throws IOException {
        byte bytes[] = new byte[10];
        System.in.read(bytes);
        byte userInput = bytes[0];
        return userInput;
    }
}
