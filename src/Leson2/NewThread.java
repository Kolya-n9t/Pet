package Leson2;

public class NewThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100; i++) {
            //System.out.println("E");
            if (i%10==0){
                System.out.println(i);
            }
        }

    }
}
