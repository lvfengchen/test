package enumtest;

import enumtest.DemoEnum;

public class Test {
    public static void main(String[] args){
        if("01".equals(DemoEnum.lfc.getCode())){
            System.out.println("Hello lfc!");
        }else if("02".equals(DemoEnum.dp.getCode())){
            System.out.println("Hello dp!");
        }else if("03".equals(DemoEnum.cbl.getCode())){
            System.out.println("Hello cbl!");
        }

        switch(DemoEnum.getEnum("01")){
            case lfc:
                System.out.println("Hello lfc!");
                break;
            case dp:
                System.out.println("Hello dp!");
                break;
            case cbl:
                System.out.println("Hello cbl!");
                break;
            default:
                System.out.println("Hello World!");
        }

    }
}
