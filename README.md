 TP Injection de Dépendances avec Spring
🎯 Objectif du TP
Ce TP a pour but de comprendre et mettre en œuvre le principe de l’injection de dépendances (IoC) en Java à l’aide de Spring Framework, en utilisant un fichier de configuration XML (config.xml). J’ai séparé les responsabilités en différentes interfaces et classes, et j’ai laissé Spring gérer les dépendances entre elles.

🛠️ Structure du code
Voici les principales composantes que j’ai créées :

IDao : une interface représentant la couche d’accès aux données.

DaoImpl : une implémentation concrète de IDao, qui retourne une valeur fictive (42) pour les tests.

IMetier : une interface pour la couche métier.

MetierImpl : l’implémentation de IMetier qui dépend d’un objet IDao injecté via setter.

Main : la classe principale qui utilise un contexte Spring pour charger les beans depuis config.xml et appeler la méthode calcul() du service métier.

🔄 Principe de fonctionnement
Dans le fichier config.xml, j’ai défini deux beans :

un pour DaoImpl

un autre pour MetierImpl où j’injecte l’objet dao via un setter

Ensuite, dans Main.java, j’ai utilisé ClassPathXmlApplicationContext pour charger les beans.

Le bean metier utilise automatiquement l’instance de DaoImpl grâce à l’injection configurée.

🧪 Résultat obtenu
Quand je lance le programme, le calcul effectué par le composant métier utilise la valeur retournée par DaoImpl. Le résultat affiché est :

![Résultat console](screenshots/de2.PNG)


🧠 Ce que j’ai appris
Comment fonctionne l’inversion de contrôle avec Spring

Comment déclarer et injecter des dépendances avec un fichier config.xml

L’importance de séparer les couches (DAO, service métier, présentation)

Comment tester facilement les composants en modifiant simplement la configuration XML
