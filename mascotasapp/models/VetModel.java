package mascotasapp.models;

public class VetModel extends UserModel{

    private String degree;
    private String grad_year;
    private String university;

    public VetModel(Long id, String name, String lastname, String email, String phone, String address, String type, String state, String degree, String grad_year, String university) {
        super(id, name, lastname, email, phone, address, type, state);
        this.degree = degree;
        this.grad_year = grad_year;
        this.university = university;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getGrad_year() {
        return grad_year;
    }

    public void setGrad_year(String grad_year) {
        this.grad_year = grad_year;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "VetModel{" +
                "degree='" + degree + '\'' +
                ", grad_year='" + grad_year + '\'' +
                ", university='" + university + '\'' +
                '}';
    }
}
