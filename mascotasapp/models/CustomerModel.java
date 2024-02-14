package mascotasapp.models;

public class CustomerModel extends UserModel {

    private String code;

    public CustomerModel(Long id, String name, String lastname, String email, String phone, String address, String code, String state) {
        super(id, name, lastname, email, phone, address, code, state);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "CustomerModel{" +
                "code='" + code + '\'' +
                '}';
    }
}
