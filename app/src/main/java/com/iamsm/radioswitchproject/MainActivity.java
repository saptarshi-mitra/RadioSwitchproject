package com.iamsm.radioswitchproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    ImageButton img_button;
    Switch s;
    RadioGroup radio_group;
    RadioButton radio_button;
    CheckBox check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s=findViewById(R.id.switch1);
        img=findViewById(R.id.imageView1);
        img_button=findViewById(R.id.imageButton);
        radio_group=findViewById(R.id.radioGroup);
        check=findViewById(R.id.checkBox);



        img.setVisibility(View.INVISIBLE);
        img_button.setVisibility(View.INVISIBLE);

    }

    public void show_hide_image(View v)
    {
        if(!s.isChecked())
            img.setVisibility(View.INVISIBLE);
        else if(s.isChecked())
            img.setVisibility(View.VISIBLE);
    }

    public void click_image_button(View v)
    {
        int id=radio_group.getCheckedRadioButtonId();
        radio_button=findViewById(id);
        if(radio_button==findViewById(R.id.radioButton1))
            img_button.setClickable(TRUE);
        else
            img_button.setClickable(FALSE);

    }

    public void show_image_button(View v)
    {
        if(check.isChecked())
            img_button.setVisibility(View.VISIBLE);
        else
            img_button.setVisibility(View.INVISIBLE);
    }

    public void refresh(View v)
    {
        show_hide_image(v);
        click_image_button(v);
        show_image_button(v);
    }
}
