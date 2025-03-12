package com.example.project;

public class Encryptor {
    
    public static int determineColumns(int messageLen, int rows){
        if (messageLen == 0) return 1;
        return (messageLen + rows - 1) / rows;
    }
    
    public static String[][] generateEncryptArray(String message, int rows) {
        int col = determineColumns(message.length(), rows);
        String[][] arr = new String[rows][col];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (index >= message.length()) {
                    arr[i][j] = "=";
                } else {
                    arr[i][j] = message.substring(index, index + 1);
                    index++;
                }
            }
        }
        return arr;
    }

    public static String encryptMessage(String message, int rows){
        String[][] arr = generateEncryptArray(message, rows);
        String msg = "";
        for (int j = arr[0].length - 1; j >= 0; j--) {
            for (int i = 0; i < arr.length; i++) {
                msg += arr[i][j];
            }
        }
        return msg;
    }

    public static String decryptMessage(String encryptedMessage, int rows) {
        int col = determineColumns(encryptedMessage.length(), rows);
        String[][] arr = new String[rows][col];
        int index = 0;
        for (int j = arr[0].length - 1; j >= 0; j--) {
            for (int i = 0; i < arr.length; i++) {
                if (index >= encryptedMessage.length()) {
                    arr[i][j] = "=";
                } else {
                    arr[i][j] = encryptedMessage.substring(index, index + 1);
                    index++;
                }
            }
        }
        String msg = "";
        for (String[] row : arr) {
            for (String item : row) {
                if (item.equals("=")) continue;
                msg += item;
            }
        }
        return msg;
    }
}