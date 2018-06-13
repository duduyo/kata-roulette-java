# Roulette

## Objectifs	

Apprendre à : 		

1. Isoler les dépendances difficilement testables du cœur de l’application 
2. Ecrire des “contrats d’intégration” de services externes.
 
## Instructions
 
Nous avons besoin d’une machine roulette qui fait tourner la balle pendant 20s avant de s’arrêter sur un nombre aléatoire entre 0 et 36. 

**Etape 1**

Résolvez le problème en TDD! 
 
Note: les tests doivent permettre de changer de moteur de hasard.  
Par contre il n’est pas nécessaire de pousser à outrance la vérification (un résultat non constant et qui produit tous les numéros entre 0 et 36 suffit). 

**Etape 2**
 
Une fois que vous avez  des tests et du code en place faites en sorte que la suite des tests tournent en maximum 21 secondes. Puis en moins d’une seconde. 
Comment s’isoler des dépendances coûteuses? 

Définissez un contrat en testant ces dépendances en intégration tant que possible 
Le reste de l’application peut se fier à ce contrat à l’aide d’un outil de mock. 


**Etape 3, si vous avez le temps**

En plus des résultats possibles entre 0 et 36, la machine doit pouvoir envoyer 00 afin d’augmenter les gains du casino. 
  
Le résultat n’est pas seulement un nombre mais aussi Rouge, Noir. 
 
On doit pouvoir miser et gagner. 

## Bénéfices des “contrats d’intégration” 

Outre l’amélioration de la testabilité cette pratique de s’isoler d’accès aux système, web-services tiers etc permet à la fois :  
1. Lorsque ce service s’arrête de fonctionner (pour cause de maintenance par ex), d’être averti au plus tôt et de façon non ambiguë. Comparez ça un un test système qui est lancé une fois par jour et demande de longues investigations. 
2. De remplacer ce même service – du moment qu’il remplit le contrat.		
