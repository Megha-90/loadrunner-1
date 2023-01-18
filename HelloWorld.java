class HelloWorld {
    static String token = "abbbsgsf";
    
    public static void main(String[] args) throws Throwable
    {
      token = args[0];  
      System.out.println("Hello, World! "); 
      HelloWorld test = new HelloWorld();
      test.init();
    }
    
    public int init() throws Throwable {
        System.out.println("Hello, World! " + token);
        return token;
    }

}
