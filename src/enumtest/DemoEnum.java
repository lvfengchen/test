package enumtest;

public enum DemoEnum {
    /**
     * 枚举Demo
     */
    lfc("01","吕风琛"),
    dp("02","段鹏"),
    cbl("03","陈泊龙");
    private String code;
    private String name;
    DemoEnum(String code ,String name){
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static DemoEnum getEnum(String code){
        for(DemoEnum e : values()){
            if(code.equals(e.getCode())){
                return e;
            }
        }
        return null;
    }

}