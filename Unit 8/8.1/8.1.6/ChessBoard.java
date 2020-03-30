public class ChessBoard
{
    public static void main(String[] args)
    {
        //Create an 8x8 2D String array called chess.
        String[] pieces = {"Rook", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight", "Rook"};
        
        String[][] chess = new String[8][8];
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                if (i<1 || i >6){
                    chess[i][j] = pieces[j];
                }
                else if ((i > 0 && i < 2) || (i>5 && i<7)){
                    chess[i][j] = "Pawn";
                }
                else{
                    chess[i][j] = "-";
                }
            }
        }
        
        //Use this method to print the chess board onto the console
        print(chess);
        

    }
    
    //Do not make alterations to this method!
    public static void print(String[][] array)
    {
        for(String[] row: array)
        {
            for(String thing: row)
            {
                System.out.print(thing + "\t");
            }
            System.out.println();
        }
    }
}
