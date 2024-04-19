package de.adrianlange.readableids.tokendictionary;

import static java.lang.System.arraycopy;

public class AppendNumberDictionary implements TokenDictionary {

  private static final int DEFAULT_MINIMAL_VALUE = 0;

  private static final int DEFAULT_MAXIMAL_VALUE = 1000;

  private final TokenDictionary parentTokenDictionary;

  private final int minimalValueInc;

  private final int maximalValueExc;

  public AppendNumberDictionary(TokenDictionary parentTokenDictionary) {

    this(parentTokenDictionary, DEFAULT_MINIMAL_VALUE, DEFAULT_MAXIMAL_VALUE);
  }

  public AppendNumberDictionary(TokenDictionary parentTokenDictionary, int maximalValueExc) {

    this(parentTokenDictionary, DEFAULT_MINIMAL_VALUE, maximalValueExc);
  }

  public AppendNumberDictionary(TokenDictionary parentTokenDictionary, int minimalValueInc, int maximalValueExc) {

    this.parentTokenDictionary = parentTokenDictionary;
    this.minimalValueInc = minimalValueInc;
    this.maximalValueExc = maximalValueExc;
  }

  @Override
  public int[] getTokenNumberPerPosition() {

    var parentTokenNumberPerPosition = parentTokenDictionary.getTokenNumberPerPosition();
    var tokenNumberPerPosition = new int[parentTokenNumberPerPosition.length + 1];
    arraycopy(parentTokenNumberPerPosition, 0, tokenNumberPerPosition, 0, parentTokenNumberPerPosition.length);
    tokenNumberPerPosition[parentTokenNumberPerPosition.length] = maximalValueExc - minimalValueInc;
    return tokenNumberPerPosition;
  }

  @Override
  public String[] getTokensAtPositions(int[] positions) {

    var positionsForParent = new int[positions.length - 1];
    arraycopy(positions, 0, positionsForParent, 0, positionsForParent.length);
    var tokensAtPositionsFromParent = parentTokenDictionary.getTokensAtPositions(positionsForParent);
    var tokensAtPositions = new String[positions.length];
    arraycopy(tokensAtPositionsFromParent, 0, tokensAtPositions, 0, tokensAtPositionsFromParent.length);
    tokensAtPositions[positionsForParent.length] = String.valueOf(positions[positionsForParent.length] + minimalValueInc);
    return tokensAtPositions;
  }
}
