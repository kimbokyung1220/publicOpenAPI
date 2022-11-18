package com.example.publcopenapi.controller;

import com.example.publcopenapi.request.OpenApiRequestDto;
import com.example.publcopenapi.response.ResponseDto;
import com.example.publcopenapi.service.OpenApiService;
import lombok.RequiredArgsConstructor;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api")
public class OpenApiController {
    private final OpenApiService openApiService;

    @PostMapping(value = "/companySearch")
    public ResponseDto<?> getPublicInstitutionsApi(@RequestBody OpenApiRequestDto requestDto) throws IOException, ParseException {
        return openApiService.getPublicInstitutionsApi(requestDto);
    }
}
