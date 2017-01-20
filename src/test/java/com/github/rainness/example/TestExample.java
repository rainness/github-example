package com.github.rainness.example;

import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

/**
 * Created by rainness on 16-12-20.
 */
public class TestExample {

    @ClassRule
    public static final TemporaryFolder tempDir = new TemporaryFolder();

    @Test
    public void testExample() throws Exception {
        Assert.assertTrue(true);
    }
}
