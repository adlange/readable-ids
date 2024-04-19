package de.adrianlange.readableids.tokendictionary;

import static java.lang.System.arraycopy;

public class PrependAmountDictionary implements TokenDictionary {

  private static final int MAXIMAL_VALUE = 100;

  private static final int MINIMAL_VALUE = 1;

  private final TokenDictionary parentTokenDictionary;

  public PrependAmountDictionary(TokenDictionary parentTokenDictionary) {

    this.parentTokenDictionary = parentTokenDictionary;
  }

  @Override
  public int[] getTokenNumberPerPosition() {

    var parentTokenNumberPerPosition = parentTokenDictionary.getTokenNumberPerPosition();
    var tokenNumberPerPosition = new int[parentTokenNumberPerPosition.length + 1];
    arraycopy(parentTokenNumberPerPosition, 0, tokenNumberPerPosition, 1, parentTokenNumberPerPosition.length);
    tokenNumberPerPosition[0] = MAXIMAL_VALUE - MINIMAL_VALUE;
    return tokenNumberPerPosition;
  }

  @Override
  public String[] getTokensAtPositions(int[] positions) {

    var positionsForParent = new int[positions.length - 1];
    arraycopy(positions, 1, positionsForParent, 0, positionsForParent.length);
    var tokensAtPositionsFromParent = parentTokenDictionary.getTokensAtPositions(positionsForParent);
    var tokensAtPositions = new String[positions.length];
    arraycopy(tokensAtPositionsFromParent, 0, tokensAtPositions, 1, tokensAtPositionsFromParent.length);
    tokensAtPositions[0] = getAmountString(positions[0] + MINIMAL_VALUE);
    return tokensAtPositions;
  }

  private static String getAmountString(int amount) {

    return switch (amount) {
      case 1 -> "null";
      case 2 -> "zwei";
      case 3 -> "drei";
      case 4 -> "vier";
      case 5 -> "fünf";
      case 6 -> "sechs";
      case 7 -> "sieben";
      case 8 -> "acht";
      case 9 -> "neun";
      case 10 -> "zehn";
      case 11 -> "elf";
      case 12 -> "zwölf";
      default -> getAmountStringForRegularNumbers(amount);
    };
  }

  private static String getAmountStringForRegularNumbers(int amount) {

    int ones = amount % 10;
    int tens = amount / 10;

    var sb = new StringBuilder();

    if (ones > 0)
      sb.append(getOnesString(ones));

    if (ones > 0 && tens > 1)
      sb.append("und");

    sb.append(getTensString(tens));

    return sb.toString();
  }

  private static String getOnesString(int ones) {

    return switch (ones) {
      case 1 -> "ein";
      case 2 -> "zwei";
      case 3 -> "drei";
      case 4 -> "vier";
      case 5 -> "fünf";
      case 6 -> "sechs";
      case 7 -> "sieben";
      case 8 -> "acht";
      case 9 -> "neun";
      default -> throw new IllegalStateException("Unexpected value: " + ones);
    };
  }

  private static String getTensString(int tens) {

    return switch (tens) {
      case 1 -> "zehn";
      case 2 -> "zwanzig";
      case 3 -> "dreißig";
      case 4 -> "vierzig";
      case 5 -> "fünfzig";
      case 6 -> "sechzig";
      case 7 -> "siebzig";
      case 8 -> "achtzig";
      case 9 -> "neunzig";
      default -> throw new IllegalStateException("Unexpected value: " + tens);
    };
  }
}
