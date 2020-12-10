package com.uni.csc.assign;

import java.util.Arrays;
import java.util.Scanner;

public class GameDemo{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String[][] arr = new String[8][8];
        Board b = new Board(arr);
        b.fill(arr);
        String game = "not done";

        do {
            System.out.println("Enter a command (type help for details):");
            String command = kb.nextLine();
            if (command.equals("print")) {
                b.display(arr);
            }
            if(command.equals("help")){
                System.out.println("Possible commands are as follows:\n" +
                        "create location [fast][flexible]: Creates a new piece.\n"+
                        "move location direction [spaces]: Moves a piece.\n"+
                        "print: Displays the board.\n" +
                        "help: Displays help.\n" +
                        "exit: Exits the program.");
            }
            final String[] s = command.split(" ");
            if(command.substring(0,1).equals("c")){
                String position = command.substring(7,8) + command.substring(9,10);
                String type;
                if(command.length()==10){
                    type = "S";
                }
                else if(command.substring(11,12).equals("s")&& command.substring(16,17).equals("f")){
                    type = "SF";
                }
                else if(command.substring(11,12).equals("f")&&command.length()==15){
                    type = "F";
                }
                else if(command.substring(11,12).equals("f")&& command.substring(16,17).equals("f")){
                    type = "FF";
                }
                else{type = "none";}


                int x = Integer.parseInt(command.substring(7,8));
                int y = Integer.parseInt(command.substring(9,10));

                if(arr[x-1][y-1].equals(" - ")) {

                System.out.println("Input a name for the new piece:");
                String name = kb.nextLine();
                System.out.println("Input a colour for the new piece;");
                String colour = kb.nextLine();
                arr[x - 1][y - 1] = name + colour + type;
                }else {System.out.println("Position not empty");}
            }
            if(command.substring(0,1).equals("m")){
                int x = Integer.parseInt(command.substring(5,6));
                int y = Integer.parseInt(command.substring(7,8));
                String direction = command.substring(9,10);
                String spaces = command.substring(command.length()-1,command.length());
                int Space = Integer.parseInt(spaces);
                if(arr[x][y].substring(arr[x][y].length()-1,arr[x][y].length()).equals("S")){
                    SlowPiece sp = new SlowPiece();
                    if(direction.equals("l")){
                        sp.moveLeft(x,y,Space,arr);
                        arr[x-1][y-1] = " - ";
                    }

                }
            }



                if(command.equals("exit")){
                game = "Done.";
                System.out.println(game);

            }
        }while(game.equals("not done"));


    }
}
