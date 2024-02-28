package WrapperPractise;

public class Dataconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a= 12;
         String s= "122";
         System.out.println(String.valueOf(a));
         String ac= String.valueOf(a);
         String abc= ac+s;
         System.out.println("after converting the integer 12 add up with String 122 :" +abc);
         int b= Integer.parseInt(s);
         System.out.println("after convert string to int" +b);
         b=b+10;
         System.out.println("the value b is added with 10 : " +b);
         boolean bt= true;
         String booleanv= String.valueOf(bt)+"test";
         System.out.println("conv boolean " + booleanv);
	}

}
