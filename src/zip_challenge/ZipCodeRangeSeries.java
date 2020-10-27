package zip_challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ZipCodeRangeSeries {
    public static List<ZipCodeRange> mergeRanges(List<ZipCodeRange> ranges) {

        List<ZipCodeRange> output = new ArrayList<>();

        //Sort the ranges by start index
        Collections.sort(ranges, (a, b) -> Integer.compare(a.start, b.start));

        //Define the first range as 0th element in list
        ZipCodeRange temp = ranges.get(0);
        int start = temp.start;
        int end = temp.end;

        //Iterate through a list
        for (int i = 1; i < ranges.size(); i++) {
            temp = ranges.get(i);
            //check if first element of next range is lesser/in range of previous range or include,
            // that mean that ranges overlaping, then end element of next range will be end element
            // of start element of previous range
            if (temp.start <= end) {
                end = Math.max(end, temp.end);
            } else {
                output.add(new ZipCodeRange(start, end));
                start = temp.start;
                end = temp.end;
            }
        }

        output.add(new ZipCodeRange(start, end));
        return output;
    }

}



