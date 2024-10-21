package com.coffee.designPattern.iterator;

public class NameRepository implements Container{
    private String names[] = {"John","jinbin","makaijian","fangjiahui"};
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements  Iterator{
        int index;
        @Override
        public Object next() {
            if (hasNext()){
                return names[index++];
            }
            return null;
        }

        @Override
        public boolean hasNext() {
            if (index < names.length){
                return true;
            }
            return false;
        }
    }
}
