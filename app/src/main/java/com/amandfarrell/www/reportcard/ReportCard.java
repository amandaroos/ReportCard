package com.amandfarrell.www.reportcard;

/**
 * Created by Amanda on 9/3/2017.
 */

public class ReportCard {

    String mChemistryGrade = "N/A";
    String mMathGrade = "N/A";

    public ReportCard(){}

    public void setChemistryGrade(String grade){
        mChemistryGrade = grade;
    }

    public String getChemistryGrade(){
        return mChemistryGrade;
    }

    public void setMathGrade(String grade){
        mMathGrade = grade;
    }

    public String getMathGrade(){
        return mMathGrade;
    }

    public String toString(){
        return "The student's chemistry grade is: " + mChemistryGrade + "\n The student's math grade is: " + mMathGrade;
    }
}



