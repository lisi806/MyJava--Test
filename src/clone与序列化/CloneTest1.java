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
          
        //clone方法返回的是Object类型的对象，即会生成新的对象  
        Student student2 = (Student)student.clone();  
          
        System.out.println(student2.getAge());  
        System.out.println(student2.getName());  
        System.out.println(student2.getTeacher().getAge());  
        System.out.println(student2.getTeacher().getName());  
          
        System.out.println("----------------------------------");  
          
        /** 
         * 以下几行说明clone是浅复制(只是复制引用)，即复制后两个对象中的teacher属性都指向同一个对象， 
         * 如果把拷贝的对象的teacher属性重新设置，则会影响被拷贝的对象。 
         */  
        student2.getTeacher().setName("hello world");  
        student2.getTeacher().setAge(44);  
        student2.setName("lisi");//不会改变student的属性  
          
        System.out.println(student2.getAge());  
        System.out.println(student2.getName());  
        //student2中的teacher对象也发生了改变  
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