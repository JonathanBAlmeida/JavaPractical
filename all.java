public class all {
    public static void main(String args[]) {

        //char part
        System.out.println("******************CHAR************************* ");
        char marks,grade; 
        marks='9';
        grade='a';
        System.out.println("marks: "+marks+" \ngrade: "+grade);

        //byte part 
        System.out.println("******************BYTE************************* ");       
        byte byt1,byt2;
        byt1= 127;
        byt2= -48;
        System.out.println("byte1: "+byt1+" \nbyte2: "+byt2);
        byt1++;
        System.out.println("incremented value for byte 1: "+byt1);

        //short part
        System.out.println("******************SHORT************************* ");
        short myShort = 6000;
		System.out.println("myShort: " + myShort);

        //int part
        System.out.println("******************INT************************* ");
        int num1,num2,total;
        num1=200;
        num2=300;
        total=num1+num2;
        System.out.println("The Sum of "+num1+" and "+num2+" is: "+total);

        //long part
        System.out.println("******************LONG************************* ");
        long lonum1,lonum2,result;
        lonum1=20000L;
        lonum2=300L;
        result=num1*num2;
        System.out.println("multiplication of "+num1+" and "+num2+" is: "+result);

        //Float part
        System.out.println("******************FLOAT************************* ");
        float myFloat1,myFloat2,flresult; 
        myFloat1=1000.666f; 
        myFloat2=110.77f; 
        flresult=myFloat1-myFloat2; 
        System.out.println("Number1: "+myFloat1 +" Number2: "+myFloat2 +" Number1-Number2: "+result); 

        //double part
        System.out.println("******************DOUBLE************************* ");
        double myDouble1, myDouble2, doresult; 
        myDouble1 = 48976.8987d; 
        myDouble2 = 29513.7812d; 
        doresult = myDouble1 + myDouble2; 
        System.out.println("Number 1: " +myDouble1+" Number 2: " +myDouble2+" = " +result);

        //bollean part
        System.out.println("******************BOLLEAN************************* ");
        boolean myBool = true;
        if(myBool == true) 
        System.out.println("I am using a Boolean data type:"+myBool);



    }
    
}
