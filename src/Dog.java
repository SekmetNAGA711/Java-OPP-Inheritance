public class Dog extends Animal {

    private String earshape;
    private String tailShape;



    public Dog() {
        super("mutt", "Big", 50);
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }
    public Dog(String type, double weight, String earshape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight <35 ? "medium": "large"), weight);
        this.earshape = earshape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earshape='" + earshape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() { //Creating a method on a subclass overrides the parent method 'makeNoise'

    }

    @Override
    public void move(String speed) {//move method using intellij to override parent method 'move'
        super.move(speed);
        System.out.println("Dogs walk, run and wag their tail");
    }
}
