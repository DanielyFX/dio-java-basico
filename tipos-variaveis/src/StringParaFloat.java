public class StringParaFloat {
    public static void main(String[] args) {

        // this program requires two 
        // arguments on the command line 
        if (args.length == 2) {
            // convert strings to numbers
            float a = (Float.parseFloat(args[0])); 
            float b = (Float.parseFloat(args[1]));

            // do some arithmetic
            System.out.println("a + b = " +
                                (a + b));
            System.out.println("a - b = " +
                                (a - b));
            System.out.println("a * b = " +
                                (a * b));
            System.out.println("a / b = " +
                                (a / b));
            System.out.println("a % b = " +
                                (a % b));
        } else {
            System.out.println("This program " +
                "requires two command-line arguments.");
        }
    }
}

// rodar no prompt de comando indicando este arquivo o seguinte código: java StringParaFloat.java "36.6" "37.40"