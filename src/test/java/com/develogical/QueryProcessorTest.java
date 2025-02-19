package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsTeamName() throws Exception {
        assertThat(queryProcessor.process("what is your name"), containsString("team-jj"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }
    @Test
    public void plus() throws Exception {
        assertThat(queryProcessor.process("largest"), containsString("15"));
    }
    @Test
    public void square() throws Exception {
        assertThat(queryProcessor.process("square"), containsString("25"));
    }
    @Test
    public void multiply() throws Exception {
        assertThat(queryProcessor.process("multiplied"), containsString("0"));
    }

}
