package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Range rangeOne = new Range(94133, 94133);
        Range rangeTwo = new Range(94200, 94299);
        Range rangeThree = new Range(94600, 94699);

        // Call the generateMinimumRanges method on the ZipCodeRanges class
        // Pass newly created range objects into the method
        ZipCodeRanges.generateMinimumRanges(rangeOne);
        ZipCodeRanges.generateMinimumRanges(rangeTwo);
        ZipCodeRanges.generateMinimumRanges(rangeThree);

        // Call the printMinimumRanges method on the ZipCodeRanges class
        ZipCodeRanges.printMinimumRanges();

        // Call the getMinimumRangeList method on the ZipCodeRanges class
        // ZipCodeRanges.getMinimumRangeList();



    }
}
