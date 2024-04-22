package de.adrianlange.readableids.tokendictionary;

public abstract class SimpleTokenDictionary implements TokenDictionary {

  private final String[][] dictionary;

  protected SimpleTokenDictionary(String[][] dictionary) {

    this.dictionary = dictionary;
  }

  @Override
  public int[] getTokenNumberPerPosition() {

    var tokenNumberPerPosition = new int[dictionary.length];
    for (int i = 0; i < dictionary.length; i++) {
      tokenNumberPerPosition[i] = dictionary[i].length;
    }
    return tokenNumberPerPosition;
  }

  @Override
  public String[] getTokensAtPositions(int[] positions) {

    if (positions.length != dictionary.length) {
      throw new IllegalArgumentException("Wrong number of tokens per position");
    }

    var tokens = new String[dictionary.length];
    for (int i = 0; i < dictionary.length; i++) {
      tokens[i] = dictionary[i][positions[i]];
    }
    return tokens;
  }

  @Override
  public long getNumberOfPossibleCombinations() {

    long numberOfCombinations = 1;
    for (var tokenArray : dictionary) {
      numberOfCombinations *= tokenArray.length;
    }
    return numberOfCombinations;
  }
}
