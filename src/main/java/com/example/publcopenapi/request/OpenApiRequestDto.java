package com.example.publcopenapi.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OpenApiRequestDto {
    private String pageNo; // 페이지 번호
    private String companyName; // 법인명칭(corpNm)
}
