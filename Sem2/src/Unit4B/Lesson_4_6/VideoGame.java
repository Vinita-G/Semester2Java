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

    public String toString(){
        return "Title: " + title + "Publisher: " + publisher +"Platform: " + platform +"Year: " + year +
                "Price: " + price + "Category: " + category;
    }

}
