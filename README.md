# readable-ids

The readable-ids library makes it possible to generate IDs that are easy for humans to read. It is based on dictionaries
that can either be created individually or selected from a supplied selection of different dictionaries. The library
offers various modifications and merging strategies that can be customized or created for specific applications. This
allows developers to create flexible and user-friendly IDs that are both easy to read and easy to remember.

## Usage

### Add the dependency to your project

**Gradle**

```gradle
implementation 'de.adrianlange:readable-ids-core:0.0.1'
```

**Maven**

```xml
<dependency>
    <groupId>de.adrianlange</groupId>
    <artifactId>readable-ids-core</artifactId>
    <version>0.0.1</version>
</dependency>
```

### Create new Readable IDs generator from simple dictionary

```java
public class FooDictionary extends SimpleTokenDictionary {

  private static final String[][] DICTIONARY = new String[][] {
          new String[] { "blue", "red", "yellow", "brown", "green", "black", "brown", "white" },
          new String[] { "balloon", "chair", "bird", "pillow" }
  };

  public FooDictionary() {
    super(DICTIONARY);
  }
}
```

```java
var generator = new ReadableIdGenerator()
        .withTokenDictionary(new FooDictionary());
for (int i = 0; i < 5; i++) {
  System.out.println(generator.nextId());
}
/*
 * generates:
 *  blackballoon
 *  yellowballoon
 *  greenpillow
 *  blackchair
 *  yellowchair
 */
```

You can easily create your own dictionary by extending `SimpleTokenDictionary` or even implement `TokenDictionary`.

### Increase existing dictionaries with decorator dictionaries

```java
var generator = new ReadableIdGenerator()
        .withTokenDictionary(new AppendNumberDictionary(new FooDictionary()));
for (int i = 0; i < 5; i++) {
  System.out.println(generator.nextId());
}
/*
 * generates:
 *  blackballoon-612
 *  yellowballoon-35
 *  greenpillow-706
 *  blackchair-1
 *  yellowchair-532
 */
```

Another preedefined decorator dictionary is `PrependAmountGermanDictionary`.

### Modify all tokens before creating a token

```java
var generator = new ReadableIdGenerator()
        .withTokenDictionary(new FooDictionary())
        .withTokenModifier(new UpperCaseModifier());
for (int i = 0; i < 5; i++) {
  System.out.println(generator.nextId());
}
/*
 * generates:
 *  BLACKBALLOON
 *  YELLOWBALLOON
 *  GREENPILLOW
 *  BLACKCHAIR
 *  YELLOWCHAIR
 */
```

Other given modifiers are `LowerCaseModifier` and `ReplaceGermanSpecialCharactersModifier`.

You can easily create your own modifier by implementing the interface `TokenModifier`.

### Change the way tokens are joined forming an ID

```java
var generator = new ReadableIdGenerator()
        .withTokenDictionary(new FooDictionary())
        .withTokenJoiner(new SeparatorJoiner("-"));
for (int i = 0; i < 5; i++) {
  System.out.println(generator.nextId());
}
/*
 * generates:
 *  black-balloon
 *  yellow-balloon
 *  green-pillow
 *  black-chair
 *  yellow-chair
 */
```

You can easily create your own joiner by implementing the interface `TokenJoiner`.

## Changelog

A list of changes can be found under [CHANGELOG.md](./CHANGELOG.md).
