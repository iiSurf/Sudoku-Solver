Sudoku Solver
This program creates a 9 × 9 Sudoku board playing space that reads from a file and checks whether the rules of Sudoku are followed. It validates rows, columns, and 3×3 subgrids and reports whether a board is valid and/or solved.
Features
Board validation for data, rows, columns, and 3×3 mini‑squares.
Solved detection: confirms when every cell contains digits 1–9 and the board is valid.
Sample puzzle files included (empty.sdk, valid-incomplete.sdk, valid-complete.sdk, and violation examples).
Test harnesses: SudokuCheckerEngineV2 runs a suite of example checks; SudokuRunner prints a board and validation results.

**How to Run**

# Clone the repository
git clone <your-repo-url>
cd sudokuBoardSolver

# Compile Java sources into out directory
javac -d out *.java

# Run the test harness
java -cp out SudokuCheckerEngineV2

# Run the simple runner to inspect a board
java -cp out SudokuRunner

Notes
Each .sdk file should contain 9 characters per line for 9 lines. Use . for empty cells.
If your Java files are inside packages, adjust the javac and java commands to include package paths.
