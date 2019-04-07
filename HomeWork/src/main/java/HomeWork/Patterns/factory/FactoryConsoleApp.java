package HomeWork.Patterns.factory;

import java.util.Scanner;

public class FactoryConsoleApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the movie language or 0 to exit");
            String movieLanguage = scanner.next();
            if (movieLanguage.equalsIgnoreCase("0")) {
                System.exit(1);
            }
            try {
                factory(movieLanguage);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

        }

    }

    static void factory(String movieLanguage) {
        MovieFactory movieFactory = getMovieByLanguage(movieLanguage);
        Movie movie = movieFactory.getMovie();
        System.out.println(movie.toString());

    }

    static MovieFactory getMovieByLanguage(String soundTrackLanguage) {
        if (soundTrackLanguage.equalsIgnoreCase("English")) {
            return new EnglishMovieFactory();
        } else if (soundTrackLanguage.equalsIgnoreCase("Russian")) {
            return new RussianMovieFactory();
        }
        throw new RuntimeException("Movie on " + soundTrackLanguage + " language is not exist");
    }
}
