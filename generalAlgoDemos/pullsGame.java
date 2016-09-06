package generalAlgoDemos;

//Да се моделира действието на следната игра: Дъска с размери nxm
//(n <= 200, m <= 400) е разграфена на квадрати.
//Позицията на всеки квадрат се определя от номера на реда и номера
//на стълба, в който лежи.Върху дъската се разпръсват по случаен
//начин k на брой пула (k<=10). Всеки пул се разполага в един квадрат
//и във всеки квадрат може да лежи най-много един пул. Играчът задава
//позиция на квадрат и получава:
//        - 100 точки, ако в кавадрата има пул. Пулът в този квадрат
//се отстранява от дъската
//        - По 5 точки за всеки съседен пул – това е пул, разположен
//в съседен квадрат на определения от играча.
//Всеки съседен квадрат има обща страна с дадения, т.е. всеки квадрат
//може да има най-много 4 съседни.
//Ако в съседен квадрат има пул, той се обръща, а ако вече е бил обърнат
//веднъж, се отстранява от дъската. Точките се получават независимо от
//това дали пулът е бил обърнат или не. Да се състави програма, която чете
//от стандартния вход n, m, k, разполага пуловете върху дъската и извежда
//събраните точки от играча за 20 негови хода или до отстраняването
//на всички пулове от дъската(ако успее да направи това за по-малко от 20 хода).



import java.util.Random;
import java.util.Scanner;


public class pullsGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            int mRows = in.nextInt(); //<=200
            int nCols = in.nextInt(); //<=400
            int k = in.nextInt(); //<=10
            int pulls = k;
            int moves = 0;
            int score = 0;

            Random position = new Random();

            int[][] board = new int[mRows][nCols];

        //generating 10 pull positions within the matrix
        while (k != 0)
        {
            int row = position.nextInt(mRows);
            int col = position.nextInt(nCols);

            //check that we don't have repeating positions
            while(board[row][col] == 1){
                row = position.nextInt(mRows);
                col = position.nextInt(nCols);
            }
            board[row][col] = 1; //means there is a pull at this position
            k--;
        }
        //printing the matrix

        for(int i = 0; i < mRows; i++){
            for( int j = 0; j < nCols; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        while(moves <=20 && pulls != 0){
            int row = in.nextInt();
            int col = in.nextInt();

            //straight hit

            if(board[row][col] == 1){
                score +=100;
                pulls--;
                board[row][col] = 0;
                moves++;
            }

            //check neighbour-squares and flipping the pulls

            if(row > 1 && board [row - 1][col] != 0){
                if(board[row - 1][col] == 1){
                    score += 5;
                    board[row - 1][col] = -1;
                    moves++;
                }
                else if(board[row - 1][col] == -1){
                    score +=5;
                    board[row - 1][col] = 0;
                    pulls--;
                    moves++;
                }
            }
            if(row < mRows - 1 && board[row + 1][col] != 0){
                if(board[row + 1][col] == 1){
                    score += 5;
                    board[row + 1][col] = -1;
                    moves++;
                }
                else if(board[row + 1][col] == -1){
                    score +=5;
                    board[row + 1][col] = 0;
                    pulls--;
                    moves++;
                }
            }
            if(col > 1 && board [row][col - 1] != 0){
                if(board[row][col - 1] == 1){
                    score += 5;
                    board[row][col - 1] = -1;
                    moves++;
                }
                else if(board[row][col - 1] == -1){
                    score +=5;
                    board[row][col - 1] = 0;
                    pulls--;
                    moves++;
                }
            }
            if(col < nCols - 1 && board[row][col + 1] != 0){
                if(board[row][col + 1] == 1){
                    score += 5;
                    board[row][col + 1] = -1;
                    moves++;
                }
                else if(board[row][col + 1] == -1){
                    score +=5;
                    board[row][col + 1] = 0;
                    pulls--;
                    moves++;
                }
            }
            //even if we don't match any scenario for hitting score, we still count user entries
            else{
                moves++;
            }
            for (int i = 0; i < mRows; i++)
            {
                for (int j = 0; j < nCols; j++)
                {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }
        System.out.println(score);
        System.out.println(pulls);
    }
}
