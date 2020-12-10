package com.leet.Solution.amazon;// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class NumberAmazonTreasureTrucks
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    int numberAmazonTreasureTrucks(int rows, int column,
                                   List<List<Integer> > grid){

 
    return 0;
}

    private int getParent(int[] parent, int i) {
        while (parent[i] != i) {
            i = parent[i];
        }

        return i;
    }
    // METHOD SIGNATURE ENDS
}