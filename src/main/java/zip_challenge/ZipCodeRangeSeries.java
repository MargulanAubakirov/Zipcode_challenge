package zip_challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ZipCodeRangeSeries {

    private Logger logger = LoggerFactory.getLogger(ZipCodeRangeSeries.class);

    public List<ZipCodeRange> mergeRanges(List<ZipCodeRange> ranges) {

        if (ranges == null) {
            logger.error("Ranges list is NULL");
            return Collections.emptyList();
        }

        logger.info("The ranges size is {}", ranges.size());
        logger.debug("The ranges is {}", ranges);

        List<ZipCodeRange> output = new ArrayList<>();

        //Sort the ranges by start index
        ranges.sort((a, b) -> Integer.compare(a.getStart(), b.getStart()));
        logger.info("Zip list was sorted by stat zip from the range");

        //Define the first range as 0th element in list
        ZipCodeRange temp = ranges.get(0);
        int start = temp.getStart();
        int end = temp.getEnd();

        //Iterate through a list
        for (int i = 1; i < ranges.size(); i++) {
            temp = ranges.get(i);
            //check if first element of next range is lesser/in range of previous range or include,
            // that mean that ranges overlaping, then end element of next range will be end element
            // of start element of previous range
            if (temp.getStart() <= end) {
                end = Math.max(end, temp.getEnd());
            } else {
                output.add(new ZipCodeRange(start, end));
                start = temp.getStart();
                end = temp.getEnd();
            }
        }

        output.add(new ZipCodeRange(start, end));
        logger.info("The result size is {}", output.size());
        logger.debug("Output is {}", output);
        return output;
    }

}



