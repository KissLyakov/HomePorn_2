public class Horse extends Animal {
    boolean trotter;

    public Horse(String food, String location){
        super(food, location);
    }

    @Override
    public String makeNoize() {
        return "*Лошадиное ржание*";
    }
    @Override
    public String eat(){
        return "*Ест ";
    }
}