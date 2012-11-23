package ����;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map����Test {  
    static long MAX_LONG = 100000L;  
    static int TIMES = 100;  
    static Map<String, String> map = new HashMap<String, String>();
    
    static {  
        for (long i = 0; i < MAX_LONG; i++) {  
            map.put("1" + i, "abc" + i);
        }  
    }  
  
    public static void main(String[] args) {  
  
        String valueStr = "";   
        String keyStr = "";  
        long start, end;  
        //��һ�ֱ���
        start = System.currentTimeMillis();
        for(int i=0;i<TIMES;i++){
            for (String key : map.keySet()) {
                keyStr = key;  
                valueStr = map.get(key);
                //System.out.println(keyStr);
            }
        }
        end = System.currentTimeMillis();
        System.out.println("��һ�ֱ�����ʱ " + (end - start) + " ms ");  
        
        //�ڶ��ֱ���  
        Map.Entry<String, String> entry;
        start = System.currentTimeMillis();
        for(int i=0;i<TIMES;i++){
        	Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();  
            while (it.hasNext()) {  
            	entry = it.next();
                keyStr = entry.getKey();  
                valueStr = entry.getValue();                  
            }
        }
        end = System.currentTimeMillis();
        System.out.println("�ڶ��ֱ�����ʱ " + (end - start) + " ms ");  
        
        //�����ֱ���  
        start = System.currentTimeMillis();
        for(int i=0;i<TIMES;i++){
        	Iterator<Map.Entry<String, String>> it2 = map.entrySet().iterator(); 
            for(;it2.hasNext();){
            	Map.Entry<String, String> entry2 = it2.next();
                keyStr = entry2.getKey();  
                valueStr = entry2.getValue();  
            }
        }
        end = System.currentTimeMillis();
        System.out.println("�����ֱ�����ʱ " + (end - start) + " ms ");  
        
        //�����ֱ���
        start = System.currentTimeMillis();
        for(int i=0;i<TIMES;i++){
            for (Map.Entry<String, String> entry3 : map.entrySet()) {
                keyStr = entry3.getKey();
                valueStr = entry3.getValue();
            }
        }
        end = System.currentTimeMillis();
        System.out.println("�����ֱ�����ʱ " + (end - start) + " ms ");  
    }  
  
}  
