package zip_challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ZipCodeRange {
    public static List<Range> mergeRanges(List<Range> ranges) {

        List<Range> output = new ArrayList<>();

        //Sort the range by start attribute
        Collections.sort(ranges, (a, b) -> Integer.compare(a.start, b.start));

        //Take range present at 0th element
        Range temp = ranges.get(0);
        int start = temp.start;
        int end = temp.end;

        //Traverse a list
        for (int i = 1; i < ranges.size(); i++) {

            temp = ranges.get(i);

            if (temp.start <= end) {
                end = Math.max(end, temp.end);
            } else {
                output.add(new Range(start, end));
                start = temp.start;
                end = temp.end;
            }
        }

        output.add(new Range(start, end));
        return output;
    }


}



