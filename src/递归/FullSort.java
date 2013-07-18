package 递归;
/**
 * ���ܣ�
 * @author�� ����
 * @date��2011-8-6
 */

import java.util.ArrayList;  
import java.util.Arrays;  
import java.util.List;  
  
/** 
 * <p> 
 * Title:ȫ�����㷨 
 * </p> 
 * 
 * <p> 
 * Copyright: http://blog.csdn.net/sunyujia/ 
 * </p> 
 * 
 * @author ���ڼ� 
 * @main sunyujia@yahoo.cn 
 * @date 2009-04-25 23:57:23 PM 
 */  
public class FullSort {  
    //NUM�ǲμ����еĸ���
    //��NUM����Ϊ����������ĳ��ȼ�ʵ��ȫ����  
    private static int NUM = 2;  
  
    /** 
     * �ݹ��㷨������ݷ�Ϊ�����֣��ݹ齫��ݴ�������Ҳ�ʵ��ȫ���� 
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