package br.edu.univas.views;

import br.edu.univas.enums.Directions;
import br.edu.univas.models.Game;
import br.edu.univas.models.Input;
import br.edu.univas.models.Output;

public class Menu {

    private final Output output;
    private final Input input;

    public Menu() {
        this.output = new Output();
        this.input = new Input();
    }

    public Output getOutput() {
        return output;
    }

    public Input getInput() {
        return input;
    }

    public void start() {
        this.getOutput().showWelcomeMessage();

        boolean looping = true;

        do {
            showMenu();
            String option = this.getInput().readString();

            switch (option) {
                case "1":
                    this.getOutput().showStartingGame();

                    this.startGame();

                    break;
                case "2":
                    this.getOutput().showRules();
                    break;
                case "3":
                    this.getOutput().showBye();
                    looping = false;
                    break;
                default:
                    this.getOutput().showInvalidOption();
                    break;
            }

        } while (looping);
    }

    private void showMenu() {
        this.getOutput().showMenuOptions();
    }

    private void startGame() {
        Game game = new Game();

        game.startGame();

        do {
            game.printCaves();
            game.getEnemySignals();

            this.getOutput().showOptionsToPlay();
            String option = this.getInput().readString();

            switch(option) {
                case "1": {
                    Directions direction = this.chooseDirections();

                    game.movePlayer(direction);
                    game.moveBats();
                    break;
                }
                case "2": {
                    game.printTotalPlayerArrows();

                    Directions direction = this.chooseDirections();

                    game.shootArrow(direction);
                    break;
                }
                default:
                    this.getOutput().showInvalidOption();
                    break;
            }

        } while(!game.isGameOver());

        game.getGameOverMessage();
    }

    private Directions chooseDirections() {
        this.getOutput().showDirections();
        String option = this.getInput().readString();

        return switch (option) {
            case "1" -> Directions.NORTE;
            case "2" -> Directions.SUL;
            case "3" -> Directions.LESTE;
            case "4" -> Directions.OESTE;
            default -> {
                this.getOutput().showInvalidOption();
                yield chooseDirections();
            }
        };
    }
}
