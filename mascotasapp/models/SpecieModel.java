package mascotasapp.models;

public class SpecieModel {
    private Long    id;
    private String  name;

    public SpecieModel(Long id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "SpecieModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}