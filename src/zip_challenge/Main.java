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

        System.out.println("_________________");

        List<ZipCodeRange> input3 = new ArrayList<>();
        input3.add(new ZipCodeRange(49679, 52015));
        input3.add(new ZipCodeRange(49800, 50000));
        input3.add(new ZipCodeRange(51500, 53479));
        input3.add(new ZipCodeRange(51500, 53479));
        input3.add(new ZipCodeRange(45012, 46937));
        input3.add(new ZipCodeRange(54012, 59607));
        input3.add(new ZipCodeRange(45500, 45590));
        input3.add(new ZipCodeRange(45999, 47900));
        input3.add(new ZipCodeRange(44000, 45000));
        input3.add(new ZipCodeRange(43012, 45950));


        List<ZipCodeRange> output3 = mergeRanges(input3);

        for (ZipCodeRange result : output3) {
            System.out.println("[" + result.start + "," + result.end + "]");


        }

    }
}