public class Figure
{
    public void printY(int width)
    {
        int d = width / 2;
        for (int i=0; i<width; i++)
        {
            for(int j=0; j<i; j++){
                System.out.print(' ');
            }
            System.out.print('*');
            for(int k=width-2; k>=width; k-=2)
            {
                if(i>width) break;
                System.out.print(' ');
            }
            if(i <= d)
            {
                System.out.print('*');
            }

        }
    }
    
    public static void main(String[] args)
    {
        Figure f = new Figure();
        f.printY(7);
    }
}
