package com.example.publcopenapi.response;

import com.example.publcopenapi.exception.CustomResponseBody;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ResponseDto<T> {
    private boolean success;
    private T data;
    private CustomResponseBody error;

    public static <T> ResponseDto<T> success(T data) {
        return new ResponseDto<>(true, data, null);
    }
    public static <T> ResponseDto<T> fail(CustomResponseBody error) {
        return new ResponseDto<>(false, null, error);
    }
}
