package de.adrianlange.readableids.tokendictionary;

public class GermanAdjectiveNounDictionary extends SimpleTokenDictionary {

  private static final String[] ADJECTIVES =
          new String[] { "abgemachte", "abgeschlossene", "abgesicherte", "absolute", "abwechslungsreiche", "adrette", "agile", "akkurate", "aktive", "aktuelle", "akzeptable",
                  "akzeptierte", "allerbeste", "allererste", "allgemeingültige", "allumfassende", "anerkannte", "angemessene", "angenehme", "angesehene", "annehmbare",
                  "anpassungsfähige", "ansehnliche", "ansprechende", "anspruchsvolle", "anständige", "artige", "ästhetische", "atemberaubende", "attraktive", "aufmerksame",
                  "aufrechte", "aufrichtige", "aufwendige", "ausführliche", "ausgebaute", "ausgebildete", "ausgeglichene", "ausgewogene", "ausgezeichnete", "ausreichende",
                  "außergewöhnliche", "außerordentliche", "aussichtsreiche", "authentische", "autonome", "bahnbrechende", "bärenstarke", "barmherzige", "beachtenswerte",
                  "beachtliche", "bedeutende", "bedeutsame", "beeindruckende", "befriedigende", "begehrte", "begeisterte", "begnadete", "behagliche", "beheizbare", "beherrschte",
                  "behutsame", "beigelegte", "beispielhafte", "bekannte", "belastbare", "belebte", "belehrbare", "beliebte", "bemerkenswerte", "beneidenswerte", "bequeme",
                  "bereite", "beruhigende", "berühmte", "bescheidene", "besondere", "besonnene", "bessere", "bestandene", "beteiligte", "beträchtliche", "bevorzugte", "bewährte",
                  "bewundernswerte", "bewunderte", "bezaubernde", "bombastische", "bombige", "brandneue", "bravouröse", "brillante", "brüderliche", "bunte", "charismatische",
                  "charmante", "chice", "clevere", "coole", "dankbare", "dauerhafte", "denkwürdige", "detaillierte", "dienliche", "diplomatische", "diskrete", "dufte",
                  "durchschlagende", "dynamische", "edle", "effektive", "effiziente", "ehrenwerte", "ehrfürchtige", "ehrgeizige", "ehrliche", "ehrwürdige", "eifrige", "eindeutige",
                  "eindrucksvolle", "einfache", "einfallsreiche", "einflussreiche", "einheitliche", "einmalige", "einträgliche", "einwandfreie", "einzigartige", "elegante",
                  "empathische", "empfehlenswerte", "energische", "engagierte", "enorme", "enthusiastische", "entschlossene", "entzückende", "epochale", "erfahrene",
                  "erfolgreiche", "erfreuliche", "erfreute", "erfrischende", "ergiebige", "erhaltene", "erhältliche", "erhebliche", "erhöhte", "erholsame", "erkennbare",
                  "erleichterte", "erleuchtete", "ernsthafte", "ersprießliche", "erstaunliche", "erstaunte", "erstklassige", "erstrangige", "erstrebenswerte", "ertragreiche",
                  "erwünschte", "etablierte", "euphorische", "exakte", "exklusive", "exorbitante", "exotische", "explosive", "exquisite", "extravagante", "exzellente",
                  "fabelhafte", "fähige", "faire", "famose", "fantasievolle", "fantastische", "faszinierende", "fehlerfreie", "feine", "fertige", "fesche", "fesselnde",
                  "festliche", "fidele", "findige", "fitte", "fleißige", "flexible", "flinke", "flotte", "flüssige", "formvollendete", "fortgeschrittene", "freie", "freiwillige",
                  "freudige", "freundliche", "freundschaftliche", "friedliche", "friedvolle", "frohe", "fröhliche", "fruchtbare", "führende", "fulminante", "funktionsfähige",
                  "furchtlose", "galante", "gastfreundliche", "gedeihliche", "gediegene", "geduldige", "geehrte", "geeignete", "gefeierte", "gefragte", "gehobene", "gehörige",
                  "gehorsame", "geile", "gelassene", "gelernte", "geliebte", "gelungene", "gemeinsame", "gemeinschaftliche", "gemütliche", "genaue", "genehme", "geniale",
                  "genießbare", "genügende", "geordnete", "gepflegte", "geräumige", "gerechte", "gerechtfertigte", "geruhsame", "geschaffte", "geschäftige", "geschätzte",
                  "geschickte", "geschmackvolle", "gesicherte", "gesunde", "getreue", "gewährleistete", "gewaltfreie", "gewaltige", "gewichtige", "gewinnbringende",
                  "gewissenhafte", "gewünschte", "gezielte", "gigantische", "glamouröse", "glänzende", "glasklare", "glatte", "glaubwürdige", "gleichwertige", "glorreiche",
                  "glückliche", "gnädige", "goldene", "goldige", "göttliche", "grandiose", "gravierende", "greifbare", "grenzenlose", "große", "großartige", "großspurige",
                  "größtmögliche", "großzügige", "grundlegende", "gründliche", "grundsätzliche", "gültige", "günstige", "gute", "gütige", "gütliche", "handfeste", "handliche",
                  "harmonische", "hartnäckige", "hauptsächliche", "heile", "heilige", "heilsame", "heiße", "heitere", "helle", "herrliche", "hervorragende", "herzige", "herzliche",
                  "hilfreiche", "hilfsbereite", "himmlische", "hinreichende", "hinreißende", "historische", "hoche", "hochgestellte", "hochgradige", "hochklassige", "hochrangige",
                  "hochwertige", "hoffnungsvolle", "höfliche", "hübsche", "humane", "humanitäre", "humorvolle", "hundertprozentige", "ideale", "idyllische", "illustere", "immense",
                  "imposante", "inbrünstige", "individuelle", "ingeniöse", "innovative", "intakte", "integre", "integrierte", "intelligente", "intensive", "interessante",
                  "interessierte", "kinderleichte", "klaglose", "klare", "klasse", "klassische", "kluge", "knorke", "knuddelige", "knuffige", "kollegiale", "komfortable",
                  "kommode", "kommunikative", "kompatible", "kompetente", "komplette", "kongeniale", "konkrete", "konkurrenzfähige", "konsequente", "konsistente", "konstante",
                  "konstruktive", "kontinuierliche", "konzertierte", "kooperative", "korrekte", "kostbare", "kostengünstige", "kostenlose", "kräftige", "kraftvolle", "kreative",
                  "kritische", "kulante", "kultivierte", "künstlerische", "kunstvolle", "langlebige", "lässige", "lautstarke", "lebendige", "lebhafte", "legale", "legendäre",
                  "legitime", "leichte", "leidenschaftliche", "leistungsfähige", "leistungsstarke", "leutselige", "liberale", "liebe", "liebenswerte", "liebenswürdige",
                  "liebevolle", "lobenswerte", "löbliche", "lockere", "logische", "loyale", "lückenlose", "lukrative", "luxuriöse", "mächtige", "magische", "majestätische",
                  "makellose", "malerische", "markante", "massive", "maximale", "meisterhafte", "meisterliche", "menschenwürdige", "menschliche", "messbare", "milde", "mobile",
                  "moderne", "mögliche", "mondäne", "monumentale", "moralische", "motivierte", "mühelose", "mustergültige", "mutige", "nachhaltige", "nahe", "namhafte",
                  "nennenswerte", "nette", "neue", "niedliche", "nützliche", "offensichtliche", "optimale", "optimistische", "ordentliche", "ordnungsgemäße", "originale",
                  "packende", "paradiesische", "partnerschaftliche", "passende", "perfekte", "phänomenale", "phantastische", "planmäßige", "plausible", "pompöse", "populäre",
                  "positive", "potente", "prächtige", "prachtvolle", "praktikable", "praktische", "pralle", "präzise", "preisgünstige", "prima", "privilegierte", "problemlose",
                  "produktive", "professionelle", "profitable", "progressive", "prominente", "protzige", "prunkvolle", "pünktliche", "qualifizierte", "qualitative",
                  "quicklebendige", "raffinierte", "rationale", "realistische", "rechtliche", "rechtmäßige", "reibungslose", "reiche", "reichhaltige", "reichliche", "reife",
                  "reine", "reizende", "reizvolle", "relevante", "renommierte", "rentable", "repräsentative", "respektable", "respektierte", "respektvolle", "richtige",
                  "riesengroße", "riesige", "robuste", "romantische", "rosarote", "rosige", "rückhaltlose", "rücksichtsvolle", "ruhige", "ruhmreiche", "rührige", "sagenhafte",
                  "sanfte", "satte", "saubere", "scharfe", "schicke", "schickere", "schillernde", "schlanke", "schlaue", "schlüssige", "schmackhafte", "schmucke", "schnelle",
                  "schöne", "sehenswerte", "selbstständige", "sensationelle", "sensible", "seriöse", "sexy", "sichere", "sichergestellte", "sichtbare", "simple", "sinnvolle",
                  "solide", "solidarische", "solide", "sonnendurchflutete", "sonnige", "sorgenfreie", "sorgfältige", "sorglose", "sorgsame", "souveräne", "spannende", "sparsame",
                  "spaßige", "spektakuläre", "spezielle", "spielende", "spielerische", "spürbare", "stabile", "standhafte", "starke", "stattliche", "steigende", "stilsichere",
                  "stilvolle", "stolze", "strahlende", "süchtige", "super", "süße", "sympathische", "systematische", "tadellose", "talentierte", "tätige", "tatkräftige",
                  "taugliche", "tiefgreifende", "tierische", "tolerante", "tolle", "top", "traditionelle", "traditionsreiche", "tragfähige", "transparente", "treffende",
                  "treffliche", "treue", "überdurchschnittliche", "überglückliche", "übergroße", "überlegene", "überragende", "überraschende", "überraschte", "überschaubare",
                  "überschwängliche", "übersichtliche", "überwältigende", "überzeugende", "ultimative", "umfangreiche", "umfassende", "umgängliche", "umsichtige", "unabhängige",
                  "unangefochtene", "unantastbare", "unbedingte", "unbegrenzte", "unberührte", "unbeschreibliche", "unbeschwerte", "unbesiegbare", "unbestreitbare", "unbezahlbare",
                  "uneingeschränkte", "uneinholbare", "unerhörte", "unermessliche", "unermüdliche", "unerreichte", "unerschrockene", "unfehlbare", "ungeahnte", "ungebrochene",
                  "ungezwungene", "unglaubliche", "universelle", "unkomplizierte", "unparteiische", "unschätzbare", "unschlagbare", "unschuldige", "unsterbliche",
                  "unternehmerische", "untrennbare", "unübertreffliche", "unumschränkte", "unumstrittene", "ununterbrochene", "unvergleichbare", "unverhoffte", "unverkrampfte",
                  "unverwundbare", "unverzichtbare", "unwiderstehliche", "unzweifelhafte", "üppige", "verantwortliche", "verantwortungsvolle", "verbindliche", "verbundene",
                  "verehrte", "vereinte", "verführerische", "vergebene", "vergnügte", "vergötterte", "verheißungsvolle", "veritable", "verlässliche", "vermehrte", "vernünftige",
                  "versierte", "versöhnliche", "verständliche", "vertrauenerweckende", "vertrauensvolle", "vertrauenswürdige", "vertrauliche", "vertraute", "verwendbare",
                  "verwöhnte", "verzückte", "vielfältige", "vielseitige", "vielversprechende", "vitale", "vollkommene", "vollständige", "vorbehaltlose", "vorbildliche",
                  "vorsichtige", "vorsorgliche", "vorteilhafte", "vorzeigbare", "vorzügliche", "wachsame", "wahre", "warme", "warmherzige", "wegweisende", "weiche", "weise",
                  "weitgehende", "weitläufige", "weiträumige", "weitreichende", "weitsichtige", "weltberühmte", "wertige", "wertvolle", "wichtige", "widerstandsfähige",
                  "willensstarke", "willkommene", "wirksame", "wirkungsvolle", "wirtschaftliche", "witzige", "wohlbehaltene", "wohlhabende", "wohlige", "wohltätige", "wohltuende",
                  "wohlwollende", "wohnliche", "wunderbare", "wundersame", "wunderschöne", "wundervolle", "wünschenswerte", "wunschgemäße", "würdevolle", "würdige", "zauberhafte",
                  "zielgerichtete", "zielstrebige", "zivilisierte", "zufriedene", "zugängliche", "zukunftsweisende", "zulässige", "zuverlässige", "zuversichtliche", "zuvorkommende"
          };
  private static final String[] NOUNS =
          new String[] { "Abenteuer", "Abläufe", "Abschlüsse", "Absperrband", "Absperrungen", "Actionfiguren", "Affen", "Affengehege", "Affenhäuser", "Akkus", "Akten",
                  "Aktenordner", "Aktivitäten", "Alben", "Altenheime", "Amphibien", "Analysen", "Ananas", "Ananassaft", "Anforderungen", "Angebote", "Angestellte", "Anreize",
                  "Anrufbeantworter", "Anstellungen", "Anträge", "Äpfel", "Apfelsaft", "Apfelwein", "Aprikosen", "Aquarien", "Arbeitsabläufe", "Arbeitsbühnen", "Arbeitsgruppen",
                  "Arbeitszeiten", "Arenen", "Artischocken", "Astern", "Atlanten", "Attraktionen", "Auberginen", "Audit", "Aufgaben", "Aufläufe", "Aufstiegschancen", "Aufträge",
                  "Ausflüge", "Auslandsreisen", "Ausrüstung", "Ausschreibungen", "Ausschüsse", "Aussichten", "Ausstellungen", "Autos", "Backformen", "Backup-Laufwerke",
                  "Backwaren", "Badewannenspielzeug", "Bagger", "Bahnen", "Bälle", "Bällebäder", "Bambussprossen", "Bananen", "Barbies", "Bären", "Bauabfallbehälter",
                  "Baufahrzeuge", "Baugeräte", "Baugerüstplanken", "Bauhelmhalter", "Bauklötze", "Baukranführerkabinen", "Baumaschinen", "Bäume", "Baupläne", "Bausätze",
                  "Baustellenbesen", "Baustellencontainer", "Baustellenfahrzeuge", "Baustellenlampen", "Baustellenradio", "Baustellenzäune", "Bauzaunblenden", "Beamte",
                  "Bedingungen", "Behandlungen", "Behinderteneinrichtungen", "Behörden", "Beilagen", "Beratungen", "Beratungsgespräche", "Beratungsstellen", "Berichte",
                  "Berufsberatungen", "Beschaffung", "Bescheide", "Besprechungsstühle", "Besprechungstische", "Besteck", "Besucher", "Betonmischer", "Betreuer", "Betreuungen",
                  "Betreuungseinrichtungen", "Betreuungspersonal", "Beuteltiere", "Bewertungen", "Beziehungen", "Bier", "Bildschirme", "Bildungsdienstleistungen",
                  "Bildungseinrichtungen", "Birnen", "Blaubeeren", "Blogs", "Blumen", "Blumenkohl", "Bodendecker", "Bohnen", "Boote", "Boxhandschuhe", "Boxsäcke", "Branntweine",
                  "Braten", "Brettspiele", "Brokkoli", "Brombeeren", "Brot", "Brötchen", "Brownies", "Buchhaltungen", "Buchungen", "Bürokratie", "Busse", "Butter", "Cafés",
                  "Campingausflüge", "Champagner", "Chatrooms", "Chicorée", "Chips", "Chrysanthemen", "Cider", "Clementinen", "Cloud-Speicher", "Coachings", "Cocktails",
                  "Compliance", "Computer", "Cranberries", "Cremeschnitten", "Crêpes", "Cupcakes", "Dahlien", "Delfine", "Desktop-Computer", "Desserts", "Dienstleistungen",
                  "Diskussionsforen", "Dockingstationen", "Donuts", "Drucker", "E-Mails", "Eclairs", "Ehrenamtliche", "Eier", "Einräder", "Eis", "Eisbärengehege", "Eiscremes",
                  "Eisenbahnen", "Eisgeräte", "Eistees", "Elefanten", "Elefantenställe", "Elektroautos", "Elektrofahrräder", "Elektrokabel", "Elektroroller", "Embryos", "Endivien",
                  "Energydrinks", "Engagierte", "Entspannung", "Entwicklungen", "Erbsen", "Erdbeeren", "Erfrischungsgetränke", "Ergebnisse", "Erlebnisse", "Essig", "Ethik",
                  "Evaluierungen", "Fähigkeiten", "Fahrgeschäfte", "Fahrräder", "Fahrradhelme", "Fans", "Farne", "Faxgeräte", "Feigen", "Felder", "Fenchel", "Ferien", "Fernseher",
                  "Fertiggerichte", "Festnetztelefone", "Festplatten", "Finanzdienstleistungen", "Finanzen", "Firmen", "Fisch", "Fische", "Fitness", "Fitnessbänder",
                  "Fitnessstudios", "Fledermäuse", "Fleisch", "Flipcharts", "Flüge", "Flugzeuge", "Flusspferde", "Flusspferdgehege", "Formulare", "Fortbildungen", "Fortschritte",
                  "Frappés", "Freiwillige", "Fruchtcocktails", "Fruchtjoghurts", "Fruchtsalate", "Fruchtschorlen", "Fuchsien", "Führungen", "Futter", "Fütterungszeiten",
                  "Gabelstapler", "Gänseblümchen", "Gatter", "Gebäck", "Gebühren", "Geflügel", "Gehälter", "Gehäuse", "Gehege", "Geländewagen", "Gelati", "Gelees",
                  "Gemeinschaften", "Gemeinwesenarbeiter", "Gemüse", "Gemüsepflanzen", "Genehmigungen", "Geparden", "Geranien", "Gerichte", "Gerüste", "Gerüstteile", "Geschirr",
                  "Gesetze", "Gesundheitsdienstleistungen", "Gesundheitszentren", "Getränke", "Getreideprodukte", "Gewichte", "Gewürze", "Gin", "Giraffen", "Giraffengehege",
                  "Gladiolen", "Gläser", "Globen", "Glühwein", "Golfbälle", "Golfschläger", "Gorillas", "Grafikkarten", "Granatäpfel", "Grapefruits", "Gräser", "Grills", "Gruppen",
                  "Guaven", "Gurken", "Gürtel", "Gymnastikbälle", "Haie", "Handschuhe", "Handys", "Hanteln", "Hauptspeisen", "Haushalte", "Haushaltswaren", "Hausmeisterdienste",
                  "Headsets", "Heckenpflanzen", "Heidelbeeren", "Herausforderungen", "Hilfsorganisationen", "Hilfsprogramme", "Himbeeren", "Holzspielzeug", "Hortensien", "Hotels",
                  "Hubschrauber", "Hühnergehege", "Hülsenfrüchte", "Hunde", "Hyänen", "Hybridautos", "Hygieneprodukte", "Immobilienverwaltungen", "Ingwer", "Inlandsreisen",
                  "Inlineskates", "Insekten", "Installationen", "Investitionen", "Jetskis", "Joghurt", "Joghurts", "Johannisbeeren", "Jugendzentren", "Kabel", "Kaffee",
                  "Kaffeemaschinen", "Kaffeetassen", "Kakao", "Kaki", "Kakteen", "Kameras", "Kängurus", "Karotten", "Kartoffeln", "Käse", "Kasus", "Katzen", "Kekse", "Kettlebells",
                  "Kindergärten", "Kirschen", "Kiwis", "Klebeband", "Klettergurte", "Kletterhelme", "Kletterpflanzen", "Kletterseile", "Klettersteigsets", "Knete", "Knoblauch",
                  "Koalagehege", "Koalas", "Kohlrabi", "Kommas", "Konfekt", "Koniferen", "Konserven", "Kopfhörer", "Kosmetikartikel", "Kräne", "Krankenhäuser", "Kräuter",
                  "Kreisel", "Kreuzfahrten", "Krokodilbecken", "Kuchen", "Küchenutensilien", "Kühlschrank", "Kulturerlebnisse", "Kumquats", "Kunden", "Kundenbeziehungen",
                  "Kundenbindung", "Kundendienst", "Kürbisse", "Kurznachrichten", "Kuscheltiere", "Kutschen", "Ladegeräte", "Lampen", "Laptops", "Lastwagen", "Lattes",
                  "Laubhölzer", "Lauch", "Laufbänder", "Lautsprecher", "Lavendel", "Leads", "Lebensmittel", "Lebewesen", "Lehrpfade", "Leistungen", "Leoparden", "Lexika",
                  "Lieferungen", "Lieferwagen", "Liköre", "Lilien", "Limetten", "Limonade", "Limonaden", "Litschis", "Lobe", "Logistik", "Lokomotiven", "Löwen", "Löwengehege",
                  "Luftballons", "Mainboards", "Mais", "Malutensilien", "Mango", "Mangold", "Mannschaften", "Marken", "Marketingstrategien", "Marktanalyse", "Maßnahmen",
                  "Maulbeeren", "Mäuse", "Medaillen", "Meeresfrüchte", "Meetings", "Mentoren", "Messenger", "Messgeräte", "Methoden", "Mietwagen", "Mikrofone", "Mikrowellen",
                  "Milch", "Milchprodukte", "Milchshakes", "Mineralwasser", "Mirabellen", "Mobiltelefone", "Mochas", "Modems", "Möglichkeiten", "Möhren", "Monitore", "Monorails",
                  "Motorboote", "Motoren", "Motorräder", "Motorroller", "Muffins", "Mündel", "Museen", "Musikinstrumente", "NAS-Festplatten", "NAS-Gehäuse", "NAS-Geräte",
                  "Nadelhölzer", "Nagetiere", "Narzissen", "Nashi-Birnen", "Nashörner", "Naturerkundungen", "Netzteile", "Netzwerke", "Nilpferde", "Notebooks", "Notizbücher",
                  "Nudeln", "Obdachlosenunterkünfte", "Obst", "Obstbäume", "Obstsalate", "Obsttörtchen", "Öffentlichkeitsarbeit", "Ohrstöpsel", "Öle", "Orang-Utans", "Orangen",
                  "Orangensaft", "Orchideen", "Organisationen", "Paddel", "Pager", "Pak-Choi", "Palmen", "Palmherzen", "Pandas", "Papayas", "Papierkörbe", "Paprika", "Parfaits",
                  "Parkbänke", "Passionsfrüchte", "Pastinaken", "Personal", "Petunien", "Pfade", "Pfannen", "Pferdekoppeln", "Pfingstrosen", "Pfirsiche", "Pflanzen", "Pflaumen",
                  "Pflegeheime", "Pflichten", "Phlox", "Physalis", "Pilze", "Pinguinbecken", "Pinguine", "Pizzas", "Pizzen", "Planungen", "Plastiktiere", "Plätze", "Plüschtiere",
                  "Pokale", "Ponyreitbahn", "Post", "Potenzielle", "Pralinen", "Präsentationen", "Preisgestaltung", "Primaten", "Primeln", "Produkte", "Projekte", "Projektor",
                  "Projektoren", "Projektpläne", "Prozessoren", "Psychologen", "Puddings", "Pumas", "Puppen", "Puppenhäuser", "Puppenkleidung", "Puppenwagen", "Puzzle",
                  "RAM-Riegel", "Radien", "Radieschen", "Radios", "Raubtiere", "Rechtsberatungen", "Rechtsvorschriften", "Regale", "Reinigungen", "Reinigungsmittel", "Reis",
                  "Reiseführer", "Reisegepäck", "Reisegesellschaften", "Reiseleiter", "Reisen", "Reisepässe", "Reiseplanung", "Reisetaschen", "Reiseversicherungen", "Rekorde",
                  "Rennbahnen", "Rennwagen", "Reparaturen", "Reptilien", "Reptilienhäuser", "Resorts", "Ressourcen", "Rettich", "Rettungsboote", "Rezepte", "Rhabarber", "Rhythmen",
                  "Richtlinien", "Rikschas", "Rittersporne", "Robben", "Rohrleitungen", "Rollschuhe", "Rosen", "Rote", "Router", "Rüben", "Rudergeräte", "Rum", "SD-Karten", "SMS",
                  "SSDs", "Saft", "Säfte", "Salat", "Salatblätter", "Salate", "Sanatorien", "Sandspielzeug", "Sandwiches", "Saucen", "Säugetiere", "Scanner", "Schalung",
                  "Schaukelpferde", "Scheren", "Schiedsrichter", "Schiedsrichter-Assistenten", "Schiedsrichter-Teams", "Schiedsrichterinnen", "Schiffe", "Schläger",
                  "Schlangenhäuser", "Schlittschuhe", "Schneemobile", "Schneeschuhe", "Schnorchel", "Schokolade", "Schokoladenmousse", "Schränke", "Schreibmaschinen",
                  "Schreibtische", "Schreibutensilien", "Schulen", "Schulungen", "Schutzausrüstung", "Schutzbrillen", "Schutzhandschuhe", "Schutzhelme", "Schutzwände",
                  "Schwimmbäder", "Schwimmbretter", "Schwimmbrillen", "Schwimmkleidung", "Segelboote", "Segelyachten", "Sehenswürdigkeiten", "Sekt", "Sellerie", "Selleriewurzeln",
                  "Server", "Sherbets", "Sicherheitsdienste", "Sicherheitswesten", "Sicherungsgeräte", "Sicherungsseile", "Sieger", "Sightseeingtouren", "Sirupe", "Sitzungen",
                  "Skateboards", "Ski", "Smartphones", "Smoothies", "Snacks", "Snowboards", "Social-Media", "Softgetränke", "Sonnenblumen", "Sonnenbrillen", "Sonnencreme",
                  "Sorbets", "Soufflés", "Souvenirläden", "Souvenirs", "Sozialarbeiter", "Sozialarbeiterinnen", "Sozialdienste", "Sozialdienstleistungen", "Sozialhelfer",
                  "Sozialpädagogen", "Sozialpsychologen", "Spargel", "Spiele", "Spieler", "Spielpläne", "Spielplätze", "Spielzelte", "Spielzeughandys", "Spielzeugkameras",
                  "Spielzeugküchen", "Spielzeugroboter", "Spielzeugtelefon", "Spielzeugwerkzeuge", "Spinat", "Spinatblätter", "Spirituosen", "Sportarten", "Sportbekleidung",
                  "Sporthallen", "Sportschuhe", "Springseile", "Stachelbeeren", "Stadien", "Standards", "Statistiken", "Stauden", "Steckdosen", "Sternfrüchte", "Steuerberatungen",
                  "Stiftungen", "Strände", "Strandtücher", "Straßenbahnen", "Strategien", "Sträucher", "Studien", "Stühle", "Suppen", "Suppenküchen", "Surfboards", "Süßigkeiten",
                  "Süßkartoffeln", "Switches", "Tablets", "Tamarillos", "Tassen", "Tastaturen", "Tätigkeiten", "Taucherbrillen", "Taxis", "Teammitglieder", "Teddys", "Tee",
                  "Telefaxe", "Telefone", "Telefoneinheiten", "Telefonkonferenzen", "Telegrafen", "Teller", "Tennisbälle", "Tennisschläger", "Teppiche", "Therapeuten", "Therapien",
                  "Tiefkühlgemüse", "Tiefkühlkost", "Tiefkühlobst", "Tiefkühlpizza", "Tierarten", "Tiere", "Tierfutterautomaten", "Tierhäuser", "Tierpfleger",
                  "Tierpflegerstationen", "Tiger", "Tigergehege", "Tiramisu", "Tische", "Tomaten", "Töpfe", "Törtchen", "Torten", "Touren", "Trainer", "Trainings",
                  "Trainingsgeräte", "Traktoren", "Trampoline", "Transporte", "Trauben", "Traubensaft", "Tretroller", "Tulpen", "Tunnels", "Turniere", "U-Bahnen", "USB-Sticks",
                  "Übungen", "Umsatz", "Umsatzsteigerung", "Universitäten", "Unterkünfte", "Unterstützungen", "Unterstützungsgruppen", "Urlaubsziele", "Vanillepudding",
                  "Veranstaltungen", "Veranstaltungsplanungen", "Verantwortlichkeiten", "Verbände", "Vereine", "Verfahren", "Vergaben", "Verhaltensweisen", "Verhandlungen",
                  "Verkäufe", "Verkäufer", "Verkaufsanalysen", "Verkaufsanreize", "Verkaufsberichte", "Verkaufserfolge", "Verkaufsförderung", "Verkaufsförderungsaktionen",
                  "Verkaufsgespräche", "Verkaufsleistungen", "Verkaufsmethoden", "Verkaufspräsentationen", "Verkaufsprozesse", "Verkaufsteams", "Verkaufstraining",
                  "Verkaufszahlen", "Verkaufsziele", "Verlierer", "Vermietungen", "Verordnungen", "Versicherungen", "Verträge", "Vertriebskanäle", "Vertriebsmitarbeiter",
                  "Vertriebsnetzwerk", "Vertriebsprognosen", "Vertriebsstrategien", "Vertriebsziele", "Verwaltung", "Verwaltungen", "Videokameras", "Videokonferenzen",
                  "Videorekorder", "Videospiele", "Viren", "Visa", "Vögel", "Vogelhäuser", "Voicemail-Nachrichten", "Vorführungen", "Vorhaben", "Vorhänge", "Vorschriften",
                  "Vorspeisen", "Waffeln", "Wale", "Wanderungen", "Warnhupe", "Warnleuchten", "Warnschilder", "Wartungen", "Wasser", "Wasserbecken", "Wasserkastanien",
                  "Wassermelonen", "Wasserpflanzen", "Wasserpistolen", "Wasserrohre", "Wasserspender", "Wasserspielzeug", "Webcam", "Webcams", "Wein", "Wermut", "Wettbewerb",
                  "Wettbewerbe", "Wettbewerbsfähigkeiten", "Wettkämpfe", "Whiskys", "Whiteboards", "Wodkas", "Wohltätigkeitsorganisationen", "Wölfe", "Workstations", "Yachten",
                  "Yogamatten", "Zaubertricks", "Zebras", "Zementsäcke", "Ziegengehege", "Ziele", "Zierpflanzen", "Zimmerpflanzen", "Zimtschnecken", "Zirkusse", "Zitronen",
                  "Zitronenbars", "Zooschilder", "Zucchini", "Zuckerguss", "Züge", "Zutaten", "Zwiebeln"
          };

  private static final String[][] DICTIONARY = new String[][] { ADJECTIVES, NOUNS };

  public GermanAdjectiveNounDictionary() {

    super(DICTIONARY);
  }
}
