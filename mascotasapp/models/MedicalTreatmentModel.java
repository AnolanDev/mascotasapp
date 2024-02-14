package mascotasapp.models;

public class MedicalTreatmentModel {
    private Long id;
    private String code;
    private String name;
    private String dosage; //dosis

    public MedicalTreatmentModel(Long id, String code, String name, String dosage) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.dosage = dosage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    @Override
    public String toString() {
        return "MedicalTreatmentModel{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", dosage='" + dosage + '\'' +
                '}';
    }
}