package clone与序列化;

public class CloneTest1  
{  
    public static void main(String[] args) throws Throwable  
    {  
        Teacher teacher = new Teacher();  
          
        teacher.setAge(34);  
        teacher.setName("Teacher chen");  
          
        Student student = new Student();  
          
        student.setAge(20);  
        student.setName("zhangsan");  
        student.setTeacher(teacher);  
          
        //clone鏂规硶杩斿洖镄勬槸Object绫诲瀷镄勫璞★紝鍗充细鐢熸垚鏂扮殑瀵硅薄  
        Student student2 = (Student)student.clone();  
          
        System.out.println(student2.getAge());  
        System.out.println(student2.getName());  
        System.out.println(student2.getTeacher().getAge());  
        System.out.println(student2.getTeacher().getName());  
          
        System.out.println("----------------------------------");  
          
        /** 
         * 浠ヤ笅鍑犺璇存槑clone鏄祬澶嶅埗(鍙槸澶嶅埗寮旷敤)锛屽嵆澶嶅埗鍚庝袱涓璞′腑镄则eacher灞炴€ч兘鎸囧悜鍚屼竴涓璞★紝 
         * 濡傛灉鎶婃嫹璐濈殑瀵硅薄镄则eacher灞炴€ч吨鏂拌缃紝鍒欎细褰卞搷琚嫹璐濈殑瀵硅薄銆?
         */  
        student2.getTeacher().setName("hello world");  
        student2.getTeacher().setAge(44);  
        student2.setName("lisi");//涓崭细鏀瑰彉student镄勫睘镐? 
          
        System.out.println(student2.getAge());  
        System.out.println(student2.getName());  
        //student2涓殑teacher瀵硅薄涔熷彂鐢熶简鏀瑰彉  
        System.out.println(student2.getTeacher().getAge());  
        System.out.println(student2.getTeacher().getName());  
          
        System.out.println("----------------------------------");  
          
        System.out.println(student.getAge());  
        System.out.println(student.getName());  
        System.out.println(student.getTeacher().getAge());  
        System.out.println(student.getTeacher().getName());  
    }  
}  
  
class Student implements Cloneable  
{  
    private int age;  
      
    private String name;  
      
    private Teacher teacher;  
  
    public Teacher getTeacher()  
    {  
        return teacher;  
    }  
  
    public void setTeacher(Teacher teacher)  
    {  
        this.teacher = teacher;  
    }  
  
    public int getAge()  
    {  
        return age;  
    }  
  
    public void setAge(int age)  
    {  
        this.age = age;  
    }  
  
    public String getName()  
    {  
        return name;  
    }  
  
    public void setName(String name)  
    {  
        this.name = name;  
    }  
      
    @Override  
    protected Object clone() throws CloneNotSupportedException  
    {  
        return  super.clone();  
    }  
}  
  
class Teacher implements Cloneable  
{  
    private int age;  
      
    private String name;  
  
    public int getAge()  
    {  
        return age;  
    }  
  
    public void setAge(int age)  
    {  
        this.age = age;  
    }  
  
    public String getName()  
    {  
        return name;  
    }  
  
    public void setName(String name)  
    {  
        this.name = name;  
    }  
}