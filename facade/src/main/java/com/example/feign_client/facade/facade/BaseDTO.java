package com.example.feign_client.facade.facade;

import java.util.List;

public class BaseDTO<T> {
    private final List<T> result;
    private final boolean success;

    private BaseDTO(List<T> result, boolean success) {
        this.result = result;
        this.success = success;
    }

    public static <T> BaseDTO<T> ofSuccess(List<T> result) {
        return new BaseDTO<>(result, true);
    }

    public List<T> getResult() {
        return result;
    }

    public boolean isSuccess() {
        return success;
    }

    @Override
    public String toString() {
        return "BaseDTO{" +
               "result=" + result +
               ", success=" + success +
               '}';
    }
}
