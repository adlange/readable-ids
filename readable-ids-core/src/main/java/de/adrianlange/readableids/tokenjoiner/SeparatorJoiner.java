package de.adrianlange.readableids.tokenjoiner;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SeparatorJoiner implements TokenJoiner {

  private final String separator;

  public SeparatorJoiner(String separator) {

    this.separator = separator;
  }

  @Override
  public String joinTokens(String[] tokens) {

    return Arrays.stream(tokens).sequential()
            .collect(Collectors.joining(separator));
  }
}
