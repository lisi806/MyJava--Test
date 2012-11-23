package sort122345;
import java.util.Set;  
import java.util.TreeSet;
/** 
 * �����������������������������������������У������ܳ����ڵڶ���λ�ã�����������һ��
 * ԭʼ�汾û�п����ظ����⣬�ҽ���������.<br> 
 * ���㷨�ľ������ǣ���һ���ַ���������λ�ö����л�����<br> 
 * �����Ͳ��������п��ܳ��ֵ��ַ����� 
 *  
 * @author ��ѧ�죬nicky_zs <a href="http://www.java2000.net">www.java2000.net</a> 
 */  
public class MyTest {  
  public static void main(String args[]) {  
    char[] number = new char[] { '1', '2', '2', '3', '4', '5'};  
    perm(number, 0, number.length - 1);
//    swap(number,0,1);
    System.out.println(set.size());  
    int cols = 10; 
    for (String s : set) {  
      System.out.print(s + " ");  
      if (cols-- == 1) {  
        System.out.println();  
        cols = 10;  
      }  
    }  
  }  
  public static void addNumber(String str) {  
    set.add(str);  
  }  
  public static Set<String> set = new TreeSet<String>();  
  
  public static void perm(char[] n, int beg, int end) {  
    if (beg == end) {  
      String result = String.valueOf(n);  
      if (n[2] == '4')  
        return;  
      if (result.contains("35") || result.contains("53"))  
        return;  
      addNumber(String.valueOf(n));  
      return;  
    }  
    for (int i = beg; i <= end; ++i) {  
      swap(n, beg, i);  
      perm(n, beg + 1, end);  
      swap(n, beg, i);  
    }  
  }  
  public static int number = 0;  
  public static void swap(char[] n, int a, int b) {  
    char temp = n[a];  
    n[a] = n[b];  
    n[b] = temp;  
  }  
}  
