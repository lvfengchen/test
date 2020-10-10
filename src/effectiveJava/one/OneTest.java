package effectiveJava.one;
    /**
     * 创建和销毁对象
     */
public class OneTest {

    /**
     * Builder模式
     */
    public void test(){
        NutritionFacts cocaCola = new NutritionFacts.Builder(240,8)
                .calories(100).sodium(35).carbohydrate(27).build();
    }

    /**
     * JavaBeans模式
     */
    public void test1(){
        NutritionFactsOne cocaCola = new NutritionFactsOne();
        cocaCola.setCalories(11);
        cocaCola.setCarbohydrate(11);
        cocaCola.setFat(11);
        cocaCola.setServings(11);
        cocaCola.setServingSize(11);
        cocaCola.setSodium(11);
    }

    /**
     *重叠构造器模式（telescoping constructor）
     */
    public void test2(){
        NutritionFactsTwo cocaCola = new NutritionFactsTwo(1,1,1,1,1,1);
    }


}
