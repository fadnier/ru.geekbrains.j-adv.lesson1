package participant;

import java.util.Random;

public class Human implements Participant {
    int distance = 300;
    int jumpHeight = 2;
    String name = "Human";
    Random random = new Random();
    boolean isMember = true;

    public Human() {
        distance = 200+random.nextInt(200);
        jumpHeight = 1+random.nextInt(2);
    }

    public Human(int distance, int jumpHeight) {
        this.distance = distance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void jump(int height) {
        if(height>jumpHeight) {
            System.out.println(name+" не смог прыгнуть на "+height+" метров.");
            isMember = false;
        } else {
            System.out.println(name+" успешно прыгнул "+height+" метров.");
        }
    }

    @Override
    public void run(int length) {
        if(length>distance) {
            System.out.println(name+" не смог пробежать "+length+" метров.");
            isMember = false;
        } else {
            System.out.println(name+" успешно пробежал "+length+" метров.");
        }
    }

    @Override
    public boolean isMember() {
        return isMember;
    }

    @Override
    public void info() {
        System.out.println("Human "+name+": прыжок "+jumpHeight+", растояние "+distance+", "+(isMember?" учасник":" выбыл"));
    }
}
