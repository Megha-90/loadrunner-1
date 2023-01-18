class HelloWorld {
    static String token = "abbbsgsf";
    
    public static void main(String[] args) 
    {
      token = args[0];  
      System.out.println("Hello, World! "); 
      HelloWorld test = new HelloWorld();
      test.printing();
    }
    public String printing()
    {
        System.out.println("Hello, World! New "+ token);
    }
}
