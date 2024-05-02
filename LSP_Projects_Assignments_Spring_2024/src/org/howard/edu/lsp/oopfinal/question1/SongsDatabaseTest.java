package org.howard.edu.lsp.oopfinal.question1;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class SongsDatabaseTest {
    @Test
    public void testAddSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        Set<String> rapSongs = db.getSongs("Rap");
        assertTrue(rapSongs.contains("Savage"));
    }

    @Test
    public void testGetGenreOfSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Jazz", "Always There");
        assertEquals("Jazz", db.getGenreOfSong("Always There"));
    }

    @Test
    public void testGetSongs() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Country", "Sweet Alabama");
        Set<String> countrySongs = db.getSongs("Country");
        assertTrue(countrySongs.contains("Sweet Alabama"));
    }
}
