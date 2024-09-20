import com.franyutti.audioplayer.models.Podcasts;
import com.franyutti.audioplayer.models.Songs;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> likes = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        List<Integer> sortedLikes = new ArrayList<>();
        List<String> sortedNames = new ArrayList<>();
        List<String> names = new ArrayList<>();
        List<String> artists = new ArrayList<>();
        List<String> sortedArtists = new ArrayList<>();
        List<String> album = new ArrayList<>();
        List<String> sortedAlbum = new ArrayList<>();
        List<Integer> numberOfTracks = new ArrayList<>();
        List<Integer> sortedNumberOfTracks = new ArrayList<>();
        List<Integer> duration = new ArrayList<>();
        List<Integer> sortedDuration = new ArrayList<>();
        List<String> topic = new ArrayList<>();
        List<String> sortedTopic = new ArrayList<>();
        List<Podcasts> podcasts = new ArrayList<>();
        List<Songs> songs = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        int max;
        int index;
        int exit = 0;

        Podcasts myFirstPodcast = new Podcasts();
        myFirstPodcast.setName("My first podcast");
        myFirstPodcast.setArtist("Franyutti");
        myFirstPodcast.setLikes(16000);
        myFirstPodcast.setTopic("Computer Science");
        myFirstPodcast.setDuration(30);

        Podcasts mySecondPodcast = new Podcasts();
        mySecondPodcast.setName("My second podcast");
        mySecondPodcast.setArtist("Franyutti");
        mySecondPodcast.setLikes(10000);
        mySecondPodcast.setTopic("Artificial Intelligence");
        mySecondPodcast.setDuration(25);

        Podcasts myThirdPodcast = new Podcasts();
        myThirdPodcast.setName("My third podcast");
        myThirdPodcast.setArtist("Franyutti");
        myThirdPodcast.setLikes(20000);
        myThirdPodcast.setTopic("Machine learning");
        myThirdPodcast.setDuration(40);

        podcasts.add(myFirstPodcast);
        podcasts.add(mySecondPodcast);
        podcasts.add(myThirdPodcast);

        Songs withoutme = new Songs();
        withoutme.setName("Without me");
        withoutme.setArtist("Eminem");
        withoutme.setLikes(15000);
        withoutme.setAlbumName("Curtain Call");
        withoutme.setTracks(10);

        Songs diamonds = new Songs();
        diamonds.setName("Diamonds");
        diamonds.setArtist("Rihanna");
        diamonds.setLikes(10000);
        diamonds.setAlbumName("Diamonds");
        diamonds.setTracks(1);

        Songs standingNextToYou = new Songs();
        standingNextToYou.setName("Standing next to you");
        standingNextToYou.setArtist("Jungkook");
        standingNextToYou.setLikes(17000);
        standingNextToYou.setAlbumName("Golden");
        standingNextToYou.setTracks(7);

        Songs monalisa = new Songs();
        monalisa.setName("Monalisa");
        monalisa.setArtist("Dominic Fike");
        monalisa.setLikes(19000);
        monalisa.setAlbumName("Monalisa");
        monalisa.setTracks(1);

        Songs blueHour = new Songs();
        blueHour.setName("Blue hour");
        blueHour.setArtist("txt");
        blueHour.setLikes(18000);
        blueHour.setAlbumName("Minisode");
        blueHour.setTracks(6);

        songs.add(withoutme);
        songs.add(diamonds);
        songs.add(standingNextToYou);
        songs.add(monalisa);
        songs.add(blueHour);

        while (exit != 9) {
            System.out.println("\nEnter a number to see a top");
            System.out.println("""
                    \n1 - Top Songs
                    2 - Top Podcasts
                    9 - Exit
                    """);
            exit = keyboard.nextInt();

            switch (exit) {
                case 1:
                    for (Songs s : songs) {
                        names.add(s.getName());
                        artists.add(s.getArtist());
                        album.add(s.getAlbumName());
                        numberOfTracks.add(s.getTracks());
                        likes.add(s.getLikes());
                    }
                    for (int i = 0; i < likes.size(); i++) {
                        max = Collections.max(likes);
                        temp.add(max);
                        index = Collections.indexOfSubList(likes, temp);
                        sortedNames.add(names.get(index));
                        sortedArtists.add(artists.get(index));
                        sortedAlbum.add(album.get(index));
                        sortedNumberOfTracks.add(numberOfTracks.get(index));
                        temp.clear();
                        likes.remove(index);
                        likes.add(index, 0);
                        sortedLikes.add(max);
                    }
                    for (int i = 0; i < sortedNames.size(); i++) {
                        System.out.printf("%d - %s - Artist: %s - Likes: %d - Album: %s - No. Tracks: %d \n", i + 1, sortedNames.get(i), sortedArtists.get(i), sortedLikes.get(i), sortedAlbum.get(i), sortedNumberOfTracks.get(i));
                    }
                    likes.clear();
                    sortedLikes.clear();
                    names.clear();
                    artists.clear();
                    album.clear();
                    numberOfTracks.clear();
                    sortedNumberOfTracks.clear();
                    sortedArtists.clear();
                    sortedAlbum.clear();
                    sortedNames.clear();
                    break;
                case 2:
                    for (Podcasts p : podcasts) {
                        names.add(p.getName());
                        artists.add(p.getArtist());
                        duration.add(p.getDuration());
                        likes.add(p.getLikes());
                        topic.add(p.getTopic());
                    }
                    for (int i = 0; i < podcasts.size(); i++) {
                        max = Collections.max(likes);
                        temp.add(max);
                        index = Collections.indexOfSubList(likes, temp);
                        sortedNames.add(names.get(index));
                        sortedArtists.add(artists.get(index));
                        sortedTopic.add(topic.get(index));
                        sortedDuration.add(duration.get(index));
                        temp.clear();
                        likes.remove(index);
                        likes.add(index, 0);
                        sortedLikes.add(max);
                    }
                    for (int i = 0; i < sortedNames.size(); i++) {
                        System.out.printf("%d - %s - Creator: %s - Likes: %d - Topic: %s - Duration: %d \n", i + 1, sortedNames.get(i), sortedArtists.get(i), sortedLikes.get(i), sortedTopic.get(i), sortedDuration.get(i));
                    }
                    likes.clear();
                    sortedLikes.clear();
                    names.clear();
                    artists.clear();
                    duration.clear();
                    topic.clear();
                    sortedTopic.clear();
                    sortedArtists.clear();
                    sortedDuration.clear();
                    sortedNames.clear();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Enter a valid number from the list");
                    break;
            }
        }

    }
}
