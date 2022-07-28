package com.leul.kidabc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.leul.kidabc.Quiz_contrat.*;

import java.util.ArrayList;
import java.util.List;

// CREATING QUESTIONS TABLE AND STORE
public class QuizHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "tryone.db";
    private static final int DATABASE_VERSION = 1;

    private SQLiteDatabase db;

    public QuizHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                questiontabl.TABLE_NAME + " ( " +
                questiontabl._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                questiontabl.COLUMN_QUESTION + " TEXT, " +
                questiontabl.COLUMN_OPTION1 + " TEXT, " +
                questiontabl.COLUMN_OPTION2 + " TEXT, " +
                questiontabl.COLUMN_OPTION3 + " TEXT, " +
                questiontabl.COLUMN_ANSWER_NR + " INTEGER" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + questiontabl.TABLE_NAME);
        onCreate(db);
    }

    private void fillQuestionsTable() {
        Question q1 = new Question("A", "a", "b", "c", 1);
        addQuestion(q1);
        Question q2 = new Question("E", "c", "q", "e", 3);
        addQuestion(q2);
        Question q3 = new Question("I", "d", "v", "i", 3);
        addQuestion(q3);
        Question q4 = new Question("O", "o", "b", "c", 1);
        addQuestion(q4);
        Question q5 = new Question("U", "a", "u", "f", 2);
        addQuestion(q5);
    }

    private void addQuestion(Question question) {
        ContentValues cv = new ContentValues();
        cv.put(questiontabl.COLUMN_QUESTION, question.getQuestion());
        cv.put(questiontabl.COLUMN_OPTION1, question.getOption1());
        cv.put(questiontabl.COLUMN_OPTION2, question.getOption2());
        cv.put(questiontabl.COLUMN_OPTION3, question.getOption3());
        cv.put(questiontabl.COLUMN_ANSWER_NR, question.getAnswerNr());
        db.insert(questiontabl.TABLE_NAME, null, cv);
    }

    public List<Question> getAllQuestions() {
        List<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + questiontabl.TABLE_NAME, null);

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndexOrThrow(questiontabl.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndexOrThrow(questiontabl.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndexOrThrow(questiontabl.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndexOrThrow(questiontabl.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndexOrThrow(questiontabl.COLUMN_ANSWER_NR)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }
}