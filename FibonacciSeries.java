public class FibonacciSeries {
    public static void main(String[] args) {
        int numTerms = 10;
        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series up to " + numTerms + " terms: ");


        for (int i = 1; i <= numTerms; ++i) {
            System.out.println(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
System.out.println("Name: SHEEBANAAZ MAKANDAR");
       System.out.println("SAP ID: 500117989");       
    }
}