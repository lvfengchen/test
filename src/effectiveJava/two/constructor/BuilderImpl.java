package effectiveJava.two.constructor;

public class BuilderImpl implements Builder{
    @Override
    public NutritionFacts build() {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240,8)
                .calories(100).sodium(35).carbohydrate(27).build();
        return cocaCola;
    }

}
