package org.romainlavabre.event.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Romain Lavabre <romainlavabre98@gmail.com>
 */
@ResponseStatus( code = HttpStatus.INTERNAL_SERVER_ERROR, reason = "An event launched doesn't respect credentials of definition" )
public class InvalidEventCredentialsException extends RuntimeException {

    public InvalidEventCredentialsException() {
        super();
    }
}
