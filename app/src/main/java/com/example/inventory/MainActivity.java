package com.example.inventory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {

    EditText A,B,C,D,E,F;
    Button submit;
    DatabaseReference rootRef,demoRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        A = (EditText) findViewById(R.id.editText);
        B = (EditText) findViewById(R.id.editText2);
        C = (EditText) findViewById(R.id.editText3);
        D = (EditText) findViewById(R.id.editText4);
        E = (EditText) findViewById(R.id.editText5);
        F = (EditText) findViewById(R.id.editText6);

        submit = (Button) findViewById(R.id.button);
//database reference pointing to root of database
        rootRef = FirebaseDatabase.getInstance().getReference();

//database reference pointing to demo node
        demoRef = rootRef.child("demo");
        onclicking();
    }

      /*  submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name = A.getText().toString();
                String Phone= B.getText().toString();
                String ADDRESS= C.getText().toString();
                String TYPE= D.getText().toString();
              //  String Temprature= E.getText().toString();
                //String Privorg= F.getText().toString();
      demoRef.push().setValue(Name);
                demoRef.push().setValue(Phone);
                demoRef.push().setValue(ADDRESS);
                demoRef.push().setValue(TYPE);
                //demoRef.push().setValue(Temprature);
                //demoRef.push().setValue(Privorg);
            }
        });*/
        public void onclicking()
        {
            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String Name = A.getText().toString();
                    String Phone= B.getText().toString();
                    String ADDRESS= C.getText().toString();
                    String TYPE= D.getText().toString();
                    String Temprature= E.getText().toString();
                    String Privorg= F.getText().toString();
                    demoRef.push().setValue(Name);
                    demoRef.push().setValue(Phone);
                    demoRef.push().setValue(ADDRESS);
                    demoRef.push().setValue(TYPE);
                    demoRef.push().setValue(Temprature);
                    demoRef.push().setValue(Privorg);

                }
            });
        }


}
