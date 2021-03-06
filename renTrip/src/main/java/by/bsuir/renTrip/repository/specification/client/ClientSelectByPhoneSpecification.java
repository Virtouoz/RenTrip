package by.bsuir.renTrip.repository.specification.client;

import by.bsuir.renTrip.repository.specification.QuerySpecification;

public class ClientSelectByPhoneSpecification implements QuerySpecification {
    private static final String SELECT_BY_PHONE_AND_PASSWORD =
            "SELECT client.id, role.name, login, password, phone, status  FROM client " +
                    "JOIN role ON client.role = role.id WHERE phone='%s'";
    private String phone;

    public ClientSelectByPhoneSpecification(String phone) {
        this.phone = phone;
    }

    @Override
    public String specify() {
        return String.format(SELECT_BY_PHONE_AND_PASSWORD, phone);
    }
}
