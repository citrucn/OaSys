package cn.linter.oasys.common.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author wangxiaoyang
 * @date 2020/12/19
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ResultStatus {

    /**
     * 操作成功
     */
    SUCCESS("0000", "操作成功"),
    UNAUTHORIZED("1000", "未授权"),
    FORBIDDEN("1001", "权限不足"),
    TOKEN_IS_INVALID("1002", "Token无效"),
    ARGUMENT_NOT_VALID("3002", "参数无效"),
    TODAY_HAS_CLOCKED_IN("4001", "今日已经签到过"),
    TODAY_HAS_NOT_CLOCKED_IN("4002", "今日还没有签到");

    /**
     * 状态码
     */
    private final String code;
    /**
     * 状态信息
     */
    private final String message;

    ResultStatus(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}