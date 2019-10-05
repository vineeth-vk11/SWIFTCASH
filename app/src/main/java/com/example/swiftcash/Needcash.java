package com.example.swiftcash;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.baoyachi.stepview.HorizontalStepView;
import com.baoyachi.stepview.bean.StepBean;

import java.util.ArrayList;
import java.util.List;

public class Needcash extends AppCompatActivity {

    StepBean stepBean0,stepBean1,stepBean2,stepBean3,stepBean4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_needcash);

        HorizontalStepView setpview5 = findViewById(R.id.step_view);
        List<StepBean> stepsBeanList = new ArrayList<>();
        StepBean stepBean0 = new StepBean("1",0);
        StepBean stepBean1 = new StepBean("2",-1);
        StepBean stepBean2 = new StepBean("3",-1);
        StepBean stepBean3 = new StepBean("4",-1);
        StepBean stepBean4 = new StepBean("5",-1);
        stepsBeanList.add(stepBean0);
        stepsBeanList.add(stepBean1);
        stepsBeanList.add(stepBean2);
        stepsBeanList.add(stepBean3);
        stepsBeanList.add(stepBean4);


        setpview5
                .setStepViewTexts(stepsBeanList)
                .setTextSize(12)
                .setStepsViewIndicatorCompletedLineColor(ContextCompat.getColor(Needcash.this, android.R.color.white))
                .setStepsViewIndicatorUnCompletedLineColor(ContextCompat.getColor(Needcash.this, R.color.uncompleted_text_color))
                .setStepViewComplectedTextColor(ContextCompat.getColor(Needcash.this, android.R.color.white))
                .setStepViewUnComplectedTextColor(ContextCompat.getColor(Needcash.this, R.color.uncompleted_text_color))
                .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(Needcash.this, R.drawable.complted))
                .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(Needcash.this, R.drawable.default_icon))
                .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(Needcash.this, R.drawable.attention));
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment f = new Amount();
        fragmentTransaction.add(R.id.fragHolder,f);
        fragmentTransaction.commit();
    }


}
