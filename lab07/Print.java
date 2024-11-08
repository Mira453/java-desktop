package lab07;

public class Print {

    public static void main(String [] args) {

        
        ContextSort context = new ContextSort();
    
        byte [] array = {33,5,6,9,0,-1,3,2,5,6,78};
    
        context.set(new Insertion());
        context.execute(array);
        context.set(new Bubble());
        context.execute(array);
        System.out.println();
    
    }
    
}
