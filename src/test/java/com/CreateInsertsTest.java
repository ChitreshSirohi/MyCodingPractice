package com;

import org.junit.Test;

import static org.junit.Assert.*;

public class CreateInsertsTest {

    @Test
    public void readAndCreateInsertStmtFile() {
        CreateInserts createInserts = new CreateInserts();
        createInserts.readAndCreateInsertStmtFile("C:\\Users\\CSirohi\\Documents\\5MS\\StandingData\\InsertCodeGroups.txt",
                "C:\\Users\\CSirohi\\Documents\\5MS\\StandingData\\StmtTest1.sql","C:\\Users\\CSirohi\\Documents\\5MS\\StandingData\\InsertCodeGroupTemplate.txt");
    }
}