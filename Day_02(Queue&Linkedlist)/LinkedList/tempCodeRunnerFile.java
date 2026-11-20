 // public void insertbypos(int p, int d) {
    //     int cnt = 0;
    //     intNode iterator = head;
    //     if (head == null) {
    //         return;
    //     }
    //     if (p == 1) {
    //         insertFirst(d);
    //         return;
    //     }

    //     while (cnt < p - 2 && iterator.getNext() != null) {
    //         iterator = iterator.getNext();
    //         cnt++;
    //     }
    //     intNode newnNode = new intNode();
    //     // newnNode.setData(d);
    //     newnNode.setNext(iterator.getNext());
    //     iterator.setNext(newnNode);
    // }