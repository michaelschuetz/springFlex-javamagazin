Artikel - Brainstorm
######################

Spring 3
###########
Flex 4
##########
Maven 3
###########################
Beispielcode

###########################################
Guter Aufhänger:
- RIA in aller Munde.. build-Tools.
- Kontext

Moderne Entwicklung - ensemble
########

Fokus: flex + java gesetzt. Ein Einblick in eine moderne etwicklungs-landschaft
- build: maven
- backend: spring

ausblick

###

struktur
+ einleitung
+

###########
In unserem professionellen Umfeld wird auf die Kombination von Java im Backend und Flex im Frontend vertraut. Im Rahmen dieses Artikels möchten wir zeigen, wie man mit diesen Rahmenparametern professionell Software erstellen kann. Apropos "erstellen": Um eine professionelle Anwendung für das Deployment in einen Container vorzubereiten, scheint heute der Einsatz eines entsprechenden Build-Tools unumgänglich. Da unser Projekt aus viellen Abhängigkeiten besteht, die sauber organisiert werden müssen, verwenden wir das Build -Tool Apache Maven. Konkret werden wir auch die neue Version 3 beleuchten, gerade im Zusammenspiel mit Flex. Was jetzt noch fehlt um unsere mit Maven sauber gebaute Flex-Anwendung den typischen Anforderungen wie Skalierbarkeit, Transaktionalität etc. auszurüsten, ist eine Java EE basierte Lösung. Wir haben uns für Spring entschieden.

Da wir mit unsere Demoandwendung quasi von Null beginnen, möchten wir je die neuesten Versionen der verwendete Technologien und Frameworks einsetzen. Gerade das saubere Zusammenspiel stellt dabei sicherlich die größte Herausforderung dar.

### Die Kombination aus Java und Flex
Den Reiz dieser Kombination sehen wir in der sauberen Trennung zwischen Front- und Backend. Diese Aussage trifft sicherlich für die meisten RIA's zu. Aus Entwicklungssicht führt diese Trennung zu einer vertikalen Entwicklung. Das heißt, dass die Java-Entwicklung von der Flex-Entwicklung getrennt ist. Entscheidend dafür ist ein sauberes Design der Schnittstellen.

Kompilieren

### Die Beispielanwendung
Wohl ziemlich jeder gönnt sich in regelmäßigen Abständen mal eine gute Pizza - so auch wir. Warum aber die Pizza nicht direkt auch online bestellen? Zugegeben, wir waren nicht die ersten mit dieser Idee.

#Die Anforderungen
Das Ziel der Plattform ist es, dass Kunden schnell, einfach und zuverlässig Ihre Pizzen online bestellen können. Daraus ergeben sich diverse Anforderungen an Front- und Backend. So ist es entscheidend, dass die Benutzeroberfläche des Frontends inuitiv und klar aufgebaut ist. Um eine möglichst hohe Zielgruppe zu erreichen, soll das GUI browserübegreifend immer gleich aussehen. Das Backend hat hingegen die Aufgabe, Anforderungen wie Transaktionalität oder asynchonre Benachrichtungen abbilden zu können. 

#Architektur
Schaubild Schichten Zusammenspiel

### Blick in den Beispielcode:

Um schnell ein Gefühl der verwendeten Technologien zu vermitteln, geht es direkt in den Code:

# Listing

### Flex 4. Das Frontend.

Warum Flex?
- klassische Vorteile..
- Entwicklungsteams vertikal

Flex 4  - was ist neu

Compilieren mittels Flex Mojo

### Spring 3. Das Backend.


### Maven 3. Das Build-System.
Die Beispiel-Anwendung besteht aus XX verschiedenen Versionen von Java-Bibliotheken (JAR's), welche je aufeinander wirken. Maven scheint mit seiner Versionsverwaltung sowie dem modularen Aufbau wie gemalt für diesen Zweck.

Das Projekt besteht aus folgenden Maven-Artifakten:
TODO

### Im Zusammenspiel
Nachdem die Einzelkomponenten beleuchtet wurden, soll jetzt das Zusammenspiel von Fronten, Backend und Infrastruktur beleuchtet werden.

## Kompilieren

Zum Kompilieren der Flex Sourcen wird das Maven Plugin "Flex Mojos" verwendet. Das Plugin wird passend zu entsprechenden Flex-Version gewählt.



## Bauen
mvn

## Testen
deploy gegen Tomcat 6


Ausbau
Was noch fehlt für ein professionelles 

- Test-Infrastruktur
- Deploy-Job (Maven oder Konfigurationen mittels ant)
- CI


Fazit
###