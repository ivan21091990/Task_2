package com.itProger;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите размер массива и нажмите Enter: ");

            int x = scanner.nextInt();
            String array[] = new String[x];

            for (int i = 0; i < array.length; i++) {
                System.out.println("Введите " + (i + 1) + "-е слово и нажмите Enter: ");
                    array[i] = scanner.nextLine();
                }

            int y = 0;

            for(int i=0;i<array.length;i++){
            if(array[i].length()>y){
                y = array[i].length();
                }
            }
            for(int i=0;i<array.length;i++){
            if(array[i].length()==y){
                System.out.println("Слово с наибольшей длиной  " + '"' + array[i] + '"' + "  и его длина составляет " + y + " символов" );
                }
            }
    }
}





