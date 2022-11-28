public class Driver {
    public static void main(String[] args) {
        Game game = new Game(10,1);
        game.addPlayer("A");
        game.addPlayer("B");
        game.addPlayer("C");
        game.launchGame();
    }
}
