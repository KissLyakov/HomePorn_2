public class Cat extends Animal {
    boolean wild;

    public Cat(String food, String location){
        super(food, location);
    }

    @Override
    public String makeNoize() {
        return "*Мурчание*";
    }
    @Override
    public String eat(){
        return "*Ест ";
    }
}