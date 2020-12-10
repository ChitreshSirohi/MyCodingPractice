package com.leet.Solution.JulyChallenge;

public class AngleClock {
    public double angleClock(int hour, int minutes) {
        final float degreePerHour = 30;
        final float hourMinorAngle = degreePerHour/60;
        final float hourAngle = (hour * degreePerHour) + (minutes * hourMinorAngle);
        final float degreePerMin = 6;
        final float minAngle = minutes * degreePerMin;
        final float abs = Math.abs(hourAngle - minAngle);
        if(abs > 180){
            return 360 - abs;
        }
        return abs;
    }
}
