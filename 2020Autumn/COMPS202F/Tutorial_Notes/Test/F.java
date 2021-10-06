public class F{

   public int secret(String[] array, String string) {
     int num = 0;
     for (int i=0; i<array.length; i++)
       if (array[i].compareTo(string) >= 0)
         num++;
        else num--;
    return num;
   }

   public static void main(String[] args)
   {
       int j = 'j';
       int i = 'i';
       int z = 'z';
       int x = 'x';
       int a = 'a';
       System.out.println(i);
       System.out.println(j);
       System.out.println(z);
       System.out.println(a);
       System.out.println(z-x);

       char c = 102;
       System.out.println(c);
       
   }
}
