
public class FinchTest1 {
    public static void main(String[] args) {
        Finch bird = new Finch();

        bird.setBeak(100, 0, 0);
        bird.playNote(60, 0.5);

        bird.setMove("F", 10, 50);
        bird.pause(1);

        for (int i = 0; i < 5; i++) {
            int t = (int)(Math.random() * 360) + 1;
            bird.setTurn("R", t, 50);
            bird.playNote(60 + (i * 5), 0.3);
            bird.setMotors(-100, 100);
            bird.setTail(1, (i * 20) % 100, (i * 30) % 100, (i * 40) % 100);
            bird.pause(1);
        }

        bird.print("Exploring!");
        bird.playNote(72, 1.0);
        bird.setBeak(0, 100, 0);

        bird.stopAll();
    }
}
