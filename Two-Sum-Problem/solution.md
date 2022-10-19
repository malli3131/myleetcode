# Solution
* One of the optimized solution uses HashTable to figure the indexes of elements whose sum matches to given target

* Here the steps of the algorithm:

```
1. create hash table
2. loop given array
  a. compute the difference i.e., key = target - element
  b. check this element in hash table
    i) return array which conatins hash_table.get(target-key), current_index)
    ii) if element not found then put the key into hash table: hash_table.put(key, current_index)
3. return array with defaults like {-1, -1}
```
