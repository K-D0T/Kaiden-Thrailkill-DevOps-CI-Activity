package edu.westga.comp4420.junit_sample.test.model.telephone_checker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import edu.westga.comp4420.junit_sample.model.TelephoneChecker;

class TestIdentifySpam {

    @ParameterizedTest
    @CsvSource({"1111111111, false", "9990000000, true", "9000000000, true", "1234567890, false", "8889999999, true", "8000000000, true", "9119999999, true", "4119999999, true"}) 
    void test(long number, boolean expectedResult) {
        TelephoneChecker checker = new TelephoneChecker();
        
        boolean result = checker.identifySpam(number);
        
        Assertions.assertEquals(expectedResult, result, "checking if (" + number + ") is potential spam");
    }
}
