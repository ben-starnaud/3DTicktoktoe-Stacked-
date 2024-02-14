public class MethoudTester {

    private static String[][][] layersOfGameboard = {{
             {"   ", "  ", "  ", "  ", "  "," "},
             {"   ", "__", "__", "__", "__"," "},
             {"   ", "__", "__", "__", "__"," "},   //i = 0
             {"   ", "__", "__", "__", "__"," "},
             {"   ", "__", "__", "__", "__"," "},
             {"   ", "  ", "  ", "  ", "  "," "},},
            {{"   ", "  ", "  ", "  ", "  "," "},
             {"   ", "__", "__", "__", "__"," "},
             {"   ", "__", "__", "__", "__"," "},   //i = 0
             {"   ", "__", "__", "__", "__"," "},
             {"   ", "__", "__", "__", "__"," "},
             {"   ", "  ", "  ", "  ", "  "," "}},
             {{"   ", "  ", "  ", "  ", "  "," "},
             {"   ", "__", "__", "__", "__"," "},
             {"   ", "__", "__", "__", "__"," "},   //i = 0
             {"   ", "__", "__", "__", "__"," "},
             {"   ", "__", "__", "__", "__"," "},
             {"   ", "  ", "  ", "  ", "  "," "}},
            {{"   ", "  ", "  ", "  ", "  "," "},
             {"   ", "__", "__", "__", "__"," "},
             {"   ", "__", "__", "__", "__"," "},   //i = 0
             {"   ", "__", "__", "__", "__"," "},
             {"   ", "__", "__", "__", "__"," "},
             {"   ", "  ", "  ", "  ", "  "," "}}};




    private static String[][] gameBoard = {

            { "  ","  ", "  ", "  ", "  ","  " },
            { "  ","__", "__", "__", "__","  " },
            { "  ","__", "__", "__", "__","  " },
            { "  ","__", "__", "__", "__","  " },
            { "  ","__", "__", "__", "__","  " },
            { "  ","  ", "  ", "  ", "  ","  " },
    };

    public static void main(String[] args) {

        StdDraw.nextKeyTyped();



    }

    private static void printGameBoard (String[][]gameBoard){
        System.out.println("   c1 c2 c3 c4");
        for (int i = 1; i <= 4; i++) {
            System.out.print("r"+i+" ");
            for (int j = 1; j <= 4; j++) {
                System.out.print(gameBoard[i][j]);
                System.out.print("|");

            }
            System.out.println();
        }
    }


}




