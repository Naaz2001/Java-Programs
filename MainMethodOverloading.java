class MainMethodOverloading {
    public static void main(String[] args) {
        System.out.println("This is Sheldon Cooper.");
    }

    public static void main(int arg) {
        System.out.println("This is the second main method. The argument is: " + arg);
    }

    public static void main(int arg1, int arg2) {
        System.out.println("This is the third main method. The arguments are: " + arg1 + " and " + arg2);
    }
}