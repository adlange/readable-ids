package de.adrianlange.readableids.tokendictionary;

public class EnglishAdjectiveNounDictionary extends SimpleTokenDictionary {

  private static final String[] ADJECTIVES = new String[] {
          "abundant", "accomplished", "accountable", "active", "activist", "adaptable", "admirable", "adventurous", "affable", "affectionate", "agile", "agreeable",
          "alert", "alluring", "ally", "altruistic", "amazing", "ambitious", "amiable", "amicable", "amusing", "angelic", "animated", "artistic", "assertive", "assuring",
          "astute", "athletic", "attentive", "attractive", "authentic", "awesome", "balanced", "beautiful", "benevolent", "blissful", "bodacious", "bold", "bookish",
          "bookworm", "bountiful", "brainy", "brave", "breathtaking", "bright", "brilliant", "buoyant", "boundless", "calm", "candid", "capable", "careful", "caring",
          "celebrated", "centered", "challenging", "champion", "charismatic", "charitable", "charming", "chatty", "cheeky", "cheerful", "cheery", "cherished", "chic",
          "chilled", "chivalrous", "civil", "classy", "clean", "clever", "comforting", "committed", "communicator", "compassionate", "competent", "confidant", "confident",
          "conscientious", "considerate", "consistent", "content", "controlled", "cool", "cool-headed", "cooperative", "courageous", "courteous", "crafty", "creative",
          "cuddly", "curious", "cute", "daring", "dear", "decisive", "dedicated", "delectable", "delightful", "detail-oriented", "determined", "devoted",
          "difference-maker", "diligent", "diplomatic", "discreet", "donor", "driven", "eager", "earnest", "easy-going", "eccentric", "effusive", "electric", "emotional",
          "empathetic", "empathic", "empowered", "empowering", "enchanting", "encouraging", "endearing", "energetic", "engaged", "enlightened", "enlivened", "enough",
          "enterprising", "entertaining", "enthusiastic", "entrepreneurial", "ethical", "euphoric", "excellent", "exceptional", "exciting", "exotic", "experienced",
          "expert", "exuberant", "fabulous", "fair", "faithful", "famous", "fantastic", "fascinating", "fast", "fastidious", "fearless", "flexible", "flowing", "focused",
          "forgiving", "foxy", "frank", "friendly", "fun", "funny", "generous", "genius", "gentle", "genuine", "giving", "glamorous", "glowing", "good", "goofy",
          "gorgeous", "graceful", "gracious", "grand", "grateful", "great", "gregarious", "handsome", "happy", "hardworking", "healthy", "heartwarming", "helper",
          "helpful", "hero", "hilarious", "hip", "honest", "hopeful", "humanitarian", "humble", "humorous", "hysterical", "idealistic", "illuminated", "imaginative",
          "impartial", "inclusive", "incomparable", "incredible", "independent", "industrious", "ineffable", "ingenios", "innovative", "inspirational", "inspiring",
          "integral", "intellectual", "intelligent", "intentional", "interesting", "intuitive", "inventive", "invigorated", "involved", "irresistible", "jaunty", "jazzed",
          "joy-giving", "jolly", "jovial", "joyful", "joyous", "jubilant", "judicious", "juicy", "just", "keen", "kid-like", "kind", "kind-hearted", "kindred", "king",
          "knowledgeable", "leader", "listener", "lively", "living", "loud", "lovable", "loved", "lovely", "loving", "loyal", "lucky", "magical", "magnanimous",
          "magnificent", "marvelous", "masterful", "mediator", "methodical", "meticulous", "mindful", "miraculous", "modest", "motivated", "motivating", "motivational",
          "natural", "neat", "nice", "noble", "notable", "nifty", "nurturing", "obliging", "open", "open-minded", "optimist", "optimistic", "opulent", "orderly",
          "organized", "original", "outgoing", "outstanding", "passionate", "patient", "peaceful", "perfect", "perky", "persistent", "philosophical", "pioneering",
          "poetic", "placid", "playful", "pleasant", "poised", "polite", "positive", "powerful", "practical", "precious", "pretty", "proactive", "prosperous",
          "provocative", "punctual", "qualified", "quality", "queen", "quick", "quick-minded", "quick-witted", "quiet", "quotable", "radiant", "radical", "rational",
          "ready", "realistic", "reassuring", "receptive", "refreshed", "relatable", "relaxed", "reliable", "relieved", "remarkable", "reserved", "resilient",
          "resourceful", "respected", "revered", "reverent", "romantic", "sacred", "safe", "saintly", "satisfied", "scrumptious", "secure", "self-assured", "sensational",
          "sensible", "sensitive", "serene", "sexy", "sharing", "sharp", "shimmering", "shining", "shrewd", "silly", "simple", "sincere", "skilled", "smart", "snazzy",
          "sociable", "soulful", "soulmate", "special", "spectacular", "spiritual", "splendid", "stalwart", "steady", "stellar", "stoic", "straightforward", "strategic",
          "striking", "strong", "studious", "stunning", "sturdy", "successful", "super", "supportive", "sustained", "sweet", "sympathetic", "talented", "team-player",
          "thankful", "thinker", "thorough", "thoughtful", "thrilled", "thriving", "tidy", "tolerant", "tough", "tranquil", "transparent", "triumphant", "trusting",
          "trustworthy", "trusty", "ultimate", "unassuming", "unbelievable", "understanding", "unique", "unlimited", "unreal", "unselfish", "upbeat", "uplifting",
          "valorous", "valuable", "valued", "versatile", "vibrant", "victorious", "virtuous", "vivacious", "warm", "warmhearted", "welcoming", "well-versed", "whole",
          "wholesome", "willful", "willing", "winner", "wise", "witty", "wonderful", "wondrous", "worthy", "yielding", "young-at-heart", "youthful", "yummy", "zappy",
          "zealous", "zesty"
  };

  private static final String[] NOUNS = new String[] {
          "account", "act", "adjustment", "advertisement", "agreement", "air", "amount", "amusement", "angle", "animal", "answer", "ant", "apparatus", "apple",
          "approval", "arch", "argument", "arm", "army", "art", "attack", "attempt", "attention", "attraction", "authority", "baby", "back", "bag", "balance", "ball",
          "band", "base", "basin", "basket", "bath", "bed", "bee", "behavior", "belief", "bell", "berry", "bird", "birth", "bit", "bite", "blade", "blood", "blow", "board",
          "boat", "body", "bone", "book", "boot", "bottle", "box", "boy", "brain", "brake", "branch", "brass", "bread", "breath", "brick", "bridge", "brother", "brush",
          "bucket", "building", "bulb", "burn", "burst", "business", "butter", "button", "cake", "camera", "canvas", "card", "care", "carriage", "cart", "cat", "cause",
          "chain", "chalk", "chance", "change", "cheese", "chess", "chin", "church", "circle", "clock", "cloth", "cloud", "coal", "coat", "collar", "color", "comb",
          "comfort", "committee", "company", "comparison", "competition", "condition", "connection", "control", "cook", "copper", "copy", "copy", "cord", "cork", "cough",
          "country", "cover", "cow", "crack", "credit", "crime", "crush", "cry", "cup", "current", "curtain", "curve", "cushion", "damage", "danger", "daughter", "day",
          "death", "debt", "decision", "degree", "design", "desire", "destruction", "detail", "development", "digestion", "direction", "discovery", "discussion", "disease",
          "disgust", "distance", "distribution", "division", "dog", "door", "doubt", "drain", "drawer", "dress", "drink", "driving", "drop", "dust", "ear", "earth", "edge",
          "education", "effect", "egg", "end", "engine", "error", "event", "example", "exchange", "existence", "expansion", "experience", "expert", "eye", "face", "fact",
          "fall", "family", "farm", "father", "fear", "feather", "feeling", "fiction", "field", "fight", "finger", "fire", "fish", "flag", "flame", "flight", "floor",
          "flower", "fly", "fold", "food", "foot", "force", "fork", "form", "fowl", "frame", "friend", "front", "fruit", "garden", "girl", "glass", "glove", "goat", "gold",
          "government", "grain", "grass", "grip", "group", "growth", "guide", "gun", "hair", "hammer", "hand", "harbor", "harmony", "hat", "hate", "head", "hearing",
          "heart", "heat", "help", "history", "hole", "hook", "hope", "horn", "horse", "hospital", "hour", "house", "humor", "ice", "idea", "impulse", "increase",
          "industry", "ink", "insect", "instrument", "insurance", "interest", "invention", "iron", "island", "jelly", "jewel", "join", "journey", "judge", "jump", "kettle",
          "key", "kick", "kiss", "knee", "knife", "knot", "knowledge", "land", "language", "laugh", "lead", "leaf", "learning", "leather", "leg", "letter", "level",
          "library", "lift", "light", "limit", "line", "linen", "lip", "liquid", "list", "lock", "look", "loss", "love", "low", "machine", "man", "manager", "map", "mark",
          "market", "mass", "match", "meal", "measure", "meat", "meeting", "memory", "metal", "middle", "milk", "mind", "mine", "minute", "mist", "money", "monkey",
          "month", "moon", "morning", "mother", "motion", "mountain", "mouth", "move", "muscle", "music", "nail", "name", "nation", "neck", "need", "needle", "nerve",
          "net", "news", "night", "noise", "nose", "note", "number", "nut", "observation", "offer", "office", "oil", "operation", "opinion", "orange", "order",
          "organization", "ornament", "oven", "owner", "page", "pain", "paint", "paper", "parcel", "part", "paste", "payment", "peace", "pen", "pencil", "person",
          "picture", "pig", "pin", "pipe", "place", "plane", "plant", "plate", "play", "pleasure", "plough", "pocket", "point", "poison", "polish", "porter", "position",
          "pot", "potato", "powder", "power", "price", "print", "prison", "process", "produce", "profit", "property", "prose", "protest", "pull", "pump", "punishment",
          "purpose", "push", "quality", "question", "rail", "rain", "range", "rat", "rate", "ray", "reaction", "reading", "reason", "receipt", "record", "regret",
          "relation", "religion", "representative", "request", "respect", "rest", "reward", "rhythm", "rice", "ring", "river", "road", "rod", "roll", "roof", "room",
          "root", "rub", "rule", "run", "sail", "salt", "sand", "scale", "school", "science", "scissors", "screw", "sea", "seat", "secretary", "seed", "selection", "self",
          "sense", "servant", "sex", "shade", "shake", "shame", "sheep", "shelf", "ship", "shirt", "shock", "shoe", "side", "sign", "silk", "silver", "sister", "size",
          "skin", "skirt", "sky", "sleep", "slip", "slope", "smash", "smell", "smile", "smoke", "snake", "sneeze", "snow", "soap", "society", "sock", "son", "song", "sort",
          "sound", "soup", "space", "spade", "sponge", "spoon", "spring", "square", "stage", "stamp", "star", "start", "statement", "station", "steam", "steel", "stem",
          "step", "stick", "stitch", "stocking", "stomach", "stone", "stop", "store", "story", "street", "stretch", "structure", "substance", "sugar", "suggestion",
          "summer", "sun", "support", "surprise", "swim", "system", "table", "tail", "talk", "taste", "tax", "teaching", "tendency", "test", "theory", "thing", "thought",
          "thread", "throat", "thumb", "thunder", "ticket", "time", "tin", "toe", "tongue", "tooth", "top", "touch", "town", "trade", "train", "transport", "tray", "tree",
          "trick", "trouble", "trousers", "turn", "twist", "umbrella", "unit", "use", "value", "verse", "vessel", "view", "voice", "walk", "wall", "war", "wash", "waste",
          "watch", "water", "wave", "wax", "way", "weather", "week", "weight", "wheel", "whip", "whistle", "wind", "window", "wine", "wing", "winter", "wire", "woman",
          "wood", "wool", "word", "work", "worm", "wound", "writing", "year"
  };

  private static final String[][] DICTIONARY = new String[][] { ADJECTIVES, NOUNS };

  public EnglishAdjectiveNounDictionary() {

    super(DICTIONARY);
  }
}
