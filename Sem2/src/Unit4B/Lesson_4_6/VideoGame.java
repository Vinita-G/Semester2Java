package Unit4B.Lesson_4_6;

public class VideoGame {
    private String title, publisher, platform;
    private int year;
    private double price;
    private String category;

    public VideoGame(String title, String publisher, String platform, int year, double price, String category) {
        this.title = title;
        this.publisher = publisher;
        this.platform = platform;
        this.year = year;
        this.price = price;
        this.category = category;
    }
    //need 25 spaces for string name
    //need 25 for maker
    // 10 for platfor
    // six for year
    // 8.2 for price
    //20 for category

    public String toString(){
        return String.format("%-25s %-25s %-10s %-6d $ %6.2f %4s %-20s", title, publisher, platform, year, price," ",category);
        // return "Title: " + title + "Publisher: " + publisher +"Platform: " + platform +"Year: " + year +
        //"Price: " + price + "Category: " + category;
    }

}
