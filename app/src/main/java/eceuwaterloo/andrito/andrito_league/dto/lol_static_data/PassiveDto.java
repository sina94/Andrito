package eceuwaterloo.andrito.andrito_league.dto.lol_static_data;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class PassiveDto {
    private String description;
    private ImageDto image;
    private String name;
    private String sanitizedDescription;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ImageDto getImage() {
        return image;
    }

    public void setImage(ImageDto image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSanitizedDescription() {
        return sanitizedDescription;
    }

    public void setSanitizedDescription(String sanitizedDescription) {
        this.sanitizedDescription = sanitizedDescription;
    }
}
