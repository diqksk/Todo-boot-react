package chorong.baeksoo.todo.common.util;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.http.HttpStatus;

public class ApiResponse {
    public static <T> ApiResult<T> success(T response) {
        return new ApiResult<>(true, response, null);
    }

    public static ApiResult<?> error(Throwable throwable, HttpStatus status) {
        return new ApiResult<>(false, null,new ApiError(throwable,status));
    }

    public static ApiResult<?> error(String msg, HttpStatus status) {
        return new ApiResult<>(false, null,new ApiError(msg,status));
    }

    @Getter
    @ToString
    public static class ApiError {
        private final String msg;
        private final int status;

        ApiError(Throwable throwable, HttpStatus status) {
            this(throwable.getMessage(), status);
        }

        ApiError(String msg, HttpStatus status) {
            this.msg = msg;
            this.status = status.value();
        }
    }

    @Getter
    @ToString
    @RequiredArgsConstructor
    public static class ApiResult<T> {
        private final boolean success;
        private final T response;
        private final ApiError err;
    }
}

