package com.example.shubham.tictactoe;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AndroidException;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private static final String EXTRA_BUTTON_INTENT = "com.example.shubham.tictactoe.button_intent";

    Button mButton1;
    Button mButton2;
    Button mButton3;
    Button mButton4;
    Button mButton5;
    Button mButton6;
    Button mButton7;
    Button mButton8;
    Button mButton9;
    Button mReset;

    TextView mResultText;

    String dflt = " ";
    String user = "X";
    String comp = "O";

    boolean mIsUsed = false;

    int mAloneOrFriend;
    int mWhoseChance = 0;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mAloneOrFriend = getIntent().getIntExtra(EXTRA_BUTTON_INTENT,R.id.button_alone);


        mButton1 = findViewById(R.id.Btn1);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mButton1.isActivated()) {
                    if(mAloneOrFriend == R.id.button_alone)
                        ifAlone(mButton1);
                    else if (mAloneOrFriend == R.id.button_friend)
                        ifFriend(mButton1);
                }
            }
        });

        mButton2 = findViewById(R.id.Btn2);
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mButton2.isActivated()) {
                    if(mAloneOrFriend == R.id.button_alone)
                        ifAlone(mButton2);
                    else if (mAloneOrFriend == R.id.button_friend)
                        ifFriend(mButton2);
                }
            }
        });

        mButton3 = findViewById(R.id.Btn3);
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mButton3.isActivated()) {
                    if(mAloneOrFriend == R.id.button_alone)
                        ifAlone(mButton3);
                    else if (mAloneOrFriend == R.id.button_friend)
                        ifFriend(mButton3);
                }
            }
        });

        mButton4 = findViewById(R.id.Btn4);
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mButton4.isActivated()) {
                    if(mAloneOrFriend == R.id.button_alone)
                        ifAlone(mButton4);
                    else if (mAloneOrFriend == R.id.button_friend)
                        ifFriend(mButton4);
                }
            }
        });

        mButton5 = findViewById(R.id.Btn5);
        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mButton5.isActivated()) {
                    if(mAloneOrFriend == R.id.button_alone)
                        ifAlone(mButton5);
                    else if (mAloneOrFriend == R.id.button_friend)
                        ifFriend(mButton5);
                }
            }
        });

        mButton6 = findViewById(R.id.Btn6);
        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mButton6.isActivated()) {
                    if(mAloneOrFriend == R.id.button_alone)
                        ifAlone(mButton6);
                    else if (mAloneOrFriend == R.id.button_friend)
                        ifFriend(mButton6);
                }
            }
        });

        mButton7 = findViewById(R.id.Btn7);
        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mButton7.isActivated()) {
                    if(mAloneOrFriend == R.id.button_alone)
                        ifAlone(mButton7);
                    else if (mAloneOrFriend == R.id.button_friend)
                        ifFriend(mButton7);
                }
            }
        });

        mButton8 = findViewById(R.id.Btn8);
        mButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mButton8.isActivated()) {
                    if(mAloneOrFriend == R.id.button_alone)
                        ifAlone(mButton8);
                    else if (mAloneOrFriend == R.id.button_friend)
                        ifFriend(mButton8);
                }
            }
        });

        mButton9 = findViewById(R.id.Btn9);
        mButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mButton9.isActivated()) {
                    if(mAloneOrFriend == R.id.button_alone)
                        ifAlone(mButton9);
                    else if (mAloneOrFriend == R.id.button_friend)
                        ifFriend(mButton9);
                }
            }
        });

        mReset = findViewById(R.id.Btn_Reset);
        mReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });

        mResultText = findViewById(R.id.Result_Text);

    }

    private void ifAlone(Button button){
        button.setText(user);
        button.setActivated(true);


        if (!isGameOver())
            compMove();
    }

    private void ifFriend(Button button){
        if(mWhoseChance == 0) {
            button.setText(user);
            button.setActivated(true);
            mWhoseChance = 1;
        }
        else if (mWhoseChance == 1){
            button.setText(comp);
            button.setActivated(true);
            mWhoseChance = 0;
        }

        isGameOver();
    }

    private boolean isGameOver() {
        Log.v("~~~~1 : ~~~", mButton1.getText().toString());
        Log.v("~~~~2 : ~~~", mButton2.getText().toString());
        Log.v("~~~~3 : ~~~", mButton3.getText().toString());
        Log.v("~~~~4 : ~~~", mButton4.getText().toString());
        Log.v("~~~~5 : ~~~", mButton5.getText().toString());
        Log.v("~~~~6 : ~~~", mButton6.getText().toString());
        Log.v("~~~~7 : ~~~", mButton7.getText().toString());
        Log.v("~~~~8 : ~~~", mButton8.getText().toString());
        Log.v("~~~~9 : ~~~", mButton9.getText().toString());


        if (isTrio(user)) {
            if (mAloneOrFriend == R.id.button_alone)
                mResultText.setText("  User Won!");
            else if(mAloneOrFriend == R.id.button_friend)
                mResultText.setText("  X Won");

            mResultText.setTextColor(Color.GREEN);

            mButton1.setEnabled(false);
            mButton2.setEnabled(false);
            mButton3.setEnabled(false);
            mButton4.setEnabled(false);
            mButton5.setEnabled(false);
            mButton6.setEnabled(false);
            mButton7.setEnabled(false);
            mButton8.setEnabled(false);
            mButton9.setEnabled(false);

            return true;
        } else if (isTrio(comp)) {
            if (mAloneOrFriend == R.id.button_alone)
                mResultText.setText("  Computer Won!");
            else if(mAloneOrFriend == R.id.button_friend)
                mResultText.setText("  O Won");

            mResultText.setTextColor(Color.RED);

            mButton1.setEnabled(false);
            mButton2.setEnabled(false);
            mButton3.setEnabled(false);
            mButton4.setEnabled(false);
            mButton5.setEnabled(false);
            mButton6.setEnabled(false);
            mButton7.setEnabled(false);
            mButton8.setEnabled(false);
            mButton9.setEnabled(false);

            return true;
        } else
            return false;
    }

    private boolean isTrio(String move) {
        if (mButton1.getText() == move && mButton2.getText() == move && mButton3.getText() == move)
            return true;

        else if (mButton1.getText() == move && mButton4.getText() == move && mButton7.getText() == move)
            return true;

        else if (mButton1.getText() == move && mButton5.getText() == move && mButton9.getText() == move)
            return true;

        else if (mButton2.getText() == move && mButton5.getText() == move && mButton8.getText() == move)
            return true;

        else if (mButton3.getText() == move && mButton5.getText() == move && mButton7.getText() == move)
            return true;

        else if (mButton3.getText() == move && mButton6.getText() == move && mButton9.getText() == move)
            return true;

        else if (mButton4.getText() == move && mButton5.getText() == move && mButton6.getText() == move)
            return true;

        else if (mButton7.getText() == move && mButton8.getText() == move && mButton9.getText() == move)
            return true;

        else
            return false;
    }

    /*

    private void compMove(){
        int random = (int)(Math.random() * ((9 - 1) + 1)) + 1;//(Math.random() * ((max - min) + 1)) + min;

        //Log.v("Random value : ",Integer.toString(random));

        switch (random){
            case 1 :
                if(!mButton1.isActivated()) {
                    mButton1.setText(comp);
                    mButton1.setActivated(true);
                }
                else
                    compMove();
                break;
            case 2 :
                if(!mButton2.isActivated()) {
                    mButton2.setText(comp);
                    mButton2.setActivated(true);
                }
                else
                    compMove();
                break;
            case 3 :
                if(!mButton3.isActivated()) {
                    mButton3.setText(comp);
                    mButton3.setActivated(true);
                }
                else
                    compMove();
                break;

            case 4 :
                if(!mButton4.isActivated()) {
                    mButton4.setText(comp);
                    mButton4.setActivated(true);
                }
                else
                    compMove();
                break;

            case 5 :
                if(!mButton5.isActivated()) {
                    mButton5.setText(comp);
                    mButton5.setActivated(true);
                }
                else
                    compMove();
                break;

            case 6 :
                if(!mButton6.isActivated()) {
                    mButton6.setText(comp);
                    mButton6.setActivated(true);
                }
                else
                    compMove();
                break;

            case 7 :
                if(!mButton7.isActivated()) {
                    mButton7.setText(comp);
                    mButton7.setActivated(true);
                }
                else
                    compMove();
                break;

            case 8 :
                if(!mButton8.isActivated()) {
                    mButton8.setText(comp);
                    mButton8.setActivated(true);
                }
                else
                    compMove();
                break;

            case 9 :
                if(!mButton9.isActivated()) {
                    mButton9.setText(comp);
                    mButton9.setActivated(true);
                }
                else
                    compMove();
                break;

            default :
                Log.v("In compMove() : ","Wrong choice");
        }
        isGameOver();
    }

    */

    void reset() {
        mButton1.setText(dflt);
        mButton2.setText(dflt);
        mButton3.setText(dflt);
        mButton4.setText(dflt);
        mButton5.setText(dflt);
        mButton6.setText(dflt);
        mButton7.setText(dflt);
        mButton8.setText(dflt);
        mButton9.setText(dflt);

        mButton1.setActivated(false);
        mButton2.setActivated(false);
        mButton3.setActivated(false);
        mButton4.setActivated(false);
        mButton5.setActivated(false);
        mButton6.setActivated(false);
        mButton7.setActivated(false);
        mButton8.setActivated(false);
        mButton9.setActivated(false);


        mButton1.setEnabled(true);
        mButton2.setEnabled(true);
        mButton3.setEnabled(true);
        mButton4.setEnabled(true);
        mButton5.setEnabled(true);
        mButton6.setEnabled(true);
        mButton7.setEnabled(true);
        mButton8.setEnabled(true);
        mButton9.setEnabled(true);

        mResultText.setText("");
    }


    private void compMove() {
        //comp favour
        //horizontal matching
        if (mButton1.getText() == mButton2.getText() && mButton1.getText() == comp && mButton3.getText() == dflt) {
            mButton3.setText(comp);
            mButton3.setActivated(true);

            mButton1.setTextColor(Color.RED);
            mButton2.setTextColor(Color.RED);
            mButton3.setTextColor(Color.RED);

        } else if (mButton1.getText() == mButton3.getText() && mButton1.getText() == comp && mButton2.getText() == dflt) {
            mButton2.setText(comp);
            mButton2.setActivated(true);

        } else if (mButton2.getText() == mButton3.getText() && mButton2.getText() == comp && mButton1.getText() == dflt) {
            mButton1.setText(comp);
            mButton1.setActivated(true);

        } else if (mButton4.getText() == mButton5.getText() && mButton4.getText() == comp && mButton6.getText() == dflt) {
            mButton6.setText(comp);
            mButton6.setActivated(true);

        } else if (mButton4.getText() == mButton6.getText() && mButton4.getText() == comp && mButton5.getText() == dflt) {
            mButton5.setText(comp);
            mButton5.setActivated(true);

        } else if (mButton5.getText() == mButton6.getText() && mButton5.getText() == comp && mButton4.getText() == dflt) {
            mButton4.setText(comp);
            mButton4.setActivated(true);

        } else if (mButton7.getText() == mButton8.getText() && mButton7.getText() == comp && mButton9.getText() == dflt) {
            mButton9.setText(comp);
            mButton9.setActivated(true);

        } else if (mButton7.getText() == mButton9.getText() && mButton7.getText() == comp && mButton8.getText() == dflt) {
            mButton8.setText(comp);
            mButton8.setActivated(true);

        } else if (mButton8.getText() == mButton9.getText() && mButton8.getText() == comp && mButton7.getText() == dflt) {
            mButton7.setText(comp);
            mButton7.setActivated(true);

        }
        //diagonal matching
        else if (mButton1.getText() == mButton5.getText() && mButton1.getText() == comp && mButton9.getText() == dflt) {
            mButton9.setText(comp);
            mButton9.setActivated(true);

        } else if (mButton1.getText() == mButton9.getText() && mButton1.getText() == comp && mButton5.getText() == dflt) {
            mButton5.setText(comp);
            mButton5.setActivated(true);

        } else if (mButton5.getText() == mButton9.getText() && mButton5.getText() == comp && mButton1.getText() == dflt) {
            mButton1.setText(comp);
            mButton1.setActivated(true);

        } else if (mButton7.getText() == mButton5.getText() && mButton7.getText() == comp && mButton3.getText() == dflt) {
            mButton3.setText(comp);
            mButton3.setActivated(true);

        } else if (mButton7.getText() == mButton3.getText() && mButton7.getText() == comp && mButton5.getText() == dflt) {
            mButton5.setText(comp);
            mButton5.setActivated(true);

        } else if (mButton5.getText() == mButton3.getText() && mButton5.getText() == comp && mButton7.getText() == dflt) {
            mButton7.setText(comp);
            mButton7.setActivated(true);

        }
        //vertical matching
        else if (mButton1.getText() == mButton4.getText() && mButton1.getText() == comp && mButton7.getText() == dflt) {
            mButton7.setText(comp);
            mButton7.setActivated(true);

        } else if (mButton1.getText() == mButton7.getText() && mButton1.getText() == comp && mButton4.getText() == dflt) {
            mButton4.setText(comp);
            mButton4.setActivated(true);

        } else if (mButton4.getText() == mButton7.getText() && mButton4.getText() == comp && mButton1.getText() == dflt) {
            mButton1.setText(comp);
            mButton1.setActivated(true);

        } else if (mButton2.getText() == mButton5.getText() && mButton2.getText() == comp && mButton8.getText() == dflt) {
            mButton8.setText(comp);
            mButton8.setActivated(true);

        } else if (mButton2.getText() == mButton8.getText() && mButton2.getText() == comp && mButton5.getText() == dflt) {
            mButton5.setText(comp);
            mButton5.setActivated(true);

        } else if (mButton5.getText() == mButton8.getText() && mButton5.getText() == comp && mButton2.getText() == dflt) {
            mButton2.setText(comp);
            mButton2.setActivated(true);

        } else if (mButton3.getText() == mButton6.getText() && mButton3.getText() == comp && mButton9.getText() == dflt) {
            mButton9.setText(comp);
            mButton9.setActivated(true);

        } else if (mButton3.getText() == mButton9.getText() && mButton3.getText() == comp && mButton6.getText() == dflt) {
            mButton6.setText(comp);
            mButton6.setActivated(true);

        } else if (mButton6.getText() == mButton9.getText() && mButton6.getText() == comp && mButton3.getText() == dflt) {
            mButton3.setText(comp);
            mButton3.setActivated(true);

        }




        //not comp favour
        //horizontal matching


        else if (mButton1.getText() == mButton2.getText() && mButton1.getText() == user && mButton3.getText() == dflt)
        {
            mButton3.setText(comp);
            mButton3.setActivated(true);

        }
        else if (mButton1.getText() == mButton3.getText() && mButton1.getText() == user && mButton2.getText() == dflt)
        {
            mButton2.setText(comp);
            mButton2.setActivated(true);

        }
        else if (mButton2.getText() == mButton3.getText() && mButton2.getText() == user && mButton1.getText() == dflt)
        {
            mButton1.setText(comp);

        }
        else if (mButton4.getText() == mButton5.getText() && mButton4.getText() == user && mButton6.getText() == dflt)
        {
            mButton6.setText(comp);

        }
        else if (mButton4.getText() == mButton6.getText() && mButton4.getText() == user && mButton5.getText() == dflt)
        {
            mButton5.setText(comp);

        }
        else if (mButton5.getText() == mButton6.getText() && mButton5.getText() == user && mButton4.getText() == dflt)
        {
            mButton4.setText(comp);

        }
        else if (mButton7.getText() == mButton8.getText() && mButton7.getText() == user && mButton9.getText() == dflt)
        {
            mButton9.setText(comp);

        }
        else if (mButton7.getText() == mButton9.getText() && mButton7.getText() == user && mButton8.getText() == dflt)
        {
            mButton8.setText(comp);

        }
        else if (mButton8.getText() == mButton9.getText() && mButton8.getText() == user && mButton7.getText() == dflt)
        {
            mButton7.setText(comp);

        }
        //diagonal matching
        else if (mButton1.getText() == mButton5.getText() && mButton1.getText() == user && mButton9.getText() == dflt)
        {
            mButton9.setText(comp);

        }
        else if (mButton1.getText() == mButton9.getText() && mButton1.getText() == user && mButton5.getText() == dflt)
        {
            mButton5.setText(comp);

        }
        else if (mButton5.getText() == mButton9.getText() && mButton5.getText() == user && mButton1.getText() == dflt)
        {
            mButton1.setText(comp);

        }
        else if (mButton7.getText() == mButton5.getText() && mButton7.getText() == user && mButton3.getText() == dflt)
        {
            mButton3.setText(comp);

        }
        else if (mButton7.getText() == mButton3.getText() && mButton7.getText() == user && mButton5.getText() == dflt)
        {
            mButton5.setText(comp);

        }
        else if (mButton5.getText() == mButton3.getText() && mButton5.getText() == user && mButton7.getText() == dflt)
        {
            mButton7.setText(comp);

        }
        //vertical matching
        else if (mButton1.getText() == mButton4.getText() && mButton1.getText() == user && mButton7.getText() == dflt)
        {
            mButton7.setText(comp);

        }
        else if (mButton1.getText() == mButton7.getText() && mButton1.getText() == user && mButton4.getText() == dflt)
        {
            mButton4.setText(comp);

        }
        else if (mButton4.getText() == mButton7.getText() && mButton4.getText() == user && mButton1.getText() == dflt)
        {
            mButton1.setText(comp);

        }
        else if (mButton2.getText() == mButton5.getText() && mButton2.getText() == user && mButton8.getText() == dflt)
        {
            mButton8.setText(comp);

        }
        else if (mButton2.getText() == mButton8.getText() && mButton2.getText() == user && mButton5.getText() == dflt)
        {
            mButton5.setText(comp);

        }
        else if (mButton5.getText() == mButton8.getText() && mButton5.getText() == user && mButton2.getText() == dflt)
        {
            mButton2.setText(comp);

        }
        else if (mButton3.getText() == mButton6.getText() && mButton3.getText() == user && mButton9.getText() == dflt)
        {
            mButton9.setText(comp);

        }
        else if (mButton3.getText() == mButton9.getText() && mButton3.getText() == user && mButton6.getText() == dflt)
        {
            mButton6.setText(comp);

        }
        else if (mButton6.getText() == mButton9.getText() && mButton6.getText() == user && mButton3.getText() == dflt)
        {
            mButton3.setText(comp);

        }




        //let it guess
        else {
            int random = (int)(Math.random() * ((9 - 1) + 1)) + 1;//(Math.random() * ((max - min) + 1)) + min;

            //Log.v("Random value : ",Integer.toString(random));

            switch (random){
                case 1 :
                    if(!mButton1.isActivated()) {
                        mButton1.setText(comp);
                        mButton1.setActivated(true);
                    }
                    else
                        compMove();
                    break;
                case 2 :
                    if(!mButton2.isActivated()) {
                        mButton2.setText(comp);
                        mButton2.setActivated(true);
                    }
                    else
                        compMove();
                    break;
                case 3 :
                    if(!mButton3.isActivated()) {
                        mButton3.setText(comp);
                        mButton3.setActivated(true);
                    }
                    else
                        compMove();
                    break;

                case 4 :
                    if(!mButton4.isActivated()) {
                        mButton4.setText(comp);
                        mButton4.setActivated(true);
                    }
                    else
                        compMove();
                    break;

                case 5 :
                    if(!mButton5.isActivated()) {
                        mButton5.setText(comp);
                        mButton5.setActivated(true);
                    }
                    else
                        compMove();
                    break;

                case 6 :
                    if(!mButton6.isActivated()) {
                        mButton6.setText(comp);
                        mButton6.setActivated(true);
                    }
                    else
                        compMove();
                    break;

                case 7 :
                    if(!mButton7.isActivated()) {
                        mButton7.setText(comp);
                        mButton7.setActivated(true);
                    }
                    else
                        compMove();
                    break;

                case 8 :
                    if(!mButton8.isActivated()) {
                        mButton8.setText(comp);
                        mButton8.setActivated(true);
                    }
                    else
                        compMove();
                    break;

                case 9 :
                    if(!mButton9.isActivated()) {
                        mButton9.setText(comp);
                        mButton9.setActivated(true);
                    }
                    else
                        compMove();
                    break;

                default :
                    Log.v("In compMove() : ","Wrong choice");
            }
        }


        isGameOver();

    }

    public static Intent newIntent(Context packageContext,int id){
        Intent intent = new Intent(packageContext,MainActivity2.class);

        intent.putExtra(EXTRA_BUTTON_INTENT,id);

        return intent;
    }

}
