Your First Program

class HelloWorld {
    static String token = "";
    public static void main(String args[]) {
      token = args[0];  
      System.out.println("Hello, World!"+ token); 
      HelloWorld test = new HelloWorld();
      
      test.init(token);
    }
      public int init(String token){
        System.out.println("Hello, World! New "+ token);
      
    }
}
