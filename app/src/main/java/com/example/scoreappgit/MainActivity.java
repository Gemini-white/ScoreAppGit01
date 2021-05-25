package com.example.scoreappgit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.scoreappgit.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;
    private int scoreA, scoreB, saveA, saveB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());


        init();

        mBinding.buttonAAdd1.setOnClickListener(v -> addA(1));
        mBinding.buttonAAdd2.setOnClickListener(v -> addA(2));
        mBinding.buttonAAdd3.setOnClickListener(v -> addA(3));
        mBinding.buttonBAdd1.setOnClickListener(v -> addB(1));
        mBinding.buttonBAdd2.setOnClickListener(v -> addB(2));
        mBinding.buttonBAdd3.setOnClickListener(v -> addB(3));
        mBinding.imaButtonReset.setOnClickListener(v -> Reset());
        mBinding.imaButtonReturn.setOnClickListener(v -> revoke());

    }

    public void save() {
        saveA = Integer.parseInt(mBinding.scoreA.getText().toString());
        saveB = Integer.parseInt(mBinding.scoreB.getText().toString());
    }

    public void show(){
        mBinding.scoreA.setText(String.valueOf(scoreA));
        mBinding.scoreB.setText(String.valueOf(scoreB));
    }

    public void addA(int i) {
        save();
        scoreA += i;
        show();
    }
    public void addB(int i){
        save();
        scoreB += i;
        show();
    }

    public void Reset(){
        save();
        scoreA = 0;
        scoreB = 0;
        show();
    }


    public void init(){
        scoreA=0;
        scoreB=0;
        saveA=0;
        saveB=0;
        show();
    }

    private void revoke(){
        scoreA=saveA;
        scoreB=saveB;
        show();
    }




}