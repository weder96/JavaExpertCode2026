import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Company {

    private String name;
    private int qtyEmployee;
    private BigDecimal marketValue;
    private int positionRanking;
    private boolean branch;
    private String location;
    List<String> departament = new ArrayList<>();
    Optional<Address> address;

    public Company() {
        super();
    }

    public Company(String name, int qtyEmployee, BigDecimal marketValue, int positionRanking, boolean branch, String location,List<String> departament) {
        this.name = name;
        this.qtyEmployee = qtyEmployee;
        this.marketValue = marketValue;
        this.positionRanking = positionRanking;
        this.branch = branch;
        this.location = location;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQtyEmployee() {
        return qtyEmployee;
    }

    public void setQtyEmployee(int qtyEmployee) {
        this.qtyEmployee = qtyEmployee;
    }

    public BigDecimal getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(BigDecimal marketValue) {
        this.marketValue = marketValue;
    }

    public boolean isBranch() {
        return branch;
    }

    public void setBranch(boolean branch) {
        this.branch = branch;
    }

    public List<String> getDepartament() {
        return departament;
    }

    public void setDepartament(List<String> departament) {
        this.departament = departament;
    }

    public Optional<Address> getAddress() {
        return address;
    }

    public void setAddress(Optional<Address> address) {
        this.address = address;
    }

    public int getPositionRanking() {
        return positionRanking;
    }

    public void setPositionRanking(int positionRanking) {
        this.positionRanking = positionRanking;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", qtyEmployee=" + qtyEmployee +
                ", marketValue=" + marketValue +
                ", positionRanking=" + positionRanking +
                ", branch=" + branch +
                ", location='" + location + '\'' +
                ", departament=" + departament +
                ", address=" + address +
                '}';
    }

}
