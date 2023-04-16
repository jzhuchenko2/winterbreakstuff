import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class TaskBlinkList {
    private List<Blink> blinks;

    public TaskBlinkList() {
        this.blinks = new ArrayList<Blink>();
    }

    public void addBlink(Blink blink) {
        blinks.add(blink);
    }

    public List<Blink> search(
        boolean fiftyPercentStartTimeCriterion_Specified,
        String fiftyPercentStartTimeCriterion_ComparisonString,
        int fiftyPercentStartTimeCriterion_Value,
        boolean fiftyPercentEndTimeCriterion_Specified,
        String fiftyPercentEndTimeCriterion_ComparisonString,
        int fiftyPercentEndTimeCriterion_Value,
        boolean fiftyPercentWindowDurationCriterion_Specified,
        String fiftyPercentWindowDurationCriterion_ComparisonString,
        int fiftyPercentWindowDurationCriterion_Value,
        boolean amplitudeCriterion_Specified,
        String amplitudeCriterion_ComparisonString,
        int amplitudeCriterion_Value,
        boolean styleCriterion_Specified,
        BlinkStyle styleCriterion_Value,
        boolean gazeShiftCriterion_Specified,
        BlinkGazeAssociation gazeShiftCriterion_Value) {

        List<Blink> matchingBlinks = new ArrayList<Blink>();

        for (Iterator<Blink> i = blinks.iterator(); i.hasNext(); ) {
            Blink checkBlink = i.next();

            // If a 50% start time criterion is specified for the search, then
            // if the checkBlink doesn't match the specified criterion, we can
            // move on to the next blink.
            if (fiftyPercentStartTimeCriterion_Specified) {
                if (fiftyPercentStartTimeCriterion_ComparisonString.equals(">")) {
                    if (!(checkBlink.getFiftyPercentStartTime() > fiftyPercentStartTimeCriterion_Value)) continue;
                } else { // comparison string is "<"
                    if (!(checkBlink.getFiftyPercentStartTime() < fiftyPercentStartTimeCriterion_Value)) continue;   
                }
            } 

            // If a 50% end time criterion is specified for the search, then
            // if the checkBlink doesn't match the specified criterion, we can 
            // move on to the next blink.
            if (fiftyPercentEndTimeCriterion_Specified) {
                if (fiftyPercentEndTimeCriterion_ComparisonString.equals(">")) {
                    if (!(checkBlink.getFiftyPercentEndTime() > fiftyPercentEndTimeCriterion_Value)) continue;
                } else { // comparison string is "<" 
                    if (!(checkBlink.getFiftyPercentEndTime() < fiftyPercentEndTimeCriterion_Value)) continue;
                }
            }

            // If a 50% window duration criterion is specified for the search,
            // then if the checkBlink doesn't match the specified criterion, we can
            // move on to the next blink.
            if (fiftyPercentWindowDurationCriterion_Specified) {
                if (fiftyPercentWindowDurationCriterion_ComparisonString.equals(">")) {
                    if (!(checkBlink.getFiftyPercentEndTime() - checkBlink.getFiftyPercentStartTime() > 
                            fiftyPercentWindowDurationCriterion_Value)) continue;
                } else { // comparison string is "<"
                    if (!(checkBlink.getFiftyPercentEndTime() - checkBlink.getFiftyPercentStartTime() < 
                            fiftyPercentWindowDurationCriterion_Value)) continue;
                }
            }

            // If an amplitude criterion is specified for the search,
            // then if the checkBlink doesn't match the specified criterion, we can
            // move on to the next blink.
            if (amplitudeCriterion_Specified) {
                if (amplitudeCriterion_ComparisonString.equals(">")) {
                    if (!(checkBlink.getAmplitude() > amplitudeCriterion_Value)) continue;
                } else { // comparison string is "<"
                    if (!(checkBlink.getAmplitude() < amplitudeCriterion_Value)) continue;
                }
            }

            // If a style criterion is specified for the search,
            // then if the checkBlink doesn't match the specified style, we can 
            // move on to the next blink.
            if (styleCriterion_Specified) {
                if (!(checkBlink.getStyle() == styleCriterion_Value)) continue;
            }

            // If an associated gaze shift criterion is specified for the search,
            // then if the checkBlink doesn't match the specified associated gaze shift, we can
            // move on to the next blink.
            if (gazeShiftCriterion_Specified) {
                if (!(checkBlink.getGazeAssociation() == gazeShiftCriterion_Value)) continue;
            }

            // If we get here, the checkBlink has passed all the tests and should be added
            // to our list of matching blinks.
            matchingBlinks.add(checkBlink);
        }

        // When we get here, we've gone through all the blinks in this list and checked to see if they
        // match all the specified criteria.
        return matchingBlinks;
    }
}