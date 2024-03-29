<h1>Enkel Motorvognregister</h1>
Dette er et register biler og holder styr på viktig informasjon som personnummer, navn, addresse, bilskilt, bilmerke og modell. Målet med dette prosjektet er å lage et motorvignsregister for å holde styr på et hvem som er registrert i registeret som oversiktlig og enkelt å bruke.

<h2>Dataliste for bilmerke og modell</h2>
Når jeg utviklet nettsiden kom jeg på at det er ganske vanlig for nettsider å ha en liste hvor man kan velge alternativer for hva man vil velge, som for eksempel hvis man skal velge størrelse på et produkt. Jeg valgte derfor å lage en dataliste som inneholdt noen bilmerker og en til dataliste som inneholdt modeller til bilmerkene og basert på hvilket merke man valgte vil alternativene for det merket dukke opp under modeller. Denne lista vil også vise alternativer som matcher med det som blir skrevet inn i feltet så kan man trykke på de og feltet vil fylles ut.

<h2>API for adresse</h2>
Jeg ville ha den samme funksjonaliteten for å velge adresse også. Da legger jeg til API som da gir tilgang til alle adresser, postnummer og byer i Norge. Denne funker på akuratt samme måte som datalistene med bilmerke og modell.

<h2>Regler for bilskilt</h2>

Jeg gjorde slit at det som blir skrevet inn i bilskilt feltet består av først to bokstaver etterfulgt av fem tall. Den sjekker også om bilskiltet allerede er i bruk og hvis det ikke er gyldig vil man få en feilmelding og blir bedt om å skrive det inn på nytt. 

<h2>Fødelsummer og regler</h2>

Jeg ville også følge riktige regler for fødselsnummer så jeg gjorde leste meg opp på hvordan ett fødselsnummer er bygd opp som du kan se her: https://no.wikipedia.org/wiki/F%C3%B8dselsnummer 
Jeg brukte denne informasjonen til å sjekke om fødselsnummeret stemmer, gjør det ikke det får man en feilmelding og blir bedt om å skrive inn ett gylidg ett.

<h2>Automatisk ufylling av brukere</h2>

Jeg valgte å gjøre det mulig for bruker å automatisk legge til 1-15 brukere med en dropdown-meny. Jeg la også til en engen knapp for å fylle ut fødselsnummeret. Hensikten med disse knappene er for å kunne teste registeret uten å måtte skrive all informasjonen inn selv, spessielt siden det er ganske strenge krav for å kunne få testet det. Hadde dette vært et ekte motorvogregister som var i bruk hadde jeg selvfølgelig ikek hatt med disse knappene, men de er kun for testing.

Når den skal fylle ut sjemaet, genereren den først ett fødselsnummer som oppnår alle kravene for riktig struktur. Deretter lager den ett fiktivt navn hvor den plukker ut et navn fra to forskjellige lister med fornavn og etternavn og slår de sammen. På addresse gjør den det samme som på navn hvor den slår sammen informasjon fra forskjellige lister. På bilskiltet velger den to bokstaver så to tall og den lager skilt som ikke allerede er i bruk. 

<h2>Søkefunskjon</h2>

Hvis det blir mange brukere, kan det vøre nytting å ha muligheten til å søke dem opp. Man kan da søke etter navn, fødselsnummer, bilmodell ovs. og den vil gi matchende resultater.

<h2>Sletteknapper</h2>

Til slutt la jeg til muligheten for å slette brukere. Da er det en knapp hvor det står "slett alle" som sletter alle brukere som er registrert og en hvor det står "slett" som ligger ved siden av hver bruker, som kun sletter den brukeren.

<h1>Brukertesting</h1>

<h2>Brukertest 1</h2>

<h3>Oppgave til brukeren</h3>

1. Gi nettisden ett overblikk. Hva ser du her? <br>
   Jeg ser en ryddig side hvor man kan fylle ut data til personer og biler.
2. Hva tror du hensikten med nettsiden er? <br>
   Jeg tror det er en side hvor man kan registrer personer til biler. 
3. Klarer du å finne addressen din ved hjelp av lista? <br>
   Ja den kom opp etter jeg hadde skrevet noen bokstaver. 
4. Klarer du å finne en bil du liker? <br>
   Ja den kom også opp av å trykke noen bokstaver og modellen så jeg med en gang 
5. Klarer du å registre en bruker til registeret uten å automatisk fylle ut? <br>
   Ja, men jeg måtte fylle ut fødselsnummeret med knappen siden jeg ikke husker mitt egen. 
6. Klarer du å slette kun 1 registrert bil? <br>
   Ja 
7. Klarer du å slette alle registrerte biler? <br>
   Ja 
   
<h3>Tilbakemeldingsspørsmål</h3>

1. Hva synes du om nettsiden? <br>
   Jeg synes den var enkel og oversiktelig.
2. Hvordan var det å bruke nettsiden? <br>
   Det var enkelt og brukervennelig.
3. Hva synes du om fargene? <br>
   Fargene var simple og passet fint.
4. Er det andre instillinger du ønsker deg? <br>
   Nei egentig ikke, jeg likte godt det at man kunne automatisk fylle ut fødselsnummer automatisk.
5. Hva kan forbedres? <br>
   Ingentilg jeg kommer på

<h2>Brukertest 2</h2>

1. Gi nettisden ett overblikk. Hva ser du her? <br>
   Jeg ser en nettside som man kan skrive inn informasjon med en tom tabell i bunnen.
2. Hva tror du hensikten med nettsiden er?
   Å kunne skrive inn informasjon om en person og en bil og det vil vises i tabellen under.
3. Klarer du å finne addressen din ved hjelp av lista? <br>
   Ja
4. Klarer du å finne en bil du liker? <br>
   Ja
5. Klarer du å registre en bruker til registeret uten å automatisk fylle ut? <br>
   Ja
6. Klarer du å slette kun 1 registrert bil? <br>
   Ja, trykket på knappen ved siden av bile jeg ville slette
7. Klarer du å slette alle registrerte biler? <br>
   Ja trykket på slett alle knappen

<h3>Tilbakemeldingsspørsmål</h3>

1. Hva synes du om nettsiden? <br>
   Fin, oversiktelig og enkel å bruke
2. Hvordan var det å bruke nettsiden? <br>
   Det var veldig enkelt å forstå hva man skulle gjøre og de forskjellige knappene for å fylle ut informasjon var fine for å kunne teste
3. Hva synes du om fargene? <br>
   Jeg likte fargene og at det var en ganske simpel stil på siden
4. Er det andre instillinger du ønsker deg? <br>
   Nei
5. Hva kan forbedres? <br>
   Vet ikke

<h2>Brukertest 3</h2>

1. Gi nettisden ett overblikk. Hva ser du her? <br>
   Ser en mange felt hvor man kan skrive informasjon om personer og bil
2. Hva tror du hensikten med nettsiden er?
   Å registrere personer og biler
3. Klarer du å finne addressen din ved hjelp av lista? <br>
   Ja, lett å søke opp
4. Klarer du å finne en bil du liker? <br>
   Ja kunne også søke den opp
5. Klarer du å registre en bruker til registeret uten å automatisk fylle ut? <br>
   Ja bare fylte ut alle feltene med riktig struktur på allt
6. Klarer du å slette kun 1 registrert bil? <br>
   Ja, trykket på slett knappen
7. Klarer du å slette alle registrerte biler? <br>
   Ja, trykket på slett alle

<h3>Tilbakemeldingsspørsmål</h3>

1. Hva synes du om nettsiden? <br>
   Liker designet og fargene
2. Hvordan var det å bruke nettsiden? <br>
   Veldig enkelt, alt var satt opp på en oversiktelig måte
3. Hva synes du om fargene? <br>
   Vargene var enkle og fine
4. Er det andre instillinger du ønsker deg? <br>
   Nei
5. Hva kan forbedres? <br>
   Vet ikke

<h1>Literaturliste</h1>

<h2>Kilder brukt underveis i utviklingen</h2>

* Egen Java regelbok <br>
* https://chat.openai.com/ <br>
* https://www.w3schools.com/ <br>

<h2>API for adresser</h2>

* https://kartverket.no/api-og-data/eiendomsdata/brukarrettleiing-adresse-api <br>
* https://ws.geonorge.no/adresser/v1/ <br>

<h2>Fødselsnummer</h2>

* https://no.wikipedia.org/wiki/F%C3%B8dselsnummer <br>
* https://www.skatteetaten.no/person/folkeregister/identitetsnummer/fodselsnummer/ <br>
