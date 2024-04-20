public class RandomWalk {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(-n - 0.45, n + 0.45);
        StdDraw.clear(StdDraw.BLUE);
        StdDraw.enableDoubleBuffering();

        int x = 0, y = 0;
        int steps = 0;
        int i;
        int stepLength = 1;
        int direction = 0;
        while (Math.abs(x) <= n && Math.abs(y) <= n) {
            for (i = 0; i < stepLength && Math.abs(x) <= n && Math.abs(y) <= n; ++i) {

                StdDraw.setPenColor(StdDraw.YELLOW);
                StdDraw.filledSquare(x, y, 0.45);

                if (direction == 0) {
                    ++x;
                } else if (direction == 1) {
                    ++y;

                } else if (direction == 2) {
                    --x;

                } else if (direction == 3) {
                    --y;
                }
                steps++;
                StdDraw.setPenColor(StdDraw.BLUE);
                StdDraw.filledSquare(x, y, 0.45);
                StdDraw.show();
                StdDraw.pause(40);

            }
            direction = (direction + 1) % 4;
            if (direction % 2 == 0) {
                stepLength++;
            }
            StdOut.println("Total steps = " + steps);
        }
    }

}

