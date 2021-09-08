package com.example.databasepractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.databasepractice.data.DatabaseHandler;
import com.example.databasepractice.model.Contact;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Contact> contactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(this);

        Contact josh = new Contact();
        josh.setName("Josh");
        josh.setPhoneNumber("5556667788");

        db.addContact(josh);

        contactList = db.getAllContacts();

        for(Contact contact: contactList){
            Log.d("Main", "onCreate: " + contact.getName());
        }
    }
}