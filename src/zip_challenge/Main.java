package zip_challenge;

import java.util.ArrayList;
import java.util.List;

import static zip_challenge.ZipCodeRangeSeries.mergeRanges;

public class Main {

    public static void main(String[] args) {

        List<ZipCodeRange> input = new ArrayList<>();
        input.add(new ZipCodeRange(94133, 94133));
        input.add(new ZipCodeRange(94200, 94299));
        input.add(new ZipCodeRange(94600, 94699));

        List<ZipCodeRange> output = mergeRanges(input);

        for (ZipCodeRange result : output) {
            System.out.println("[" + result.start + "," + result.end + "]");

        }
        System.out.println("_________________");

        List<ZipCodeRange> input2 = new ArrayList<>();
        input2.add(new ZipCodeRange(94133, 94133));
        input2.add(new ZipCodeRange(94200, 94299));
        input2.add(new ZipCodeRange(94226, 94399));

        List<ZipCodeRange> output2 = mergeRanges(input2);

        for (ZipCodeRange result : output2) {
            System.out.println("[" + result.start + "," + result.end + "]");


        }

    }
}