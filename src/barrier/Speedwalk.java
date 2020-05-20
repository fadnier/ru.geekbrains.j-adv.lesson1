package barrier;

import participant.Participant;

public class Speedwalk implements Barrier {
    int length;

    public Speedwalk(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant participant) {
        participant.run(length);
    }
}
