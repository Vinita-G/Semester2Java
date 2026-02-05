package Unit4B.Lesson_4_6.Lesson_4_6HW;

public class Restaurant {
    private int id;
    private String name;
    private String cuisine;
    private String type;
    private double rating;

    public Restaurant(int id, String name, String cuisine, String type, double rating) {
        this.id = id;
        this.name = name;
        this.cuisine = cuisine;
        this.type = type;
        this.rating = rating;
    }

    public String toString(){
        return id + "   " + name +"    " + cuisine + "   " + type + "   " + rating;
    }
}
