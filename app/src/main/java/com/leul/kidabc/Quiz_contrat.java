package com.leul.kidabc;

import android.provider.BaseColumns;

public final class Quiz_contrat {

    private Quiz_contrat(){}

    public static class questiontabl implements BaseColumns {
        public static final String TABLE_NAME="quiz_questio";
        public static final String COLUMN_QUESTION="questions";
        public static final String COLUMN_OPTION1="option1";
        public static final String COLUMN_OPTION2="option2";
        public static final String COLUMN_OPTION3="option3";
        public static final String COLUMN_ANSWER_NR="answer_nr";

    }
}
