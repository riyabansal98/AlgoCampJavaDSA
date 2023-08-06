package L17;

class Main3 {

    //instance
    int var;

    //paramter
    Main3(int var) {

        this.var = var;
        System.out.println(this);

    }

    public static void main(String[] args) {

        Main3 obj  = new Main3(8);
        System.out.println(obj);
        System.out.println(obj.var);
    }
}

