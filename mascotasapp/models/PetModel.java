package mascotasapp.models;

public class PetModel {
    private Long id;
    private String name;
    private String birthdate;
    private String gender;
    private SpecieModel specieModel;
    private BreedModel breedModel;
    private String color;
    private MedicalTreatmentModel medicalTreatmentModel;
    private CustomerModel ownerModel;

    public PetModel(Long id, String name, String birthdate, String gender, SpecieModel specieModel, BreedModel breedModel, String color, MedicalTreatmentModel medicalTreatmentModel, CustomerModel ownerModel) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.gender = gender;
        this.specieModel = specieModel;
        this.breedModel = breedModel;
        this.color = color;
        this.medicalTreatmentModel = medicalTreatmentModel;
        this.ownerModel = ownerModel;
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

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public SpecieModel getSpecieModel() {
        return specieModel;
    }

    public void setSpecieModel(SpecieModel specieModel) {
        this.specieModel = specieModel;
    }

    public BreedModel getBreedModel() {
        return breedModel;
    }

    public void setBreedModel(BreedModel breedModel) {
        this.breedModel = breedModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public MedicalTreatmentModel getMedicalTreatmentModel() {
        return medicalTreatmentModel;
    }

    public void setMedicalTreatmentModel(MedicalTreatmentModel medicalTreatmentModel) {
        this.medicalTreatmentModel = medicalTreatmentModel;
    }

    public CustomerModel getOwnerModel() {
        return ownerModel;
    }

    public void setOwnerModel(CustomerModel ownerModel) {
        this.ownerModel = ownerModel;
    }

    @Override
    public String toString() {
        return "PetModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", gender='" + gender + '\'' +
                ", specieModel=" + specieModel +
                ", breedModel=" + breedModel +
                ", color='" + color + '\'' +
                ", medicalTreatmentModel=" + medicalTreatmentModel +
                ", ownerModel=" + ownerModel +
                '}';
    }
}