package de.adrianlange.readableids.tokenmodifier;

/**
 * Modifying function which performs a change on each token in the array, which forms the ID later.
 */
public interface TokenModifier {

  /**
   * Modify given tokens in a specified way.
   *
   * @param tokens Tokens to modify
   * @return New array of modified tokens
   */
  String[] modifyTokens(String[] tokens);
}
