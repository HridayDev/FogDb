# FogDb
## FogDb is a very simple to use NoSql document based database.

###### FogDb (furthur referred to as just db) is a database made in java and is very simple to use.

#### I was tired of all the existing databases have wierd me-only problems like, MongoDB is too complicated and can't be self hosted and meanwhile Firebase don't even have client side libraries for most languages including java.  
---

---
## How to use
*currently the database runs only on the project(which is using the db) runtime.
---
How to make a doc, here `docName` is the name of the doc you want to make:
```
DocFile doc = new DocFile(docName);
```
---
How to delete a doc:
```
doc.DelFile();
```
---
How to add data to a doc, here `key` and `val` refers to the data:
```
doc.addData(key, val);
```
---
How to edit data of a doc, here `key` and `val` refers to the data:
```
doc.editData(key, val);
```
---
How to delete data of a doc, here `key` refers to the key:
```
doc.delData(key);
```
---
How to get data from a doc, here `key` refers to the key, returns a string:
```
String data = doc.getData(key);
```
---
How to existance of data in a doc, here `key` refers to the key, returns a bool:
```
Boolean existance = doc.exists(key);
```
---
