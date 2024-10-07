package ilya.service.linkshortener.dto;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record CreateLinkInfoRequest(
        @NotNull String link,
        @NotNull LocalDateTime endTime,
        @Nullable String description,
        boolean isActive
) {

    public CreateLinkInfoRequest(String link, LocalDateTime endTime, String description) {
        this(link, endTime, description, true);
    }

}