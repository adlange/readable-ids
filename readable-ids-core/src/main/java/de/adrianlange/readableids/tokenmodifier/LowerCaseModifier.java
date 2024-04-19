package de.adrianlange.readableids.tokenmodifier;

import java.util.Arrays;

public final class LowerCaseModifier implements TokenModifier {

  @Override
  public String[] modifyTokens(String[] tokens) {

    return Arrays.stream(tokens).sequential()
            .map(String::toLowerCase)
            .toArray(String[]::new);
  }
}
