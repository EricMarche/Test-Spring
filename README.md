# Test-Spring

Ce projet est un Template qui me servira a produire un projet Java utilisant Maven, Spring. MongoDB 

Pour ce faire j'ai utilisé ces liens : 
   - http://spring.io/guides/gs/rest-service/#initial
   - http://spring.io/guides/gs/maven/
   - https://spring.io/guides/gs/accessing-mongodb-data-rest/
   
Le projet Test-Maven est un projet Java qui contient déjà Maven. Il suffit d'ajouté les dépendences nécessaire dans le pom.xml lorsque nous en avons besoin. (TODO une suite de test unitaire et d'intégration de base (base de donnée + TomCat))

Le projet Test-Spring contient un petit API avec Spring qui une fois lancée nous affiche Hello World. Le lien d'accès est localhost:8080/greeting. Il est possible d'ajouter un nom avec le lien localhost:8080/greeting?name=Eric. 

Le projet Test-MongoDB me permettra de tester cette base de donnée
