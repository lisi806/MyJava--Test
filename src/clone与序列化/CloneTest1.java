package clone�����л�;

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
          
        //clone�������ص���Object���͵Ķ��󣬼��������µĶ���  
        Student student2 = (Student)student.clone();  
          
        System.out.println(student2.getAge());  
        System.out.println(student2.getName());  
        System.out.println(student2.getTeacher().getAge());  
        System.out.println(student2.getTeacher().getName());  
          
        System.out.println("----------------------------------");  
          
        /** 
         * ���¼���˵��clone��ǳ����(ֻ�Ǹ�������)�������ƺ����������е�teacher���Զ�ָ��ͬһ������ 
         * ����ѿ����Ķ����teacher�����������ã����Ӱ�챻�����Ķ��� 
         */  
        student2.getTeacher().setName("hello world");  
        student2.getTeacher().setAge(44);  
        student2.setName("lisi");//����ı�student������  
          
        System.out.println(student2.getAge());  
        System.out.println(student2.getName());  
        //student2�е�teacher����Ҳ�����˸ı�  
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