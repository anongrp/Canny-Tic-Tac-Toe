package anongrp.canny_thetic_tac_toegame;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class BotController extends AppCompatActivity {
    TextView block1;
    TextView block2;
    TextView block3;
    TextView block4;
    TextView block5;
    TextView block6;
    TextView block7;
    TextView block8;
    TextView block9;
    TextView userChoice1;
    TextView userChoice2;
    Button backBtn;
    int turn;
    ArrayList<String> botList;
    ArrayList<String> forShuffle;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_to_bot);
        block1 = findViewById(R.id.block1);
        block2 = findViewById(R.id.block2);
        block3 = findViewById(R.id.block3);
        block4 = findViewById(R.id.block4);
        block5 = findViewById(R.id.block5);
        block6 = findViewById(R.id.block6);
        block7 = findViewById(R.id.block7);
        block8 = findViewById(R.id.block8);
        block9 = findViewById(R.id.block9);
        userChoice1 = findViewById(R.id.userChoice1);
        userChoice2 = findViewById(R.id.userChoice2);
        backBtn = findViewById(R.id.backBtn);
        botList=new ArrayList<String>();
        turn=-1;
        botTurn();
    }
    public void botTurn() {
        if (turn == -1) {
            String firstIndex = botList.get(0);
            if (firstIndex == null) {
                forShuffle = new ArrayList<String>();
                forShuffle.add("block1");
                forShuffle.add("block2");
                forShuffle.add("block3");
                forShuffle.add("block4");
                forShuffle.add("block5");
                forShuffle.add("block6");
                forShuffle.add("block7");
                forShuffle.add("block8");
                forShuffle.add("block9");
                Collections.shuffle(forShuffle);
                String block = forShuffle.get(0);

                if (block.equals("block1")) {
                    if (block1.getText() == null) {
                        block1.setText(userChoice2.getText());
                        botList.add(block);
                        turn = turn * -1;
                        forShuffle.clear();
                    } else {
                        forShuffle.clear();
                        botTurn();

                    }
                }
                if (block.equals("block2")) {
                    if (block2.getText() == null) {
                        block2.setText(userChoice2.getText());
                        botList.add(block);
                        turn = turn * -1;
                        forShuffle.clear();
                    } else {
                        forShuffle.clear();
                        botTurn();

                    }
                }
                if (block.equals("block3")) {
                    if (block3.getText() == null) {
                        block3.setText(userChoice2.getText());
                        botList.add(block);
                        turn = turn * -1;
                        forShuffle.clear();
                    } else {
                        forShuffle.clear();
                        botTurn();

                    }
                }
                if (block.equals("block4")) {
                    if (block4.getText() == null) {
                        block4.setText(userChoice2.getText());
                        botList.add(block);
                        turn = turn * -1;
                        forShuffle.clear();
                    } else {
                        forShuffle.clear();
                        botTurn();

                    }
                }
                if (block.equals("block5")) {
                    if (block5.getText() == null) {
                        block5.setText(userChoice2.getText());
                        botList.add(block);
                        turn = turn * -1;
                        forShuffle.clear();
                    } else {
                        forShuffle.clear();
                        botTurn();

                    }
                }
                if (block.equals("block6")) {
                    if (block6.getText() == null) {
                        block6.setText(userChoice2.getText());
                        botList.add(block);
                        turn = turn * -1;
                        forShuffle.clear();
                    } else {
                        forShuffle.clear();
                        botTurn();

                    }
                }
                if (block.equals("block7")) {
                    if (block7.getText() == null) {
                        block7.setText(userChoice2.getText());
                        botList.add(block);
                        turn = turn * -1;
                        forShuffle.clear();
                    } else {
                        forShuffle.clear();
                        botTurn();

                    }
                }
                if (block.equals("block8")) {
                    if (block8.getText() == null) {
                        block8.setText(userChoice2.getText());
                        botList.add(block);
                        turn = turn * -1;
                        forShuffle.clear();
                    } else {
                        forShuffle.clear();
                        botTurn();

                    }
                }
                if (block.equals("block9")) {
                    if (block9.getText() == null) {
                        block9.setText(userChoice2.getText());
                        botList.add(block);
                        turn = turn * -1;
                        forShuffle.clear();
                    } else {
                        forShuffle.clear();
                        botTurn();

                    }
                }
            } else {
                String lastIndex = botList.get(-1);
                if (lastIndex == "block1") {
                    forShuffle = new ArrayList<String>();
                    forShuffle.clear();
                    forShuffle.add("block2");
                    forShuffle.add("block4");
                    forShuffle.add("block5");
                    Collections.shuffle(forShuffle);
                    String block = forShuffle.get(0);
                    if (block.equals("block2")) {
                        if (block2.getText() == null) {
                            block2.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block4")) {
                        if (block4.getText() == null) {
                            block4.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block5")) {
                        if (block5.getText() == null) {
                            block5.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                }












                if (lastIndex == "block2") {
                    forShuffle = new ArrayList<String>();
                    forShuffle.clear();
                    forShuffle.add("block1");
                    forShuffle.add("block3");
                    forShuffle.add("block4");
                    forShuffle.add("block5");
                    forShuffle.add("block6");
                    Collections.shuffle(forShuffle);
                    String block = forShuffle.get(0);
                    if (block.equals("block1")) {
                        if (block1.getText() == null) {
                            block1.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block3")) {
                        if (block3.getText() == null) {
                            block3.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block4")) {
                        if (block4.getText() == null) {
                            block4.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block5")) {
                        if (block5.getText() == null) {
                            block5.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block6")) {
                        if (block6.getText() == null) {
                            block6.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                }











                if (lastIndex == "block3") {
                    forShuffle = new ArrayList<String>();
                    forShuffle.clear();
                    forShuffle.add("block2");
                    forShuffle.add("block5");
                    forShuffle.add("block6");
                    Collections.shuffle(forShuffle);
                    String block = forShuffle.get(0);
                    if (block.equals("block2")) {
                        if (block2.getText() == null) {
                            block2.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block5")) {
                        if (block5.getText() == null) {
                            block5.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block6")) {
                        if (block6.getText() == null) {
                            block6.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                }








                if (lastIndex == "block4") {
                    forShuffle = new ArrayList<String>();
                    forShuffle.clear();
                    forShuffle.add("block1");
                    forShuffle.add("block2");
                    forShuffle.add("block6");
                    forShuffle.add("block7");
                    forShuffle.add("block8");
                    Collections.shuffle(forShuffle);
                    String block = forShuffle.get(0);
                    if (block.equals("block1")) {
                        if (block1.getText() == null) {
                            block1.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block2")) {
                        if (block2.getText() == null) {
                            block2.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block6")) {
                        if (block6.getText() == null) {
                            block6.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block7")) {
                        if (block7.getText() == null) {
                            block7.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block8")) {
                        if (block8.getText() == null) {
                            block8.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                }











                if (lastIndex == "block5") {
                    forShuffle = new ArrayList<String>();
                    forShuffle.clear();
                    forShuffle.add("block1");
                    forShuffle.add("block2");
                    forShuffle.add("block3");
                    forShuffle.add("block4");
                    forShuffle.add("block6");
                    forShuffle.add("block7");
                    forShuffle.add("block8");
                    forShuffle.add("block9");
                    Collections.shuffle(forShuffle);
                    String block = forShuffle.get(0);
                    if (block.equals("block1")) {
                        if (block1.getText() == null) {
                            block1.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block2")) {
                        if (block2.getText() == null) {
                            block2.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block3")) {
                        if (block3.getText() == null) {
                            block3.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block4")) {
                        if (block4.getText() == null) {
                            block4.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block6")) {
                        if (block6.getText() == null) {
                            block6.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block7")) {
                        if (block7.getText() == null) {
                            block7.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block8")) {
                        if (block8.getText() == null) {
                            block8.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block9")) {
                        if (block9.getText() == null) {
                            block9.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                }






                if (lastIndex == "block6") {
                    forShuffle = new ArrayList<String>();
                    forShuffle.clear();
                    forShuffle.add("block2");
                    forShuffle.add("block3");
                    forShuffle.add("block5");
                    forShuffle.add("block8");
                    forShuffle.add("block9");
                    Collections.shuffle(forShuffle);
                    String block = forShuffle.get(0);
                    if (block.equals("block2")) {
                        if (block2.getText() == null) {
                            block2.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block3")) {
                        if (block3.getText() == null) {
                            block3.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block5")) {
                        if (block5.getText() == null) {
                            block5.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block8")) {
                        if (block8.getText() == null) {
                            block8.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block9")) {
                        if (block9.getText() == null) {
                            block9.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                }














                if (lastIndex == "block7") {
                    forShuffle = new ArrayList<String>();
                    forShuffle.clear();
                    forShuffle.add("block8");
                    forShuffle.add("block4");
                    forShuffle.add("block5");
                    Collections.shuffle(forShuffle);
                    String block = forShuffle.get(0);
                    if (block.equals("block8")) {
                        if (block8.getText() == null) {
                            block8.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block4")) {
                        if (block4.getText() == null) {
                            block4.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block5")) {
                        if (block5.getText() == null) {
                            block5.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                }








                if (lastIndex == "block8") {
                    forShuffle = new ArrayList<String>();
                    forShuffle.clear();
                    forShuffle.add("block4");
                    forShuffle.add("block5");
                    forShuffle.add("block6");
                    forShuffle.add("block7");
                    forShuffle.add("block9");
                    Collections.shuffle(forShuffle);
                    String block = forShuffle.get(0);
                    if (block.equals("block4")) {
                        if (block4.getText() == null) {
                            block4.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block5")) {
                        if (block5.getText() == null) {
                            block5.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block6")) {
                        if (block6.getText() == null) {
                            block6.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block7")) {
                        if (block7.getText() == null) {
                            block7.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block9")) {
                        if (block9.getText() == null) {
                            block9.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                }









                if (lastIndex == "block9") {
                    forShuffle = new ArrayList<String>();
                    forShuffle.clear();
                    forShuffle.add("block5");
                    forShuffle.add("block6");
                    forShuffle.add("block8");
                    Collections.shuffle(forShuffle);
                    String block = forShuffle.get(0);
                    if (block.equals("block5")) {
                        if (block5.getText() == null) {
                            block5.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block6")) {
                        if (block6.getText() == null) {
                            block6.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                    if (block.equals("block8")) {
                        if (block8.getText() == null) {
                            block8.setText(userChoice2.getText());
                            botList.add(block);
                            turn = turn * -1;
                            forShuffle.clear();
                        } else {
                            forShuffle.clear();
                            botTurn();

                        }
                    }
                }
            }
        }
    }

    public void onBlock1(View view) {
        if (block1.getText()==null){
            block1.setText(userChoice1.getText());
            turn=turn*-1;
            botTurn();
        }
    }

    public void onBlock2(View view) {
        if (block2.getText()==null){
            block2.setText(userChoice1.getText());
            turn=turn*-1;
            botTurn();
        }
    }

    public void onBlock3(View view) {
        if (block3.getText()==null){
            block3.setText(userChoice1.getText());
            turn=turn*-1;
            botTurn();
        }
    }

    public void onBlock4(View view) {
        if (block4.getText()==null){
            block4.setText(userChoice1.getText());
            turn=turn*-1;
            botTurn();
        }
    }

    public void onBlock5(View view) {
        if (block5.getText()==null){
            block5.setText(userChoice1.getText());
            turn=turn*-1;
            botTurn();
        }
    }

    public void onBlock6(View view) {
        if (block6.getText()==null){
            block6.setText(userChoice1.getText());
            turn=turn*-1;
            botTurn();
        }
    }

    public void onBlock7(View view) {
        if (block7.getText()==null){
            block7.setText(userChoice1.getText());
            turn=turn*-1;
            botTurn();
        }
    }

    public void onBlock8(View view) {
        if (block8.getText()==null){
            block8.setText(userChoice1.getText());
            turn=turn*-1;
            botTurn();
        }
    }

    public void onBlock9(View view) {
        if (block9.getText()==null){
            block9.setText(userChoice1.getText());
            turn=turn*-1;
            botTurn();
        }
    }
}
