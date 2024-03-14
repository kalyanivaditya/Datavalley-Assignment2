class Swapping
{
    public static void main(String args[])
    {
        int a=500;
        int b=170;
        System.out.println("Values of a and b are (before swapping) : "+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Values of a and b are (after swapping) : "+a+" "+b);
    }
}