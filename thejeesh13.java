import java.util.StringTokenizer;
class thejeesh13
{
    public static void main(String[]args)

    {
        StringTokenizer st=new StringTokenizer("my name is thejeesh","");
        while (st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}