package com.sparta.travelnewsfeed.dto.request;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommentCreateRequestDtoTest {

    @Test
    void testCommentCreateRequestDto() {
        // Given: Prepare the DTO with test data
        String expectedText = "Test Comment";
        CommentCreateRequestDto dto = new CommentCreateRequestDto(expectedText);
        dto.setText("Test Comment");

        // When: (In this case, not applicable as we're testing a simple POJO)

        // Then: Verify the DTO's data is as expected
        assertEquals(expectedText, dto.getText(), "The text should match the expected value");
    }

}