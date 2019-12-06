package com.example.myapplication;

import android.content.Context;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class WithFile {
    public static final String FILENAME = "itemsAll.dat";

    public static void toFile(ArrayList<String> items, Context context){
        try {
            FileOutputStream fileOuts = context.openFileOutput(FILENAME,Context.MODE_PRIVATE);
            ObjectOutputStream objOuts = new ObjectOutputStream(fileOuts);
            objOuts.writeObject(items);
            fileOuts.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<String> fromFile(Context context) {
        ArrayList<String> items = null;
        try {
            FileInputStream fileInts = context.openFileInput(FILENAME);
            ObjectInputStream objInts = new ObjectInputStream(fileInts);
            items = (ArrayList<String>) objInts.readObject();
        } catch (FileNotFoundException e) {
            items = new ArrayList<>();
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            items = new ArrayList<>();

            e.printStackTrace();
        }
        return items;
    }
}
