package org.application;

public class Main {
    public static void main(String[] args) {

        String input = "Bilyuba Alexander Yurievich";
        //String input = "Nizhny Novgorod State Technical University";
        String key = "Secret";

        String encrypted = encrypt(input, key);
        System.out.println("Encrypted: " + encrypted);

        String decrypted = decrypt(encrypted, key);
        System.out.println("Decrypted: " + decrypted);
    }

    //  метод шифровки
    public static String encrypt(String input, String key) {
        StringBuilder encrypted = new StringBuilder();
        int keyIndex = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            char keyChar = key.charAt(keyIndex);

            char encryptedChar = (char) (c ^ keyChar); // xor операция
            encrypted.append(encryptedChar);

            keyIndex = (keyIndex + 1) % key.length(); // перемещение по ключу
        }

        return encrypted.toString();
    }

    //метод расшифровки
    public static String decrypt(String encrypted, String key) {
        // Декрипция аналогична шифрованию
        return encrypt(encrypted, key);
    }
}