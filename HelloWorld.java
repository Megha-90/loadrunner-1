class HelloWorld {
    static String token = "abbbsgsf";
    
    public static void main(String args[]) 
    {
      token = args[0];  
      System.out.println("Hello, World! "+ token); 
      HelloWorld test = new HelloWorld();
      test.printing();
    }
    public String printing (String token)
    {
        System.out.println("Hello, World! New "+ token);
    }
}
