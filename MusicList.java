/*
 * @author Gabe Hedges with Mark Yankovitz
 * @version 09302019
 */


import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
	class MusicList {

	public static void main(String[] args) {
		String peekName, peekArtist, getName, getArtist;
		String currentInfo = "";
		String nextInfo = "";
		SimplePlayList playlist = new SimplePlayList();
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the filename: ");
		String fileName = kb.nextLine();
		
		try {
		File songFile = new File(fileName); //Opening file
		Scanner songs = new Scanner(songFile);
		
		
		//Creating PlayListTracks from input file an placing into playlist
		 
		while (songs.hasNext()) {
			PlayListTrack song = new SimpleMusicTrack();
			song.setName(songs.nextLine());
			song.setArtist(songs.nextLine());
			song.setAlbum(songs.nextLine());
			playlist.addTrack(song); } 
		
		//Using user input to guide actions
		
		System.out.println("Currently playing: No Song Playing");
		System.out.println("Next track to play: " + playlist.peekAtTrack().getName() + " / " + playlist.peekAtTrack().getArtist());
		String input = ""; 
		while (!input.equals("q")) { //While the input does not equal 'q'...
				System.out.println("[P]lay next track");
				System.out.println("[A]dd a new track");
				System.out.println("[Q]uit");
				input = kb.nextLine();
				System.out.println();
				System.out.println();
				
				if (playlist.isEmpty()) { //forces user input to "q" if playlist is empty
					input = "q"; 
					System.out.println("No tracks remaining");
				}
				else { //If playlist is not empty, following lines of code are run
				peekName = playlist.peekAtTrack().getName(); //Using variables to store track information 
				peekArtist = playlist.peekAtTrack().getArtist();
				if (playlist.getArray().size() > 1) {
				getName = playlist.peekAtSecond().getName();
				getArtist = playlist.peekAtSecond().getArtist(); }
				
				if (input.equals("p")) {
					if (!(playlist.getArray().size() > 0)) {
						System.out.println("Playlist is empty - no more tracks.");
					} else if (!(playlist.getArray().size() > 1)){
					currentInfo =  "Currently playing: " + playlist.peekAtTrack().getName() + " / " +  playlist.peekAtTrack().getArtist();
					nextInfo = "Play list is empty - no more tracks";
					System.out.println("Currently playing: " + playlist.peekAtTrack().getName() + " / " +  playlist.peekAtTrack().getArtist());
					System.out.println("Next track to play: " + nextInfo); 
					playlist.getTrack(); }
					else {
						currentInfo =  "Currently playing: " + playlist.peekAtTrack().getName() + " / " +  playlist.peekAtTrack().getArtist();
						nextInfo = "Next track to play: " + playlist.peekAtSecond().getName() + " / " + playlist.peekAtSecond().getArtist();
						System.out.println("Currently playing: " + playlist.peekAtTrack().getName() + " / " +  playlist.peekAtTrack().getArtist());
						System.out.println("Next track to play: " + playlist.peekAtSecond().getName() + " / " + playlist.peekAtSecond().getArtist()); 
						playlist.getTrack();
					}
				} else if (input.equals("a")) {
					
					//Initiate new PlayListTrack, assign user input into it
					PlayListTrack track = new SimpleMusicTrack();
					System.out.print("Track name: ");
					String name = kb.nextLine();
					track.setName(name);
					System.out.print("Artist name: ");
					name = kb.nextLine();
					track.setArtist(name);
					System.out.print("Album name: ");
					name = kb.nextLine();
					track.setAlbum(name);
					
					System.out.println();
					System.out.println("New track: " + track.getName());
					System.out.println("Artist: " + track.getArtist());
					System.out.println("Album: " + track.getAlbum());
					System.out.print("Are you sure you want to add this track [y/n]?");
					String yN = kb.nextLine();
					if (yN.contentEquals("y")) {
						playlist.addTrack(track);
						System.out.println();
						System.out.println(currentInfo);
						System.out.println(nextInfo); 
					} else {
						System.out.println("Cancelled. Track not added.");
					}
				} else {
					input = "q";
					if (playlist.isEmpty()) {
						System.out.println("No tracks remaining");
					} 
					
					else {
					System.out.println("Tracks remaining in play list");
					System.out.println("--------------------------------------------------------------");
					int i = 1;
					while (!playlist.isEmpty()) {
						System.out.println(i + " - " + playlist.getTrack());
						i++;
					} }
				}
				
			}
		
		}
		
		}
		catch (IOException e) {
			System.out.println("Error opening file." + e);
		}
		
		


        }
	}


