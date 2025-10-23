package FacadePattern;


public class Main {
    static void main() {
        GameFacade counterStrike2 = new GameFacade();
        counterStrike2.startGame("Mirage");
        System.out.println();
        counterStrike2.closeGame();


    }
}
