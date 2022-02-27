class ArrayBox<T extends Comparable> {
    Object[] arr;
    int dlug = 0;


    ArrayBox(int dlug) {                                                              //nowy zestaw elementów z początkową pojemnością
        arr = new Object[dlug];
        for (int i = 0; i < dlug; i++) {
            arr[i] = new Object();
        }
    }


    public boolean addAll(T[] x) {
        int c = 0;
        for (int i = 0; i < x.length; i++) {
            if (add(x[i])) c++;
        }
        if (c >= 1)
            return true;
        else
            return false;
    }


    public boolean add(T x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(x)) {
                return false;
            }
        }
        if (dlug < arr.length) {
            arr[dlug++] = x;
        } else {
            Object[] arr1;
            arr1 = arr;
            arr = new Object[(arr.length + 1)];
            for (int i = 0; i < arr1.length; i++) {
                arr[i] = arr1[i];
            }
            arr[dlug++] = x;
        }
        return true;
    }

    public T min() {
        T min = (T) arr[0];
        for (int i = 0; i < dlug; i++) {
            if (((T) arr[i]).compareTo(min) < 0) {         //znajdowanie, bez sortowania, minimum zestawu zgodnie ze zdefiniowanym porządkiem
                min = ((T) arr[i]);
            }

        }
        return min;
    }

    public T max() {
        T max = (T) arr[0];
        for (int i = 0; i < dlug; i++) {
            if (((T) arr[i]).compareTo(max) < 0) {    //znajdowanie, bez sortowania, maksimum zestawu zgodnie ze zdefiniowanym porządkiem
                max = ((T) arr[i]);
            }

        }
        return max;
    }


    public void print() {
        for (int i = 0; i < dlug; i++) {
            System.out.println(arr[i]);
        }
    }


    public boolean delete(int o) {
        for (int i = 0; i < dlug; i++) {
            if (arr[i].equals(o)) {
                arr[i] = new Object();
                return true;
            }
        }
        return false;
    }


    public int search(T x) {                 //sprawdzanie, czy podany element znajduje się w zestawie, zwraca indeks znalezionego elementu lub -1
        for (int i = 0; i < dlug; i++) {
            if (arr[i].equals(x)) return i;
        }
        return -1;
    }


    public boolean swap(int id1, int id2) {          //zamiana elementów w zestawie na dwóch podanych pozycjach, rezultat true oznacza sukces operacji
        if (id1 == id2 || id1 >= dlug || id2 >= dlug) return false;
        T x = (T) arr[id1];
        T x1 = (T) arr[id2];
        arr[id2] = x;
        arr[id1] = x1;
        return true;
    }
}