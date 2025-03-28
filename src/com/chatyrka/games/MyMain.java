package com.chatyrka.games;

public class MyMain {
    public static void main(String[] args) {
        //startGame();
        startGuessWordGame();
    }
    public static void startGame(){
        new TicTacToe();
    }
    public static void startGuessWordGame(){
        new GuessWord();
    }
}
