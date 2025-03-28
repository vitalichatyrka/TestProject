package com.chatyrka.games;

import java.util.Random;
import java.util.Scanner;

public class GuessWord {
    public static void main(String[] args){
        // Will of Fortune или поле чудес, угадай слово
        startGame();
        // Алгоритм - это определенное количество операций,
        // в определенном порядке, которые должны быть сделаны,
        // чтобы программа работала исправно

        // 1. Поздравительное сообщение и приглашение сыграть в игру
        // 2. Если мы принимаем это приглашение, то играем
        // 2.1. Если не принимаем, пока
        // 3. Если играем, то - задаем инструкцию
        // 4. Создадим определенный массив слов, которые будем хранить в массиве
        // 5. После этого, через использование класса Рендом, выберем одно случайно слово
        // 6. Выбрали случайное слово, теперь надо пригласить пользователя угадать это слово
        // 7. Слово угадывается - полностью или по буквам
        // 8. Если по буквам, проверить существует ли такая бука и вывести на экран какую букву отгадали
        // 8.1. Если букву не отгадали, сказать, что такой буквы нет и продолжить отгадаывание
        // 9. Если была попытка угадывания слова полностью, проверить угадали - если да, победа и запрашиваем
        // ХОТИТЕ ЛИ ВЫ СНОВА СЫГРАТЬ В ИГРУ
        // 9.1. Если слово не угадано - сообщаем эту информацию и продолжаем.
        // 10. Рано или поздно, все буквы будут отгаданы - тогда ПОБЕДА и запрашиваем хотите ли вы снова играть
        // Если нет, прощайте, если да, все ЗАНОВО.
    }

    public static void startGame(){
        getIntroductoryMsg();
         boolean startGame = playGame();
        if (startGame){
            getInstructions();

            // getRandomWord() метод принимает результат работы метода words()
            // сам метод words() просто создаем массив с данными
            // а вот метод getRandomWords из этого массива берет случайное значение и возвращает
            // в переменную String hiddenWord

            // Вызвал метод words() который массив со словами
            // Потом пробросил этот массив в getRandomWord()
            // Вернул строчку и через метод toCharArray() трансформировал его в массив символов
            char[] hiddenWord = getRandomWord(words()).toCharArray();

            System.out.println("*****************************************************************************");
            System.out.println("AI have generated a hidden word for you. It is time to start a game.");
            System.out.println("your hidden word is: ".toUpperCase());
            showWord(hiddenWord);
            System.out.println("*****************************************************************************");

            while(true) {
                System.out.print("Please, enter a LETTER or a WHOLE WORLD to GUESS: ");

                String input = input().nextLine();

                // ДОБАВИТЬ! А что если я ничего не ввел? Сделать проверку и дать мне возможность
                // ДОБАВИТЬ! Исправить свою ошибку!
                if (input.length() == 1) {
                    // Если я ввел ОДНУ БУКВУ
                    // 1. Проверить, есть ли такая буква
                    // Если нету, продолжаем
                    // Если есть, показать ее в слове, а остальные буквы оставить скрытыми
                    // Например: Banana, я ввел букву - а
                    // На экране должно появится: *а*а*а
                    // Если отгадали еще букву - b, ba*a*a
                    // И продолжаем вводить буквы
                    // Следует проверить не закончились ли буквы у вас
                    // Если все буквы отгаданы - проверка статуса и ВЫ ПОБЕДИЛИ

                    // ДОБАВИТЬ МЕХАНИЗМ ПОВТОРА ИГРЫ. Т.Е. ЕСЛИ Я ПОБЕДИЛ, НЕ ПРОСТО ЗАКОНЧИТЬ ИГРУ
                    // А СПРОСИТЬ МЕНЯ: МОЖЕТ ЕЩЕ? ДА, ЗАНОВО ВСЕ, НЕТ - ПРОЩАЙТЕ и ПРОГРАММА ЗАКАНЧИВАЕТСЯ!!!!
                } else if (input.length() > 1) {
                    // Если я ввел слово
                    // String.valueOf() -> превращает значения в строчку
                    // после этого .equalsIgnoreCase(_значение) - проверить слова на совпадение
                    // без учета регистра
                    if (checkWord(input, hiddenWord)){
                        System.out.println("YOU HAVE GUESSED THE WORD. YOU HAVE WON!");
                        return;
                    } else {
                        System.out.println("YOU MISSED!");
                    }
                }
            }
        } else if (startGame = false)  {


        }
        else {

        }
    }

    public static void getIntroductoryMsg(){
        System.out.println("Welcome to Guess Word Game. The PC randomly selects words and hides it.");
        System.out.println("You should guess the word. If you are successful - YOU WIN.");
    }

    public static boolean playGame(){
        System.out.println("****************************************************************************");
        System.out.print("Would you like to play a GAME? (y - YES, the rest NO): ");

        return input().nextLine().equalsIgnoreCase("y");
    }

    public static void getInstructions(){
        System.out.println("The AI have created a set of hidden words. It stored these words in an array.");
        System.out.println("The random number has been generated to randomly select a word from the array.");
        System.out.println("You should guess the word either by a LETTER or a FULL WORD.");
    }

    public static String[] words(){
        return new String[]{
                "Apple", "House", "Car", "Stone", "Dragon",
                "Vehicle", "Pineapple", "Watermelon", "Globe", "Tree",
                "Java", "Python", "Banana", "Building", "Butter",
                "Computer", "Notebook", "Bag", "Trousers", "Wardrobe"
        };
    }

    public static String getRandomWord(String[] hiddenWords){
        // верни мне массив hiddenWords[создай случайное число от 0 до длины массива]
        // если массив длиной в 20 элементов - то случайное число буде от 0 до 20, 0-19
        return hiddenWords[new Random().nextInt(0, hiddenWords.length)];
    }

    public static void showWord(char[] word){
        for (char letter : word){
            System.out.print(letter + "\t");
        }
        System.out.println();
    }

    public static boolean checkWord(String input, char[] word){
        return String.valueOf(word).equalsIgnoreCase(input);
    }

    public static Scanner input(){
        return new Scanner(System.in);
    }
    public static boolean askReplay() {
        System.out.print("Would you like to play again? (y/n): ");
        return input().nextLine().equalsIgnoreCase("y");
    }
}