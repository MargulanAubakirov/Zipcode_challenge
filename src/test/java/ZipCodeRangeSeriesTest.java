import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import zip_challenge.ZipCodeRange;
import zip_challenge.ZipCodeRangeSeries;

import java.util.ArrayList;
import java.util.List;

public class ZipCodeRangeSeriesTest {

    private ZipCodeRangeSeries zipCodeRangeSeries;

    @Before
    public void init(){
        zipCodeRangeSeries = new ZipCodeRangeSeries();
    }

    @Test
    public void mergeTestNotMerged(){
        List<ZipCodeRange> input = new ArrayList<>();
        input.add(new ZipCodeRange(94133, 94133));
        input.add(new ZipCodeRange(94200, 94299));
        input.add(new ZipCodeRange(94600, 94699));

        List<ZipCodeRange> output = zipCodeRangeSeries.mergeRanges(input);

        Assert.assertEquals(input, output);

    }

    @Test
    public void mergeTestMerged(){
        List<ZipCodeRange> input = new ArrayList<>();
        input.add(new ZipCodeRange(94133, 94133));
        input.add(new ZipCodeRange(94200, 94299));
        input.add(new ZipCodeRange(94226, 94399));

        List<ZipCodeRange> expectedResult = new ArrayList<>();
        expectedResult.add(new ZipCodeRange(94133, 94133));
        expectedResult.add(new ZipCodeRange(94200, 94399));

        List<ZipCodeRange> mergeResult = zipCodeRangeSeries.mergeRanges(input);

        Assert.assertEquals(expectedResult, mergeResult);
    }

    @Test
    public void mergeTestMerged2(){
        List<ZipCodeRange> input = new ArrayList<>();
        input.add(new ZipCodeRange(49679, 52015));
        input.add(new ZipCodeRange(49800, 50000));
        input.add(new ZipCodeRange(51500, 53479));
        input.add(new ZipCodeRange(51500, 53479));
        input.add(new ZipCodeRange(45012, 46937));
        input.add(new ZipCodeRange(54012, 59607));
        input.add(new ZipCodeRange(45500, 45590));
        input.add(new ZipCodeRange(45999, 47900));
        input.add(new ZipCodeRange(44000, 45000));
        input.add(new ZipCodeRange(43012, 45950));

        List<ZipCodeRange> expectedResult = new ArrayList<>();
        expectedResult.add(new ZipCodeRange(43012, 47900));
        expectedResult.add(new ZipCodeRange(49679, 53479));
        expectedResult.add(new ZipCodeRange(54012, 59607));

        List<ZipCodeRange> mergeResult = zipCodeRangeSeries.mergeRanges(input);

        Assert.assertEquals(expectedResult, mergeResult);
    }


    @Test
    public void mergeNullTest(){
        List<ZipCodeRange> input = null;
        List<ZipCodeRange> mergeResult = zipCodeRangeSeries.mergeRanges(input);

        Assert.assertTrue(mergeResult.isEmpty());
    }

    @Test
    public void mergeOneZipRangeTest(){
        List<ZipCodeRange> input = new ArrayList<>();
        input.add(new ZipCodeRange(94133, 94133));

        List<ZipCodeRange> mergeResult = zipCodeRangeSeries.mergeRanges(input);

        Assert.assertEquals(input, mergeResult);
    }

}
