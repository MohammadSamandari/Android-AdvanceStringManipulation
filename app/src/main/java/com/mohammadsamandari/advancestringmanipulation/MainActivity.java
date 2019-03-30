package com.mohammadsamandari.advancestringmanipulation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    public class StringManipulation {
        //Split:
        //  this is a method for spiliting a strings
        String myString = "Mohammad x Faeze x Tommy x Mobina";
        //        if i wanted to convert above string into an array which contained each of the name:
        String[] splitString = myString.split(" x ");
        //        this takes myString and split it by x into an array;

        //----------------------------------------

        //now we want to extract a portion of a string.
        String river = "Mississippi";
        //to get a part of a string :
        String riverPart = river.substring(2, 5); //This Returns: "ssi"
        //  this method, returns the 2th letter and keeps going untill the last letter before 5th letter

        //---------------------------------------

        //Regex :
        //  Short for Regular Expression:
        //  It is a cross language way of minipulating Strings.
        String river2 = "Mississippi";
        //  The way it works is that we start by a creating a pattern:
        Pattern p = Pattern.compile("Mi(.*?)pi");
        //  we created a Patern and compile that with a piece of Regex
        //  the most important thing that we are going to use regex for is is finding the
        //  content between 2 other strings.
        //  This means , find "Mi" and then find "pi" and then return what ever is between them.

        //after Pattern, we create a Matcher:
        //  So Matcher is going to match our pattern inside the original string.
        Matcher m = p.matcher(river);

        //  This matcher might find nothing or might find more that one result, so :
        while( m.find()){
            //  To get the result:
            System.out.println(m.group(1));
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
