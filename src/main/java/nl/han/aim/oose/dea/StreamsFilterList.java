package nl.han.aim.oose.dea;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Character.isDigit;

public class StreamsFilterList {
    List<String> filterStringsShorterThanThreeCharacters(List<String> input) {
        // TODO: implement
        return  input.stream().filter(string -> string.length() < 3).toList();
    }

    List<String> filterStringsThatContainOnlyNumerals(List<String> input) {
            // TODO: implement
            return input.stream().filter(string -> string.matches("\\d+")).toList();
    }
}
