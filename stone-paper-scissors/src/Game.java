import java.util.Scanner;

public class Game {

    private int playerScore = 0;
    private int enemyScore = 0;

    private int userChoice = 0;
    public void setUserChoice(int choice){
        this.userChoice = choice;
    }
    private int enemyChoice = 0;

    public int getUserChoice (){
        return  this.userChoice;
    }


    public int getEnemyChoice(){
        int min = 1;
        int max = 3;
        int randomInt = (int) (Math.random() * (max - min + 1) + min);
        if (randomInt==1) System.out.println("Enemy threw rock");
        else if (randomInt==2) System.out.println("Enemy threw scissor");
        else if (randomInt==3) System.out.println("Enemy threw paper");
        return randomInt;
    }

    public void playerWin(){
        System.out.println("You win");
        playerScore++;
    }

    public void enemyWin(){
        System.out.println("You lose");
        enemyScore++;
    }

    public void getScore(){
        System.out.println("player : " + this.playerScore);
        System.out.println("Enemy : " + this.enemyScore);
    }

    static int playGame(){
        Scanner sc = new Scanner(System.in);
        Game game = new Game();
        while (true){
            System.out.println("Press 1 for Rock");
            System.out.println("Press 2 for Scissor");
            System.out.println("Press 3 for Paper");
            int ch = Integer.valueOf(sc.nextLine());
            switch (ch){
                case 1: System.out.println("You threw rock"); break;
                case 2: System.out.println("You threw scissor"); break;
                case 3: System.out.println("You threw paper"); break;
                default:
                    System.out.println("invalid input");

            }

            game.setUserChoice(ch);
            game.enemyChoice = game.getEnemyChoice();
            if (game.userChoice == game.enemyChoice){
                System.out.println("Draw game");
            }
            else if ((game.userChoice == 1 && game.enemyChoice == 3) || game.userChoice > game.enemyChoice){
                game.enemyWin();
            }
            else if (game.userChoice < game.enemyChoice || (game.userChoice == 3 && game.enemyChoice==1)){
                game.playerWin();
            }


            game.getScore();
            System.out.println("Press 1 to Play again");
            System.out.println("Press 2 to Exit");
            switch (Integer.valueOf(sc.nextLine())){
                case 1:
                    System.out.println("Let's Go!");
                    break;
                case 2: return game.playerScore;
                default:
                    System.out.println("Enter valid choice");
            }

        }
    }
}
