package com.amandfarrell.www.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public ReportCard mReportCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mReportCard = new ReportCard();

        //TODO make this work for multiple subjects

        Button getReport = (Button) findViewById(R.id.get_report_card);
        final TextView textView1 = (TextView) findViewById(R.id.text_view1);

        Button setGrades = (Button) findViewById(R.id.button_set_grades);
        final EditText enteredChemGrade = (EditText) findViewById(R.id.edit_text_set_chem_grade);
        final EditText enteredMathGrade = (EditText) findViewById(R.id.edit_text_set_math_grade);

        //Print the Report Card to the screen
        getReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String grade = mReportCard.toString();
                textView1.setText(grade);
            }
        });

        //Set the chemistry grade of the report card
        setGrades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chemGrade = enteredChemGrade.getText().toString();
                String mathGrade = enteredMathGrade.getText().toString();
                mReportCard.setChemistryGrade(chemGrade);
                mReportCard.setMathGrade(mathGrade);
            }
        });

    }
}
