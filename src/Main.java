import barrier.Barrier;
import barrier.Speedwalk;
import barrier.Wall;
import enm.DayOfWeekMain;
import participant.Cat;
import participant.Human;
import participant.Participant;
import participant.Robot;

public class Main {
    public static void main(String[] args) {

        //DZ1
        Participant[] participant = {
            new Human(),
            new Cat(),
            new Robot()
        };

        Barrier[] barriers = {
            new Speedwalk(100),
            new Wall(2),
            new Speedwalk(300)
        };

        for (Participant p: participant) {
            for (Barrier b: barriers) {
                if(p.isMember()) {
                    b.doIt(p);
                }
            }
        }
        System.out.println();
        for (Participant p: participant) {
            p.info();
        }

        //DZ2
        //DayOfWeekMain.main(null);
    }
}
