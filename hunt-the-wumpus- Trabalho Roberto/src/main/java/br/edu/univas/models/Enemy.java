package br.edu.univas.models;

public abstract class Enemy {

    public abstract void emitSignal();

    public abstract void interactWithPlayer(Player player);
}
