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

### Die Beispielanwendung
Wohl ziemlich jeder gönnt sich in regelmäßigen Abständen mal eine gute Pizza - so auch wir. Warum aber die Pizza nicht auch direkt online bestellen? Zugegeben, wir waren nicht die ersten mit dieser Idee. Dennoch


#Die Anforderungen
- Frontend
	- einfach und klar zu bedienen
	- in jedem Browser gleich
- Backend:
	- Transaktionalität (Wenn eine Bestellung nicht klappt (z.b. falsche Bezahlinformationen), wäre es fatal, wenn die Bestellung auch nur teilweise ausgeführt werden würde)
	- Benachrichtung --> Asnychron
- 

#Architektur
Schaubild Schichten Zusammenspiel

### Blick in den Beispielcode:

Um schnell ein Gefühl der verwendeten Technologien zu vermitteln, geht es direkt in den Code:

# Listing

### Flex 4. Das Frontend.

Warum Flex?
- klassische Vorteile..
- Entwicklungsteams vertikal


### Spring 3. Das Backend.

### Maven 3. Das Build-System.


