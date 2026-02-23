# Inversion de Contrôle et Injection de Dépendances (IoC & DI)
![img_1.png](photo/img_1.png)
Ce projet implémente les concepts fondamentaux de l'architecture logicielle Java, en passant du couplage fort au couplage faible, et en utilisant le framework **Spring**.

---

##  Description du projet
L'objectif est de créer une application capable de calculer des données sans que la couche Métier ne soit liée de manière rigide à la couche DAO (Data Access Object).

### Structure du projet :
1. **`IDao`** : Interface définissant la méthode `getData()`.
2. **`DaoImpl`** : Implémentation concrète de l'accès aux données.
3. **`IMetier`** : Interface définissant la méthode `calcul()`.
4. **`MetierImpl`** : Logique métier utilisant un objet de type `IDao` (Couplage Faible).

---

## 🛠️ Étapes de Réalisation

### 1. Architecture des Interfaces
Nous avons défini des interfaces pour isoler les spécifications des implémentations. Cela permet de changer la source de données sans modifier le code métier.



### 2. Stratégies d'Injection de Dépendances

Le projet explore 4 méthodes pour injecter la dépendance `Dao` dans `Metier` :

#### **A. Instanciation Statique**
Injection manuelle dans le code via le constructeur ou un setter.
* *Inconvénient* : Nécessite une recompilation à chaque changement.

#### **B. Instanciation Dynamique**
Utilisation de la **Réflexion Java** (`Class.forName`). Les noms des classes sont lus depuis un fichier `config.txt`.
* *Avantage* : On change le comportement de l'app sans toucher au code source.

#### **C. Framework Spring (XML)**
Utilisation d'un fichier `applicationContext.xml` pour déclarer les beans.
```xml
<bean id="dao" class="dao.DaoImpl" />
<bean id="metier" class="metier.MetierImpl">
    <property name="dao" ref="dao" />
</bean>
