package br.edu.univas.models;

public class Output {
    public void print(String message) {
        System.out.print(message);
    }

    public void println(String message) {
        System.out.println(message);
    }

    public void wumpusSignal() {
        this.println("Você sente um cheiro forte.");
    }

    public void batSignal() {
        this.println("Você ouve o som de asas batendo.");
    }

    public void bottomlessPitSignal() {
        this.println("Você sente uma brisa fria.");
    }

    public void wumpusInteraction() {
        this.println("Wumpus te matou.");
        this.println("");
    }

    public void batInteraction() {
        this.println("Morcegos te levaram para outra caverna.");
        this.println("");
    }

    public void bottomlessPitInteraction() {
        this.println("Você caiu em um poço sem fundo.");
        this.println("");
    }

    public void invalidDirection() {
        this.println("Não há cavernas nessa direção. Tente novamente!");
        this.println("");
    }

    public void arrowCollected() {
        this.println("Você encontrou uma flecha!");
        this.println("");
    }

    public void arrowMissed() {
        this.println("Você errou o tiro.");
        this.println("");
    }

    public void missingArrows() {
        this.println("Você morreu. Sem flechas restantes!");
        this.println("");
    }

    public void showWelcomeMessage() {
        this.println("Bem-vindo ao Hunt the Wumpus!");
        this.println("");
    }

    public void showMenuOptions() {
        this.println("1. Iniciar um novo jogo!");
        this.println("2. Ver as regras!");
        this.println("3. Sair!");
        this.showChooseOption();
    }

    public void showChooseOption() {
        this.print("Escolha uma opção: ");
    }

    public void showStartingGame() {
        this.println("Iniciando um novo jogo...");
        this.println("");
    }

    public void showInvalidOption() {
        this.println("Opção inválida. Tente novamente.");
        this.println("");
    }

    public void showBye() {
        this.println("Até logo! :)");
    }

    public void showRules() {
        this.println("");
        this.println("Regras - Hunt the Wumpus:");
        this.println("");
        this.println("""
                1. Existem três perigos:
                 - Um poço sem fundo (Você sentirá uma brisa fria).
                 - Uma colônia de morcegos que o levará para uma caverna aleatória (Você ouve asas batendo).
                 - Um wumpus faminto e perigoso (Você sente um cheiro forte).""");
        this.println("2. Você pode encontrar uma flecha de um caçador anterior.");
        this.println("3. O jogo termina se você ficar sem flechas, cair em um poço sem fundo ou for devorado pelo Wumpus.");
        this.println("4. O 'X' no mapa indica sua posição atual.");
        this.println("5. Sobreviva! Você tem 5 flechas e há 3 flechas escondidas entre as 25 cavernas.");
        this.println("");
    }

    public void showOptionsToPlay() {
        this.println("1. Mover para outra caverna.");
        this.println("2. Atirar uma flecha.");
        this.showChooseOption();
    }

    public void showDirections() {
        this.println("1. Norte");
        this.println("2. Sul");
        this.println("3. Leste");
        this.println("4. Oeste");
        this.showChooseOption();
    }

    public void wumpusDefeated() {
        this.println("Você derrotou o Wumpus!");
        this.println("");
    }

    public void showTotalPlayerArrows(int arrows) {
        if(arrows != 0) {
            this.println("Você tem " + arrows + " flechas!");
            this.println("");
        } else {
            this.println("Você está sem flechas.");
            this.println("");
        }
    }
}
