public class ForExam {
    public static void main(String[] args) {
        
           greetUser("Mariam");

          int result = sum(5, 8);
          
        System.out.println("Sum is: " + result);
        
        
        
          int number = 10;
          
          boolean checkResult = check(number);
          
        System.out.println(checkResult);
        
        

             double price = 9.5;
          
             int priceInt = (int) price;
        System.out.println(priceInt);

             int a = 100;
             
             int b = 200;
             
             int maxResult = max(a, b);
        System.out.println(maxResult);

          String name = "Automation Testing";
        System.out.println(name.length());
        
        
        
            int x = multiply(2, 3);
            
            int y = multiply(1, 3, 5);
            
        System.out.println("2 * 3 = " + x);
        System.out.println("1 * 3 * 5 = " + y);
    }

    public static void greetUser(String name) {
        System.out.println("Welcome to our class, " + name + "!");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static boolean check(int number) {
        return number % 2 == 0;
    }

    public static int max(int a, int b) {
        if (a > b) {
            
            return a;
        } else {
            
            return b;
        }
        
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int multiply(int x, int y, int z) {
        return x * y * z;
    }
    
}
