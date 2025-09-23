public class OOPS {

    public static void main(String[] args) {

        Fish f1 = new Fish();
        f1.eat();

    }
    
}

class Fish {
    String name ;


    void eat(){
        System.out.println("eat small fish");
    }

    void breathe(){
        System.out.println("breath");
    }

}


class FishTwo extends Fish {
    int fash ;

    void size(){
        System.out.println("12 m");
    }
}