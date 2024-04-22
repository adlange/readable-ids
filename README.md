# readable-ids

The readable-ids library makes it possible to generate IDs that are easy for humans to read. It is based on dictionaries
that can either be created individually or selected from a supplied selection of different dictionaries. The library
offers various modifications and merging strategies that can be customized or created for specific applications. This
allows developers to create flexible and user-friendly IDs that are both easy to read and easy to remember.

## Usage

### Add the Dependency to Your Project

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

### Create New Readable IDs Generator From Simple Dictionary

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

### Increase Existing Dictionaries With Decorator Dictionaries

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

### Modify All Tokens Before Creating a Token

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

### Change the Way Tokens are Joined Forming an ID

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

### German Dictionary with Adjectives and Nouns

To use the German dictionary you need to include the following dependency. 

```gradle
implementation 'de.adrianlange:readable-ids-dictionary-german-adjective-noun:0.0.1'
```

```xml
<dependency>
    <groupId>de.adrianlange</groupId>
    <artifactId>readable-ids-dictionary-german-adjective-noun</artifactId>
    <version>0.0.1</version>
</dependency>
```

Use it preferably with the token modifier `ReplaceGermanSpecialCharactersModifier`:

```java
var generator = new ReadableIdGenerator()
        .withTokenDictionary(new GermanAdjectiveNounDictionary())
        .withTokenModifier(new ReplaceGermanSpecialCharactersModifier())
        .withTokenModifier(new LowerCaseModifier())
        .withIdJoiner(new KebapCaseJoiner());
for (int i = 0; i < 5; i++) {
  System.out.println(generator.nextId());
}
/*
 * generates:
 *  beachtliche-reinigungen
 *  nachhaltige-elefanten
 *  vertrauenswuerdige-spieler
 *  hoefliche-heckenpflanzen
 *  interessante-insekten
 */
```

### Using Multiple Modules of readable-ids

To avoid having to maintain the module version individually, it is advisable to use the BOM.

**Gradle**

```gradle
implementation(platform("de.adrianlange:readable-ids:0.0.1"))
implementation("de.adrianlange:readable-ids-core")
implementation("de.adrianlange:readable-ids-dictionary-german-adjective-noun")
```

**Maven**

```xml
 <dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>de.adrianlange</groupId>
            <artifactId>readable-ids</artifactId>
            <version>0.0.1</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>

<dependency>
    <groupId>de.adrianlange</groupId>
    <artifactId>readable-ids-core</artifactId>
</dependency>
<dependency>
    <groupId>de.adrianlange</groupId>
    <artifactId>readable-ids-dictionary-german-adjective-noun</artifactId>
</dependency>
```

## Changelog

A list of changes can be found under [CHANGELOG.md](./CHANGELOG.md).
