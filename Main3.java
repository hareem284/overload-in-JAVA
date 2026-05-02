class superclass {
    int number = 76;
}

class superclasskid extends superclass {
    int number = 204;

    void printing() {
        System.out.println("the number of the class is " + number);
    }
}

class Main3 {
    public static void main(String[] args) {
        superclasskid k1 = new superclasskid();
        k1.printing();
    }
}