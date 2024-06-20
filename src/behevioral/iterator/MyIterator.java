package behevioral.iterator;

import behevioral.observer.Observer;

public interface MyIterator<T> {

    boolean hasNext();

   T next();

}
