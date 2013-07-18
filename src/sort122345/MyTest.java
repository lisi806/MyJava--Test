package sort122345;
import java.util.Set;  
import java.util.TreeSet;
/** 
 * 问题描述：１，２，２，３，４，５　所有排列，４不能出现在第二个位置，３５不能在一起
 * 原始版本没有考虑重复问题，我进行了修正.<br> 
 * 此算法的精华就是，让一个字符串的所有位置都进行互换，<br> 
 * 这样就产生了所有可能出现的字符串。 
 *  
 * @author 赵学庆，nicky_zs <a href="http://www.java2000.net">www.java2000.net</a> 
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
