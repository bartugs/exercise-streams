package nl.han.aim.oose.dea;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsCreateFullSentence {
    String createAFullSentenceFromTheList(List<String> input) {
        // TODO: implement
        return input.stream().reduce("", (string1, string2) -> string1 + " " + string2 );
    }
}
