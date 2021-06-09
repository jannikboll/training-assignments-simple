package eu.sig.training.ch03;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlagFactory {

    private static Map<Nationality,List<Color>> flagColors = new HashMap<>();
    private static final List<Color> defaultColor = Arrays.asList(Color.GRAY);
    static {
        flagColors.put(Nationality.DUTCH, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
        flagColors.put(Nationality.GERMAN, Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW));
        flagColors.put(Nationality.BELGIAN, Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED));
        flagColors.put(Nationality.FRENCH, Arrays.asList(Color.BLUE, Color.WHITE, Color.RED));
        flagColors.put(Nationality.ITALIAN, Arrays.asList(Color.GREEN, Color.WHITE, Color.RED));
        flagColors.put(Nationality.ROMANIA,  Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED));
        flagColors.put(Nationality.IRELAND, Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE));
        flagColors.put(Nationality.HUNGARIAN, Arrays.asList(Color.RED, Color.WHITE, Color.GREEN));
        flagColors.put(Nationality.BULGARIAN, Arrays.asList(Color.WHITE, Color.GREEN, Color.RED));
        flagColors.put(Nationality.RUSSIA, Arrays.asList(Color.WHITE, Color.BLUE, Color.RED));
        flagColors.put(Nationality.UNCLASSIFIED, defaultColor);
    }

    // tag::getFlag[]
    public List<Color> getFlagColors(Nationality nationality) {
       return flagColors.getOrDefault(nationality, defaultColor);
    }
    // end::getFlag[]

}
