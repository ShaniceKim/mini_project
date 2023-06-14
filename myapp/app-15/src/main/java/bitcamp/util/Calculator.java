package bitcamp.util;

public class Calculator {
  
  private  int result = 0;
  private static int result2 = 0;

  public static int getResult2() {
    int a = 200;
    return result2 + a;
  }

  public int getResult() {
    int a = 100;
    return this.result + a;
  }

  public void init(int a) {
    this.result = a;
  }

  public void plus(int a) {
    this.result += a;
  }

  public void minus(int a) {
    this.result -= a;
  }

  public void multiple(int a) {
    this.result *= a;
  }

  public void divide(int a) {
    this.result /= a;
  }  

}



// 2.package bitcamp.util;

// public class Calculator {
  
//   private  int result = 0;

//   public static int getResult(Calculator c) {
//     return c.result;
//   }

//   public static void init(Calculator c, int a) {
//     c.result = a;
//   }

//   public static void plus(Calculator c, int a) {
//     c.result += a;
//   }

//   public static void minus(Calculator c, int a) {
//     c.result -= a;
//   }

//   public static void multiple(Calculator c, int a) {
//     c.result *= a;
//   }

//   public static void divide(Calculator c, int a) {
//     c.result /= a;
//   }  

// }

////////

// 1. package bitcamp.util;

// public class Calculator {
  
//   private  int result = 0;

//   public static int getResult(Calculator c) {
//     return c.result;
//   }

//   public static void init(Calculator c, int a) {
//     c.result = a;
//   }

//   public static void plus(Calculator c, int a) {
//     c.result += a;
//   }

//   public static void minus(Calculator c, int a) {
//     c.result -= a;
//   }

//   public static void multiple(Calculator c, int a) {
//     c.result *= a;
//   }

//   public static void divide(Calculator c, int a) {
//     c.result /= a;
//   }  

// }