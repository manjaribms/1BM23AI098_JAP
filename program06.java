import java.util.Arrays;
public class program06<T> {
    T[] que;
    int size;
    public program06()
    {
        que=(T[])new Object[2];
        size=0;
    }
    public void enqueue(T element)
    {
        if(size==que.length)
        {
            int new_capacity=que.length * 2;
            que=Arrays.copyOf(que,new_capacity);

        }
        que[size++]=element;
    }
    public T dequeue()
    {
        if(size==0)
        {
            System.out.println("queue is empty");
        }
        T del_element=que[0];
        System.arraycopy(que,1,que,0,size-1);
        que[--size]=null;
        return del_element;
    }
    public void display()
    {
        for(T element : que)
        {
            System.out.println(element);
        }
    }
    public static void main(String args[])
    {
        program06<Integer>a=new program06<>();
        a.enqueue(10);
        a.enqueue(20);
        a.enqueue(30);

        a.dequeue();

        a.display();
    }
}
