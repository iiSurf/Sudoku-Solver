public class SudokuRunner {
   public static void main(String[] args) {
      SudokuBoard myBoard = new SudokuBoard("valid-complete.sdk");
         myBoard.isValid();
         System.out.println(myBoard.isValid());
         System.out.println(myBoard);
         System.out.println(myBoard.isSolved());
   }
}