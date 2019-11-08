package com.example.alert;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textview;
    private Button button, btnexit, btnchoice;
    String[] str_list = {"哈哈", "嘻嘻", "呵呵","XD","喔喔"};
    AlertDialog.Builder builder = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview = findViewById(R.id.textView);
        button = findViewById(R.id.buttoN);
        btnexit = findViewById(R.id.btnExit);
        btnchoice = findViewById(R.id.btnChoice);
        button.setOnClickListener(this);
        btnexit.setOnClickListener(this);
        btnchoice.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

if (v.getId()==button.getId()){
    textview.setText("選一個");

}else if (v.getId()==btnexit.getId()){

    builder = new AlertDialog.Builder(MainActivity.this);
    builder.setTitle("什麼")
            .setIcon(R.mipmap.question)
            .setMessage("確定要離開?")
            .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                //設定確定按鈕
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            })
            .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            }).create().show();

//清單
}else {
            builder= new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("多種笑聲")
                    .setIcon(R.mipmap.pineapple)
                    .setSingleChoiceItems(str_list, 2, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    }).create().show();
        }
    }
}
