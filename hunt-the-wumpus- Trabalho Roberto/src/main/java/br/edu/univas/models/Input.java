package br.edu.univas.models;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    private Scanner getScanner() {
        return this.scanner;
    }

    public String readString() {
        return this.getScanner().nextLine();
    }
}
