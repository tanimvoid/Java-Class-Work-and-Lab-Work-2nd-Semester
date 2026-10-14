class BlankFinalVariable {

    final int number;

    BlankFinalVariable() {
        number = 50;   // value assigned in constructor
    }

    void display() {
        System.out.println("Final number = " + number);
    }

    public static void main(String[] args) {

        BlankFinalVariable obj = new BlankFinalVariable();
        obj.display();
    }
}