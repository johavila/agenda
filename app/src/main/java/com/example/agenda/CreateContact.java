package com.example.agenda;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
//import java.util.ArrayList;

public class CreateContact extends AppCompatActivity {
    private EditText Name, LastName, Phone, Cellphone;
    private Resources Resources;
    //private ArrayList <Contact> contacts;
    private Contact C;
    private DatabaseReference database;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_contact);
        database = FirebaseDatabase.getInstance().getReference("database");
        Name = (EditText)findViewById(R.id.TxtName);
        LastName = (EditText)findViewById(R.id.TxtLastName);
        Phone = (EditText)findViewById(R.id.TxtPhone);
        Cellphone = (EditText)findViewById(R.id.TxtCellphone);
        Resources = this.getResources();
        //contacts = Data.Get();
    }

    public void Save(View view){
        String NameV, LastNameV, PhoneV, CellphoneV, ID;
        //ID = (contacts.size()+1)+"";
        ID= database.push().getKey();
        NameV = Name.getText().toString();
        LastNameV = LastName.getText().toString();
        PhoneV = Phone.getText().toString();
        CellphoneV = Cellphone.getText().toString();

     if (TextUtils.isEmpty(NameV)){
            Toast.makeText(this, "No ha Digitado un Nombre", Toast.LENGTH_LONG).show();
        } else if (TextUtils.isEmpty(LastNameV)){
            Toast.makeText(this, "No ha Digitado un Apellido", Toast.LENGTH_LONG).show();
        }else if (TextUtils.isEmpty(PhoneV)){
            Toast.makeText(this, "No ha Digitado un Telefono", Toast.LENGTH_LONG).show();
        }else if (TextUtils.isEmpty(CellphoneV)){
            Toast.makeText(this, "No ha Digitado un Correo", Toast.LENGTH_LONG).show();
        }else {
         Contact C1 = new Contact(ID, NameV, LastNameV, PhoneV, CellphoneV);

         database.child("C1");
        //    C.SaveContact();
            Toast.makeText(this, R.string.done, Toast.LENGTH_LONG).show();

        }

    }
}
