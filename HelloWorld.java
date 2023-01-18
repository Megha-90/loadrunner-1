class HelloWorld {
    static String token = "abbbsgsf";
    
    public static void main(String[] args) throws Throwable
    {
      token = args[0];  
      System.out.println("Hello, World! "); 
      HelloWorld test = new HelloWorld();
      test.init();
    }
    
    public String init() throws Throwable {
        System.out.println("Hello, World! New " + token);
        return token;
    }

}
