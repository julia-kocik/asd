package turnament;
import java.util.ArrayList;

public class Main {

    static class Player {
        int value;
        ArrayList<Integer> lost = new ArrayList<>();

        Player(int value) {
            this.value = value;
        }
    }

    public static int tournamentSecondMin(int[] A) {
        ArrayList<Player> players = new ArrayList<>();

        for (int x : A) {
            players.add(new Player(x));
        }

        while (players.size() > 1) {
            ArrayList<Player> next = new ArrayList<>();

            for (int i = 0; i + 1 < players.size(); i += 2) {
                Player a = players.get(i);
                Player b = players.get(i + 1);

                if (a.value < b.value) {
                    a.lost.add(b.value);
                    next.add(a);
                } else {
                    b.lost.add(a.value);
                    next.add(b);
                }
            }

            if (players.size() % 2 == 1) {
                next.add(players.get(players.size() - 1));
            }

            players = next;
        }

        ArrayList<Integer> lost = players.get(0).lost;

        int second = lost.get(0);

        for (int x : lost) {
            if (x < second) {
                second = x;
            }
        }

        return second;
    }
}
