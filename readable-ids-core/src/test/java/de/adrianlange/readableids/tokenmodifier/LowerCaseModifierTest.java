package de.adrianlange.readableids.tokenmodifier;

import de.adrianlange.readableids.ReadableIdGenerator;
import de.adrianlange.readableids.tokendictionary.SimpleTokenDictionary;
import de.adrianlange.readableids.tokendictionary.TokenDictionary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LowerCaseModifierTest {

  @Test
  void testLowerCaseModifier() {

    var generator = new ReadableIdGenerator()
            .withTokenDictionary(SIMPLE_DICTIONARY)
            .withTokenModifier(new LowerCaseModifier());

    var id = generator.nextId();

    Assertions.assertNotNull(id);
    Assertions.assertEquals(9, id.length());
    Assertions.assertTrue(id.matches("^[a-z]+$"));
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
