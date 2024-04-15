package de.adrianlange.readableids.tokendictionary;

import de.adrianlange.readableids.ConfigurationException;
import de.adrianlange.readableids.ReadableIdGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleTokenDictionaryTest {

  @Test
  void testNextIdWithDefaultJoinerHasNoSeparators() {

    var generator = new ReadableIdGenerator()
            .withTokenDictionary(SIMPLE_DICTIONARY);

    var id = generator.nextId();

    Assertions.assertNotNull(id);
    Assertions.assertEquals(9, id.length());
    Assertions.assertTrue(id.matches("^[a-zA-Z]+$"));
  }

  @Test
  void testNextIdWithoutDictionaryThrowsException() {

    var generator = new ReadableIdGenerator();

    var exception = Assertions.assertThrows(ConfigurationException.class, generator::nextId);

    Assertions.assertEquals("At least one token dictionary is required", exception.getMessage());
  }

  @Test
  void testNextIdWithEmptyDictionaryReturnsEmptyIDs() {

    var emptyDictionary = createFromTokenArrays(
            new String[][] {}
    );

    var generator = new ReadableIdGenerator()
            .withTokenDictionary(emptyDictionary);

    var id = generator.nextId();

    Assertions.assertNotNull(id);
    Assertions.assertEquals(0, id.length());
  }

  @Test
  void testNextIdWithDictionaryWithEmptyPosition() {

    var emptyPositionDictionary = createFromTokenArrays(
            new String[][] {
                    new String[] { "foo", "Bar", "baZ" },
                    new String[] {},
                    new String[] { "BAZ" },
            }
    );

    var generator = new ReadableIdGenerator()
            .withTokenDictionary(emptyPositionDictionary);

    var exception = Assertions.assertThrows(ConfigurationException.class, generator::nextId);

    Assertions.assertEquals("bound must be positive", exception.getMessage());
  }

  private static TokenDictionary createFromTokenArrays(String[][] tokenArrays) {

    return new SimpleTokenDictionary(tokenArrays) {

    };
  }

  private static final TokenDictionary SIMPLE_DICTIONARY = createFromTokenArrays(
          new String[][] {
                  new String[] { "foo", "Bar", "baZ" },
                  new String[] { "Foo", "bAr" },
                  new String[] { "BAZ" },
          }
  );
}
