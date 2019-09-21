package by.iba;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class HttpControllerTest {

    private HttpController controller;

    @Before
    public void init() {
        controller = new HttpController();
    }

    @Test
    public void getEmptyUrl() {
        try {
            controller.get("");
        }
        catch (Exception e) {
            assertThat(e, not(instanceOf(RuntimeException.class)));
        }
    }

    @Test
    public void getNull() {
        try {
            controller.get(null);
        }
        catch (Exception e) {
            assertThat(e, not(instanceOf(RuntimeException.class)));
        }
    }

    @Test
    public void getPosts() {
        try {
            HttpController.HttpResponse httpResponse = controller.get("https://jsonplaceholder.typicode.com/posts");
            assertTrue(
                    httpResponse != null
                            && httpResponse.statusCode == 200
                            && httpResponse.message != null
                            && !httpResponse.message.isEmpty()
                            && !(new JSONArray(httpResponse.message).isEmpty())
            );
        }
        catch (Exception e) {
            fail("Method failed with exception");
        }
    }

    @Test
    public void getPostWithId() {
        try {
            HttpController.HttpResponse httpResponse = controller.get("https://jsonplaceholder.typicode.com/posts/1");
            assertTrue(
                    httpResponse != null
                            && httpResponse.message != null
                            && !httpResponse.message.isEmpty()
            );

            JSONObject object = new JSONObject(httpResponse.message);
            assertTrue(
                    httpResponse.statusCode == 200
                            && object.has("body")
                            && object.has("title")
                            && object.has("userId")
                            && object.has("id")
            );
        }
        catch (Exception e) {
            fail("Method failed with exception");
        }
    }
}
