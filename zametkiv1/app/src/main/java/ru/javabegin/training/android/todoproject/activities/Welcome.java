package ru.javabegin.training.android.todoproject.activities;

/**
 package ru.javabegin.training.android.todoproject.activities;

 /**
 * Created by Leka on 21.04.2017.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ru.javabegin.training.adnroid.todoproject.R;

public class Welcome extends Activity implements View.OnClickListener {

    Button btnActTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        btnActTwo = (Button) findViewById(R.id.next);
        btnActTwo.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.next:
                Intent intent = new Intent (this, TodoList.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}