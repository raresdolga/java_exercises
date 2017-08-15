import java.util.Random;

public class Main1 {

    public static void main(String[] args) {
        String input = generateTest();
        System.out.println(input);
    }

    public static String generateTest(){
        String s= "";
        int nodes = randomInRange(0, 6);
        int edges = randomInRange(0, nodes*nodes);
        s += nodes + " " + edges + " ";
        for (int i = 0; i < edges; i++) {
            s += randomInRange(0, nodes) + " " + randomInRange(0, nodes) + " ";
        }
        s += randomInRange(0, nodes) + " ";
        s += randomInRange(0, nodes) + " ";
        s += randomInRange(0, nodes) + " ";
        return generateSentence(1) + " " + s;
    }

    public static String generateSentence(int level){
        char[] tab = {'v', '^', '>'};
        char[] tab1 = {'x', 'y', 'z'};

        int random = (int) Math.round(Math.random()*level);
        if(random==0){
            return "(" + generateSentence(level+1) + tab[randomInRange(0,2)] + generateSentence(level+1) + ")";
        }
        double randDouble = Math.random();
        if(randDouble>=0.5){
            return "X[" + tab1[randomInRange(0,2)] + tab1[randomInRange(0,2)] +"]";
        } else if (randDouble>=0.25){
            return "E" + tab1[randomInRange(0,2)] + generateSentence(level+1);
        } else {
            return "A" + tab1[randomInRange(0,2)] + generateSentence(level+1);
        }
    }

    public static int randomInRange(int min, int max){
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}