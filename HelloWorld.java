// Your First Program

class HelloWorld {
    static String TOKEN = arg[0];
    public static void main(String args[]) {
      System.out.println("Hello, World!"+TOKEN); 
      HelloWorld test = new HelloWorld();
      
      test.init(TOKEN);
    }
      public int init(String TOKEN){
        System.out.println("Hello, World! New "+TOKEN);
      
    }
}
