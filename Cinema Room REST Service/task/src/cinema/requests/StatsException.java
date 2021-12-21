package cinema.requests;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.UNAUTHORIZED)
public final class StatsException extends RuntimeException{
    public StatsException(String error) {
        super(error);
    }
}
