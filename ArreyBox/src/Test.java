public class Test {
    public static void main(String[] args) {

        ArrayBox<Osoba>  bo = new ArrayBox<>(2);

        bo.add(new Osoba("Kowalski", 19));
        bo.add(new Student("Kowalska", 18, 100));
        bo.add(new Student("Kowalska", 20, 200));

        Osoba[] to = new Osoba[] {new Osoba("Nowak", 21), new Student("Nowak", 22, 200)};
        bo.addAll(to);
        System.out.println(bo.min());

        ArrayBox<Student> bst = new ArrayBox<>(1);
        bst.add(new Student("Nowacka", 24, 100));
        bst.add(new Student("Nowacka", 24, 300));
        bst.add(new Student("Nowacka", 24, 200));


        System.out.println(bst.max());

        ArrayBox<Integer> bi = new ArrayBox<>(2);
        Integer[] ti = new Integer[] {1, 2, 3};
        bi.addAll(ti);

        bi.print();                                                                          // 1, 2, 3


        ArrayBox<String> bs = new ArrayBox<>(1);
        String[] ts = new String[] {"cpp", new String("java")};
        bs.addAll(ts);
        bs.swap(1,2);
        bs.print();  // java, cpp

        bst.delete( 1);
        bst.print();
        int index = bi.search(1);
        System.out.println(index);


    }
}
