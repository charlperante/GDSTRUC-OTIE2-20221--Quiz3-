import java.sql.Array;

public class Main {
    public static void main(String[] args) {

        ArrayQueue players = new ArrayQueue(50); // Player array
        ArrayQueue queue = new ArrayQueue(50); // Queue array
        ArrayQueue game = new ArrayQueue(5); // In game array

        int min = 1; // Minimum x value
        int max = 7; // Maximum x value

        int qNumber = 0; // In queue counter
        int gPlayers = 0; // In game players counter
        int games = 1; // Number of games counter

        players.add(new Player("Max"));           players.add(new Player("Lucas"));         players.add(new Player("Eleven"));            // 1, 2, 3
        players.add(new Player("Mike"));          players.add(new Player("Will"));          players.add(new Player("Dustin"));            // 4, 5, 6
        players.add(new Player("Nancy"));         players.add(new Player("Steve"));         players.add(new Player("Jonathan"));          // 7, 8, 9
        players.add(new Player("Robin"));         players.add(new Player("Eddie"));         players.add(new Player("Billy"));             // 10, 11, 12
        players.add(new Player("Argyle"));        players.add(new Player("Hopper"));        players.add(new Player("Joyce"));             // 13, 14, 15
        players.add(new Player("Murray"));        players.add(new Player("Yuri"));          players.add(new Player("Antonnov"));          // 16, 17, 18
        players.add(new Player("Phil"));          players.add(new Player("Claire"));        players.add(new Player("Haley"));             // 19, 20, 21
        players.add(new Player("Alex"));          players.add(new Player("Luke"));          players.add(new Player("Cam"));               // 22, 23, 24
        players.add(new Player("Mitch"));         players.add(new Player("Lily"));          players.add(new Player("Jay"));               // 25, 26, 27
        players.add(new Player("Gloria"));        players.add(new Player("Manny"));         players.add(new Player("Stella"));            // 28, 29, 30
        players.add(new Player("Dylan"));         players.add(new Player("Andy"));          players.add(new Player("Pepper"));            // 31, 32, 33
        players.add(new Player("Professor"));     players.add(new Player("Tokyo"));         players.add(new Player("Denver"));            // 34, 35, 36
        players.add(new Player("Rio"));           players.add(new Player("Nairobi"));       players.add(new Player("Oslo"));              // 37, 38, 39
        players.add(new Player("Moscow"));        players.add(new Player("Berlin"));        players.add(new Player("Helsinki"));          // 40, 41, 42
        players.add(new Player("Woofless"));      players.add(new Player("TBNRfrags"));     players.add(new Player("LachlanPlays"));      // 43, 44, 45
        players.add(new Player("Vikkstar123"));   players.add(new Player("BajanCanadian")); players.add(new Player("JeromeASF"));         // 46, 47, 48
        players.add(new Player("Pewdiepie"));     players.add(new Player("Jacksepticeye"));                                                     // 49, 50

        while (games <= 10) {

            int rand = (int) Math.floor(Math.random() * (max - min + 1) + min); // Random x value

            if (rand > players.size()) { // if rand is greater than players array size,
                rand = players.size(); // then rand is equals to players array size
            }

            System.out.print("IN QUEUE: ");

            // Queueing program
            if (rand <= 7 && players.size() != 0) {
                for (int i = 0; i < rand; i++) {
                    queue.add(players.remove());
                    qNumber++;
                }
                System.out.println(qNumber + " PLAYERS \n");
                queue.printQueue();
                System.out.print("\n\n");
            }

            // Press enter program
            System.out.println("--------------------------------------------------");
            System.out.print("Press Enter key to continue...");
            try {
                System.in.read();
            } catch (Exception e) {
            }
            System.out.println();

            // In game program
            while (qNumber >= 5) {
                for(int i = 0; i < 5; i++) {
                    game.add(queue.remove());
                    qNumber--;
                    gPlayers++;
                }
                System.out.println("IN GAME: " + gPlayers + " PLAYERS | " + games++ + " GAME/S \n");
                game.printQueue();
                System.out.print("\n");
            }
        }
    }
}