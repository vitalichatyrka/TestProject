package com.chatyrka.games;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    // Added constructor
    public TicTacToe(){
        checkRows();
    }

    public void startGame(){
        getInitialMSG();

        while(true){
            if ((input().nextLine()).equalsIgnoreCase("y")){
                char[][] table = initializeTable();
                System.out.println("********************************************");
                getRules();
                System.out.println("********************************************");
                System.out.println("Let's decide who makes the first move?!");

                int randomNumber = random().nextInt(0, 101);
                char userSymbol;
                char aiSymbol;
                // Как определить, когда Х, а когда О
                // !!!СДЕЛАТЬ ВАМ!!!!!

                // ТОТ КТО ИДЕТ ПЕРВЫМ, БУДЕТ ХОДИТЬ Х
                // СЛЕДОВАТЕЛЬНО, ДРУГОЙ БУДЕТ ИСПОЛЬЗОВАТЬ О
                if (randomNumber <= 50){
                    userSymbol = 'x';
                    aiSymbol = '0';
                    // USER
                    // ВАМ НУЖНО БУДЕТ!!!! СОЗДАТЬ РЕАЛИЗАЦИЮ ИГРОКА
                    // ИГРОК, ЗАДАЕМ ЗНАЧЕНИЯ ПО РЯДУ 1-3, по СТОЛБЦАМ 1-3
                    // УЧЕСТЬ! ЧТО ИНДЕКСАЦИЯ ИДЕТ СТАНДАРТНО 0-2
                    // ПОСТОЯННЫЕ ШАГИ, ДО ТЕХ ПОР !!!
                    // НАДО СОЗДАТЬ СЧЕТЧИК ХОДОВ, КОТОРЫЙ ПОМОЖЕТ ВАМ ОТСЛЕЖИВАТЬ ПРОЦЕСС
                    // НАПРИМЕР, ПОБЕДА ОДНОЙ ИЗ СТОРОН ПРАКТИЧЕСКИ ВОЗМОЖНА ЛИШЬ ПОСЛЕ 5 ШАГА
                    // НА 9 ШАГЕ - ИГРА ЗАКОНЧИТСЯ В ЛЮБОМ СЛУЧАЕ

                    // ПОСЛЕ 5 ШАГА, ПРОВЕРЯТЬ ТАБЛИЦА / МАССИВ

                    // КАЖДАЯ ФОРМУЛА ДОЛЖНА БЫТЬ РАСПРЕДЕЛНА ПО МЕТОДУ
                    // НЕ ВЫИГРАЛ ЛИ Я ПО СТРОКАМ 0 - 0,0 - 0,1 - 0,2 = x/y
                    // НЕ ВЫИГРАЛ ЛИ Я ПО СТРОКАМ 1 - 1,0 - 1,1 - 1,2 = x/y
                    // НЕ ВЫИГРАЛ ЛИ Я ПО СТРОКАМ 2 - 2,0 - 2,1 - 2,2 = x/y

                    // НЕ ВЫИГРАЛ ЛИ Я ПО СТОЛБЦАМ 0, 0 = 0,0 - 1,0 - 2,0
                    // НЕ ВЫИГРАЛ ЛИ Я ПО СТОЛБЦАМ 1, 0 = 0,1 - 1,1 - 2,1
                    // НЕ ВЫИГРАЛ ЛИ Я ПО СТОЛБЦАМ 2, 0 = 0,2 - 1,2 - 2,2

                    // Проверка по осям
                    // 0,0 - 1,1 - 2,2
                    // 0,2 - 1,1 - 2,0
                } else {
                    // AI
                    userSymbol = '0';
                    aiSymbol = 'x';
                }
                System.out.println("AI plays as: " + aiSymbol);
                System.out.println("User plays as: " + userSymbol);
                // USER, AI - тот, кто делает первый шаг будет ходить X,
                // Следовательно, следующий игрок будет О
            } else {
                System.out.println("You choose not to move on with the game. GOODBYE!");
            }
            return;
        }
    }

    // как работать с ИИ
    public void makeAIMove(){
        // Поскольку у нас игра меленькая, то мы можем просто сказать компу
        // Выберы случайные числа от 0 по 2 и попытайся вложить туда значение
        // Значение х/о зависит от того, что первый начал играть
        // Если ячейка занята, продолжай рандомно искать
        // Когда найдешь, пробрось туда значение
    }

    public void makeUserMove(){
        // Input via Scanner
        // User enters values row 1-3
        // User enters values column 1-3
        // You must adjust it to indexes
        // 1, 3 = [0][2]
        // Check whether [0][2] is empty
        // If it is PUT a VALUE
        // If it is busy - ASK to RE-ENTER
    }

    public void checkRows(){
        // Проверка по рядам
        char[][] letters = new char[][]{
                {'*', 'O', 'X'},
                {'O', 'O', '*'},
                {'X', 'X', 'X'}
        };

        int userCounter = 0;
        int aiCounter = 0;

        for (int row = 0; row < letters.length; row++){
            for (int col = 0; col < letters[row].length; col++){
                // if user = x
                // if ai = o
                if (letters[row][col] == 'X'){
                    userCounter++;
                } else if (letters[row][col] == 'O'){
                    aiCounter++;
                }
            }
            if (userCounter == 3 || aiCounter == 3){
                System.out.println("SOMEONE WON!!!");
                break;
            }
            userCounter = 0;
            aiCounter = 0;
        }
    }

    public void checkColumns(){
        // Проверка по столбцам
    }

    public void checkAxes(){
        // Проверка по осям
    }

    public void getRules() {
        System.out.println("You decided to play the game.");
        System.out.println("Here are the rules. You have a table 3x3.");
        System.out.println("You will play with the AI.");
        System.out.println("To make a move you must enter coordinates x & y.");
        System.out.println("X - rows, y - columns. The first column in the first low equals 1, 1.");
    }

    public void getInitialMSG(){
        System.out.println("********************************************");
        System.out.println("Welcome to Tic-Tac-Toe game.");
        System.out.println("You need to play against AI.");
        System.out.println("Would you like to play a GAME?!");
        System.out.println("********************************************");
    }

    public char[][] initializeTable(){
        return new char[][]{
                {'*', '*', '*'},
                {'*', '*', '*'},
                {'*', '*', '*'},
        };
    }

    public void readTable(char[][] table){
        for(char[] outer : table){
            for (char inner : outer){
                System.out.print(inner + "\t");
            }
            System.out.println();
        }
    }

    public Scanner input(){
        return new Scanner(System.in);
    }

    public Random random(){
        return new Random();
    }
}