import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            User player = new User();
            int ch = 0;

            System.out.println("Welcome to the game");
            System.out.println("What is your name:");
            player.setName(sc.nextLine());
            System.out.println("Hello " + player.getName() + ", Welcome to the game");

            System.out.println("Press 1 to Play");
            System.out.println("Press 2 to Exit");
            System.out.println("Press 3 to check High Score");
            ch = Integer.valueOf(sc.nextLine());
            switch (ch){
                case 1:
                    Game game = new Game();
                    int playerScore =  game.playGame();
                    player.setScore(playerScore);
                    player.addScore(player);
                    break;
                case 2: System.exit(0); break;
                case 3: player.displayScoreBoard();
            }

        }
    }

}