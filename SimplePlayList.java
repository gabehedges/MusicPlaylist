/*
 * @author Gabe Hedges with Mark Yankovitz
 * @version 09302019
 */



import java.util.ArrayList;
public class SimplePlayList implements PlayList {
	private ArrayList<PlayListTrack> tracks;
	
	public SimplePlayList() {
		tracks = new ArrayList<PlayListTrack>();
	}
	/**
     * Returns the current track in the play list and removes it from the play
     * list, advancing to the next track. If the play list is empty, the
     * behavior of this method is undefined, so the caller is required to check
     * to see if the play list is empty BEFORE calling this method.
     *
     * @return the current track in the play list
     */
    public PlayListTrack getTrack() {
    	return tracks.remove(0);

    	
    	
    }

    /**
     * Returns the current track in the play list without removing it. If the
     * play list is empty the behavior of this method is undefined so the caller
     * is required to check to see if the play list is empty BEFORE calling this
     * method.
     *
     * @return the current track in the play list
     */
    public PlayListTrack peekAtTrack() {
    	return tracks.get(0);
    }

    /**
     * Appends another track to the end of the play list
     *
     * @param track
     *            track to be appened to the end of the list
     */
    public void addTrack(PlayListTrack track) {
    	this.tracks.add(track);
    }
    

    /**
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty() {
    	
    	boolean tF = false;
    	if (tracks.isEmpty()) {
    		tF = true; }
    	return tF;
    	
} public PlayListTrack peekAtSecond() {
	return tracks.get(1);
} public ArrayList getArray() {
	return this.tracks;
}

}
