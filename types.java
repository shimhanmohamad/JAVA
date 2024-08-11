//type conversion and casting

class types{
    public static void main(String a[]){
        byte b = 23;
        int c = b;
        System.out.println(b);
        System.out.println(c);

        int d = 12;
       // byte s = d; //This is caused an error because int size is bigger than byte .Lets say a small box cannot 
        //contain a big box , but big box can contain a small box
        //To fix this error
        byte s = (byte)d;
        System.out.println(s);


        int g = 256;
        byte p = (byte)g;  // this is also caused an error because this is out of range



        //type promotion

        byte k = 10;
        byte j = 30;

        int result = k*j;
        System.out.println(result);
    }
}