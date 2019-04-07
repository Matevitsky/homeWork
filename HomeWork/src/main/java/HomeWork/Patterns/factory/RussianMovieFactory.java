package HomeWork.Patterns.factory;

public class RussianMovieFactory implements MovieFactory {
    @Override
    public Movie getMovie() {
        return new RussianMovie();
    }
}
