package static≤‚ ‘;

class insect{
    int i=9;
    int j;

    static {
    	prt("static block first,because it's begin of the static variable");
    }
    
    insect(){
    	System.out.println("insect initialized");

       prt("i= "+i+" j="+j);

       j=39;

    }

    static int x1=prt("static insect x1 initialized");

    static int prt(String s){

       System.out.println(s);

       return 47;

    }

}

public class Wps extends insect{
	
    Wps(){
    	System.out.println("wps initialized");

       prt("k="+k);

       prt("j="+j);

    }
    int k=prt("the member k in wps be initialized");

    static int x2=prt("static wps x2 initialized");

    static int prt(String s){

       System.out.println(s);

       return 63;

    }  

public static void main(String[] args){

       insect.prt("initialized constructor");

//       Wps w=new Wps();

    }

}