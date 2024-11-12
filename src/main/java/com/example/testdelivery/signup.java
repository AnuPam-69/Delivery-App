package com.example.testdelivery;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class signup extends AppCompatActivity{
    private EditText FirstNameInput, LastNameInput, emailAddress, Password, PasswordAgain;

    @Override
    protected void onCreate(Bundle Session) {
        super.onCreate(Session);
        setContentView(R.layout.sign_up);

        EditText FirstNameInput = findViewById(R.id.name_one);
        EditText LastNameInput = findViewById(R.id.name_two);
        EditText emailAddress = findViewById(R.id.emailID);
        EditText Password = findViewById(R.id.penis_one);
        EditText PasswordAgain = findViewById(R.id.ConfirmPassword);

        String Pass1 = Password.getText().toString();
        String Pass2 = PasswordAgain.getText().toString();
        TextView warning = findViewById(R.id.savadhan);


        Button back;

        back = findViewById(R.id.Back);
        Button save = findViewById(R.id.Register);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fname = FirstNameInput.getText().toString();
                String lname = LastNameInput.getText().toString();
                String eMail = emailAddress.getText().toString();
                String Pass1 = Password.getText().toString();
                String Pass2 = PasswordAgain.getText().toString();

                String emailRegex = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.com$";

                boolean Condition1 = fname.isEmpty(), Condition2= lname.isEmpty(), Condition3 = eMail.isEmpty(), Condition4 = Pass1.isEmpty(), Condition5 = Pass2.isEmpty();

                if (Condition1 || Condition2 || Condition3 || Condition4 || Condition5) {
                    Toast.makeText(signup.this, "Something is Missing!", Toast.LENGTH_LONG).show();
                } else if(!eMail.matches(emailRegex)){
                    Toast.makeText(signup.this, "Please enter a valid email address.", Toast.LENGTH_SHORT).show();
                }
                else if (!Pass1.equals(Pass2)) {
                    warning.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(signup.this, "Congratulaions! You Registered Successfully", Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            // Code to execute after the delay
                            Intent intent = new Intent(signup.this, MainActivity.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intent);
                        }
                    }, 1000); // 2000 milliseconds = 2 seconds

                }
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signup.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

    }
}
