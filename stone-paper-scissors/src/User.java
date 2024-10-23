import java.util.ArrayList;
import java.util.Collections;

public class User implements Comparable<User> {
    private String name;
    private int score;
    private static ArrayList<User> Scoreboard = new ArrayList<User>();

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setScore(int score){
        this.score = score;
    }
    public int getScore(){
        return this.score;
    }

    public void addScore(User player){
        Scoreboard.add(player);
    }

    @Override
    public int compareTo(User other){
        return Integer.compare(this.score, other.score);
    }
    
    public void displayScoreBoard(){
        Collections.sort(Scoreboard);
        for (int i = Scoreboard.size() - 1; i >=0 ; i--) {
            System.out.println(Scoreboard.get(i));
        }
    }

    @Override
    public String toString(){
        return this.name + " : " + this.score;
    }
}
