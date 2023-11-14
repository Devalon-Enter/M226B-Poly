# M226B

## Analyse 
Dieser Ansatz ist natürlich sehr mühsam und fehleranfällig
Nennen Sie die Hauptprobleme bei diesem Ansatz:

Nun haben wir die Klasse EventPost hinzugefügt. Was mussten wir dabei machen? Ich musste
die einzelnen Attribute definieren so wie sie auch schon in anderen Klassen redundant vorkommen,
ich musste die einzelnen Methoden definieren die grösstenteils auch schon so in anderen Klassen vorkommen.

Kurz gesagt es werden sehr viele sich widerholende Codeabschnitte eingefügt. Das kann sehr schnell zu fehlern führen.
Angenommen wir erstellen nochmals eine neue Post-Klasse und müssen nocheinmal durch all diese Schritte. Jetzt
ist es so, dass wir eine der Methoden nicht richtig eingefügt haben und Zack! Schon hat sich ein Fehler eingeschlichen.

Sehen wir uns nun die NewsFeed Klasse an:
````java
public class NewsFeed {
	
	
	private ArrayList<MessagePost> messages;
	private ArrayList<PhotoPost> photos;
	private ArrayList<EventPost> events;
	
	
	public NewsFeed() {
		
		messages = new ArrayList<>();
		photos = new ArrayList<>();
		events = new ArrayList<>();
	}
	
	
	public void addMessagePost(MessagePost message) {
		messages.add(message);
	}
	
	public void addPhotoPost(PhotoPost photo) {
		photos.add(photo);
	}

	public void addEventPost(EventPost event) {
		events.add(event);
	}
	
	public void show() {
		
		for(MessagePost message : messages) {
			message.display();
			System.out.println();
		}
		
		for(PhotoPost photo : photos) {
			photo.display();
			System.out.println();
		}

		for(EventPost event : events) {
			event.display();
			System.out.println();
		}
		
	}

}
````

Hier können wir sehen, wie wir drei gleichaussehende Arrays erstellen und diese mit dem Typ der jeweiligen
Klasse austatten. Das ist alles sehr repetativ. Wir müssten jedes Mal auch hier wenn eine neue Post-Klasse eingeführt wird,
einen neuen Array initialisieren und definieren. Fehleranfällig.

Eine weiter Sache. Wir haben in den meisten unserer Post-Klassen ein Attribut mit dem Namen ```comments``` dieses
Attribut ist eine Arraylist also es sieht komplett so aus: ```private ArrayList<String> comments```. Jedes Mal wenn ein Comment
geschrieben wurde, ist dies einfach nur ein String. Wir wollen aber noch mehr Sachen zu diesem Comment hinzufügen
zum Beispiel Author. Dies können wir nicht so einfach zu ```private ArrayList<Comment> comments``` ändern. Um dies zu 
bewerkstelligen, müssten wir an mehreren Stellen in unserem Projekt etwas ändern was nocheinmal mühseliger und fehleranfällig wäre.