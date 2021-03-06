package com.iredko.wowcraft2.controllers.recipe;

import com.iredko.wowcraft2.controllers.reagent.ReagentInfoModel;

import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class RecipeForm {

    private int id;

    @Size(min=2,max = 15,message = "Name size must be between 2 and 15")
    private String name;

    private Map<Integer, Integer> reagentCountMap;

    private BigDecimal sellPrice;

    public RecipeForm() {
    }

    public RecipeForm(int id, String name, Map<Integer, Integer> reagentCountMap, BigDecimal sellPrice) {
        this.id = id;
        this.name = name;
        this.reagentCountMap = reagentCountMap;
        this.sellPrice = sellPrice;
    }

    public static RecipeForm fromModel(RecipeInfoModel recipeInfoModel) {
        Map<Integer, Integer> reagentIdCount = new HashMap<>();
        for (Map.Entry<ReagentInfoModel, Integer> entry : recipeInfoModel.getReagenCountMap().entrySet()) {
            reagentIdCount.put(entry.getKey().getId(), entry.getValue());
        }
        return new RecipeForm(recipeInfoModel.getId(), recipeInfoModel.getName(),reagentIdCount,
                recipeInfoModel.getSellPrice());
    }

    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(BigDecimal sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer, Integer> getReagentCountMap() {
        return reagentCountMap;
    }

    public void setReagentCountMap(Map<Integer, Integer> reagentCountMap) {
        this.reagentCountMap = reagentCountMap;
    }
}
