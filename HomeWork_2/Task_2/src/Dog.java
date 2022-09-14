public class Dog extends Animal {
    String breed;

    public Dog(String food, String location){
        super(food, location);
    }

    @Override
    public String makeNoize() {
        return "*Собачий лай*";
    }
    @Override
    public String eat(){
        return "*Ест ";
    }
}
