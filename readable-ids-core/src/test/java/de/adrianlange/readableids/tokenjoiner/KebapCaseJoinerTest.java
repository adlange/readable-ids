package de.adrianlange.readableids.tokenjoiner;

import de.adrianlange.readableids.ReadableIdGenerator;
import de.adrianlange.readableids.tokendictionary.SimpleTokenDictionary;
import de.adrianlange.readableids.tokendictionary.TokenDictionary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KebapCaseJoinerTest {

  @Test
  void testNextId() {

    var generator = new ReadableIdGenerator()
            .withTokenDictionary(SIMPLE_DICTIONARY)
            .withIdJoiner(new KebapCaseJoiner());

    var id = generator.nextId();

    Assertions.assertNotNull(id);
    Assertions.assertEquals(11, id.length());
    Assertions.assertTrue(id.matches("^[a-zA-Z-]+$"));
    Assertions.assertEquals(3, id.split("-").length);
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
