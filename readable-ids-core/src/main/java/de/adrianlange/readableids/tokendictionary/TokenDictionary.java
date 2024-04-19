package de.adrianlange.readableids.tokendictionary;

/**
 * Defines a dictionary of possible words/values per position for the token.
 */
public interface TokenDictionary {

  /**
   * Returns an array of the amount of possible tokens per position in the dictionary. The length of the returning array also specifies the expected number of tokens, which form
   * the ID in the end.
   *
   * @return Array of amount of tokens per position
   */
  int[] getTokenNumberPerPosition();

  /**
   * Get token values specified by the given positions array.
   *
   * @param positions Positions of the tokens per position in the dictionary
   * @return Array of tokens, which form the ID in the end
   */
  String[] getTokensAtPositions(int[] positions);
}
