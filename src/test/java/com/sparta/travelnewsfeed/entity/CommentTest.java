package com.sparta.travelnewsfeed.entity;

import com.sparta.travelnewsfeed.user.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommentTest {

    @Test
    void testCommentEntity() {
        // Given: Prepare the Comment entity with test data
        String expectedText = "Test Comment";
        User user = new User(); // Assuming User is already tested or mocked
        Comment comment = new Comment();
        comment.setText(expectedText);
        comment.setUser(user);

        // When: (In this case, not applicable as we're testing a simple entity)

        // Then: Verify the entity's data is as expected
        assertEquals(expectedText, comment.getText(), "The text should match the expected value");
    }
}
