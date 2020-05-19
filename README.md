# Hash Table implementation

The program is the implementation of HashTable. It demonstrates how a searching operation in this data structure looks like.

### Principle operation

In order to retrieve an element from the HashTable, a position in hashTable is calculated first. 
The position is calculated using the function where we use a  key hascode and a size of table:  
```java
Math.abs(key.hashCode() % TABLE_SIZE);
```
Then we use calculated value to find an appropiate bucket in the table. 
The bucket may contain many elements because for different elements, there can be calculated the same position. In order to retrieve appropriate element, we compare keys if they are equal.
  
    
The program was written in java language. It was made up with following classes:  

* Hashnode - class that is stored in HashTable and corresponds to a node in HashTable data structure. 
* Person - the class that is stored in hashnode as a value.
* HashTable - it is the implementation of hashTable data structure. It provides possibility of adding and searching elements.
* Main -> it is the class that run the program.

### In order to run the program:
1. Install jdk (at least 1.8 version)
1. download code from the repository
2. Run main method

### Report
Demonstration version consist of two phases, putting elements to hashtable and retrieving elements from hashtable.
#### Initialization phase:
We initialize hashtable by adding 4 people to it.
 ![not_found](https://github.com/daw934/hashTable-implementation/tree/master/screens/file1.jpg)  
#### Searching phase
Demonstration version shows cases of searching an element where:
1.	we have only a one node in hashTable bucket
2.	we have many nodes in hashTable bucket
3.	we do not have a node in hashTable

1.	First case  
![not_found](https://github.com/daw934/hashTable-implementation/tree/master/screens/file2.jpg)
2.	Second case  
![not_found](https://github.com/daw934/hashTable-implementation/tree/master/screens/file3.jpg)
3.	Third case  
![not_found](https://github.com/daw934/hashTable-implementation/tree/master/screens/file5.jpg)


