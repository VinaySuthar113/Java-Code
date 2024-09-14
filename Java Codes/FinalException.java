class StackOverFlow extends Exception
{
    public String toString()
    {
        return "stack if full";
    }

}
class StackUnderFlow extends Exception
{
        public String toString()
    {
        return "stack if empty";
    }
}
class stackexception {
    private int size;
    private int top=-1;
    private int S[];
    
        public stackexception(int sz)
        {
            size=sz;
            S=new int[sz];
        }
        public void push(int x) throws StackOverFlow
        {
            if(top==size-1)
            throw new StackOverFlow();
            top++;
            S[top]=x;
        }
        public int pop() throws StackUnderFlow
        {
            int x=-1;
            if(top==-1)
            throw new StackUnderFlow();
            x=S[top];
            top--;
            return x;
        }
}
class FinalException
{
    public static void main(String args[])
    {
        stackexception st=new stackexception(5);
        try
        {
            st.push(10);
            st.push(15);
            st.push(20);
            st.push(25);
            st.push(30);
            st.push(45);
        }
        catch(StackOverFlow s)
        {
            System.out.println(s);
        }
    }
}
