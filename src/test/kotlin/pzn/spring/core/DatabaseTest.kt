package pzn.spring.core

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DatabaseTest {

    @Test
    fun testSingleton(){

        var database1 = Database.instance;
        var database2 = Database.instance;

        Assertions.assertSame(database1, database2);
    }
}