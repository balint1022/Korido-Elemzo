# Köridő Elemző Java Projekt 🏎️

Ez a Java projekt egy egyetemi programozási feladat keretében készült, amelyben egy egyszerű **köridő nyilvántartó és elemző rendszer** megvalósítása volt a cél. A program képes különböző versenypályákon futott köridőket rögzíteni, azokat fájlba menteni JSON és XML formátumban, valamint érvénytelen adatokat kiszűrni.

## 🧠 Projekt célja

A projekt célja az volt, hogy:

- Gyakoroljuk az objektumorientált programozást Java nyelven
- Megismerkedjünk interfészek és kivételek kezelésével
- Használjunk külső könyvtárakat (pl. Jackson) JSON/XML fájlkezeléshez
- Különböző csomagokat használjunk a kód strukturálásához

## Fő funkciók

- ⏱️ Köridők mérése és tárolása `Pilota` objektumhoz
- 🏁 Versenypályák nyilvántartása
- ❌ Hibás (pl. negatív) köridők kezelése saját kivétel osztállyal
- 💾 JSON és XML fájlba mentés a `FileKezelo` segítségével
