package de.adrianlange.readableids.tokenmodifier;

import de.adrianlange.readableids.ReadableIdGenerator;
import de.adrianlange.readableids.tokendictionary.SimpleTokenDictionary;
import de.adrianlange.readableids.tokendictionary.TokenDictionary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReplaceGermanSpecialCharactersModifierTest {

  @Test
  void testReplaceSpecialCharacters() {

    var generator = new ReadableIdGenerator()
            .withTokenDictionary(SIMPLE_DICTIONARY)
            .withTokenModifier(new ReplaceGermanSpecialCharactersModifier());

    var id = generator.nextId();

    Assertions.assertNotNull(id);
    Assertions.assertEquals(13, id.length());
    Assertions.assertTrue(id.matches("^[a-zA-Z]+$"));
  }

  private static TokenDictionary createFromTokenArrays(String[][] tokenArrays) {

    return new SimpleTokenDictionary(tokenArrays) {

    };
  }

  private static final TokenDictionary SIMPLE_DICTIONARY = createFromTokenArrays(
          new String[][] {
                  new String[] { "föä" },
                  new String[] { "bßr" },
                  new String[] { "Bür", "béèZ" },
          }
  );
}
