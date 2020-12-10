package com.leet.Solution.mayChallenge;

public class VersionControl {
    int[] version;

    public void setVersion(int[] version) {
        this.version = version;
    }

    public boolean isBadVersion(int n) {
        return this.version[n-1] == 1;
    }

    public int firstBadVersion(int n) {
        if (n < 2) {
            return n;
        }
        if(n==2){
            if (isBadVersion(1)){
                return 1;
            }
            return 2;
        }
        int start = 1;
        int end = n ;
        int mid = 0;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (isBadVersion(mid) ) {
                end = mid;
            }  else {
                start = mid + 1;
            }
        }
        if(start == end && isBadVersion(start)){
            return start;
        }
        return -1;
    }
}




