# 📊 Fővárosok – Adatelemző Projekt

Ez a projekt a `fovaros.csv` fájl feldolgozására és elemzésére épül, amely különböző országokat, azok fővárosait és lakosságszámukat tartalmazza. A fájl pontosvesszővel tagolt, UTF-8 kódolású, az első sora pedig fejlécet tartalmaz.

## 📁 Fájl: `fovaros.csv`
- **Formátum**: `Ország;Országjel;Főváros;Népesség`
- **Kódolás**: UTF-8
- **Elválasztó**: `;` (pontosvessző)

---

## 📌 Feladatok

### 0️⃣ Beolvasás
- Olvassuk be a `fovaros.csv` fájl adatait egy megfelelő adatszerkezetbe.
- Írjuk ki, hány ország adata lett beolvasva.  
🧠 *(2 pont)*

---

### 1️⃣ Legnépesebb országok
- Keressük meg, melyik országban élnek a legtöbben, és írjuk ki.
- Írjuk ki a második legnépesebb országot is.  
📌 *Formátumkód: `%,d` – ezres tagolással*  
🧠 *(1 + 1 pont)*

---

### 2️⃣ Budapestnél kisebb fővárosok
- Hány fővárosban élnek kevesebben, mint Budapesten?  
🧠 *(2 pont)*

---

### 3️⃣ Országjelek 'C' betűvel
- Soroljuk fel azokat az országjeleket, amelyek tartalmazzák a `'C'` betűt.
- A jelek legyenek **vesszővel elválasztva**, **ABC sorrendben**, és **ne legyen vessző az utolsó után**.  
🧠 *(3 pont)*

---

### 4️⃣ 20 millió alatti országok
- Számoljuk ki és írjuk ki, hányan élnek **összesen** azokban az országokban, ahol a lakosság 20 millió fő alatt van.  
🧠 *(1 pont)*

---

### 5️⃣ Fővárosok csoportosítása
- Csoportosítsuk a fővárosokat **népesség szerint**, 5 milliós léptékekben.
- Számoljuk meg, hány főváros tartozik az egyes kategóriákba.
- A kiírás a megadott **minta szerint** történjen.  
🧠 *(3 pont)*

---

### 6️⃣ `nagyok.txt` fájl létrehozása
- Írjuk ki egy külön fájlba (`nagyok.txt`) azoknak az országoknak a **nevét és népességét**, ahol **több mint 200 millióan** élnek.  
🧠 *(2 pont)*

---

## 🧪 Minta kimenet

```text
0) Összesen 49 ország adata lett beolvasva.
1) Az ország, ahol a legtöbben élnek: Kína, 1 410 000 000 fő
   A második legnagyobb népesség: India, 1 390 000 000 fő
2) Összesen 24 fővárosban élnek kevesebben, mint Budapesten!
3) Országjel, amiben szerepel 'C' betű: CA, CL, CN, CO, CR, CU, CZ, EC
4) A 20 millió főnél kisebb országok fővárosainak össznépessége: 44 970 000 fő
5) Fővárosok népesség szerint csoportosítva (5 millió fő):
            0 -  4 999 999: 35
    5 000 000 -  9 999 999: 7
   10 000 000 - 14 999 999: 2
   15 000 000 - 19 999 999: 1
   20 000 000 - 24 999 999: 3
   30 000 000 - 34 999 999: 1
6) Nagy népességű országok a nagyok.txt fájlban!
Brazília (213 millió)
Kína (1410 millió)
Egyesült Államok (331 millió)
India (1390 millió)
