package com.bridgelabz;

import com.bridgelabz.JUnit.FileprocessingTest.FileProcessing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class FileProcessingTest {
    private FileProcessing fp;
    private String testFile="file.txt";

    @BeforeEach
    void setUp(){
        fp=new FileProcessing();
    }

    @Test
    public void shouldReadWriteFile() throws IOException {
        String text="My name is Sehajpreet Kaur";
        fp.writeToFile(testFile, text);

        Assertions.assertTrue(new java.io.File(testFile).exists());
        Assertions.assertEquals(text, fp.readFromFile(testFile));
    }

    @Test
    public void testReadNonExistentFile() {
        Assertions.assertThrows(IOException.class, () -> fp.readFromFile("nonexistent.txt"));
    }
}
