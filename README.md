# NF11
UV NF11 UTC - Théorie des langages de programmation

## Description

Le projet NF11 P17 vise à re-créer un dérivé du langage [Logo](https://en.wikipedia.org/wiki/Logo_%28programming_language%29) permettant en particulier d'utiliser des instructions graphiques simples pour dessiner des formes.

Le langage ainsi créé permet d'effectuer plusieurs opérations graphiques (avancer, reculer, changer de couleur...), d'évaluer des expressions arithmétiques, d'utiliser des conditions, des boucles, du hasard, ainsi que des procédures ou des fonctions (possiblement récursives). 

## Fonctionnement

Le projet s'appuie sur la bibliothèque Java [`ANTLR`](https://github.com/antlr/antlr4), un __générateur d'analyseur syntaxique__ descendant, *i.e.* `LL(*)` généralement utilisé pour construire des langages de programmation.

Le langage créé est décrit par une grammaire au format `g4`, spécifique à `ANTLR`. Elle n'a pas nécessairement besoin d'être `LL(*)` depuis sa version 3, `ANTLR` gérant par exemple la récursivité à gauche.

À partir de cette grammaire sont générés un ensemble de classes Java permettant :
* D'une part, de construire l'arbre de dérivation du programme à analyser ;
* D'autre part, d'utiliser le pattern `Visitor` pour parcourir l'arbre et prendre des décisions.

Dans cette version du langage (contrairement à Logo), chaque fonction possède sa propre pile, n'autorisant pas les variables globales mais préservant l'état des variables locales lors des appels récursifs.

## Organisation

* `src` : sources du projet.
  * `logogui` : tout ce qui a trait à l'affichage, réalisé avec JavaFX. Système de logging, affichage de l'arbre syntaxique et du dessin réalisé.
  * `logoparsing` : classe de parsing, interface et implémentation du visiteur d'arbre, classes métier permettant de gérer les tables de symboles (piles d'appel) et les procédures / fonctions.
* `grammar` : grammaire décrivant le langage.
* `lib` : `JAR` d'`ANTLR` à importer dans le Build Path.
* `programs` : exemples de programmes que le projet est capable d'exécuter.

## Utilisation

Avec Eclipse, il suffit d'importer le projet, de lier la bibliothèque au Build Path. L'application se lance au travers de la classe principale `LogoApplication`.

Une fenêtre s'ouvre alors avec plusieurs parties : à gauche, l'entrée du programme, à droite, l'arbre de dérivation ainsi que l'affichage sous forme d'onglets, et en bas, l'affichage des logs. 

Il est possible de désactiver l'affichage des logs ralentissant considérablement le programme à des degrés de récursions importants : soit en commentant tous les `Log.append(...)` de la classe `LogoTreeVisitor`, soit en commentant la ligne de la procédure `append(String s)` de la classe `Log` (moins performant).

Il suffit alors d'écrire le programme et d'appuyer sur le bouton Exécuter pour voir le résultat.

## Exemple

Voici un exemple de dessin généré avec le langage créé. Il s'agit de 24 triangles de Sierpiński supersposés par rotations successives.

![Triangles de Sierpiński](/result.png)
