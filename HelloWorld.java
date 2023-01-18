// Your First Program

class HelloWorld {
    static String TOKEN = "";
    public static void main(String args[]) {
      TOKEN = arg[0];  
      System.out.println("Hello, World!"+TOKEN); 
      HelloWorld test = new HelloWorld();
      
      test.init(TOKEN);
    }
      public int init(String TOKEN){
        System.out.println("Hello, World! New "+TOKEN);
      
    }
}
