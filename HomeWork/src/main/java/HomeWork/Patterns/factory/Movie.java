package HomeWork.Patterns.factory;

abstract class Movie {
    private String soundTrack;
    private String subtitles;

    public Movie(String soundTrack, String subtitles) {
        this.soundTrack = soundTrack;
        this.subtitles = subtitles;
    }


    @Override
    public String toString() {
        return "soundTrack is " + soundTrack + " subtitles is " + subtitles;
    }
}
