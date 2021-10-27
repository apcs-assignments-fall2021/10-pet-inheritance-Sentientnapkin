public class DogClient {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.setBreed("Golden Retriever");
        myDog.setAge(3);
        myDog.setName("Luna");
        System.out.println(myDog);
        myDog.makeNoise();
    }
}