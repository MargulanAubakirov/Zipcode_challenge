/**
 * Class: 	ZipCodeRange
 *  Range of restricted ZipCodes
 * 	start:	Zip Code start range (inclusive).
 * 	end:	Zip Code end range (inclusive).
 */

package zip_challenge;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class ZipCodeRange {
    //lower bound
    private int start;
    //upper bound
    private int end;
}
