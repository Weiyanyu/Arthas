package top.yeonon.response;

import lombok.Getter;

/**
 * @Author yeonon
 * @date 2020/2/23 0023 15:17
 **/
@Getter
public enum ResponseCode {

    //0 mean success code
    SUCCESS(0, "top.yeonon.response success"),
    //1 ~ 99 mean common error code
    REQUEST_PARAM_ERROR(1, "request parameter error, please recheck it"),
    NOT_ALLOW_ACTION(2, "the action was not allowed"),
    VALIDATE_CODE_ERROR(3, "validate code error"),
    NOT_EXIST_TOKEN_IN_HEADER(4, "not exist token in header"),
    UPLOAD_FILE_ERROR(5, "upload file error"),
    JSON_PARSE_ERROR(6, "JSON parse error"),
    SERVICE_ERROR(99, "internal service error"),

    ;

    private int code;

    private String description;

    ResponseCode(int code, String description) {
        this.code = code;
        this.description = description;
    }
}
