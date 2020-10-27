/**
 * Class: 	ZipCodeRange
 *  Range of restricted ZipCodes
 * 	start:	Zip Code start range (inclusive).
 * 	end:	Zip Code end range (inclusive).
 */

package zip_challenge;

public class ZipCodeRange {
    int start; //lower bound
    int end; //upper bound

    public ZipCodeRange(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
