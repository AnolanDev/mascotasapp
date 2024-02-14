package mascotasapp.models;

public class BreedModel {
    private Long    id;
    private String  name;
    private String  origin;

    public BreedModel(Long id, String name, String origin) {
        this.id = id;
        this.name = name;
        this.origin = origin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "BreedsModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}
