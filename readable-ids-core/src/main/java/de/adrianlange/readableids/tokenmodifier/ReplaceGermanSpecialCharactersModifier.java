package de.adrianlange.readableids.tokenmodifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public final class ReplaceGermanSpecialCharactersModifier implements TokenModifier {

  private static final List<UnaryOperator<String>> REPLACEMENTS = new ArrayList<>();

  static {
    REPLACEMENTS.add(s -> s.replace("ä", "ae"));
    REPLACEMENTS.add(s -> s.replace("ö", "oe"));
    REPLACEMENTS.add(s -> s.replace("ü", "ue"));
    REPLACEMENTS.add(s -> s.replace("Ä", "Ae"));
    REPLACEMENTS.add(s -> s.replace("Ö", "Oe"));
    REPLACEMENTS.add(s -> s.replace("Ü", "Ue"));
    REPLACEMENTS.add(s -> s.replace("é", "e"));
    REPLACEMENTS.add(s -> s.replace("è", "e"));
    REPLACEMENTS.add(s -> s.replace("ê", "e"));
    REPLACEMENTS.add(s -> s.replace("É", "E"));
    REPLACEMENTS.add(s -> s.replace("È", "E"));
    REPLACEMENTS.add(s -> s.replace("Ê", "E"));
    REPLACEMENTS.add(s -> s.replace("ß", "ss"));
    REPLACEMENTS.add(s -> s.replace("ẞ", "Ss"));
  }

  @Override
  public String[] modifyTokens(String[] tokens) {

    return Arrays.stream(tokens).sequential()
            .map(ReplaceGermanSpecialCharactersModifier::replaceSpecialCharacters)
            .toArray(String[]::new);
  }

  private static String replaceSpecialCharacters(String token) {

    var newToken = token;
    for (var replacement : REPLACEMENTS) {
      newToken = replacement.apply(newToken);
    }
    return newToken.replaceAll("[^a-zA-Z0-9-]", "");
  }
}
