package Unit4B.Lesson_4_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class VideoGameTester {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        Create File object
        create Scanner to read this file
        Crate an ArrayList of VideoGame objects
        Use a while loop to read as long as there is data
            read whole line
            use split method to break up line
            individually assign each value in the split array into its own var
            Create VideoGame object with those variables
            Add the object to the ArrayList
         */
        File f = new File("video_games.txt");
        Scanner inF = new Scanner(f);

        ArrayList<VideoGame> games = new ArrayList<>();
        while(inF.hasNextLine()){
            String wholeLine = inF.nextLine();
            String[] splitArr = wholeLine.split(",");
            String title = splitArr[0];
            String publisher = splitArr[1];
            String platform = splitArr[2];
            //takes string and as long as the string can be turned into an int, it turns it into an int and returns it
            int year = Integer.parseInt(splitArr[3]);
            double price = Double.parseDouble(splitArr[4]);
            String category = splitArr[5];

            VideoGame v = new VideoGame(title, publisher, platform, year, price, category);
            games.add(v);
        }
        for(VideoGame v: games){
            System.out.println(v);
        }
    }
}
