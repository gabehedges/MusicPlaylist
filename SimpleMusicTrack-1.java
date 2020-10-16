/*
 * @author Gabe Hedges with Mark Yankovitz
 * @version 09302019
 */


public class SimpleMusicTrack implements PlayListTrack {

    private String name;
    private String artist;
    private String album;

    @Override
    public String getName() {

        return this.name;
    }

    @Override
    public void setName(String name) {
    	this.name = name;

    }

    @Override
    public String getArtist() {
        return this.artist;
    }

    @Override
    public void setArtist(String artist) {
    	this.artist = artist;

    }

    @Override
    public String getAlbum() {
    	return this.album;
    }

    @Override
    public void setAlbum(String album) {
    	this.album = album;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PlayListTrack ) {
        	PlayListTrack song = (PlayListTrack) obj;
         if ((this.getAlbum() == song.getAlbum()) && (this.getArtist() == song.getArtist()) && (this.getName() == song.getName()) ) {
        	 return true;
         } else { return false; }

        } else { return false; }

    }

    @Override
    public String toString() {
        String title = ("'" + this.getName() + " / " + this.getArtist() + " / " + this.getAlbum() +"'");
        return title;
    }

}
