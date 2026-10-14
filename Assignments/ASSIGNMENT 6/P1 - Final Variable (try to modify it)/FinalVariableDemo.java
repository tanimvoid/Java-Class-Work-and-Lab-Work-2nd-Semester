class FinalVariableDemo {

    final int number = 10;

    void changeValue() {
        // number = 20;  // This will give ERROR because final variable cannot be changed
        System.out.println("Final number = " + number);
    }

    public static void main(String[] args) {

        FinalVariableDemo obj = new FinalVariableDemo();
        obj.changeValue();
    }
}