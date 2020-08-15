package uz.uzmuiat.roundup.Database;

public class Units {
    public int UnitId;
    public String UnitName;

    public Units(int unitId, String unitName) {
        UnitId = unitId;
        UnitName = unitName;
    }

    public int getUnitId() {
        return UnitId;
    }

    public void setUnitId(int unitId) {
        UnitId = unitId;
    }

    public String getUnitName() {
        return UnitName;
    }

    public void setUnitName(String unitName) {
        UnitName = unitName;
    }
}
