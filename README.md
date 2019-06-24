# undoable-list
Undoable list


Your List should provide following API -

```
public interface ListIntf<T> extends Iterable<T>{

    void add(T value);
    void remove(T value);
    void undo(); // We can redo last operation on list
    void redo(); // We can undo last operation on list
    
}
```