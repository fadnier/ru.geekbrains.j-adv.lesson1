package participant;

import java.util.Random;

public class Robot implements Participant {
    int distance = 1000;
    int jumpHeight = 3;
    String name = "Robot";
    Random random = new Random();
    boolean isMember = true;

    public Robot() {
        distance = 900+random.nextInt(200);
        jumpHeight = 1+random.nextInt(3);
    }

    public Robot(int distance, int jumpHeight, String name) {
        this.distance = distance;
        this.jumpHeight = jumpHeight;
        this.name = name;
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
        System.out.println("Robot "+name+": прыжок "+jumpHeight+", растояние "+distance+", "+(isMember?" учасник":" выбыл"));
    }
}
