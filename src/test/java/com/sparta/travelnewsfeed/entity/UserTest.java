package com.sparta.travelnewsfeed.entity;

import com.sparta.travelnewsfeed.user.User;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private static Validator validator;

    @BeforeAll
    static void setup() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    @DisplayName("이름, 비밀번호, 이메일 인증성공")
    void testUserFieldsValiditySuccess() {
        // Given
        User user = new User();
        user.setUsername("validUsername");
        user.setPassword("ValidPassword123!");
        user.setEmail("user@example.com");

        // When

        // Then
        assertAll(
                () -> assertEquals("validUsername", user.getUsername(), "Username should be valid"),
                () -> assertEquals("ValidPassword123!", user.getPassword(), "Password should be valid"),
                () -> assertEquals("user@example.com", user.getEmail(), "Email should be valid")
        );
    }

    @Test
    @DisplayName("Test Username, Password, and Email Validity - Failure")
    void testUserFieldsValidityFailure() {
        // Given
        User user = new User();
        user.setUsername("us"); // 잘못된 아이디 형식
        user.setPassword("pass"); // 잘못된 비번 형식
        user.setEmail("user@"); // 잘못된 이메일 형식

        // When

        // Then
        assertAll(
                () -> assertNotEquals("validUsername", user.getUsername(), "Username should be invalid"),
                () -> assertNotEquals("ValidPassword123!", user.getPassword(), "Password should be invalid"),
                () -> assertNotEquals("user@example.com", user.getEmail(), "Email should be invalid")
        );
    }

    // Add more tests as necessary for password, email, etc.
}