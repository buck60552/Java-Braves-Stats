package bravesStats;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BravesStats {

    static String[] playerNames = { "Battle, Howard", "Lombard, George", "Speier, Justin", "Jones, Chipper",
            "Lopez, Javy", "Simon, Randall", "Klesko, Ryan", "Jordan, Brian", "Jones, Andruw", "Williams, Gerald",
            "Smoltz, John", "Hernandez, Jose", "Myers, Greg", "Lockhart, Keith", "Boone, Bret", "Perez, Eddie",
            "Hunter, Brian", "Guillen, Ozzie", "Garcia, Freddy", "Weiss, Walt", "Nixon, Otis", "Fabregas, Jorge",
            "Maddux, Greg", "Millwood, Kevin", "Glavine, Tom", "Perez, Odalis", "Matos, Pascual", "Bergman, Sean",
            "Mulholland, Terry", "Chen, Bruce", "DeRosa, Mark", "Ebert, Derrin", "Hudek, John", "McGlinchy, Kevin",
            "Remlinger, Mike", "Seanez, Rudy", "Bowie, Micah", "Cather, Mike", "Cortes, David", "Rocker, John",
            "Springer, Russ", "Stull, Everett", "Winkelsas, Joe", "Wohlers, Mark" };

    static int[] gamesPlayed = { 15, 6, 18, 157, 65, 90, 133, 153, 162, 143, 29, 48, 34, 108, 152, 104, 114, 92, 2, 110,
            84, 6, 31, 31, 33, 17, 6, 6, 16, 15, 7, 5, 12, 61, 70, 52, 3, 4, 4, 69, 46, 1, 1, 2 };

    static int[] atBats = { 17, 6, 3, 567, 246, 218, 404, 576, 592, 422, 62, 166, 72, 161, 608, 309, 181, 232, 2, 279,
            151, 8, 64, 78, 65, 30, 8, 0, 16, 11, 8, 1, 1, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0 };

    static int[] runsScored = { 2, 1, 0, 116, 34, 26, 55, 100, 97, 76, 11, 22, 10, 20, 102, 30, 28, 21, 1, 38, 31, 0, 7,
            4, 3, 1, 0, 0, 2, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0 };

    static int[] hits = { 6, 2, 1, 181, 78, 69, 120, 163, 163, 116, 17, 42, 16, 42, 153, 77, 45, 56, 1, 63, 31, 0, 11,
            12, 9, 4, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    static int[] doubles = { 0, 0, 0, 41, 18, 16, 28, 28, 35, 24, 4, 8, 2, 3, 38, 17, 12, 16, 0, 13, 2, 0, 1, 2, 1, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    static int[] triples = { 0, 0, 0, 1, 1, 0, 2, 4, 5, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 4, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    static int[] homeRuns = { 1, 0, 0, 45, 11, 5, 21, 23, 26, 17, 1, 4, 2, 1, 20, 7, 6, 1, 1, 2, 0, 0, 2, 1, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    static int[] runsBattedIn = { 5, 0, 0, 110, 45, 25, 80, 115, 84, 68, 7, 19, 9, 21, 63, 30, 30, 20, 1, 29, 8, 0, 7,
            6, 64, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    static int[] walks = { 2, 1, 0, 126, 20, 17, 53, 51, 76, 33, 5, 12, 13, 19, 47, 17, 31, 15, 1, 35, 23, 0, 1, 2, 5,
            0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 };

    static int[] strikeouts = { 3, 2, 2, 94, 41, 25, 69, 81, 103, 67, 28, 44, 16, 21, 112, 40, 40, 17, 1, 48, 15, 0, 18,
            29, 17, 10, 1, 0, 4, 6, 2, 1, 1, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0 };

    static int[] key = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
            26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44 };
   
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        char trueSelect = menu(sc);
       
        while (trueSelect != 'Q') {
           
            switch (trueSelect) {
           
            case 'C':
                categoryLeads();
           
            case 'P':
                searchPlayer(sc);
           
            case 'T':
                displayCategoryTotals();
            }
        }
    }
    
    // category leaders
    static int gamePlayer() {
        int i;

        int max = gamesPlayed[0];

        for (i = 1; i < gamesPlayed.length; i++) {
            if (gamesPlayed[i] > max) {
                max = gamesPlayed[i];
            }
        }
        return max;
    }

    static int batter() {
        int i;

        int max = atBats[0];

        for (i = 1; i < atBats.length; i++) {
            if (atBats[i] > max) {
                max = atBats[i];
            }
        }

        return max;
    }

    static int runner() {
        int i;

        int max = runsScored[0];

        for (i = 1; i < runsScored.length; i++) {
            if (runsScored[i] > max) {
                max = runsScored[i];
            }
        }
        return max;
    }

    static int hitter() {
        int i;

        int max = hits[0];

        for (i = 1; i < hits.length; i++) {
            if (hits[i] > max) {
                max = hits[i];
            }
        }
        return max;
    }

    static int doubler() {
        int i;

        int max = doubles[0];

        for (i = 1; i < doubles.length; i++) {
            if (doubles[i] > max) {
                max = doubles[i];
            }
        }
        return max;
    }

    static int tripler() {
        int i;

        int max = triples[0];

        for (i = 1; i < triples.length; i++) {
            if (triples[i] > max) {
                max = triples[i];
            }
        }
        return max;
    }

    static int homeRunner() {
        int i;

        int max = homeRuns[0];

        for (i = 1; i < homeRuns.length; i++) {
            if (homeRuns[i] > max) {
                max = homeRuns[i];
            }
        }
        return max;
    }

    static int runsBattedInner() {
        int i;

        int max = runsBattedIn[0];

        for (i = 1; i < runsBattedIn.length; i++) {
            if (runsBattedIn[i] > max) {
                max = runsBattedIn[i];
            }
        }
        return max;
    }

    static int walker() {
        int i;

        int max = walks[0];

        for (i = 1; i < walks.length; i++) {
            if (walks[i] > max) {
                max = walks[i];
            }
        }
        return max;
    }

    static int worstBatter() {
        int i;

        int max = gamesPlayed[0];

        for (i = 1; i < gamesPlayed.length; i++) {
            if (gamesPlayed[i] > max) {
                max = gamesPlayed[i];
            }
        }

        return max;
    }

    static String gamePlayerP() {
        int i;

        int max = gamesPlayed[0];
        int max2 = 0;

        for (i = 1; i < gamesPlayed.length; i++) {
            if (gamesPlayed[i] > max) {
                max = gamesPlayed[i];
                max2 = i;

            }
        }
        return playerNames[max2];
    }

    static String batterP() {
        int i;

        int max = atBats[0];
        int max2 = 0;

        for (i = 1; i < atBats.length; i++) {
            if (atBats[i] > max) {
                max = atBats[i];
                max2 = i;

            }
        }

        return playerNames[max2];
    }

    static String runnerP() {
        int i;

        int max = runsScored[0];
        int max2 = 0;

        for (i = 1; i < runsScored.length; i++) {
            if (runsScored[i] > max) {
                max = runsScored[i];
                max2 = i;

            }
        }
        return playerNames[max2];
    }

    static String hitterP() {
        int i;

        int max = hits[0];
        int max2 = 0;

        for (i = 1; i < hits.length; i++) {
            if (hits[i] > max) {
                max = hits[i];
                max2 = i;

            }
        }
        return playerNames[max2];
    }

    static String doublerP() {
        int i;

        int max = doubles[0];
        int max2 = 0;

        for (i = 1; i < doubles.length; i++) {
            if (doubles[i] > max) {
                max = doubles[i];
                max2 = i;

            }
        }
        return playerNames[max2];
    }

    static String triplerP() {
        int i;

        int max = triples[0];
        int max2 = 0;

        for (i = 1; i < triples.length; i++) {
            if (triples[i] > max) {
                max = triples[i];
                max2 = i;

            }
        }
        return playerNames[max2];
    }

    static String homeRunnerP() {
        int i;

        int max = homeRuns[0];
        int max2 = 0;

        for (i = 1; i < homeRuns.length; i++) {
            if (homeRuns[i] > max) {
                max = homeRuns[i];
                max2 = i;

            }
        }
        return playerNames[max2];
    }

    static String runsBattedInnerP() {
        int i;

        int max = runsBattedIn[0];
        int max2 = 0;

        for (i = 1; i < runsBattedIn.length; i++) {
            if (runsBattedIn[i] > max) {
                max = runsBattedIn[i];
                max2 = i;

            }
        }
        return playerNames[max2];
    }

    static String walkerP() {
        int i;

        int max = walks[0];
        int max2 = 0;

        for (i = 1; i < walks.length; i++) {
            if (walks[i] > max) {
                max = walks[i];
                max2 = i;

            }
        }
        return playerNames[max2];
    }

    static String worstBatterP() {
        int i;

        int max = gamesPlayed[0];
        int max2 = 0;

        for (i = 1; i < gamesPlayed.length; i++) {
            if (gamesPlayed[i] > max) {
                max = gamesPlayed[i];
                max2 = i;

            }
        }

        return playerNames[max2];
    }

    public static void bestBatter() {
        int i, index;
       
        DecimalFormat dForm = new DecimalFormat(".000");
       
        double[] b = new double[playerNames.length];
       
        for (i = 0; i < b.length; i++)

        {
            if (atBats[i] >= 100)
                b[i] = (double) hits[i] / atBats[i];

            else
                b[i] = 0;
        }
        index = 0;
        for (i = 1; i < b.length; i++)
            if (b[i] > b[index])
                index = i;

        for (i = 0; i < b.length; i++)
            if (b[i] == b[index])
                System.out.println(playerNames[i] + "-" + dForm.format(b[i]));
    }

    public static void bestSlugger() {
        int i, index;
       
        DecimalFormat dForm = new DecimalFormat(".000");
       
        double[] b = new double[playerNames.length];
       
        for (i = 0; i < b.length; i++)
            if (atBats[i] >= 100)
                b[i] = ((hits[i] - doubles[i] - triples[i] - homeRuns[i]) + (doubles[i] * 2) + (triples[i] * 3)
                        + (homeRuns[i] * 4)) / (double) atBats[i];

            else

                b[i] = 0;
        index = 0;
       
        for (i = 1; i < b.length; i++)
            if (b[i] > b[index])
                index = i;
       
        for (i = 0; i < b.length; i++)
            if (b[i] == b[index])
                System.out.println(playerNames[i] + "-" + dForm.format(b[i]));
    }

    // end Category Leaders
    // totals start
    public static void totalStat(int arr[]) {
      
        int i, sum = 0;
       
        for (i = 0; i < arr.length; i++)
            sum += arr[i];
        System.out.println(sum);
    }

    public static void totalBattingDec() {
      
        int i, h = 0, bats = 0;
      
        double sum = 0;
       
        DecimalFormat dForm = new DecimalFormat(".000");
      
        for (i = 0; i < playerNames.length; i++) {
            h += hits[i];
            bats += atBats[i];
        }

        sum += (double) h / bats;

        System.out.println(dForm.format(sum));
    }

    public static void totalSluggingDec() {
       
        int i, totalH = 0, totalD = 0, totalT = 0, totalF = 0, totalBats = 0;
      
        double sum = 0;
       
        DecimalFormat dForm = new DecimalFormat(".000");
       
        for (i = 0; i < playerNames.length; i++) {
            totalH += hits[i];
            totalD += doubles[i];
            totalT += triples[i];
            totalF += homeRuns[i];
            totalBats += atBats[i];
        }

        sum = ((totalH - totalD - totalT - totalF) + (totalD * 2) + (totalT * 3) + (totalF * 4)) / (double) totalBats;
        System.out.println(dForm.format(sum));
    }

    // totals setup end

    // menu setup
    public static char menu(Scanner sc) {
       
        char trueSelect;
        System.out.println("");
        System.out.println("|--------------------------------------------|");
        System.out.println("|      What would you like to do next?       |");
        System.out.println("| Input the letter code to select an option  |");
        System.out.println("|--------------------------------------------|");
        System.out.println("(c) Show Category Leaders.");
        System.out.println("(p) Show Stats For a Player.");
        System.out.println("(t) Show Stat Totals For All Players.");
        System.out.println("(q) Quit");
       
        do {
            System.out.print("|--|Make Selection Below: ");
            System.out.println("");
            trueSelect = Character.toUpperCase(sc.nextLine().trim().charAt(0));

            if (trueSelect == 'P' || trueSelect == 'C' || trueSelect == 'T' || trueSelect == 'Q')
                return trueSelect;

            System.out.println("Incompatible Input, Try Again");
        } while (true);
    }
    // category leaders
    public static void categoryLeads() {
       
        System.out.println("|--------------------------------------------|");
        System.out.println("Most Games played: ");
        System.out.println(gamePlayerP() + " - " + gamePlayer());
        System.out.println("Most At Bats: ");
        System.out.println(batterP() + " - " + batter());
        System.out.println("Most Runs Scored: ");
        System.out.println(runnerP() + " - " + runner());
        System.out.println("Most Hits: ");
        System.out.println(hitterP() + " - " + hitter());
        System.out.println("Most Doubles Hit: ");
        System.out.println(doublerP() + " - " + doubler());
        System.out.println("Most Triples Hit: ");
        System.out.println(triplerP() + " - " + tripler());
        System.out.println("Most Homeruns Hit: ");
        System.out.println(homeRunnerP() + " - " + homeRunner());
        System.out.println("Most Runs Batted In: ");
        System.out.println(runsBattedInnerP() + " - " + runsBattedInner());
        System.out.println("Most Walks: ");
        System.out.println(walkerP() + " - " + walker());
        System.out.println("Most Strikeouts: ");
        System.out.println(worstBatterP() + " - " + worstBatter());
        System.out.println("Best Batting Average: ");
        bestBatter();
        System.out.println("Best Slugging average: ");
        bestSlugger();
        System.out.println("|--------------------------------------------|");
    }

    // search start
    public static void searchPlayer(Scanner sc) {
       
        String n, m;
       
        DecimalFormat dForm = new DecimalFormat(".000");
       
        int letters, i;
        sc.nextLine();
       
        System.out.println("Enter player name, last name first:");
        
        n = sc.nextLine();
        letters = n.length();
        
        for (i = 0; i < playerNames.length; i++) {
            m = playerNames[i].substring(0, letters);
        
        if (m.compareToIgnoreCase(n) == 0) {
            System.out.println("\n\nName: " + playerNames[i]);
            System.out.println("Games played: " + gamesPlayed[i]);
            System.out.println("At bats: " + atBats[i]);
            System.out.println("Runs scored: " + runsScored[i]);
            System.out.println("Hits: " + hits[i]);
            System.out.println("Doubles: " + doubles[i]);
            System.out.println("Triples: " + triples[i]);
            System.out.println("Home Runs: " + homeRuns[i]);
            System.out.println("Runs Batted in: " + runsBattedIn[i]);
            System.out.println("Walks: " + walks[i]);
            System.out.println("Strikeouts: " + strikeouts[i]);
            System.out.println("Batting Average: " + dForm.format(hits[i] / (double) atBats[i]));
            System.out.println("Slugging Average: " + dForm.format(((hits[i] - doubles[i] - triples[i] - homeRuns[i])
                    + (doubles[i] * 2) + (triples[i] * 3) + (homeRuns[i] * 4)) / (double) atBats[i]));
        }}
    }
    // totals
    public static void displayCategoryTotals() {
       
        System.out.print("Total At Bats: ");
        totalStat(atBats);
        System.out.print("Total Runs Scored: ");
        totalStat(runsScored);
        System.out.print("Total Hits: ");
        totalStat(hits);
        System.out.print("Total Doubles: ");
        totalStat(doubles);
        System.out.print("Total Triples: ");
        totalStat(triples);
        System.out.print("Total Home Runs: ");
        totalStat(homeRuns);
        System.out.print("Total Runs Batted In: ");
        totalStat(runsBattedIn);
        System.out.print("Total Walks: ");
        totalStat(walks);
        System.out.print("Total Strike Outs: ");
        totalStat(strikeouts);
        System.out.print("Batting Average: ");
        totalBattingDec();
        System.out.print("Slugging Average ");
        totalSluggingDec();

    }
}
