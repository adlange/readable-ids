package de.adrianlange.readableids.tokenjoiner;

/**
 * Strategy to concatenate tokens in the end to result in an ID.
 */
public interface TokenJoiner {

  /**
   * Concatenates the given tokens to a string.
   *
   * @param tokens Tokens to join
   * @return Joined tokens forming an ID
   */
  String joinTokens(String[] tokens);
}
