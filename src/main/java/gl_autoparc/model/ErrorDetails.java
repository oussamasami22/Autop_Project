package gl_autoparc.model;

import java.util.Date;

public record ErrorDetails (Date timestamp, int status, String message, String details) {
}

