package com.example.dependenciesdemo;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.cardview.widget.CardView;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    MyViewmodel myViewmodel;
    TextView textView;
    Button plusonebtn;
//    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        cardView = new CardView();
        setContentView(R.layout.activity_main);
        //不能直接创建ViewModel的实例，不然每次活动oncreate()都会创建一个实例，无法保留其中数据

        //不需传参，使用无参构造函数
        myViewmodel = new ViewModelProvider(this).get(MyViewmodel.class);

        plusonebtn = findViewById(R.id.plusOneBtn);
        textView = findViewById(R.id.infoText);
        plusonebtn.setOnClickListener(this);
        textView.setText(String.valueOf(myViewmodel.a));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.plusOneBtn:
                myViewmodel.a++;
                textView.setText(myViewmodel.a + "");//+空字符串是为了转字符串
                break;
            default:
                break;
        }
    }

}