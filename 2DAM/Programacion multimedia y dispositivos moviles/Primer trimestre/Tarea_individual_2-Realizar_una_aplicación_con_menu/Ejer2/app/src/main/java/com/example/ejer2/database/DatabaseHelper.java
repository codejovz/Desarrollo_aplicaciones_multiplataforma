package com.example.ejer2.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.ContentValues;

public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(Context context) {
        super(context, "students.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE students ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "name TEXT, "
                + "age INTEGER)";
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS students");
        onCreate(db);
    }

    // Método para insertar un estudiante
    public boolean insertStudent(String name, int age) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("age", age);
        long result = db.insert("students", null, contentValues);
        db.close();
        return result != -1;  // Devuelve true si la inserción fue exitosa
    }

    // Método para leer todos los estudiantes
    public String getAllStudents() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM students", null);
        // Crea un StringBuilder para construir la cadena de salida
        StringBuilder builder = new StringBuilder();
        if (cursor.getCount() == 0) {
            // Si no hay estudiantes, agrega un mensaje al StringBuilder
            builder.append("No hay estudiantes.");
        } else {
            // Si hay registros, itera sobre cada uno de ellos
            while (cursor.moveToNext()) {
                // Obtiene el ID del estudiante desde la primera columna (índice 0)
                int id = cursor.getInt(0);
                // Obtiene el nombre del estudiante desde la segunda columna (índice 1)
                String name = cursor.getString(1);
                // Obtiene la edad del estudiante desde la tercera columna (índice 2)
                int age = cursor.getInt(2);
                builder.append("ID: ").append(id)
                        .append(", Nombre: ").append(name)
                        .append(", Edad: ").append(age)
                        .append("\n");
            }
        }
        // Cierra el cursor para liberar recursos
        cursor.close();
        db.close();
        return builder.toString();
    }

    public String getAllStudents_V2() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM students", null);
        // Crea un StringBuilder para construir la cadena de salida
        StringBuilder builder = new StringBuilder();

        if (cursor.getCount() == 0) {
            // Si no hay estudiantes, agrega un mensaje al StringBuilder
            builder.append("No hay estudiantes.");
        } else {
            // Mueve el cursor a la primera fila
            if (cursor.moveToFirst()) {
                do {
                    // Obtiene el ID del estudiante desde la primera columna (índice 0)
                    int id = cursor.getInt(0);
                    // Obtiene el nombre del estudiante desde la segunda columna (índice 1)
                    String name = cursor.getString(1);
                    // Obtiene la edad del estudiante desde la tercera columna (índice 2)
                    int age = cursor.getInt(2);
                    builder.append("ID: ").append(id)
                            .append(", Nombre: ").append(name)
                            .append(", Edad: ").append(age)
                            .append("\n");
                } while (cursor.moveToNext()); // Continúa moviéndose a la siguiente fila
            }
        }
        // Cierra el cursor para liberar recursos
        cursor.close();
        db.close();
        return builder.toString();
    }

    // Método para actualizar un estudiante
    public boolean updateStudent(int id, String newName, int newAge) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", newName);
        contentValues.put("age", newAge);
        // Actualiza la fila donde el "id" coincide
        int rowsAffected = db.update("students", contentValues, "id = ?", new String[]{String.valueOf(id)});
        db.close();
        return rowsAffected > 0;  // Devuelve true si se actualizó al menos una fila
    }

    public boolean deleteStudent(int id) {
        SQLiteDatabase db = this.getWritableDatabase();

        // Elimina la fila donde el "id" coincide
        int rowsDeleted = db.delete("students", "id = ?", new String[]{String.valueOf(id)});
        db.close();
        return rowsDeleted > 0;  // Devuelve true si se eliminó al menos una fila
    }
    public Cursor getStudentById(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.rawQuery("SELECT * FROM students WHERE id = ?", new String[]{String.valueOf(id)});
    }
    public Cursor getStudentByName(String name) {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.rawQuery("SELECT * FROM students WHERE name = ?", new String[]{name});
    }


}