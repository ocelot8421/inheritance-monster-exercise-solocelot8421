# Inheritance monster

### Hozzunk létre egy Monster osztályt az alábbi atributumokkal:

- name
- age
- color
- carnivorous
- hp (health point)

Egy üres és egy teli konstruktort.

- Írj egy olyan metódust aminek visszatérési értéke egy String. Ha a carnivorous értékje false, akkor: Eat vegetable. ,
  minden egyéb esetben meg Eat meat.

### Hozzunk létre egy Weapon osztályt

Kapjon extra attribútumokat:

- name
- damage

Egy üres és egy teli konstruktort és getter/settereket.

### Hozzunk létre egy Human osztályt

Kapjon extra attribútumokat:

- name
- age

Egy üres és egy teli konstruktort és getter/settereket.

### Hozzunk létre egy Orc osztályt ami a Monster osztálynak a subclassa

Kapjon extra attribútumokat:

- friendly
- humanList (package private legyen)
- weaponList

Hozzunk létre egy teli konstruktort (kiveve friendly) és getter/settereket.

- Írj egy olyan metódust aminek visszatérési értéke egy boolean és paraméterként kap egy human-t. Ha paraméterként
  kapott human nem **null** akkor adja hozzá a humanList hez és a visszatérési érték legyen true, más esetben false
  legyen a visszatérési érték.

- Írj egy olyan metódust aminek visszatérési értéke void és paraméterként kap egy Monster-t és egy Weapon-t. Ha
  paraméterként kapott monster nem **null** és élete több mint 0 akkor vonja le a paraméterként beadott weapon sebzését az
  életéből.

### Hozzunk létre egy UrukHai osztályt ami az Orc osztálynak a subclassa

Hozzunk létre egy teli konstruktort es a friendlyt allitsuk be false-ra.

- Írj egy olyan metódust aminek visszatérési értéke egy boolean és paraméterként kap egy human-t. Ha paraméterként
  kapott human nem **null** és a humalista tartalmazza az adott human-t, akkor vegyek ki a listából és visszatérési
  érték legyen true, más esetben false legyen a visszatérési érték.

### Hozzunk létre egy BlackUruk osztályt ami az Orc osztálynak a subclassa

Hozzunk létre egy teli konstruktort es a friendlyt allitsuk be true-ra.


