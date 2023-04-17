public class Dog extends Animal {
    private String earShape, tailShape;
    public Dog(){
        super("Mutt","Big",50);
    }
    public Dog(String type, double weight){
        this(type,weight,"Perky","Curled");
    }
    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs walk, run and wag their tail ");
        if(speed == "slow"){
            walk();
            wagTail();
        }
        else{
            bark();
            run();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makeNoise() {
        if(type == "Wolf"){
            System.out.println("OWWWWWWW.......WOooooooooooo");
        }
        bark();
        System.out.println("Boww ...  Bow....   Boww");
    }
    private void bark(){
        System.out.println("Woof!!!");
    }
    private void run(){
        System.out.println("Running!!!");
    }
    private void walk(){
        System.out.println("Walking!!!");
    }
    private void wagTail(){
        System.out.println("Woof!!!");
    }
}
