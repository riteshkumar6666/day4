import java.util.Random;

public class rollDice {
    public static void main(String[] args) {
        Random random = new Random();
        int rand = 0;
        while (true){
            rand = random.nextInt(6);
            if(rand !=0) break;
        }
        System.out.println(rand);
    }
}
