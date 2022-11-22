public enum Week {
    MONDAY("Дуйшомбу куну java техникалык сабак болот жана English technical"),
    TUESDAY("Бейшемби куну java практикалык сабак жана  Talking club болот!"),
    WEDNESDAY("Шаршемби куну java техникалыксабак болот жана Talking club!"),
    THURSDAY("Бейшенби куну java практикалык сабак жана Soft skills болот!"),
    FRIDAY("Жума куну java java техникалык сабак жана Event болот!"),
    SATURDAY("Ишемби куну сабак болбойт, бирок аампуска келсен болот!"),
    SUNDAY("Жекшемби куну дем алыш!");





    private String name;

    Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void info(){

   }

    @Override
    public String toString() {
        return  super.toString()+" : "+ name + '\'';
    }
}
