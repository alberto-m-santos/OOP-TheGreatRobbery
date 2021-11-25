public class Detective extends Person{
    private static final double SUCCESS_PERCENTAGE = 20;

    public Detective(String name, String nickname, int yearOfBorn, String expertIn, Item[] items) {
        super(name, nickname, yearOfBorn, expertIn, items);
    }

    @Override
    public void printBioData(){
        System.out.println("Detective");
        super.printBioData();
    }
}
