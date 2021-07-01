import java.util.ArrayList;
class queue<T>
{
    ArrayList<T> arr;
int front;
int rear;
int size;

queue(int s)
{
size = s;
arr = new ArrayList<T>(size);
front=-1;
rear=-1;
}

void enqueue(T var)
{
    ArrayList<T> a = new ArrayList<T>(size*2);
for(int i=0;i<size;i++)
for (T value : arr) {
    a.add(value);
}

this.size = size*2;
arr = a;
 if (front == 0 && rear == size - 1) {
      System.out.println("Queue is full");
    }
    else {
      if (front == -1) {
        front = 0;
      }

      rear++;
      arr.set(rear,var);
}
}
void dequeue(){
		if (front == -1 && rear == -1)
			System.out.println("Queue is already empty");
		else if (front == rear)
       {
			front = rear = -1;
		}
		else {
			front++;
		}
	}
void print_queue()
{
for(int i=front;i<=rear;i++)
System.out.println(arr);
System.out.println("-----------");
}
}

public class GenericQueues
{
public static void main(String args[])
{
queue<Integer> iob = new queue<Integer>(5);

for(int i=1;i<= 5;i++)
{
iob.enqueue(i);
}
iob.print_queue();
iob.dequeue();
iob.dequeue();
iob.print_queue();

queue<Double> a = new queue<Double>(2);
a.enqueue(10.0);
a.enqueue(20.0);
a.enqueue(30.0);
a.dequeue();
a.enqueue(40.0);
a.enqueue(50.0);
a.enqueue(60.0);
a.enqueue(70.0);
a.enqueue(80.0);
a.print_queue();
}
}