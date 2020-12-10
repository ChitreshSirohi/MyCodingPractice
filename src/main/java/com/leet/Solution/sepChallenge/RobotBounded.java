package com.leet.Solution.sepChallenge;


public class RobotBounded {
    char[] dir = new char[]{'N', 'E', 'S', 'W'};
    int dirIdx = 0;
    int x, y = 0;


    public boolean isRobotBounded(String instructions) {
        this.x =0;
        this.y =0;
        this.dirIdx =0;
        if (instructions == null || instructions.isEmpty() || (instructions.indexOf('G') == -1)) {
            return true;
        }
        int r=0;
        int init=4;
        final char[] chars = instructions.toCharArray();
        for (int iter = 0; iter < 4; iter++) {
            for (final char c : chars) {
                if (c == 'L' || c == 'R') {
                    getAndSetDir(c);
                } else if (c == 'G') {
                    if (this.dir[this.dirIdx] == 'N') {
                        this.x += 1;
                    } else if (this.dir[this.dirIdx] == 'E') {
                        this.y += 1;
                    } else if (this.dir[this.dirIdx] == 'S') {
                        this.x -= 1;
                    } else if (this.dir[this.dirIdx] == 'W') {
                        this.y -= 1;
                    }
                }
            }
        }
/*        if (this.y == 0 && this.x == 0 && this.dirIdx ==0) {
            r++;
        }*/
        return (this.y == 0 && this.x == 0 && this.dirIdx ==0);
    }

    public void getAndSetDir(final char direc) {
        if ('L' == direc) {
            this.dirIdx = this.dirIdx - 1;
            if (this.dirIdx < 0) {
                this.dirIdx = 3;
            }
        } else if ('R' == direc) {
            this.dirIdx = this.dirIdx + 1;
            if (this.dirIdx > 3) {
                this.dirIdx = 0;
            }
        }
    }
}
