package ����.sample1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
/**
 * ���ܣ�
 * @author�� ����
 * @date��2012-3-2
 */

import org.junit.Test;


/** 
* ������,��JUnit4 ���в��� 
* @author syh 
* 
*/  

public class ReflectionUtilsTest {  

  /** 
   * ���Ի�ȡ����ĸ����������� 
   */  
    
  @Test  
  public void testGetDeclaredMethod() {  
        
      Object obj = new Son() ;  
        
      //��ȡ����������  
      Method publicMethod = ReflectionUtils.getDeclaredMethod(obj, "publicMethod") ;  
      System.out.println(publicMethod.getName());  
        
      //��ȡĬ�Ϸ�����  
      Method defaultMethod = ReflectionUtils.getDeclaredMethod(obj, "defaultMethod") ;  
      System.out.println(defaultMethod.getName());  
        
      //��ȡ������������  
      Method protectedMethod = ReflectionUtils.getDeclaredMethod(obj, "protectedMethod") ;  
      System.out.println(protectedMethod.getName());  
        
      //��ȡ˽�з�����  
      Method privateMethod = ReflectionUtils.getDeclaredMethod(obj, "privateMethod") ;  
      System.out.println(privateMethod.getName());  
  }  

  /** 
   * ���Ե��ø���ķ��� 
   * @throws Exception 
   */  
    
  @Test  
  public void testInvokeMethod() throws Exception {  
      Object obj = new Son() ;  
        
      //���ø���Ĺ�������  
      ReflectionUtils.invokeMethod(obj, "publicMethod", null , null) ;  
        
      //���ø����Ĭ�Ϸ���  
      ReflectionUtils.invokeMethod(obj, "defaultMethod", null , null) ;  
        
      //���ø���ı���������  
      ReflectionUtils.invokeMethod(obj, "protectedMethod", null , null) ;  
        
      //���ø����˽�з���  
      ReflectionUtils.invokeMethod(obj, "privateMethod", null , null) ;  
  }  

  /** 
   * ���Ի�ȡ����ĸ��������� 
   */  
    
  @Test  
  public void testGetDeclaredField() {  
        
      Object obj = new Son() ;  
        
      //��ȡ����������  
      Field publicField = ReflectionUtils.getDeclaredField(obj, "publicField") ;  
      System.out.println(publicField.getName());  
        
      //��ȡ����������  
      Field defaultField = ReflectionUtils.getDeclaredField(obj, "defaultField") ;  
      System.out.println(defaultField.getName());  
        
      //��ȡ����������  
      Field protectedField = ReflectionUtils.getDeclaredField(obj, "protectedField") ;  
      System.out.println(protectedField.getName());  
        
      //��ȡ����������  
      Field privateField = ReflectionUtils.getDeclaredField(obj, "privateField") ;  
      System.out.println(privateField.getName());  
        
  }  

  @Test  
  public void testSetFieldValue() {  
        
      Object obj = new Son() ;  
        
      System.out.println("ԭ���ĸ������Ե�ֵ: ");  
      System.out.println("publicField = " + ReflectionUtils.getFieldValue(obj, "publicField"));  
      System.out.println("defaultField = " + ReflectionUtils.getFieldValue(obj, "defaultField"));  
      System.out.println("protectedField = " + ReflectionUtils.getFieldValue(obj, "protectedField"));  
      System.out.println("privateField = " + ReflectionUtils.getFieldValue(obj, "privateField"));  
        
      ReflectionUtils.setFieldValue(obj, "publicField", "a") ;  
      ReflectionUtils.setFieldValue(obj, "defaultField", "b") ;  
      ReflectionUtils.setFieldValue(obj, "protectedField", "c") ;  
      ReflectionUtils.setFieldValue(obj, "privateField", "d") ;  
        
      System.out.println("***********************************************************");  
        
      System.out.println("������ֵ�ı��ĸ�������ֵ: ");  
      System.out.println("publicField = " + ReflectionUtils.getFieldValue(obj, "publicField"));  
      System.out.println("defaultField = " + ReflectionUtils.getFieldValue(obj, "defaultField"));  
      System.out.println("protectedField = " + ReflectionUtils.getFieldValue(obj, "protectedField"));  
      System.out.println("privateField = " + ReflectionUtils.getFieldValue(obj, "privateField"));  
        
  }  

  @Test  
  public void testGetFieldValue() {  
        
      Object obj = new Son() ;  
        
      System.out.println("publicField = " + ReflectionUtils.getFieldValue(obj, "publicField"));  
      System.out.println("defaultField = " + ReflectionUtils.getFieldValue(obj, "defaultField"));  
      System.out.println("protectedField = " + ReflectionUtils.getFieldValue(obj, "protectedField"));  
      System.out.println("privateField = " + ReflectionUtils.getFieldValue(obj, "privateField"));  
  }  

}  