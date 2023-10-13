/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.pay.iu;


import java.util.ArrayList;
import java.util.List;
import mx.itson.pay.entities.*;
import mx.itson.pay.enums.Difficulty;


/**
 *
 * @author luisd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User user1 =new User();
        user1.setName("Luis");
        user1.setEmail("Luis@gmail.com");
        user1.setPassword("Las donas son lo mejor");
        
        List<String> ingredients= new ArrayList<>();
        
        ingredients.add("1 Sobre de Levadura (11 g c/u)");
        ingredients.add("1 Cucharadita de Azúcar");
        ingredients.add("4 Cucharadas de Agua tibia");
        ingredients.add("4 Tazas de Harina de trigo");
        ingredients.add("1/2 Taza de Cocoa NESTLÉ® Chocolatería");
        ingredients.add("1/2 Taza de Azúcar");
        ingredients.add("1 Lata de Leche Evaporada CARNATION® CLAVEL®");
        ingredients.add("1 Huevo");
        ingredients.add("2 Barras de Mantequilla a temperatura ambiente (90 g c/u)");
        ingredients.add("Aceite de maíz para freír");
        ingredients.add("1 Barra de Mantequilla fundida (90 g)");
        ingredients.add("2 Barras de Chocolate con Leche NESTLÉ® Chocolatería (80 g) fundidas a baño María (80 g c/u)");
        
        Direction d1 = new Direction();
        d1.setStep(1);
        d1.setDescription("Mezcla la levadura con el azúcar y el agua tibia, espera hasta que doble su volumen. Forma una fuente con la harina, la Cocoa NESTLÉ® Chocolatería"
                + " \ny el azúcar, vierte en el centro la levadura fermentada, la Leche Evaporada CARNATION® CLAVEL®, el huevo, las yemas y las 2 barras de mantequilla. Mezcla "
                + "\ntodos los ingredientes hasta formar una pasta. Amasa y golpea la masa contra la mesa hasta que este tersa, elástica y no se te pegue en las manos. Reposa "
                + "\nla masa en un lugar tibio hasta que doble su volumen.");
        
        Direction d2 = new Direction();
        d2.setStep(2);
        d2.setDescription("Sobre una superficie enharinada estira la masa hasta que quede de ½ centímetro de grosor y con cortadores circulares enharinados corta círculos "
                + "\ngrandes y en el interior pequeños para formar las donas. Colócalas en charolas previamente engrasadas y enharinadas, cubre con plástico adherente y déjalas"
                + "\nreposar en un lugar tibio hasta que doblen su volumen. En una olla con aceite caliente, coloca las donas con la parte plana en contacto con el aceite y"
                + "\ncon una cuchara baña la parte que sobresale para que esponjen; fríelas hasta que doren ligeramente por ambos lados. Retira del aceite, coloca sobre papel "
                + "\nabsorbente y deja enfriar.");
        
        Direction d3 = new Direction();
        d3.setStep(3);
        d3.setDescription("Mezcla la mantequilla con el Chocolate con Leche NESTLÉ® Chocolatería hasta integrar por completo; cubre las donas con esta mezcla y enfría. Disfruta..");
        
        List<Direction> directions= new ArrayList<>();
        directions.add(d1);
        directions.add(d2);
        directions.add(d3);
        
        NutritionFact nutritionFact1 =new NutritionFact();
        nutritionFact1.setName("Carbohidratos");
        nutritionFact1.setValue("46.9 g");
        NutritionFact nutritionFact2 =new NutritionFact();
        nutritionFact2.setName("Energia");
        nutritionFact2.setValue("461.9 kcal");
        NutritionFact nutritionFact3 =new NutritionFact();
        nutritionFact3.setName("Grasas");
        nutritionFact3.setValue("26.4 g");
        NutritionFact nutritionFact4 =new NutritionFact();
        nutritionFact4.setName("Fibra");
        nutritionFact4.setValue("1.6 g");
        NutritionFact nutritionFact5 =new NutritionFact();
        nutritionFact5.setName("Proteina");
        nutritionFact5.setValue("9.2 g");
        NutritionFact nutritionFact6 =new NutritionFact();
        nutritionFact6.setName("Grasas saturadas");
        nutritionFact6.setValue("13.3 g");
        NutritionFact nutritionFact7 =new NutritionFact();
        nutritionFact7.setName("Sodio");
        nutritionFact7.setValue("49.8 mg");
        NutritionFact nutritionFact8 =new NutritionFact();
        nutritionFact8.setName("Azúcares");
        nutritionFact8.setValue("15.4 g");
        
        List<NutritionFact> nutritionFacts= new ArrayList<>();
        nutritionFacts.add(nutritionFact1);
        nutritionFacts.add(nutritionFact2);
        nutritionFacts.add(nutritionFact3);
        nutritionFacts.add(nutritionFact4);
        nutritionFacts.add(nutritionFact5);
        nutritionFacts.add(nutritionFact6);
        nutritionFacts.add(nutritionFact7);
        nutritionFacts.add(nutritionFact8);
        
        Recipe recipe1 =new Recipe();
        recipe1.setName("Donas de chocolate");
        recipe1.setDescripcion("Prepara para San Valentín unas deliciosas DONAS de CHOCOLATE con el delicioso sabor de NESTLÉ® Chocolatería \ny comparte con tus seres queridos.");
        recipe1.setUser(user1);
        recipe1.setIngredients(ingredients);
        recipe1.setDirections(directions);
        recipe1.setTime(42);
        recipe1.setServings(15);
        recipe1.setDifficulty(Difficulty.MEDIUM);
        recipe1.setNutritionFacts(nutritionFacts);
        
        
        // imprimir en consola
        System.out.println(recipe1.getName().toUpperCase()+"\n"
                +recipe1.getDescripcion() +" \n"
                +"Porciones: "+recipe1.getServings() +" \n"
                +"Dificultad: "+recipe1.getDifficulty()+" \n"
                +"Subido por: "+recipe1.getUser().getName()+" \n");
        
        System.out.println("-----INGREDIENTES-----");
        for(String ingredient: recipe1.getIngredients()){
            System.out.println(ingredient);
        }
        
        System.out.println(" \n -----PASOS-----");
        for(Direction direction: recipe1.getDirections()){
            System.out.println(direction.getStep()+" "+direction.getDescription()+"\n");
        }
        
        System.out.println("------INFORMACION NUTRICIONAL----- ");
        for(NutritionFact nutritionfact: recipe1.getNutritionFacts()){
            System.out.println(nutritionfact.getName()+" "+nutritionfact.getValue());
        }
        
        
        
        
    }
    
}
