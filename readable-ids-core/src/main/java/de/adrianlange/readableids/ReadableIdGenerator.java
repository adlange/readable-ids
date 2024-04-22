package de.adrianlange.readableids;

import de.adrianlange.readableids.tokendictionary.TokenDictionary;
import de.adrianlange.readableids.tokenjoiner.ConcatJoiner;
import de.adrianlange.readableids.tokenjoiner.TokenJoiner;
import de.adrianlange.readableids.tokenmodifier.TokenModifier;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

/**
 * Create readable IDs from given dictionaries, apply modifiers and join the tokens from the dictionaries by a defined strategy.
 */
public final class ReadableIdGenerator {

  private RandomGenerator randomGenerator = new Random();

  private final List<TokenDictionary> tokenDictionaries = new ArrayList<>();

  private final List<TokenModifier> tokenModifiers = new ArrayList<>();

  private TokenJoiner tokenJoiner = new ConcatJoiner();

  /**
   * Adds a token dictionary to the generator. At least one dictionary must be added for the generator to work.
   *
   * @param tokenDictionary Token dictionary to add
   * @return This instance (fluent API)
   */
  public ReadableIdGenerator withTokenDictionary(TokenDictionary tokenDictionary) {

    if (tokenDictionary == null) {
      throw new IllegalArgumentException("tokenDictionary cannot be null");
    }
    tokenDictionaries.add(tokenDictionary);
    return this;
  }

  /**
   * Adds a token modifier to the generator to edit all tokens, which form the ID later. Modifiers are applied in the order they are added to the generator.
   *
   * @param tokenModifier Token modifier to add
   * @return This instance (fluent API)
   */
  public ReadableIdGenerator withTokenModifier(TokenModifier tokenModifier) {

    if (tokenModifier == null) {
      throw new IllegalArgumentException("tokenModifier cannot be null");
    }
    tokenModifiers.add(tokenModifier);
    return this;
  }

  /**
   * Sets the token joiner strategy to get an ID from the tokens. Per default {@link ConcatJoiner} is used with an empty separator.
   *
   * @param tokenJoiner Token joiner strategy to create an ID.
   * @return This instance (fluent API)
   */
  public ReadableIdGenerator withIdJoiner(TokenJoiner tokenJoiner) {

    if (tokenJoiner == null) {
      throw new IllegalArgumentException("tokenJoiner cannot be null");
    }
    this.tokenJoiner = tokenJoiner;
    return this;
  }

  /**
   * Sets the {@link RandomGenerator} instance. Per default {@link Random} is used.
   *
   * @param randomGenerator Random generator to use.
   * @return This instance (fluent API)
   */
  public ReadableIdGenerator withRandomGenerator(RandomGenerator randomGenerator) {

    if (randomGenerator == null) {
      throw new IllegalArgumentException("randomGenerator cannot be null");
    }
    this.randomGenerator = randomGenerator;
    return this;
  }

  /**
   * @return a new ID
   */
  public String nextId() {

    checkTokenDictionaryIsGiven();

    var idFromDictionary = getIdFromDictionary();
    for (var idModifier : tokenModifiers) {
      idFromDictionary = idModifier.modifyTokens(idFromDictionary);
    }
    return tokenJoiner.joinTokens(idFromDictionary);
  }

  /**
   * Returns the number of possible combinations of tokens for all dictionaries.
   *
   * @return Number of possible combinations
   */
  public long getNumberOfPossibleCombinations() {

    return tokenDictionaries.stream()
            .map(TokenDictionary::getNumberOfPossibleCombinations)
            .reduce(0L, Long::sum);
  }

  private String[] getIdFromDictionary() {

    var dictionary = tokenDictionaries.get(randomGenerator.nextInt(tokenDictionaries.size()));
    var tokenNumberPerPosition = dictionary.getTokenNumberPerPosition();

    var tokenPositions = new int[tokenNumberPerPosition.length];
    for (int i = 0; i < tokenNumberPerPosition.length; i++) {
      try {
        tokenPositions[i] = randomGenerator.nextInt(tokenNumberPerPosition[i]);
      } catch (IllegalArgumentException e) {
        throw new ConfigurationException(e.getMessage(), e);
      }
    }
    return dictionary.getTokensAtPositions(tokenPositions);
  }

  private void checkTokenDictionaryIsGiven() {

    if (tokenDictionaries.isEmpty()) {
      throw new ConfigurationException("At least one token dictionary is required");
    }
  }
}
