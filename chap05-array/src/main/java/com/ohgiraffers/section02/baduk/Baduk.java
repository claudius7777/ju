package com.ohgiraffers.section02.baduk;

import java.util.Scanner;
/*
public class Baduk {
    public static void main(String[] args) {
        Baduk baduk = new Baduk();
        baduk.baduck();
        }
        public void baduck(){
            String[][] board = new String[19][19];//바둑판을 만들기위해

            for (int i = 0; i < board.length; i++){
            }//반복을 해서 바둑판의 틀을 만들기 위해 보드에 랭스환경돌아가는 이유for문2개 가로축 세로축 프린트 밑으로
          //   가로줄
                for (int j = 0; j < board[0].length; j++){//세로줄
                    board[i][j] = "[ ]";
                System.out.print(board[i][j]);
                }
                System.out.println();
            }

        //게임로직들 짜줌
            String play = "";
            Scanner scanner = new Scanner(System.in);//입려받으려고 사용자에게
            int[]index = new int[2];// 첫번째와 두번째 xy로 해도 됨
            int turn = 0;// 턴을 뭐로 할것인가
    {while(!play.equals("exit")) // 조건이 될때까지 플랜
                System.out.print("첫 번째 좌표를 입력해주세요 : ");
                index[0] = scanner.nextInt();
                System.out.print("두 번째 좌표를 입력해주세요 : ");
                index[1] = scanner.nextInet();

                if(board[index[0]][index[1]].equals("[ ]")){ //비어있는지 확인하려고
                if (turn % 2 == 0){
                    board[index[0]][index[1]] = "[흑]";
                }else{
                    board[index[0]][index[1]] = "[백]";
                }
                }else{
                    System.out.println("같은 위치에 바둑돌으 놓을 수 없습니다.");
                    turn += 2;// 다시 턴을 주려고
                    continue;
                    }
                    for(int i =0; i < board.length; i++) {
                     for(int j = 0; j < board[0].length; j++){
                        System.out.print(board[i][j]);
                     }
                        System.out.println();
                     }
                        turn++;

        }
    }

*/