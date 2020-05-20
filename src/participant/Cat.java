package participant;

import java.util.Random;

public class Cat implements Participant {
    int distance = 200;
    int jumpHeight = 1;
    String name = "Cat";
    Random random = new Random();
    boolean isMember = true;

    public Cat() {
        distance = 100+random.nextInt(200);
        jumpHeight = 1+random.nextInt(1);
    }

    public Cat(int distance, int jumpHeight, String name) {
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
        System.out.println("Cat "+name+": прыжок "+jumpHeight+", растояние "+distance+", "+(isMember?" учасник":" выбыл"));
    }
}
