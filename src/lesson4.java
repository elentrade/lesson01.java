import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class lesson4 {
    static final int SizeMap = 3;
    static final int WinItems = 3;
    static final char DotX = 'X';
    static final char DotO = 'O';
    static final char DotEmpty = '*';
    static char[][] GameMap = new char[SizeMap][SizeMap];

    //fill map with '*"
    static void Map() {
        for (int i = 0; i < GameMap.length; i++) {
            for (int j = 0; j < GameMap[i].length; j++) {
                GameMap[i][j] = DotEmpty;
            }
        }
    }

    //print map wih row and column index
    static void PrintMap() {
        for (int i = 0; i <= SizeMap; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SizeMap; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SizeMap; j++) {
                System.out.print(GameMap[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //Human step
    static void HumanStep() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        do {
            System.out.println("Enter coordinate in X Y formate");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }
        while (!CheckValid(x, y));
        GameMap[y][x] = DotX;
    }

    //Human step
    static void ProgramStep() {
        Random random = new Random();
        int x;
        int y;
        do {
            x = random.nextInt(SizeMap);
            y = random.nextInt(SizeMap);
        }
        while (!CheckValid(x, y));
        GameMap[y][x] = DotO;
    }

    //Check validate of coordinate
    static boolean CheckValid(int x, int y) {
        if (x < 0 || x > SizeMap || y < 0 || y > SizeMap) {
            return false;
        } else {
            if (GameMap[y][x] == DotEmpty) {
                return true;
            }
            return false;
        }
    }

    ////Check win. If Dot has found 3 times - win
    static boolean CheckWin(char Symbol) {
        int Dots;
        //checking rows
        for (int i = 0; i < SizeMap; i++) {
            Dots = 0;
            for (int j = 0; j < GameMap[i].length; j++) {
                if (GameMap[i][j] == Symbol) {
                    Dots = Dots + 1;
                }
                if (Dots == 3) {
                    return true;
                    //break;
                }
            }

            return false;
        }

        //checking columns
for (int j=0;j<SizeMap;j++) {
    Dots = 0;
    for (int i = 0; i < SizeMap; i++) {
        if (GameMap[i][j] == Symbol) {
            Dots = Dots + 1;
        }
        if (Dots == 3) {
            return true;
            //  break;
        }
    }
    return false;
}

        if ((GameMap[0][0] == Symbol && GameMap[1][1] == Symbol && GameMap[2][2] == Symbol) || (GameMap[2][0] == Symbol && GameMap[1][1] == Symbol && GameMap[0][2] == Symbol)) {
            return true;
        }

        return false;
    }

    // Check empty
    static boolean CheckEmpty() {
        for (int i = 0; i < SizeMap; i++) {
            for (int j = 0; j < GameMap[i].length; j++) {
                if (GameMap[i][j] == DotEmpty) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Map();
        PrintMap();
        while (true) {
            HumanStep();
            PrintMap();
            if (CheckWin(DotX)) {
                System.out.println("Human, you are win");
                break;
            }
            if (CheckEmpty()) {
                System.out.println("Game over. Nobody win");
                 break;
            }
            ProgramStep();
            PrintMap();
            if (CheckWin(DotO)) {
                System.out.println("Human, you are looser");
                  break;
            }
            if (CheckEmpty()) {
                System.out.println("Game over. Nobody win");
                break;
            }
        }

    }
}