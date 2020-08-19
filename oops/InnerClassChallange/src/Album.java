import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList=new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.songList.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song checkedSong = this.songList.findSong(trackNumber);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }

        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = songList.findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    private class SongList{
        private ArrayList<Song> songs;

        public SongList() {
            this.songs =new ArrayList<Song>();
        }

        public boolean add(Song song) {
            if(songs.contains(song)) {
                return false;
            }
            songs.add(song);
            return true;
        }

        public Song findSong(String title) {
            for(Song song:this.songs) {
                if(song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }

        public Song findSong(int trackNumber) {
            int index=trackNumber-1;
            if(index>=0 && index<songs.size()) {
                return songs.get(index);
            }
            return null;
        }
    }
    
}
