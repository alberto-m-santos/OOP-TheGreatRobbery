public class Criminal extends Person{

    private static final double SUCCESS_PERCENTAGE = 83.5;

    public Criminal(String name, String nickname, int yearOfBorn, String expertIn, Item[] items) {
        super(name, nickname, yearOfBorn, expertIn, items);
    }

    @Override
    public void printBioData(){
        System.out.println("Criminal person");
        super.printBioData();
    }
}
