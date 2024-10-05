package ilya.service.linkshortener.utils;

import ilya.service.linkshortener.dto.CreateLinkInfoRequestDto;
import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDateTime;

public class CreateLinkInfoRequestMotherObject {
    private String link;
    private LocalDateTime endTime;
    private String description;
    private boolean isActive = true;

    public CreateLinkInfoRequestMotherObject setLink(String link) {
        this.link = link;
        return this;
    }

    public CreateLinkInfoRequestMotherObject setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    public CreateLinkInfoRequestMotherObject setDescription(String description) {
        this.description = description;
        return this;
    }

    public CreateLinkInfoRequestMotherObject setActive(boolean active) {
        isActive = active;
        return this;
    }

    public CreateLinkInfoRequestMotherObject random() {
        this.link = RandomStringUtils.randomAlphanumeric(15);
        this.endTime = LocalDateTime.now();
        this.description = RandomStringUtils.randomAlphanumeric(15);
        return this;
    }

    public CreateLinkInfoRequestDto build() {
        return new CreateLinkInfoRequestDto(
                this.link,
                this.endTime,
                this.description,
                this.isActive
        );
    }
}
