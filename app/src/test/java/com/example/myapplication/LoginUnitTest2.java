package com.example.myapplication;

import org.junit.Test;
import org.mockito.Mock;
import android.content.Context;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginUnitTest2 {
    private static final String VALID_STRING = "Login was successful";
    private static final String INVALID_STRING = "Invalid login!";

    @Mock
    Context mMockContext;

    @Test
    public void readStringFromContext_LocalizedString(){
        LoginActivity myObjectUnderTest = new LoginActivity(mMockContext);

        String result = myObjectUnderTest.validate("admin","admin");

        assertThat(result, is(VALID_STRING));
    }

    @Test
    public void readStringFromContext_ANdTEST(){
        LoginActivity myObjectUnderTest = new LoginActivity(mMockContext);
        String result = myObjectUnderTest.validate("notadmin", "notadmin");
        assertThat(result,  is(INVALID_STRING));
    }
}
