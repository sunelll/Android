package com.example.project4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text1, text2;
    CheckBox chkAgree;
    RadioGroup Rgroup1;
    RadioButton RdoDog, RdoCat, RdoRabbit;
    Button btnOk;
    ImageView ImgPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");

        text1 = (TextView) findViewById(R.id.Text1);
        chkAgree = (CheckBox) findViewById(R.id.ChkAgree);

        text2 = (TextView) findViewById(R.id.Text2);

        Rgroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        RdoDog = (RadioButton) findViewById(R.id.RdoDog);
        RdoCat = (RadioButton) findViewById(R.id.RdoCat);
        RdoRabbit = (RadioButton) findViewById(R.id.RdoRabbit);

        btnOk = (Button) findViewById(R.id.btnOk);
        ImgPet = (ImageView) findViewById(R.id.ImgPet);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(chkAgree.isChecked() == true){
                    text2.setVisibility(android.view.View.VISIBLE);
                    Rgroup1.setVisibility(android.view.View.VISIBLE);
                    btnOk.setVisibility(android.view.View.VISIBLE);
                    ImgPet.setVisibility(android.view.View.VISIBLE);
                }else {
                    text2.setVisibility(android.view.View.INVISIBLE);
                    Rgroup1.setVisibility(android.view.View.INVISIBLE);
                    btnOk.setVisibility(android.view.View.INVISIBLE);
                    ImgPet.setVisibility(android.view.View.INVISIBLE);
                }
            }
        });
        btnOk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                switch (Rgroup1.getCheckedRadioButtonId()){
                    case R.id.RdoDog:
                        ImgPet.setImageResource(R.drawable.dog);
                        break;
                    case R.id.RdoCat:
                        ImgPet.setImageResource(R.drawable.cat);
                        break;
                    case R.id.RdoRabbit:
                        ImgPet.setImageResource(R.drawable.rabbit);
                        break;

                    default:
                        Toast.makeText(getApplicationContext(), "동물을 선택해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
