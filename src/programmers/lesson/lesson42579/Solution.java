package programmers.lesson.lesson42579;

import java.util.*;

class Music implements Comparable<Music> {
    public int index;
    public String genres;
    public int plays;

    public Music(int index, String genres, int plays) {
        this.index = index;
        this.genres = genres;
        this.plays = plays;
    }

    @Override
    public String toString() {
        return "Music{" +
                "index=" + index +
                ", genres='" + genres + '\'' +
                ", plays=" + plays +
                '}';
    }

    @Override
    public int compareTo(Music o) {
        return -Integer.compare(this.plays, o.plays);
    }
}


class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genreRank = new HashMap<>();
        Map<String, List<Music>> playRank = new HashMap<>();

        for (int index = 0; index < genres.length; index++) {
            int curCount = genreRank.getOrDefault(genres[index], 0) + plays[index];
            genreRank.put(genres[index], curCount);

            List<Music> playCountList = playRank.getOrDefault(genres[index], new ArrayList<Music>());
            playCountList.add(new Music(index, genres[index], plays[index]));
            playRank.put(genres[index], playCountList);
        }
        List<Map.Entry<String, Integer>> genreRankSorted = new ArrayList<>(genreRank.entrySet());
        genreRankSorted.sort((o1, o2) -> -Integer.compare(o1.getValue(), o2.getValue()));

        List<Integer> answer = new ArrayList<>(genreRank.size() * 2);
        for (Map.Entry<String, Integer> e : genreRankSorted) {
            List<Music> musics = playRank.get(e.getKey());
            Collections.sort(musics);

            for (int i = 0; i < Math.min(2, musics.size()); i++) {
                answer.add(musics.get(i).index);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}