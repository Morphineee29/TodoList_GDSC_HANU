package TodoListforGDSC.demo.ToDoException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;


public class ToDoErrorResponse {

    private final String message;


    public ToDoErrorResponse(String message) {

        this.message = message;
    }


    public String getMessage() {
        return message;
    }

    public static ResponseEntity<Object> ToDoResponseBody(String msg, String code, Object TodoObject, HttpStatus httpStatus) {

        Map<String, Object> ToDoResponse = new HashMap<>();
        ToDoResponse.put("message: ", msg);
        ToDoResponse.put("data: ", TodoObject);
        ToDoResponse.put("code: ", code);
        return new ResponseEntity<Object>(ToDoResponse, httpStatus);
    }
}