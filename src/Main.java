import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("1задание");
        Set<Integer> set = new HashSet<>();

        Random random = new Random();

        for (int i = 0; i < 40; i++) {
            int randomNumber = random.nextInt(21);
            set.add(randomNumber);
        }

        System.out.println("Значения в множестве: " + set);

        int sum = 0;
        for (int value : set) {
            sum += value;
        }

        System.out.println("Сумма всех значений: " + sum);

        System.out.println("\n");

        System.out.println("\n2задание");
        try {

            Song song1 = new Song("Everything i wanted ", "Billie Eilish");
            Song song2 = new Song("Me Gustas Tu", "Manu Chao");
            Song song3 = new Song("She Wolf", "Shakira");
            Song song4 = new Song("Without Me", "Eminem");
            Song song5 = new Song("Mackin'", "Eminem");

            Set<Song> songs = new TreeSet<>();
            songs.add(song1);
            songs.add(song2);
            songs.add(song3);
            songs.add(song4);
            songs.add(song5);
            if (songs.isEmpty()) {
                System.out.println("Первый TreeSet пуст.");
            } else {
                TreeSet<Song> treeSet2 = (TreeSet<Song>) ((TreeSet<Song>) songs).clone();
                System.out.println("Элементы второго TreeSet:");
                Iterator<Song> iterator = treeSet2.iterator();
                while (iterator.hasNext()) {

                    Song song = iterator.next();
                    System.out.println("Title: " + song.getTitle() + ", Author: " + song.getAutor());
                }

            }
        } catch (NoSuchElementException | ClassCastException e) {
            e.printStackTrace();
        }
    }}