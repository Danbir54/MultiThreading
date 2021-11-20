package danbir;
import java.util.Scanner;
public class Main {
    static void  manu(){
        //while(true){
            System.out.println("\t\t\tMultithreading");
            System.out.println("\t\t\t==============\n");
            System.out.println("1.Main Thread");
            System.out.println("2.Implementing Thread");
            System.out.println("3.Extending Thread");
            System.out.println("4.Multiple Thread");
            System.out.println("5.Testing isAlive() and join()");
            System.out.println("6.Synchronization");
            System.out.println("7.Testing wait() and notify()");
            System.out.println("8.Deadlock");
            System.out.println("9.Exit");
            System.out.print("\n\nYour Choice : ");


       // }
    }

    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int k;
        while(true){

            manu();
            k = inp.nextInt();
            if(k == 1){
                Thread t = Thread.currentThread();
                System.out.println("Current Thread : "+t);
                //reset thread name ....
                t.setName("Danbir");
                System.out.println("Changed Nmae : "+t);
                try{
                    for(int i = 5 ; i > 0 ; i--)
                    {
                        System.out.println(i);
                        Thread.sleep(1000);
                    }
                }
                catch(InterruptedException e){
                    System.out.println("Main thread interrupted!");
                }
            }
            else if(k == 2){
                new ImplementingThread();
                try {
                    for (int i = 5; i > 0; i--) {
                        System.out.println("Main Thread : "+i);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    System.out.println("Main thread interrupted!");
                }
            }
            else if(k == 3){
                new ExtendingThread();
                try {
                    for (int i = 5; i > 0; i--) {
                        System.out.println("Main Thread : "+i);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    System.out.println("Main thread interrupted!");
                }
            }
            else if(k == 4){
                new MultipleThread("Tufayel");
                new MultipleThread("Tuhin");
                new MultipleThread("Tonmoy");
                new MultipleThread("Srabon");
                try {
                    for (int i = 5; i > 0; i--) {
                        System.out.println("Main Thread : "+i);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    System.out.println("Main thread interrupted!");
                }
            }
            else if(k == 5){
                MultipleThread object1 = new MultipleThread("One");
                MultipleThread object2 = new MultipleThread("Two");
                MultipleThread object3 = new MultipleThread("Three");

                System.out.println("Thread one is Alive : " +object1.t.isAlive());
                System.out.println("Thread Two is Alive : " +object2.t.isAlive());
                System.out.println("Thread Three is Alive : " +object3.t.isAlive());

                try{
                    System.out.println("Waiting for threads to finish.");
                    object1.t.join();
                    object2.t.join();
                    object3.t.join();
                }
                catch(InterruptedException e){
                    System.out.println("Main thread interrupted!");
                }

                System.out.println("Thread one is Alive : " +object1.t.isAlive());
                System.out.println("Thread Two is Alive : " +object2.t.isAlive());
                System.out.println("Thread Three is Alive : " +object3.t.isAlive());
                System.out.println("Main thread exiting.");
            }
            else if(k == 6){
                Callme tt = new Callme();
                Caller obj1 = new Caller(tt , "Hello");
                Caller obj2 = new Caller(tt , "Synchronized");
                Caller obj3 = new Caller(tt , "World");

                try{
                    obj1.t.join();
                    obj2.t.join();
                    obj3.t.join();
                } catch( InterruptedException e ){
                    System.out.println("Interrupted!");
                }
            }
            else if(k == 7){
                Q qq = new Q();
                new Producer(qq);
                new Consumer(qq);
            }
            else if(k == 8){
                new Deadlock();
            }
            else{
                break;
            }
        }
        //manu();
       // 1. Ckeck main thread
        //Thread t = Thread.currentThread();
        //1System.out.println("Current Thread : " + t);
        //reset thread name ....
       //t.setName("Danbir");
       // System.out.println("Changed Nmae : " + t);
        // 2 . Implementing Thread
            // new ImplementingThread();
        // 3. Extending Thread
            //new ImplementingThread();
        //4. Multiple Thread
            //new MultipleThread("Tufayel");
           // new MultipleThread("Tuhin");
          //  new MultipleThread("Tonmoy");
           // new MultipleThread("Srabon");

      /*  try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread : "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted!");
        }
        System.out.println("Main thread exiting.");
       */
        // 5 . Testing isAlive() and join()
        /*
        MultipleThread object1 = new MultipleThread("One");
        MultipleThread object2 = new MultipleThread("Two");
        MultipleThread object3 = new MultipleThread("Three");

        System.out.println("Thread one is Alive : " +object1.t.isAlive());
        System.out.println("Thread Two is Alive : " +object2.t.isAlive());
        System.out.println("Thread Three is Alive : " +object3.t.isAlive());

        try{
            System.out.println("Waiting for threads to finish.");
            object1.t.join();
            object2.t.join();
            object3.t.join();
        }
        catch(InterruptedException e){
            System.out.println("Main thread interrupted!");
        }

        System.out.println("Thread one is Alive : " +object1.t.isAlive());
        System.out.println("Thread Two is Alive : " +object2.t.isAlive());
        System.out.println("Thread Three is Alive : " +object3.t.isAlive());
        System.out.println("Main thread exiting.");

         */
        // 6 . Understanding synchronize
        //
        //
        /*
        Callme tt = new Callme();
        Caller obj1 = new Caller(tt , "Hello");
        Caller obj2 = new Caller(tt , "Synchronized");
        Caller obj3 = new Caller(tt , "World");

        try{
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch( InterruptedException e ){
            System.out.println("Interrupted!");
        }
        */
        // 7 . Testing wait() , notify()
        //
       /*
        Q qq = new Q():
        new Producer(qq);
       new Consumer(qq);*/
        //8.Deadlock
        //new Deadlock();



    }
}