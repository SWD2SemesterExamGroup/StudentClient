package dk.kea.student.artifacts.Controllers;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentControllerTest
{
    @Test
    public void indexTest() {
        // Assign
        StudentController _controller = new StudentController();
        // Act
        String result = _controller.index();
        // Assert
        Assert.assertNotNull(result);
    }
}
