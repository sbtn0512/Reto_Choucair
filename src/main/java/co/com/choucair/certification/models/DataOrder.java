package co.com.choucair.certification.models;



import io.cucumber.datatable.DataTable;
import org.apiguardian.api.API;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

@API(status = API.Status.STABLE)
public final class DataOrder implements  DataTable.TableConverter {

    private String customer;
    private String employee;
    private String product;
    private String shipVia;
    private String freight;
    private String shipName;
    private String shipAddress;
    private String shipCity;
    private String shipRegion;
    private String shipCountry;

    public String getCustomer() {
        return customer;
    }

    public String getEmployee() {
        return employee;
    }

    public String getProduct() {
        return product;
    }

    public String getShipVia() {
        return shipVia;
    }

    public String getFreight() {
        return freight;
    }

    public String getShipName() {
        return shipName;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public String getShipCity() {
        return shipCity;
    }

    public String getShipRegion() {
        return shipRegion;
    }

    public String getShipCountry() {
        return shipCountry;
    }

    @Override
    public <T> T convert(DataTable dataTable, Type type) {
        return null;
    }

    @Override
    public <T> T convert(DataTable dataTable, Type type, boolean transposed) {
        return null;
    }

    @Override
    public <T> List<T> toList(DataTable dataTable, Type itemType) {
        return null;
    }

    @Override
    public <T> List<List<T>> toLists(DataTable dataTable, Type itemType) {
        return null;
    }

    @Override
    public <K, V> Map<K, V> toMap(DataTable dataTable, Type keyType, Type valueType) {
        return null;
    }

    @Override
    public <K, V> List<Map<K, V>> toMaps(DataTable dataTable, Type keyType, Type valueType) {
        return null;
    }
}
