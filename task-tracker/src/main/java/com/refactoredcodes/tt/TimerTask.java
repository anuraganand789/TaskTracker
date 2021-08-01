package com.refactoredcodes.tt;

import com.refactoredcodes.tt.db.SqliteDB;

public class TimerTask{
    
    public static void main(final String[] args){
        SqliteDB sqlite = new SqliteDB();
        sqlite.connect();
    }
}
