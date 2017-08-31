package com.example.nd.myquizz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onRadioButtonClicked (View view){
        boolean checked = ((RadioButton)view).isChecked();

        //Check which RadioButton is checked
        switch (view.getId()){
            // For question 1
            case  R.id.abubakar_bello:
                if (checked)
                    Toast.makeText(this,"Correct",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bello_mustapha:
                if (checked)
                    Toast.makeText(this,"Try again",Toast.LENGTH_LONG).show();
                break;
            // For question 2
            case  R.id.all_progressive_congress:
                if (checked)
                    Toast.makeText(this,"Correct",Toast.LENGTH_SHORT).show();
                break;
            case R.id.all_people_council:
                if (checked)
                    Toast.makeText(this,"Try again",Toast.LENGTH_SHORT).show();
                break;
            // For question 3
            case  R.id.year_1970:
                if (checked)
                    Toast.makeText(this,"Correct",Toast.LENGTH_SHORT).show();
                break;
            case R.id.year_1976:
                if (checked)
                    Toast.makeText(this,"Try again",Toast.LENGTH_SHORT).show();
                break;
            case R.id.year_1973:
                if (checked)
                    Toast.makeText(this,"Try again",Toast.LENGTH_SHORT).show();
                break;
            // For question 4
            case  R.id.sulja:
                if (checked)
                    Toast.makeText(this,"Try again",Toast.LENGTH_SHORT).show();
                break;
            case R.id.minna:
                if (checked)
                    Toast.makeText(this,"Correct",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bida:
                if (checked)
                    Toast.makeText(this,"Try again",Toast.LENGTH_SHORT).show();
                break;
            // For question 5
            case  R.id.lga_25:
                if (checked)
                    Toast.makeText(this,"Correct",Toast.LENGTH_SHORT).show();
                break;
            case R.id.lga_20:
                if (checked)
                    Toast.makeText(this,"Try again",Toast.LENGTH_SHORT).show();
                break;
            case R.id.lga_22:
                if (checked)
                    Toast.makeText(this,"Try again",Toast.LENGTH_SHORT).show();
                break;
            // For question 6
            case  R.id.nupe:
                if (checked)
                    Toast.makeText(this,"Correct",Toast.LENGTH_SHORT).show();
                break;
            case R.id.ebira:
                if (checked)
                    Toast.makeText(this,"Try again",Toast.LENGTH_SHORT).show();
                break;
            // For question 7
            case  R.id.rice:
                if (checked)
                    Toast.makeText(this,"Correct",Toast.LENGTH_SHORT).show();
                break;
            case R.id.palm_fruit:
                if (checked)
                    Toast.makeText(this,"Try again",Toast.LENGTH_SHORT).show();
                break;
            // For question 8
            case  R.id.children_group:
                if (checked)
                    Toast.makeText(this,"Try again",Toast.LENGTH_SHORT).show();
                break;
            case R.id.dance_group:
                if (checked)
                    Toast.makeText(this,"Correct",Toast.LENGTH_SHORT).show();
                break;
            //for question 9
            case R.id.tribe:
                if (checked)
                    Toast.makeText(this,"Correct",Toast.LENGTH_SHORT).show();
                break;
            case R.id.location:
                if (checked)
                    Toast.makeText(this,"Try again",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submit (View view) {
        EditText nameField = (EditText)findViewById(R.id.quiz_name);

        String testResult = nameField.getText().toString();
        Toast.makeText(getApplicationContext(),"Thank you, " + testResult, Toast.LENGTH_LONG).show();
    }
}
