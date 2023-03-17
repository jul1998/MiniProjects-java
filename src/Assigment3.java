import java.util.*;
public class Assigment3 {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> factories = new HashMap<>();

        Map<String, Integer> factory1 = new HashMap<>();
        factory1.put("jan", 100);
        factory1.put("feb", 200);
        factory1.put("mar", 300);
        factory1.put("apr", 400);
        factory1.put("may", 500);
        factory1.put("jun", 600);
        factory1.put("jul", 700);
        factory1.put("aug", 800);

        Map<String, Integer> factory2 = new HashMap<>();
        factory2.put("jan", 100);
        factory2.put("feb", 400);
        factory2.put("mar", 350);
        factory2.put("apr", 275);
        factory2.put("may", 150);
        factory2.put("jun", 200);
        factory2.put("jul", 375);
        factory2.put("aug", 400);
        factory2.put("sep", 300);
        factory2.put("oct", 250);
        factory2.put("nov", 375);
        factory2.put("dec", 500);

        Map<String,Integer> factory3 = new HashMap<>();
        factory3.put("jan", 100);
        factory3.put("feb", 400);
        factory3.put("mar", 350);
        factory3.put("apr", 275);
        factory3.put("may", 150);
        factory3.put("jun", 200);
        factory3.put("jul", 20000000);
        factory3.put("aug", 400);
        factory3.put("sep",240);
        factory3.put("oct", 250);
        factory3.put("nov", 375);



        factories.put("factory_1", factory1);
        factories.put("factory_2", factory2);
        factories.put("factory3", factory3);




        String mostProductiveFactory = "";
        int maxProduction = Integer.MIN_VALUE;
        int factoriesOverThreshold = 0;
        for (String factory : factories.keySet()) {
            System.out.println("Factory name: " + factory);

            Map<String, Integer> innerMap = factories.get(factory);
            int total = 0;
            for (String month : innerMap.keySet()) {

                int production = innerMap.get(month);
                System.out.println("Month: " + month + ", Production: " + production);
                total += production;
                if (total>maxProduction ){
                    maxProduction = total;
                    mostProductiveFactory = factory;
                }

                if (month.equals("jul") && production > 3000000) {
                    factoriesOverThreshold++;
                }
            }
            System.out.println("Total per year for " + factory + ": " + total);

        }

        System.out.println(String.format("The factory %s was the most productive with %d units", mostProductiveFactory, maxProduction));
        System.out.println(String.format("%d factories exceeded 3,000,000 units of production in July", factoriesOverThreshold));


    }
}
