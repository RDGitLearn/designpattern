package behevioral.iterator;

import java.util.List;

public class MyIteratorImpl<T> implements MyIterator {

    private int position=0;
    private int length;

    private List<T> list;
    public MyIteratorImpl(List<T> userList) {
        length=userList.size();
        list = userList;
    }

    @Override
    public boolean hasNext() {
        if(position >= length )
            return false;

        return true;
    }

    @Override
    public T next() {

        return list.get(position++);
    }
}
