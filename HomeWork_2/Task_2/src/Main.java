public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Мясо", "Двор");
        animals[1] = new Cat("Рыба", "Дом");
        animals[2] = new Horse("Сено", "Поле");

        for (int i = 0; i < 3; i++) {
            Veterinarian.animalInfo(animals[i]);
        }
    }
}