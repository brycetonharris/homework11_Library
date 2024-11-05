package library.items;

public class DVD extends Item {
    private String regionCode;

    public DVD(String title, String author, String regionCode) {
        super(title, author);
        this.regionCode = regionCode;
    }

    public DVD() {
        this("Default DVD Title", "Default DVD Author", "0");
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Region Code: " + regionCode);
    }
}