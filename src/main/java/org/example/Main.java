package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            System.out.print("Упало инсключение - " + e);
        } catch (IOException e) {
            System.out.print("Упало инсключение - " + e);
        } catch (Exception e) {
            System.out.print("Упало инсключение -" + e);
        }
    }
}