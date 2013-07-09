package 反射.sample1;
/**
 * 功能：
 * @author： 传秋
 * @date：2012-3-2
 */

public class Parent {  
	  
    public String publicField  = "1";  
      
    String defaultField = "2";   
      
    protected String protectedField = "3";  
      
    private String privateField = "4" ;  
      
    public void publicMethod() {  
        System.out.println("this is publicMethod...");  
    }  
      
    void defaultMethod() {  
        System.out.println("this is defaultMethod...");  
    }  
      
    protected void protectedMethod() {  
        System.out.println("this is protectedMethod...");  
    }  
      
    private void privateMethod() {  
        System.out.println("this is privateMethod...");  
    }  
      
}  