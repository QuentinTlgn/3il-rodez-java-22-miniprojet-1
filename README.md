---
Mini Projet 1 | Quentin TAULEIGNE
---

##Faites du bruit
**Question :** pourquoi l'attribut graine est-il en final ?
Car il n'a pas besoin d'être redéfini après l'initialisation de l'objet.

Deux problèmes persistent : 
1) La graine n'a aucun effet sur la génération
2) Indexoutofbound qui vient des lignes 59 à 62 de bruit2D dans bruitperlin2D.java
En lien avec ligne 55 et 56


## Un peu de modélisation objet dans votre Perlin ?
Diagramme UML de l'architecture proposée.
![Diagramme UML](https://media.botmarket.ovh/jfagkk.png)

Pourquoi est-ce une mauvaise idée ? 
On se retrouverait avec du code dupliqué et très compliqué à faire évoluer.

La solution à préférer serait d'avoir une classe Terrain qui contient une référence à un objet de type TypeTerrain qui représente le type spécifique de terrain.


