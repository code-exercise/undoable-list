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

Cover your implementation to test multilevel redo/undo operations.

* If this all seems to be a bit easy , further credit will be given for implementing following
Iterator and attaching it to to your undoable list.

```
import java.util.Iterator;

public class EverySecondIterator<T> implements Iterator<T> {

    public EverySecondIterator(Iterator<T> target) {

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }
}


``` 

**** Some recommendations for better coding practices ****

Just to re-iterate, things we look for in code

1. clear and good object modeling 

2. clear and logical separation of responsibilities - (emphasis on single responsibility)

3. things not dumped in at one place 

4. Unit tests

5. easy to understand , not to complex code (something which can be extended by any other person)
   and ofcourse functional completion. 
   
Good luck!
