public class SudokuCheckerEngineV2 {

   public static void main(String[] args) {
      // Note that here I am calling the board object MySudokuBoard
      // if you named your class something different, you should
      // find and replace all `MySudokuBoard` with your class name
      boolean allTests = true;
      
      // an empty board is valid, but not solved
      System.out.print("Checking empty board...");
      SudokuBoard board1 = new SudokuBoard("empty.sdk");
      assert board1.isValid() : "isValid: should be true";
      assert !board1.isSolved() : "isSolved: should be false";
      if(board1.isValid() && !board1.isSolved()) 
         System.out.println("passed.");
      else {
         System.out.println("failed.");
         allTests = false;
      }
   
      // an incomplete, valid board is valid, but not solved
      System.out.print("Checking incomplete, valid board...");
      SudokuBoard board2 = new SudokuBoard("valid-incomplete.sdk");
      assert board2.isValid() : "isValid: should be true";
      assert !board2.isSolved() : "isSolved: should be false";
      if(board2.isValid() && !board2.isSolved()) 
         System.out.println("passed.");
      else {
         System.out.println("failed.");
         allTests = false;
      }
      
      // a complete, valid board is valid and solved
      System.out.print("Checking complete, valid board...");
      SudokuBoard board3 = new SudokuBoard("valid-complete.sdk");
      assert board3.isValid() : "isValid: should be true";
      assert board3.isSolved() : "isSolved: should be true";
      if(board3.isValid() && board3.isSolved()) 
         System.out.println("passed.");
      else {
         System.out.println("failed.");
         allTests = false;
      }
      
      // a board with dirty data is not valid and not solved
      System.out.print("Checking dirty data board...");
      SudokuBoard board4 = new SudokuBoard("dirty-data.sdk");
      assert !board4.isValid() : "isValid: should be false";
      assert !board4.isSolved() : "isSolved: should be false";
      if(!board4.isValid() && !board4.isSolved()) 
         System.out.println("passed.");
      else {
         System.out.println("failed.");
         allTests = false;
      }
      
      // a board with a row violation is not valid and not solved
      System.out.print("Checking row violating board...");
      SudokuBoard board5 = new SudokuBoard("row-violation.sdk");
      assert !board5.isValid() : "isValid: should be false";
      assert !board5.isSolved() : "isSolved: should be false";
      if(!board5.isValid() && !board5.isSolved()) 
         System.out.println("passed.");
      else {
         System.out.println("failed.");
         allTests = false;
      }
      
      // a board with a column violation is not valid and not solved
      System.out.print("Checking col violating board...");
      SudokuBoard board6 = new SudokuBoard("col-violation.sdk");
      assert !board6.isValid() : "isValid: should be false";
      assert !board6.isSolved() : "isSolved: should be false";
      if(!board6.isValid() && !board6.isSolved()) 
         System.out.println("passed.");
      else {
         System.out.println("failed.");
         allTests = false;
      }
      
      // a board with both a row and a column violation is not valid and not solved
      System.out.print("Checking row&col violating board...");
      SudokuBoard board7 = new SudokuBoard("row-and-col-violation.sdk");
      assert !board7.isValid() : "isValid: should be false";
      assert !board7.isSolved() : "isSolved: should be false";
      if(!board7.isValid() && !board7.isSolved()) 
         System.out.println("passed.");
      else {
         System.out.println("failed.");
         allTests = false;
      }
      
      // a board with a mini-square violation is not valid and not solved
      System.out.print("Checking mini-square violating board...");
      SudokuBoard board8 = new SudokuBoard("grid-violation.sdk");
      assert !board8.isValid() : "isValid: should be false";
      assert !board8.isSolved() : "isSolved: should be false";
      if(!board8.isValid() && !board8.isSolved()) 
         System.out.println("passed.");
      else {
         System.out.println("failed.");
         allTests = false;
      }       
      
      if(allTests)
         System.out.println("**** HORRAY: ALL TESTS PASSED ****");
   }
}