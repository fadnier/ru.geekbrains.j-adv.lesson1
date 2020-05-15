package barrier;

import participant.Participant;

public class Wall implements Barrier {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Participant participant) {
        participant.jump(height);
    }
}
