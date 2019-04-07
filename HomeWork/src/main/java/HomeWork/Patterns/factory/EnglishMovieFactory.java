package HomeWork.Patterns.factory;

public class EnglishMovieFactory implements MovieFactory {
    @Override
    public Movie getMovie() {
        return new EnglishMovie();
    }
}
