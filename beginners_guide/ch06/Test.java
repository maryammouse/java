class Test {
    int a;
    Test(int i) { a = i;}

    void swap(Test ob1, Test ob2) {
        int holdA = ob1.a;
        ob1.a = ob2.a;
        ob2.a = holdA;
    }

}


