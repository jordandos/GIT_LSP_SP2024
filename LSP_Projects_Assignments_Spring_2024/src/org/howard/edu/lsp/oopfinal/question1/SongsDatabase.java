package org.howard.edu.lsp.oopfinal.question1;

import java.util.*;

public class SongsDatabase {
    private Map<String, Set<String>> map = new HashMap<String, Set<String>>();

    public void addSong(String genre, String songTitle) {
        if (!map.containsKey(genre)) {
            map.put(genre, new HashSet<String>());
        }
        map.get(genre).add(songTitle);
    }

    public String getGenreOfSong(String songTitle) {
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            if (entry.getValue().contains(songTitle)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public Set<String> getSongs(String genre) {
        return map.getOrDefault(genre, new HashSet<String>());
    }
}
