package 递归;
/**
 * 功能：
 * @author： 传秋
 * @date：2011-8-6
 */

import java.util.ArrayList;  
import java.util.Arrays;  
import java.util.List;  
  
/** 
 * <p> 
 * Title:全排列算法 
 * </p> 
 * 
 * <p> 
 * Copyright: http://blog.csdn.net/sunyujia/ 
 * </p> 
 * 
 * @author 孙钰佳 
 * @main sunyujia@yahoo.cn 
 * @date 2009-04-25 23:57:23 PM 
 */  
public class FullSort {  
    //NUM是参加排列的个数
    //将NUM设置为待排列数组的长度即实现全排列  
    private static int NUM = 2;  
  
    /** 
     * 递归算法：将数据分为两部分，递归将数据从左侧移右侧实现全排列 
     * 
     * @param datas 
     * @param target 
     */  
    private static void sort(List datas, List target) {  
        if (target.size() == NUM) {  
            for (Object obj : target)  
                System.out.print(obj);  
            System.out.println();  
            return;  
        }  
        for (int i = 0; i < datas.size(); i++) {  
            List newDatas = new ArrayList(datas);  
            List newTarget = new ArrayList(target);  
            newTarget.add(newDatas.get(i));  
            newDatas.remove(i);  
            sort(newDatas, newTarget);  
        }  
    }  
  
    public static void main(String[] args) {  
        String[] datas = new String[] { "a", "b", "c", "d"};  
        sort(Arrays.asList(datas), new ArrayList());  
    }  
  
} 