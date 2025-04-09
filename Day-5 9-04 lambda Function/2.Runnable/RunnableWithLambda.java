public class RunnableWithLambda{
    public static void main(String[] args) {
        Runnable runnable = ()-> {
            System.out.println("Thread is running using Lambda!");
        };
        Thread thread= new Thread(runnable);
        thread.start();
    }
}