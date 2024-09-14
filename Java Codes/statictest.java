public class statictest
{
        static int x = 10;
        int y=20;
          public void show()
          {
            System.out.println(x+ " " +y);
          }  
          static void display()
          {
            System.out.println(x);
          }
}
class Test1
{
  public static void main(String args[])
  {
    statictest st= new statictest();
    st.show();
    st.x=20;
    st.y=40;
    st.show();
  }
}
