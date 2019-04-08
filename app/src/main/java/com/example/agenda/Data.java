package com.example.agenda;

//import android.view.View;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class Data {

    private static ArrayList<Contact> Contacts = new ArrayList<>();
    public static void Save(Contact c){Contacts.add(c);}
    public static ArrayList<Contact> Get(){return Contacts;}
}
